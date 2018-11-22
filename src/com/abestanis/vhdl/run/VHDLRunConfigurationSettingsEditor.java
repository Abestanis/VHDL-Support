package com.abestanis.vhdl.run;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import org.jetbrains.annotations.NotNull;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VHDLRunConfigurationSettingsEditor extends SettingsEditor<VHDLRunConfiguration> {
    private LabeledComponent<ComponentWithBrowseButton> myMainClass;
    private JComboBox                                   interpreterSelect;
    private JTextField                                  scriptInput;
    private JPanel                                      mainPanel;
    private JButton                                     addInterpreterButton;

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
        myMainClass = new LabeledComponent<>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }
}
