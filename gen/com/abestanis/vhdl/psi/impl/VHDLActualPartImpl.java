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

public class VHDLActualPartImpl extends ASTWrapperPsiElement implements VHDLActualPart {

  public VHDLActualPartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitActualPart(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLActualDesignator getActualDesignator() {
    return findNotNullChildByClass(VHDLActualDesignator.class);
  }

  @Override
  @Nullable
  public VHDLName_ getName_() {
    return findChildByClass(VHDLName_.class);
  }

  @Override
  @Nullable
  public VHDLTypeMark getTypeMark() {
    return findChildByClass(VHDLTypeMark.class);
  }

}
