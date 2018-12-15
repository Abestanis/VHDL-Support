package com.abestanis.vhdl.build.jsp;

import com.abestanis.vhdl.build.VHDLBuildTargetType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildTargetType;
import org.jetbrains.jps.incremental.BuilderService;
import org.jetbrains.jps.incremental.TargetBuilder;

import java.util.Collections;
import java.util.List;


public class VHDLBuilderService extends BuilderService {

    @NotNull
    @Override
    public List<? extends BuildTargetType<?>> getTargetTypes() {
        return Collections.singletonList(VHDLBuildTargetType.INSTANCE);
    }

    @NotNull
    @Override
    public List<? extends TargetBuilder<?, ?>> createBuilders() {
        return Collections.singletonList(new VHDLBuilder());
    }
}
