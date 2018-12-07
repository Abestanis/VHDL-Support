package com.abestanis.vhdl.settings;

import com.abestanis.vhdl.interpreter.VHDLInterpreter;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.annotations.Property;
import com.intellij.util.xmlb.annotations.Transient;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.nio.file.Paths;


@State(name = "VHDL")
public class VHDLProjectConfigService
        implements PersistentStateComponent<VHDLProjectConfigService> {
    @Nullable
    private VHDLInterpreter interpreter = null;

    @Nullable
    @Override
    public VHDLProjectConfigService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull VHDLProjectConfigService state) {
        interpreter = state.interpreter;
    }

    @Override
    public void noStateLoaded() {
        interpreter = VHDLPluginConfigService.getInstance()
                .getKnownInterpreters().stream().findAny().orElse(null);
    }

    public static VHDLProjectConfigService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, VHDLProjectConfigService.class);
    }

    @Property
    public String getProjectInterpreterPath() {
        return interpreter != null ? interpreter.getBasePath().toString() : null;
    }
    
    public void setProjectInterpreterPath(String interpreterPath) {
        if (interpreterPath != null) {
            Path path = Paths.get(interpreterPath);
            if (interpreter == null || !path.equals(interpreter.getBasePath())) {
                interpreter = VHDLInterpreter.of(path);
            }
        }
    }
    
    @Nullable
    @Transient
    public VHDLInterpreter getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(@Nullable VHDLInterpreter interpreter) {
        this.interpreter = interpreter;
    }
}
