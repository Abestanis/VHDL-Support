package com.abestanis.vhdl.psi;

import com.abestanis.vhdl.VHDLFileType;
import com.abestanis.vhdl.VHDLLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class VHDLFile extends PsiFileBase {
    public VHDLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VHDLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return VHDLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "VHDL File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
