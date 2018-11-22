// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLIfStatement extends PsiElement {

  @NotNull
  List<VHDLCondition> getConditionList();

  @NotNull
  List<VHDLLabel_> getLabel_List();

  @NotNull
  List<VHDLSequenceOfStatements> getSequenceOfStatementsList();

}
