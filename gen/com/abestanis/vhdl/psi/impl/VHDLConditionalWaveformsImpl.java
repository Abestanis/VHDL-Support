// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.abestanis.vhdl.psi.*;

public class VHDLConditionalWaveformsImpl extends ASTWrapperPsiElement implements VHDLConditionalWaveforms {

  public VHDLConditionalWaveformsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConditionalWaveforms(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VHDLCondition> getConditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLCondition.class);
  }

  @Override
  @NotNull
  public List<VHDLWaveform> getWaveformList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLWaveform.class);
  }

}
