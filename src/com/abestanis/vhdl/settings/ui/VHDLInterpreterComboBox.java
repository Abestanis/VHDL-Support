package com.abestanis.vhdl.settings.ui;

import com.abestanis.vhdl.interpreter.KnownVHDLInterpreterList;
import com.abestanis.vhdl.interpreter.VHDLInterpreter;
import com.abestanis.vhdl.settings.VHDLProjectConfigService;
import com.intellij.openapi.ui.ComboBoxWithWidePopup;
import com.intellij.ui.ColoredListCellRenderer;
import com.intellij.ui.ScreenUtil;
import com.intellij.ui.SimpleTextAttributes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JList;


public class VHDLInterpreterComboBox extends ComboBoxWithWidePopup<VHDLInterpreterComboBox.Item> {
    private       JButton addInterpreterButton;
    
    public VHDLInterpreterComboBox(@NotNull KnownVHDLInterpreterList interpreterList,
                                   boolean showVersions) {
        this(interpreterList, null, showVersions);
    }
    
    public VHDLInterpreterComboBox(@NotNull KnownVHDLInterpreterList interpreterList,
                                   @Nullable VHDLProjectConfigService projectConfig,
                                   boolean showVersions) {
        super(new VHDLComboBoxModel(projectConfig));
        reloadModel(null, interpreterList);
        setRenderer(new ColoredListCellRenderer<Item>() {
            @Override
            protected void customizeCellRenderer(@NotNull JList<? extends Item> list, Item value,
                                                 int index, boolean selected, boolean hasFocus) {
                if (VHDLInterpreterComboBox.this.isEnabled()) {
                    if (value == null) {
                        append("No Interpreter found",
                               SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES);
                    } else {
                        value.renderInterpreterName(this);
                    }
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        final Rectangle rec = ScreenUtil.getScreenRectangle(0, 0);
        final Dimension size = super.getPreferredSize();
        final int maxWidth = rec.width / 4;
        if (size.width > maxWidth) {
            size.width = maxWidth;
        }
        return size;
    }

    @Override
    public Dimension getMinimumSize() {
        final Dimension minSize = super.getMinimumSize();
        final Dimension prefSize = getPreferredSize();
        if (minSize.width > prefSize.width) {
            minSize.width = prefSize.width;
        }
        return minSize;
    }
    
    public void setAddInterpreterButton(final JButton addInterpreterButton) {
//                               @Nullable final Project project,
//                               final ProjectSdksModel jdksModel,
//                               final JdkComboBoxItem firstItem,
//                               @Nullable final Condition<? super Sdk> additionalSetup,
//                               final String actionGroupTitle) {
//
        this.addInterpreterButton = addInterpreterButton;
        this.addInterpreterButton.addActionListener(event -> {
//            DefaultActionGroup group = new DefaultActionGroup();
//            jdksModel.createAddActions(group, this, getSelectedJdk(), jdk -> {
//                if (project != null) {
//                    final JdkListConfigurable configurable = JdkListConfigurable.getInstance(project);
//                    configurable.addJdkNode(jdk, false);
//                }
//                reloadModel(new ActualJdkComboBoxItem(jdk), project);
//                setSelectedJdk(jdk); //restore selection
//                if (additionalSetup != null) {
//                    if (additionalSetup.value(jdk)) { //leave old selection
//                        setSelectedJdk(firstItem.getJdk());
//                    }
//                }
//            }, myCreationFilter);
//            final DataContext dataContext = DataManager.getInstance().getDataContext(this);
//            if (group.getChildrenCount() > 1) {
//                JBPopupFactory.getInstance()
//                        .createActionGroupPopup(actionGroupTitle, group, dataContext, JBPopupFactory.ActionSelectionAid.MNEMONICS, false)
//                        .showUnderneathOf(setUpButton);
//            }
//            else {
//                final AnActionEvent event =
//                        new AnActionEvent(null, dataContext, ActionPlaces.UNKNOWN, new Presentation(""), ActionManager.getInstance(), 0);
//                group.getChildren(event)[0].actionPerformed(event);
//            }
        });
    }

//    public void setEditButton(final JButton editButton, final Project project, final Computable<? extends Sdk> retrieveJDK){
//        editButton.addActionListener(e -> {
//            final Sdk projectJdk = retrieveJDK.compute();
//            if (projectJdk != null) {
//                ProjectStructureConfigurable.getInstance(project).select(projectJdk, true);
//            }
//        });
//        addActionListener(e -> {
//            final JdkComboBoxItem selectedItem = getSelectedItem();
//            if (selectedItem instanceof ProjectInterpreterItem) {
//                editButton.setEnabled(ProjectStructureConfigurable.getInstance(project).getProjectJdksModel().getProjectSdk() != null);
//            }
//            else {
//                editButton.setEnabled(!(selectedItem instanceof InvalidInterpreterItem) && selectedItem != null && selectedItem.getJdk() != null);
//            }
//        });
//    }

    @Override
    public Item getSelectedItem() {
        return (Item) super.getSelectedItem();
    }

    public void reloadModel(@Nullable VHDLInterpreter selectedItem,
                            @NotNull KnownVHDLInterpreterList interpreterList) {
        final VHDLComboBoxModel model = (VHDLComboBoxModel) getModel();
        model.reload(this, selectedItem, interpreterList);
    }

    private static class VHDLComboBoxModel extends DefaultComboBoxModel<Item> {
        @Nullable
        private final VHDLProjectConfigService projectConfig;
        
        VHDLComboBoxModel(@Nullable VHDLProjectConfigService projectConfig) {
            this.projectConfig = projectConfig;
        }
        
        private void reload(@NotNull VHDLInterpreterComboBox comboBox,
                            @Nullable VHDLInterpreter selectedInterpreter,
                            @NotNull KnownVHDLInterpreterList interpreters) {
            removeAllElements();
            if (selectedInterpreter != null) {
                Item selectedItem = new InterpreterItem(selectedInterpreter);
                comboBox.setSelectedItem(selectedItem);
                addElement(selectedItem);
            }
            if (projectConfig != null) {
                Item projectItem = new ProjectInterpreterItem(projectConfig);
                addElement(projectItem);
                if (selectedInterpreter == null) {
                    comboBox.setSelectedItem(projectItem);
                }
            }
            interpreters.stream().filter(interpreter -> !interpreter.equals(selectedInterpreter))
                    .map(InterpreterItem::new).forEach(this::addElement);
        }
    }

    public interface Item {
        @NotNull
        VHDLInterpreter getInterpreter();
        void renderInterpreterName(@NotNull ColoredListCellRenderer renderer);
    }
    
    public static class InterpreterItem implements Item {
        protected final VHDLInterpreter interpreter;

        InterpreterItem(@NotNull VHDLInterpreter interpreter) {
            this.interpreter = interpreter;
        }

        @NotNull
        @Override
        public VHDLInterpreter getInterpreter() {
            return interpreter;
        }

        @Override
        public void renderInterpreterName(@NotNull ColoredListCellRenderer renderer) {
            renderer.setIcon(interpreter.getIcon());
            if (interpreter.isValid()) {
                renderInterpreter(renderer, SimpleTextAttributes.REGULAR_ATTRIBUTES,
                                  SimpleTextAttributes.GRAYED_ATTRIBUTES);
            } else {
                renderInterpreter(renderer, SimpleTextAttributes.ERROR_ATTRIBUTES,
                                  SimpleTextAttributes.ERROR_ATTRIBUTES);
            }
        }
        
        void renderInterpreter(@NotNull ColoredListCellRenderer renderer,
                               @NotNull SimpleTextAttributes nameAttributes,
                               @NotNull SimpleTextAttributes pathAttributes) {
            renderer.append(interpreter.getName(), nameAttributes);
            renderer.append(" (" + interpreter.getBasePath() + ")", pathAttributes); // TODO: Need to make sure th path is not too long, needs to be like this C:\\Path\to…ong\ghdl.exe
        }
    }
    
    public static class ProjectInterpreterItem extends InterpreterItem {
        private static final class ProjectInterpreter implements VHDLInterpreter {
            @NotNull
            private final VHDLProjectConfigService projectConfig;
            ProjectInterpreter(@NotNull VHDLProjectConfigService projectConfig) {
                this.projectConfig = projectConfig;
            }

            @NotNull
            @Override
            public String getName() {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                return projectInterpreter != null ? projectInterpreter.getName() : "Not set";
            }

            @Nullable
            @Override
            public Icon getIcon() {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                return projectInterpreter != null ? projectInterpreter.getIcon() : null;
            }

            @NotNull
            @Override
            public Path getBasePath() {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                return projectInterpreter != null ? projectInterpreter.getBasePath()
                        : Paths.get("");
            }

            @NotNull
            @Override
            public Path getExecutable() {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                return projectInterpreter != null ? projectInterpreter.getExecutable()
                        : Paths.get("");
            }

            @Override
            public boolean isValid() {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                return projectInterpreter != null && projectInterpreter.isValid();
            }

            @Override
            public boolean equals(Object obj) {
                VHDLInterpreter projectInterpreter = projectConfig.getInterpreter();
                if (projectInterpreter == null) {
                    return obj == null;
                }
                if (!(obj instanceof VHDLInterpreter)) {
                    return false;
                }
                return projectInterpreter.equals(obj);
            }
        }
        
        ProjectInterpreterItem(@NotNull VHDLProjectConfigService projectConfig) {
            super(new ProjectInterpreter(projectConfig));
        }

        @Override
        public void renderInterpreterName(@NotNull ColoredListCellRenderer renderer) {
            renderer.setIcon(interpreter.getIcon());
            if (interpreter.isValid()) {
                renderer.append("Project ", SimpleTextAttributes.REGULAR_ATTRIBUTES);
                renderInterpreter(renderer, SimpleTextAttributes.GRAYED_ATTRIBUTES,
                                  SimpleTextAttributes.GRAYED_ATTRIBUTES);
            } else {
                renderer.append("Project (not specified)",
                                SimpleTextAttributes.ERROR_ATTRIBUTES);
            }
        }
    }
}

