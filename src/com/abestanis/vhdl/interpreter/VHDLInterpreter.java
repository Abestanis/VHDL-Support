package com.abestanis.vhdl.interpreter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.Icon;

public interface VHDLInterpreter {
    @NotNull
    String getName();

    @Nullable
    Icon getIcon();

    @NotNull
    Path getBasePath();
    
    @NotNull
    Path getExecutable();

    boolean isValid();

    @Nullable
    static VHDLInterpreter of(@NotNull Path path) {
        boolean isDir = Files.isDirectory(path);
        boolean executable = Files.isExecutable(path);
        if (GHDLInterpreter.isValidLocation(path, isDir, executable)) {
            return new GHDLInterpreter(path);
        }
        return null;
    }
}
