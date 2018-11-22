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

public class VHDLPackageBodyImpl extends ASTWrapperPsiElement implements VHDLPackageBody {

  public VHDLPackageBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPackageBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLPackageBodyDeclarativePart getPackageBodyDeclarativePart() {
    return findNotNullChildByClass(VHDLPackageBodyDeclarativePart.class);
  }

  @Override
  @NotNull
  public List<VHDLSimpleName> getSimpleNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLSimpleName.class);
  }

}
