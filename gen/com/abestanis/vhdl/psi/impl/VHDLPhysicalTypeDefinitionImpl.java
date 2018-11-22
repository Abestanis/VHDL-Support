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

public class VHDLPhysicalTypeDefinitionImpl extends ASTWrapperPsiElement implements VHDLPhysicalTypeDefinition {

  public VHDLPhysicalTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPhysicalTypeDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLPrimaryUnitDeclaration getPrimaryUnitDeclaration() {
    return findNotNullChildByClass(VHDLPrimaryUnitDeclaration.class);
  }

  @Override
  @NotNull
  public VHDLRangeConstraint getRangeConstraint() {
    return findNotNullChildByClass(VHDLRangeConstraint.class);
  }

  @Override
  @NotNull
  public List<VHDLSecondaryUnitDeclaration> getSecondaryUnitDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLSecondaryUnitDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLSimpleName getSimpleName() {
    return findChildByClass(VHDLSimpleName.class);
  }

}
