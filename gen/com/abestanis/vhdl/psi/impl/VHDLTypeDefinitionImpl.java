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

public class VHDLTypeDefinitionImpl extends ASTWrapperPsiElement implements VHDLTypeDefinition {

  public VHDLTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitTypeDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAccessTypeDefinition getAccessTypeDefinition() {
    return findChildByClass(VHDLAccessTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLCompositeTypeDefinition getCompositeTypeDefinition() {
    return findChildByClass(VHDLCompositeTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLFileTypeDefinition getFileTypeDefinition() {
    return findChildByClass(VHDLFileTypeDefinition.class);
  }

  @Override
  @Nullable
  public VHDLScalarTypeDefinition getScalarTypeDefinition() {
    return findChildByClass(VHDLScalarTypeDefinition.class);
  }

}
