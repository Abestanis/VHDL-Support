// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLBlockStatement extends PsiElement {

  @NotNull
  VHDLBlockDeclarativePart getBlockDeclarativePart();

  @NotNull
  VHDLBlockHeader getBlockHeader();

  @NotNull
  VHDLBlockStatementPart getBlockStatementPart();

  @Nullable
  VHDLExpression getExpression();

  @NotNull
  List<VHDLLabel_> getLabel_List();

}
