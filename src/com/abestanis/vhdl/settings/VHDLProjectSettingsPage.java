package com.abestanis.vhdl.settings;

import com.abestanis.vhdl.settings.ui.VHDLInterpreterComboBox;
import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.project.Project;
import com.intellij.ui.ComboboxWithBrowseButton;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class VHDLProjectSettingsPage implements SearchableConfigurable {
    private JPanel                   rootPanel;
    private VHDLInterpreterComboBox  interpreterComboBox;
    private JPanel                   interpreterPanel;
    private ComboboxWithBrowseButton interpreterComboboxWithButton;
    private final VHDLProjectConfigService projectConfig;
    private VHDLPluginConfigService pluginConfig;

    public VHDLProjectSettingsPage(@NotNull Project project) {
        projectConfig = VHDLProjectConfigService.getInstance(project);
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "VHDL";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return rootPanel;
    }

    @Override
    public boolean isModified() {
        VHDLInterpreterComboBox.Item selectedItem = interpreterComboBox.getSelectedItem();
        if (selectedItem != null) {
            return !Objects.equals(projectConfig.getInterpreter(), selectedItem.getInterpreter());
        } else {
            return projectConfig.getInterpreter() != null;
        }
    }

    @Override
    public void apply() {
        VHDLInterpreterComboBox.Item selectedItem = interpreterComboBox.getSelectedItem();
        if (selectedItem != null) {
            projectConfig.setInterpreter(selectedItem.getInterpreter());
        }
    }

    @Override
    public void reset() {
        interpreterComboBox.reloadModel(projectConfig.getInterpreter(),
                                        pluginConfig.getKnownInterpreters());
    }

    @NotNull
    @Override
    public String getId() {
        return "VHDLSettings";
    }

    private void createUIComponents() {
        pluginConfig = VHDLPluginConfigService.getInstance();
        interpreterComboBox = new VHDLInterpreterComboBox(
                pluginConfig.getKnownInterpreters(), true);
        interpreterComboboxWithButton = new ComboboxWithBrowseButton(interpreterComboBox);
        interpreterComboBox.setAddInterpreterButton(interpreterComboboxWithButton.getButton());
    }
}
