package com.abestanis.vhdl.settings;

import com.abestanis.vhdl.interpreter.GHDLInterpreter;
import com.abestanis.vhdl.interpreter.KnownVHDLInterpreterList;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.RoamingType;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.annotations.Transient;
import com.intellij.util.xmlb.annotations.XCollection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


@State(name = "VHDL", storages = @Storage(
        value = "vhdl.xml", roamingType = RoamingType.DISABLED))
public class VHDLPluginConfigService
        implements PersistentStateComponent<VHDLPluginConfigService> {
    @NotNull
    private KnownVHDLInterpreterList knownInterpreters = new KnownVHDLInterpreterList();

    @Nullable
    @Override
    public VHDLPluginConfigService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull VHDLPluginConfigService state) {
        knownInterpreters = state.knownInterpreters;
    }

    public static VHDLPluginConfigService getInstance() {
        return ServiceManager.getService(VHDLPluginConfigService.class);
    }

    @XCollection(propertyElementName = "interpreters")
    public List<String> getInterpreterPaths() {
        return knownInterpreters.getPaths().stream().map(Path::toString)
                .collect(Collectors.toList());
    }

    public void setInterpreterPaths(@NotNull List<String> interpreterPaths) {
        knownInterpreters.updatePaths(interpreterPaths.stream().map(Paths::get)
                                              .collect(Collectors.toList()));
    }


    @NotNull
    @Transient
    public KnownVHDLInterpreterList getKnownInterpreters() {
        return knownInterpreters;
    }

    @Override
    public void noStateLoaded() {
        knownInterpreters.add(new GHDLInterpreter());
    }
}
