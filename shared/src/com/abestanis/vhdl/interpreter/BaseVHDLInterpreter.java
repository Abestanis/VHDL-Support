package com.abestanis.vhdl.interpreter;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import javax.swing.Icon;

public abstract class BaseVHDLInterpreter implements VHDLInterpreter {
    @NotNull
    private final Path   basePath;
    @NotNull
    private final Path   executablePath;
    @NotNull
    private final String name;

    BaseVHDLInterpreter(@NotNull Path basePath, @NotNull String name) {
        this.name = name;
        this.basePath = basePath;
        this.executablePath = findExecutablePath(basePath);
    }

    @NotNull
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @NotNull
    @Override
    public Path getBasePath() {
        return basePath;
    }

    @NotNull
    @Override
    public Path getExecutable() {
        return executablePath;
    }

    @Override
    public boolean isValid() {
        return Files.isExecutable(executablePath);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseVHDLInterpreter)) return false;
        BaseVHDLInterpreter that = (BaseVHDLInterpreter) o;
        return name.equals(that.name) && executablePath.equals(that.executablePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePath, executablePath);
    }

    @NotNull
    private Path findExecutablePath(@NotNull Path basePath) {
        Path executablePath = basePath.toAbsolutePath(); // TODO: Handle directory base paths?
        if (Files.isExecutable(executablePath)) {
            return executablePath;
        }
        // TODO: Only search for not absolute paths?
        for (String dirname : System.getenv("PATH").split(File.pathSeparator)) {
            Path file = Paths.get(dirname).resolve(basePath);
            if (Files.isExecutable(file)) {
                return file.toAbsolutePath();
            }
        }
        return basePath.toAbsolutePath();
    }
}
