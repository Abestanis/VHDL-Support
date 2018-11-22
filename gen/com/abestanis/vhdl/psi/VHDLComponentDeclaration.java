// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLComponentDeclaration extends VHDLDeclaration {

  @Nullable
  VHDLGenericClause getGenericClause();

  @NotNull
  VHDLIdentifier getIdentifier();

  @Nullable
  VHDLPortClause getPortClause();

  @Nullable
  VHDLSimpleName getSimpleName();

}
