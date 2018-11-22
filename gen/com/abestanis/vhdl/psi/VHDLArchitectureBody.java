// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLArchitectureBody extends PsiElement {

  @NotNull
  VHDLArchitectureDeclarativePart getArchitectureDeclarativePart();

  @NotNull
  VHDLArchitectureStatementPart getArchitectureStatementPart();

  @NotNull
  VHDLIdentifier getIdentifier();

  @NotNull
  List<VHDLName_> getName_List();

}
