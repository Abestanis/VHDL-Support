// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLPrimary extends PsiElement {

  @Nullable
  VHDLAggregate getAggregate();

  @Nullable
  VHDLAllocator getAllocator();

  @Nullable
  VHDLExpression getExpression();

  @Nullable
  VHDLFunctionCall getFunctionCall();

  @Nullable
  VHDLLiteral_ getLiteral_();

  @Nullable
  VHDLName_ getName_();

  @Nullable
  VHDLQualifiedExpression getQualifiedExpression();

  @Nullable
  VHDLTypeConversion getTypeConversion();

}
