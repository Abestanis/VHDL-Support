// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLConditionalWaveforms extends PsiElement {

  @NotNull
  List<VHDLCondition> getConditionList();

  @NotNull
  List<VHDLWaveform> getWaveformList();

}
