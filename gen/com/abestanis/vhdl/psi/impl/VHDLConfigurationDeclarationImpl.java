// This is a generated file. Not intended for manual editing.
package com.abestanis.vhdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.abestanis.vhdl.psi.VHDLTypes.*;
import com.abestanis.vhdl.psi.*;

public class VHDLConfigurationDeclarationImpl extends VHDLDeclarationImpl implements VHDLConfigurationDeclaration {

  public VHDLConfigurationDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitConfigurationDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLBlockConfiguration getBlockConfiguration() {
    return findNotNullChildByClass(VHDLBlockConfiguration.class);
  }

  @Override
  @NotNull
  public VHDLConfigurationDeclarativePart getConfigurationDeclarativePart() {
    return findNotNullChildByClass(VHDLConfigurationDeclarativePart.class);
  }

  @Override
  @NotNull
  public VHDLIdentifier getIdentifier() {
    return findNotNullChildByClass(VHDLIdentifier.class);
  }

  @Override
  @NotNull
  public List<VHDLName_> getName_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLName_.class);
  }

}
