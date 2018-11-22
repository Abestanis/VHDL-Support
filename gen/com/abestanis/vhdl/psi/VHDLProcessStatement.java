// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLProcessStatement extends PsiElement {

  @NotNull
  List<VHDLLabel_> getLabel_List();

  @NotNull
  VHDLProcessDeclarativePart getProcessDeclarativePart();

  @NotNull
  VHDLProcessStatementPart getProcessStatementPart();

  @Nullable
  VHDLSensitivityList getSensitivityList();

}
