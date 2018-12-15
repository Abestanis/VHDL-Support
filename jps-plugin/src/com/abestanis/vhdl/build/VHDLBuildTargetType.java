package com.abestanis.vhdl.build;

import com.intellij.openapi.diagnostic.Logger;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildTargetLoader;
import org.jetbrains.jps.builders.ModuleBasedBuildTargetType;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.JpsProject;
import org.jetbrains.jps.model.module.JpsModule;

import java.util.List;
import java.util.stream.Collectors;

public class VHDLBuildTargetType extends ModuleBasedBuildTargetType<VHDLBuildTarget> {
    public static final VHDLBuildTargetType INSTANCE = new VHDLBuildTargetType();
    
    private VHDLBuildTargetType() {
        super("vhdl");
    }

    @NotNull
    @Override
    public List<VHDLBuildTarget> computeAllTargets(@NotNull JpsModel model) {
        JpsProject project = model.getProject();
        List<VHDLBuildTarget> targets = project.getModules().stream().map(VHDLBuildTarget::new)
                .collect(Collectors.toList());
        Logger.getInstance("DebugTesting").debug("computeAllTargets: " + targets);
        return targets;
    }

    @NotNull
    @Override
    public BuildTargetLoader<VHDLBuildTarget> createLoader(@NotNull JpsModel model) {
        return new BuildTargetLoader<VHDLBuildTarget>() {
            @Nullable
            @Override
            public VHDLBuildTarget createTarget(@NotNull String targetId) {
                Logger.getInstance("DebugTesting").debug("createTarget: " + targetId);
                for (JpsModule module : model.getProject().getModules()) {
                    if (targetId.equals(module.getName())) {
                        return new VHDLBuildTarget(module);
                    }
                }
                return null;
            }
        };
    }
}
