package com.abestanis.vhdl.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

import org.jetbrains.annotations.NotNull;

public abstract class VHDLNamedElementImp extends ASTWrapperPsiElement implements VHDLNamedElement {
    public VHDLNamedElementImp(@NotNull ASTNode node) {
        super(node);
    }
}
