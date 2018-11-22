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

public class VHDLConcurrentSignalAssignmentStatementImpl extends ASTWrapperPsiElement implements VHDLConcurrentSignalAssignmentStatement {

  public VHDLConcurrentSignalAssignmentStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConcurrentSignalAssignmentStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConditionalSignalAssignment getConditionalSignalAssignment() {
    return findChildByClass(VHDLConditionalSignalAssignment.class);
  }

  @Override
  @Nullable
  public VHDLLabel_ getLabel_() {
    return findChildByClass(VHDLLabel_.class);
  }

  @Override
  @Nullable
  public VHDLSelectedSignalAssignment getSelectedSignalAssignment() {
    return findChildByClass(VHDLSelectedSignalAssignment.class);
  }

}
