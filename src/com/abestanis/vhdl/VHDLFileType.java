package com.abestanis.vhdl;

import com.intellij.openapi.fileTypes.LanguageFileType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class VHDLFileType extends LanguageFileType {
    public static final VHDLFileType INSTANCE = new VHDLFileType();

    private VHDLFileType() {
        super(VHDLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "VHDL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "VHDL source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vhd";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VHDLIcons.FILE;
    }
}
