package com.abestanis.vhdl.interpreter;

import com.abestanis.vhdl.VHDLLanguageLevel;
import com.intellij.execution.configurations.GeneralCommandLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Stream;


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

    @NotNull
    @Override
    public GeneralCommandLine getBuildCommand(@NotNull Set<Path> sourceDirs, @NotNull Path buildDir,
                                              @Nullable VHDLLanguageLevel level) {
        GeneralCommandLine cmd = new GeneralCommandLine(
                getExecutable().toString(), "-c",
                "--workdir=" + buildDir.toAbsolutePath().toString());
        if (level != null) {
            cmd.addParameter("--std=" + level.getShortName());
        }
        sourceDirs.stream().map(path -> new File(path.toFile(), "*.vhdl?").toString())
                .forEach(cmd::addParameter);
        return cmd;
    }

    @NotNull
    @Override
    public GeneralCommandLine getRunCommand(@NotNull String unitName, @NotNull Path buildDir) {
        return new GeneralCommandLine(
                getExecutable().toString(), "-c",
                "--workdir=" + buildDir.toAbsolutePath().toString(), "-r", unitName);
    }
}
