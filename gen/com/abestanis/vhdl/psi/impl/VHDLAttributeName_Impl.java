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

public class VHDLAttributeName_Impl extends VHDLName_Impl implements VHDLAttributeName_ {

  public VHDLAttributeName_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitAttributeName_(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLAttributeDesignator getAttributeDesignator() {
    return findNotNullChildByClass(VHDLAttributeDesignator.class);
  }

  @Override
  @Nullable
  public VHDLExpression getExpression() {
    return findChildByClass(VHDLExpression.class);
  }

  @Override
  @Nullable
  public VHDLFunctionCallParameter getFunctionCallParameter() {
    return findChildByClass(VHDLFunctionCallParameter.class);
  }

  @Override
  @NotNull
  public VHDLName_ getName_() {
    return findNotNullChildByClass(VHDLName_.class);
  }

}
