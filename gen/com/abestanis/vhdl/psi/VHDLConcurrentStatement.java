// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConcurrentStatement extends PsiElement {

  @Nullable
  VHDLBlockStatement getBlockStatement();

  @Nullable
  VHDLComponentInstantiationStatement getComponentInstantiationStatement();

  @Nullable
  VHDLConcurrentAssertionStatement getConcurrentAssertionStatement();

  @Nullable
  VHDLConcurrentProcedureCallStatement getConcurrentProcedureCallStatement();

  @Nullable
  VHDLConcurrentSignalAssignmentStatement getConcurrentSignalAssignmentStatement();

  @Nullable
  VHDLGenerateStatement getGenerateStatement();

  @Nullable
  VHDLProcessStatement getProcessStatement();

}
