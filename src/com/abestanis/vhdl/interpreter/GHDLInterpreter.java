package com.abestanis.vhdl.interpreter;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GHDLInterpreter extends BaseVHDLInterpreter {
    public GHDLInterpreter() {
        this(Paths.get("ghdl.exe")); // TODO: Mac & Linux
    }

    GHDLInterpreter(@NotNull Path path) {
        super(path, "GHDL"); // TODO: make sure the name is unique
    }

    static boolean isValidLocation(
            @NotNull Path path, boolean isDir, boolean executable) {
        // TODO: Handle mac and linux as well
        String executableName = "ghdl.exe";
        if (isDir) {
            Path executablePath = path.resolve(executableName);
            return Files.isExecutable(executablePath);
        }
        return executable && path.getFileName().equals(Paths.get(executableName));
    }
}
