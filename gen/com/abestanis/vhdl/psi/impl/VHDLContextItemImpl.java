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

public class VHDLContextItemImpl extends ASTWrapperPsiElement implements VHDLContextItem {

  public VHDLContextItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitContextItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLLibraryClause getLibraryClause() {
    return findChildByClass(VHDLLibraryClause.class);
  }

  @Override
  @Nullable
  public VHDLUseClause getUseClause() {
    return findChildByClass(VHDLUseClause.class);
  }

}