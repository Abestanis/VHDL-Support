// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSubprogramBody extends PsiElement {

  @Nullable
  VHDLDesignator getDesignator();

  @NotNull
  VHDLSubprogramDeclarativePart getSubprogramDeclarativePart();

  @Nullable
  VHDLSubprogramKind getSubprogramKind();

  @NotNull
  VHDLSubprogramSpecification getSubprogramSpecification();

  @NotNull
  VHDLSubprogramStatementPart getSubprogramStatementPart();

}
