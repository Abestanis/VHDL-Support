package com.abestanis.vhdl.interpreter;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.java.JavaSourceRootType;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsModuleSourceRootType;
import org.jetbrains.jps.model.module.JpsTypedModuleSourceRoot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public final class PathUtils {
    @Nullable
    public static Path getRootSourcesPath(Collection<Path> sourceDirs) {
        return commonPath(sourceDirs);
    }

    @NotNull
    public static Set<Path> getSourceDirectories(JpsModule module, boolean isTest)
            throws IOException {
        JavaSourceRootType sourceType = isTest ?
                JavaSourceRootType.TEST_SOURCE : JavaSourceRootType.SOURCE;
        Set<Path> sourcesDirs = new HashSet<>();
        for (JpsTypedModuleSourceRoot root : module.getSourceRoots(sourceType)) {
            Files.walk(root.getFile().toPath()).filter(PathUtils::isVHDLFile)
                    .map(Path::getParent).forEach(sourcesDirs::add);
        }
        return sourcesDirs;
    }

    @NotNull
    public static Set<Path> getSourceDirectories(Module module, boolean isTest)
            throws IOException {

        JpsModuleSourceRootType sourceType = isTest ?
                JavaSourceRootType.TEST_SOURCE : JavaSourceRootType.SOURCE;
        Set<Path> sourcesDirs = new HashSet<>();
        for (VirtualFile root : ModuleRootManager.getInstance(module).getSourceRoots(sourceType)) {
            Files.walk(Paths.get(VfsUtilCore.urlToPath(root.getUrl())))
                    .filter(PathUtils::isVHDLFile).map(Path::getParent).forEach(sourcesDirs::add);
        }
        return sourcesDirs;
    }

    private static boolean isVHDLFile(Path path) {
        String fileName = path.getFileName().toString();
        return (fileName.endsWith(".vhd") || fileName.endsWith(".vhdl"))
                && Files.isRegularFile(path);
    }

    @Nullable
    private static Path commonPath(@NotNull Collection<Path> paths) {
        Path common = null;
        for (Path path : paths) {
            if (common == null) {
                common = path.getParent();
                continue;
            }
            while (!path.startsWith(common)) {
                common = common.getParent();
                if (common == null) {
                    return null;
                }
            }
        }
        return common;
    }
}
