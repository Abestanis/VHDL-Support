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

public class VHDLSequentialStatementImpl extends ASTWrapperPsiElement implements VHDLSequentialStatement {

  public VHDLSequentialStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitSequentialStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAssertionStatement getAssertionStatement() {
    return findChildByClass(VHDLAssertionStatement.class);
  }

  @Override
  @Nullable
  public VHDLCaseStatement getCaseStatement() {
    return findChildByClass(VHDLCaseStatement.class);
  }

  @Override
  @Nullable
  public VHDLExitStatement getExitStatement() {
    return findChildByClass(VHDLExitStatement.class);
  }

  @Override
  @Nullable
  public VHDLIfStatement getIfStatement() {
    return findChildByClass(VHDLIfStatement.class);
  }

  @Override
  @Nullable
  public VHDLLoopStatement getLoopStatement() {
    return findChildByClass(VHDLLoopStatement.class);
  }

  @Override
  @Nullable
  public VHDLNextStatement getNextStatement() {
    return findChildByClass(VHDLNextStatement.class);
  }

  @Override
  @Nullable
  public VHDLNullStatement getNullStatement() {
    return findChildByClass(VHDLNullStatement.class);
  }

  @Override
  @Nullable
  public VHDLProcedureCallStatement getProcedureCallStatement() {
    return findChildByClass(VHDLProcedureCallStatement.class);
  }

  @Override
  @Nullable
  public VHDLReportStatement getReportStatement() {
    return findChildByClass(VHDLReportStatement.class);
  }

  @Override
  @Nullable
  public VHDLReturnStatement getReturnStatement() {
    return findChildByClass(VHDLReturnStatement.class);
  }

  @Override
  @Nullable
  public VHDLSignalAssignmentStatement getSignalAssignmentStatement() {
    return findChildByClass(VHDLSignalAssignmentStatement.class);
  }

  @Override
  @Nullable
  public VHDLVariableAssignmentStatement getVariableAssignmentStatement() {
    return findChildByClass(VHDLVariableAssignmentStatement.class);
  }

  @Override
  @Nullable
  public VHDLWaitStatement getWaitStatement() {
    return findChildByClass(VHDLWaitStatement.class);
  }

}
