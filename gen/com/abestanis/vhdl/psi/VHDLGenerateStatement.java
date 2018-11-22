// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLGenerateStatement extends PsiElement {

  @NotNull
  List<VHDLBlockDeclarativeItem> getBlockDeclarativeItemList();

  @NotNull
  List<VHDLConcurrentStatement> getConcurrentStatementList();

  @NotNull
  VHDLGenerationScheme getGenerationScheme();

  @NotNull
  List<VHDLLabel_> getLabel_List();

}
