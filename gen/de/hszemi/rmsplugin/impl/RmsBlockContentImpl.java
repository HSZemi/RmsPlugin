// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.hszemi.rmsplugin.psi.RmsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.hszemi.rmsplugin.psi.*;

public class RmsBlockContentImpl extends ASTWrapperPsiElement implements RmsBlockContent {

  public RmsBlockContentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RmsVisitor visitor) {
    visitor.visitBlockContent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RmsVisitor) accept((RmsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RmsCommand> getCommandList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RmsCommand.class);
  }

}
