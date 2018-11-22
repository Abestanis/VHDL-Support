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

public class VHDLPrimaryImpl extends ASTWrapperPsiElement implements VHDLPrimary {

  public VHDLPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAggregate getAggregate() {
    return findChildByClass(VHDLAggregate.class);
  }

  @Override
  @Nullable
  public VHDLAllocator getAllocator() {
    return findChildByClass(VHDLAllocator.class);
  }

  @Override
  @Nullable
  public VHDLExpression getExpression() {
    return findChildByClass(VHDLExpression.class);
  }

  @Override
  @Nullable
  public VHDLFunctionCall getFunctionCall() {
    return findChildByClass(VHDLFunctionCall.class);
  }

  @Override
  @Nullable
  public VHDLLiteral_ getLiteral_() {
    return findChildByClass(VHDLLiteral_.class);
  }

  @Override
  @Nullable
  public VHDLName_ getName_() {
    return findChildByClass(VHDLName_.class);
  }

  @Override
  @Nullable
  public VHDLQualifiedExpression getQualifiedExpression() {
    return findChildByClass(VHDLQualifiedExpression.class);
  }

  @Override
  @Nullable
  public VHDLTypeConversion getTypeConversion() {
    return findChildByClass(VHDLTypeConversion.class);
  }

}
