package com.abestanis.vhdl.build.jsp;

import com.abestanis.vhdl.build.VHDLBuildTarget;
import com.abestanis.vhdl.build.VHDLBuildTargetType;
import com.abestanis.vhdl.interpreter.GHDLInterpreter;
import com.abestanis.vhdl.interpreter.PathUtils;
import com.abestanis.vhdl.interpreter.VHDLInterpreter;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.io.FileUtil;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.BuildRootDescriptor;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.TargetBuilder;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Set;


public class VHDLBuilder extends TargetBuilder<BuildRootDescriptor, VHDLBuildTarget> {
    private final static Logger LOGGER = Logger.getInstance(VHDLBuilder.class);
    VHDLBuilder() {
        super(Collections.singletonList(VHDLBuildTargetType.INSTANCE));
    }

    @Override
    public void build(@NotNull VHDLBuildTarget target,
                      @NotNull DirtyFilesHolder<BuildRootDescriptor, VHDLBuildTarget> holder,
                      @NotNull BuildOutputConsumer outputConsumer, @NotNull CompileContext context)
            throws ProjectBuildException, IOException {
        Set<Path> sourceDirs = target.getSourceDirectories();
        if ((!holder.hasDirtyFiles() && !holder.hasRemovedFiles()) || sourceDirs.isEmpty()) {
            return;
        }
        Path buildDir = getBuildOutputDirectory(target.getModule(), target.isTests());
        VHDLInterpreter buildInterpreter = new GHDLInterpreter(); // TODO
        if (buildInterpreter == null) {
            throw new ProjectBuildException("No VHDL project interpreter defined");
        } else if (!buildInterpreter.isValid()) {
            throw new ProjectBuildException("VHDL interpreter is not valid");
        }
        Path workingDir = PathUtils.getRootSourcesPath(sourceDirs);
        if (workingDir == null) {
            throw new ProjectBuildException("VHDL sources are on different drives");
        }
        GeneralCommandLine buildCommand = buildInterpreter.getBuildCommand(
                sourceDirs, buildDir, workingDir, null); // TODO: LanguageLevel
        LOGGER.debug("Build command: " + buildCommand);
        ProcessAdapter adapter = new VHDLCompilerProcessAdapter(
                context, getPresentableName(), target.getModule());
        runBuildProcess(buildCommand, adapter);
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "vhdl";
    }

    @NotNull
    private Path getBuildOutputDirectory(@NotNull JpsModule module, boolean forTests)
            throws ProjectBuildException {
        JpsJavaExtensionService instance = JpsJavaExtensionService.getInstance();
        File outputDirectory = instance.getOutputDirectory(module, forTests);
        if (outputDirectory == null) {
            throw new ProjectBuildException("No output directory for module " + module.getName());
        }
        if (!outputDirectory.exists()) {
            if (!FileUtil.createDirectory(outputDirectory)) {
                throw new ProjectBuildException(
                        "Unable to create output directory for module " + module.getName());
            }
        }
        return outputDirectory.toPath();
    }

    private void runBuildProcess(@NotNull GeneralCommandLine commandLine,
                                 @NotNull ProcessAdapter adapter) throws ProjectBuildException {
        OSProcessHandler handler;
        try {
            handler = new OSProcessHandler(commandLine);
        } catch (ExecutionException error) {
            throw new ProjectBuildException("Failed to launch the VHDL compiler", error);
        }
        handler.addProcessListener(adapter);
        handler.startNotify();
        handler.waitFor();
    }
}
