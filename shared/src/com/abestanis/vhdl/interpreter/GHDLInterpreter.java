package com.abestanis.vhdl.interpreter;

import com.abestanis.vhdl.VHDLLanguageLevel;
import com.intellij.execution.configurations.GeneralCommandLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
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
    public GeneralCommandLine getBuildCommand(
            @NotNull Set<Path> sourceDirs, @NotNull Path buildDir, @NotNull Path workingDir,
            @Nullable VHDLLanguageLevel level) {
        GeneralCommandLine cmd = new GeneralCommandLine(
                getExecutable().toString(), "-c",
                "--workdir=" + workingDir.relativize(buildDir).toString());
        if (level != null) {
            cmd.addParameter("--std=" + level.getShortName());
        }
        sourceDirs.stream().flatMap(path -> getVHDLWildcards(path)
                .map(pattern -> new File(workingDir.relativize(path).toFile(), pattern).toString()))
                .forEach(cmd::addParameter);
        cmd.setWorkDirectory(workingDir.toFile());
        return cmd;
    }

    @NotNull
    @Override
    public GeneralCommandLine getRunCommand(
            @NotNull String unitName, @NotNull Path buildDir, @NotNull Path workingDir) {
        GeneralCommandLine commandLine = new GeneralCommandLine(
                getExecutable().toString(), "-c",
                "--workdir=" + workingDir.relativize(buildDir).toString(), "-r", unitName);
        commandLine.setWorkDirectory(workingDir.toFile());
        return commandLine;
    }
    
    @NotNull
    private Stream<String> getVHDLWildcards(@NotNull Path path) {
        return Stream.of("*.vhdl", "*.vhd")
                .filter(pattern -> containsMatchingFiles(path, "glob:" + pattern));
    }
    
    private boolean containsMatchingFiles(@NotNull Path path, @NotNull String pattern) {
        PathMatcher matcher = path.getFileSystem().getPathMatcher(pattern);
        try {
            return Files.list(path).filter(Files::isRegularFile)
                    .map(Path::getFileName).anyMatch(matcher::matches);
        } catch (IOException ignored) {
            return false;
        }
    }
}
