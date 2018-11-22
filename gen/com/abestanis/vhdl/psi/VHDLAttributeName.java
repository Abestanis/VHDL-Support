// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLAttributeName extends PsiElement {

  @NotNull
  VHDLAttributeDesignator getAttributeDesignator();

  @Nullable
  VHDLExpression getExpression();

  @Nullable
  VHDLFunctionCallParameter getFunctionCallParameter();

  @NotNull
  VHDLName_ getName_();

}
