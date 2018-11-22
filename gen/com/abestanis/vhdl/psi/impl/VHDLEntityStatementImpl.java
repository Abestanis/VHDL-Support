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

public class VHDLEntityStatementImpl extends ASTWrapperPsiElement implements VHDLEntityStatement {

  public VHDLEntityStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitEntityStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConcurrentAssertionStatement getConcurrentAssertionStatement() {
    return findChildByClass(VHDLConcurrentAssertionStatement.class);
  }

  @Override
  @Nullable
  public VHDLConcurrentProcedureCallStatement getConcurrentProcedureCallStatement() {
    return findChildByClass(VHDLConcurrentProcedureCallStatement.class);
  }

  @Override
  @Nullable
  public VHDLProcessStatement getProcessStatement() {
    return findChildByClass(VHDLProcessStatement.class);
  }

}
