package com.abestanis.vhdl.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

import org.jetbrains.annotations.NotNull;

public class VHDLConfigurationFactory extends ConfigurationFactory {
    private static final String FACTORY_NAME = "VHDL configuration factory";

    VHDLConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new VHDLRunConfiguration(project, this, "VHDL");
    }

    @NotNull
    @Override
    public String getName() {
        return FACTORY_NAME;
    }
}
