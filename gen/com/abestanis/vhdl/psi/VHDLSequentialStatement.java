// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSequentialStatement extends PsiElement {

  @Nullable
  VHDLAssertionStatement getAssertionStatement();

  @Nullable
  VHDLCaseStatement getCaseStatement();

  @Nullable
  VHDLExitStatement getExitStatement();

  @Nullable
  VHDLIfStatement getIfStatement();

  @Nullable
  VHDLLoopStatement getLoopStatement();

  @Nullable
  VHDLNextStatement getNextStatement();

  @Nullable
  VHDLNullStatement getNullStatement();

  @Nullable
  VHDLProcedureCallStatement getProcedureCallStatement();

  @Nullable
  VHDLReportStatement getReportStatement();

  @Nullable
  VHDLReturnStatement getReturnStatement();

  @Nullable
  VHDLSignalAssignmentStatement getSignalAssignmentStatement();

  @Nullable
  VHDLVariableAssignmentStatement getVariableAssignmentStatement();

  @Nullable
  VHDLWaitStatement getWaitStatement();

}
