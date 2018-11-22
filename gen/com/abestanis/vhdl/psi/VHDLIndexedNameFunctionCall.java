// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLIndexedNameFunctionCall extends VHDLName_ {

  @NotNull
  List<VHDLExpression> getExpressionList();

  @NotNull
  VHDLFunctionCallParameter getFunctionCallParameter();

  @NotNull
  VHDLName_ getName_();

}
