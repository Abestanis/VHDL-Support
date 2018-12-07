package com.abestanis.vhdl.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;

public class VHDLPsiImplUtil {
    public static String getName(VHDLIdentifier element) {
        return element.getText();
    }

    public static PsiElement setName(VHDLIdentifier element, String newName) {
        ASTNode nameNode = element.getNode();
        if (nameNode != null) {
            VHDLIdentifier newIdentifier = VHDLElementFactory.createIdentifier(
                    element.getProject(), newName);
            element.getParent().getNode().replaceChild(nameNode, newIdentifier.getNode());
            element = newIdentifier;
        }
        return element;
    }

    public static PsiElement getNameIdentifier(VHDLIdentifier element) {
        ASTNode nameNode = element.getNode();
        if (nameNode != null) {
            return nameNode.getPsi();
        } else {
            return null;
        }
    }
}
