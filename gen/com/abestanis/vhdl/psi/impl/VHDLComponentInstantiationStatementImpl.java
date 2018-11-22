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

public class VHDLComponentInstantiationStatementImpl extends ASTWrapperPsiElement implements VHDLComponentInstantiationStatement {

  public VHDLComponentInstantiationStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitComponentInstantiationStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLGenericMapAspect getGenericMapAspect() {
    return findChildByClass(VHDLGenericMapAspect.class);
  }

  @Override
  @NotNull
  public VHDLInstantiatedUnit getInstantiatedUnit() {
    return findNotNullChildByClass(VHDLInstantiatedUnit.class);
  }

  @Override
  @NotNull
  public VHDLLabel_ getLabel_() {
    return findNotNullChildByClass(VHDLLabel_.class);
  }

  @Override
  @Nullable
  public VHDLPortMapAspect getPortMapAspect() {
    return findChildByClass(VHDLPortMapAspect.class);
  }

}
