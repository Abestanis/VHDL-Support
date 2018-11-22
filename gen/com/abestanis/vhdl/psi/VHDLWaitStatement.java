// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLWaitStatement extends PsiElement {

  @Nullable
  VHDLConditionClause getConditionClause();

  @Nullable
  VHDLLabel_ getLabel_();

  @Nullable
  VHDLSensitivityClause getSensitivityClause();

  @Nullable
  VHDLTimeoutClause getTimeoutClause();

}
