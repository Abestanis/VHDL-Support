package com.abestanis.vhdl.build;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.util.containers.ContainerUtil;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildRootDescriptor;
import org.jetbrains.jps.builders.BuildRootIndex;
import org.jetbrains.jps.builders.BuildTarget;
import org.jetbrains.jps.builders.BuildTargetRegistry;
import org.jetbrains.jps.builders.ModuleBasedTarget;
import org.jetbrains.jps.builders.TargetOutputIndex;
import org.jetbrains.jps.builders.storage.BuildDataPaths;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.indices.IgnoredFileIndex;
import org.jetbrains.jps.indices.ModuleExcludeIndex;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.java.JavaSourceRootType;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsTypedModuleSourceRoot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


public class VHDLBuildTarget extends ModuleBasedTarget<BuildRootDescriptor> {
    VHDLBuildTarget(@NotNull JpsModule module) {
        super(VHDLBuildTargetType.INSTANCE, module);
    }

    @Override
    public String getId() {
        return getModule().getName();
    }

    @Override
    public Collection<BuildTarget<?>> computeDependencies(
            BuildTargetRegistry targetRegistry, TargetOutputIndex outputIndex) {
//        Set<JpsModule> modules = JpsJavaExtensionService.dependencies(getModule()).includedIn(JpsJavaClasspathKind.compile(isTests())).getModules();
//        for (JpsModule module : modules) {
//            if (module.getModuleType() == JpsGoModuleType.INSTANCE) {
//                dependencies.add(new GoTarget(module, getGoTargetType()));
//            }
//        }
//        if (isTests()) {
//            dependencies.add(new GoTarget(myModule, GoTargetType.PRODUCTION));
//        }
//        return dependencies;
        Logger.getInstance("DebugTesting").debug("computeDependencies");
        return Collections.emptyList(); // TODO
    }

    @NotNull
    @Override
    public List<BuildRootDescriptor> computeRootDescriptors(
            JpsModel model, ModuleExcludeIndex index, IgnoredFileIndex ignoredFileIndex,
            BuildDataPaths dataPaths) {
        JavaSourceRootType sourceType = isTests() ?
                JavaSourceRootType.TEST_SOURCE : JavaSourceRootType.SOURCE;
        List<BuildRootDescriptor> collect = StreamSupport.stream(
                getModule().getSourceRoots(sourceType).spliterator(), false)
                .map(sourceRoot -> new VHDLSourceRootDescriptor(this, sourceRoot.getFile()))
                .collect(Collectors.toList());
        Logger.getInstance("DebugTesting").debug("computeRootDescriptors: " + collect);
        return collect;
    }

    @Nullable
    @Override
    public BuildRootDescriptor findRootDescriptor(String rootId, BuildRootIndex rootIndex) {
        Logger.getInstance("DebugTesting").debug("findRootDescriptor: rootId = " + rootId);
        return ContainerUtil.getFirstItem(rootIndex.getRootDescriptors(
                new File(rootId), Collections.singletonList((VHDLBuildTargetType) getTargetType()),
                null));
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "VHDL build target";
    }

    @NotNull
    @Override
    public Collection<File> getOutputRoots(CompileContext context) {
        List<File> maybeSingletonList = ContainerUtil.createMaybeSingletonList(
                JpsJavaExtensionService.getInstance().getOutputDirectory(getModule(), isTests()));
        Logger.getInstance("DebugTesting").debug("getOutputRoots: " + maybeSingletonList);
        return maybeSingletonList;
    }

    @Override
    public boolean isTests() {
        return false; // TODO
    }
    
    @NotNull
    public Set<Path> getSourceDirectories() throws IOException {
        JavaSourceRootType sourceType = isTests() ?
                JavaSourceRootType.TEST_SOURCE : JavaSourceRootType.SOURCE;
        Set<Path> sourcesDirs = new HashSet<>();
        for (JpsTypedModuleSourceRoot root : getModule().getSourceRoots(sourceType)) {
            Files.walk(root.getFile().toPath()).filter(this::isVHDLFile)
                    .map(Path::getParent).forEach(sourcesDirs::add);
        }
        return sourcesDirs;
    }
    
    private boolean isVHDLFile(Path path) {
        String fileName = path.getFileName().toString();
        return (fileName.endsWith(".vhd") || fileName.endsWith(".vhdl"))
                && Files.isRegularFile(path);
    }
}
