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

public class RmsNonBracketsCommandInBracketsImpl extends ASTWrapperPsiElement implements RmsNonBracketsCommandInBrackets {

  public RmsNonBracketsCommandInBracketsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RmsVisitor visitor) {
    visitor.visitNonBracketsCommandInBrackets(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RmsVisitor) accept((RmsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RmsIfBlock getIfBlock() {
    return findChildByClass(RmsIfBlock.class);
  }

  @Override
  @Nullable
  public RmsRandomBlock getRandomBlock() {
    return findChildByClass(RmsRandomBlock.class);
  }

  @Override
  @Nullable
  public RmsSimpleCommand getSimpleCommand() {
    return findChildByClass(RmsSimpleCommand.class);
  }

}
