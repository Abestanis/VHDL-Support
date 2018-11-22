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

public class VHDLLiteral_Impl extends ASTWrapperPsiElement implements VHDLLiteral_ {

  public VHDLLiteral_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitLiteral_(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLEncodedStringLiteral getEncodedStringLiteral() {
    return findChildByClass(VHDLEncodedStringLiteral.class);
  }

  @Override
  @Nullable
  public VHDLEnumerationLiteral getEnumerationLiteral() {
    return findChildByClass(VHDLEnumerationLiteral.class);
  }

  @Override
  @Nullable
  public VHDLNumericLiteral getNumericLiteral() {
    return findChildByClass(VHDLNumericLiteral.class);
  }

}
