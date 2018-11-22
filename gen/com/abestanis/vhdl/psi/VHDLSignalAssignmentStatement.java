// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSignalAssignmentStatement extends PsiElement {

  @Nullable
  VHDLDelayMechanism getDelayMechanism();

  @Nullable
  VHDLLabel_ getLabel_();

  @NotNull
  VHDLTarget getTarget();

  @NotNull
  VHDLWaveform getWaveform();

}
