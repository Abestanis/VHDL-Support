package com.abestanis.vhdl.psi;

import com.abestanis.vhdl.VHDLLanguage;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class VHDLElementType extends IElementType {
    VHDLElementType(@NotNull @NonNls String debugName) {
        super(debugName, VHDLLanguage.INSTANCE);
    }
}
