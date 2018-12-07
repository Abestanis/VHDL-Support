package com.abestanis.vhdl.run;

import com.abestanis.vhdl.settings.VHDLPluginConfigService;
import com.abestanis.vhdl.settings.VHDLProjectConfigService;
import com.abestanis.vhdl.settings.ui.VHDLInterpreterComboBox;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.ui.ComboboxWithBrowseButton;

import org.jetbrains.annotations.NotNull;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VHDLRunConfigurationSettingsEditor extends SettingsEditor<VHDLRunConfiguration> {
    private final Project project;
    private JTextField                                  scriptInput;
    private JPanel                                      mainPanel;
    private ComboboxWithBrowseButton interpreterComboboxWithButton;
    private VHDLInterpreterComboBox interpreterComboBox;

    public VHDLRunConfigurationSettingsEditor(Project project) {
        super();
        this.project = project;
    }

    @Override
    protected void resetEditorFrom(@NotNull VHDLRunConfiguration demoRunConfiguration) {

    }

    @Override
    protected void applyEditorTo(@NotNull VHDLRunConfiguration demoRunConfiguration)
            throws ConfigurationException {

    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return mainPanel;
    }

    private void createUIComponents() {
        VHDLProjectConfigService projectConfig = VHDLProjectConfigService.getInstance(project);
        interpreterComboBox = new VHDLInterpreterComboBox(
                VHDLPluginConfigService.getInstance().getKnownInterpreters(), projectConfig, false);
        interpreterComboboxWithButton = new ComboboxWithBrowseButton(interpreterComboBox);
        interpreterComboBox.setAddInterpreterButton(interpreterComboboxWithButton.getButton());
    }
}
