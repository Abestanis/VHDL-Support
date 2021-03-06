// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import com.abestanis.vhdl.psi.VHDLNamedElementImp;
import com.abestanis.vhdl.psi.*;

public class VHDLIdentifierImpl extends VHDLNamedElementImp implements VHDLIdentifier {

  public VHDLIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  public String getName() {
    return VHDLPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return VHDLPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return VHDLPsiImplUtil.getNameIdentifier(this);
  }

}
