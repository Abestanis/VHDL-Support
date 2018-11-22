// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.abestanis.vhdl.psi.*;

public class VHDLVariableDeclarationImpl extends ASTWrapperPsiElement implements VHDLVariableDeclaration {

  public VHDLVariableDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitVariableDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLExpression getExpression() {
    return findChildByClass(VHDLExpression.class);
  }

  @Override
  @NotNull
  public VHDLIdentifierList getIdentifierList() {
    return findNotNullChildByClass(VHDLIdentifierList.class);
  }

  @Override
  @NotNull
  public VHDLSubtypeIndication getSubtypeIndication() {
    return findNotNullChildByClass(VHDLSubtypeIndication.class);
  }

}
