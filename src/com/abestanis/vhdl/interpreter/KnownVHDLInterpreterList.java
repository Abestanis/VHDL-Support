package com.abestanis.vhdl.interpreter;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KnownVHDLInterpreterList {
    private List<VHDLInterpreter> interpreters = new ArrayList<>();
    
    @NotNull
    public Stream<VHDLInterpreter> stream() {
        return interpreters.stream();
    }

    public void updatePaths(@NotNull List<Path> interpreterPaths) {
        interpreterPaths.stream().map(VHDLInterpreter::of).filter(Objects::nonNull)
                .forEach(this::add);
    }

    @NotNull
    public List<Path> getPaths() {
        return interpreters.stream().map(VHDLInterpreter::getBasePath).collect(Collectors.toList());
    }

    public void add(@NotNull VHDLInterpreter interpreter) {
        if (!interpreters.contains(interpreter)) {
            interpreters.add(interpreter);
        }
    }
}
