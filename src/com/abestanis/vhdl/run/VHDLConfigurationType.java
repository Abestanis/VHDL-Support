package com.abestanis.vhdl.run;

import com.abestanis.vhdl.VHDLIcons;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;

import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;


public class VHDLConfigurationType implements ConfigurationType {
    @NotNull
    @Override
    public String getDisplayName() {
        return "VHDL";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "VHDL Run Configuration Type";
    }

    @Override
    public Icon getIcon() {
        return VHDLIcons.VHDL;
    }

    @NotNull
    @Override
    public String getId() {
        return "VHDL_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new VHDLConfigurationFactory(this)};
    }
}
