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

public class VHDLLoopStatementImpl extends ASTWrapperPsiElement implements VHDLLoopStatement {

  public VHDLLoopStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitLoopStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLIterationScheme getIterationScheme() {
    return findChildByClass(VHDLIterationScheme.class);
  }

  @Override
  @NotNull
  public List<VHDLLabel_> getLabel_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLLabel_.class);
  }

  @Override
  @NotNull
  public VHDLSequenceOfStatements getSequenceOfStatements() {
    return findNotNullChildByClass(VHDLSequenceOfStatements.class);
  }

}
