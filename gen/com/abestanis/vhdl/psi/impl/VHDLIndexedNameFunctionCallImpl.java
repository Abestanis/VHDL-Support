// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import com.abestanis.vhdl.psi.*;

public class VHDLIndexedNameFunctionCallImpl extends VHDLName_Impl implements VHDLIndexedNameFunctionCall {

  public VHDLIndexedNameFunctionCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitIndexedNameFunctionCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VHDLExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLExpression.class);
  }

  @Override
  @NotNull
  public VHDLFunctionCallParameter getFunctionCallParameter() {
    return findNotNullChildByClass(VHDLFunctionCallParameter.class);
  }

  @Override
  @NotNull
  public VHDLName_ getName_() {
    return findNotNullChildByClass(VHDLName_.class);
  }

}
