// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLPhysicalTypeDefinition extends PsiElement {

  @NotNull
  VHDLPrimaryUnitDeclaration getPrimaryUnitDeclaration();

  @NotNull
  VHDLRangeConstraint getRangeConstraint();

  @NotNull
  List<VHDLSecondaryUnitDeclaration> getSecondaryUnitDeclarationList();

  @Nullable
  VHDLSimpleName getSimpleName();

}
