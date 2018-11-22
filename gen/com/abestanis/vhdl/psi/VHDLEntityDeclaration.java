// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLEntityDeclaration extends VHDLDeclaration {

  @NotNull
  VHDLEntityDeclarativePart getEntityDeclarativePart();

  @NotNull
  VHDLEntityHeader getEntityHeader();

  @Nullable
  VHDLEntityStatementPart getEntityStatementPart();

  @NotNull
  VHDLIdentifier getIdentifier();

  @Nullable
  VHDLSimpleName getSimpleName();

}
