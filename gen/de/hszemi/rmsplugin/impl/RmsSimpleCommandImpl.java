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

public class RmsSimpleCommandImpl extends ASTWrapperPsiElement implements RmsSimpleCommand {

  public RmsSimpleCommandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RmsVisitor visitor) {
    visitor.visitSimpleCommand(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RmsVisitor) accept((RmsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RmsFourParameterCommand getFourParameterCommand() {
    return findChildByClass(RmsFourParameterCommand.class);
  }

  @Override
  @Nullable
  public RmsNoParameterCommand getNoParameterCommand() {
    return findChildByClass(RmsNoParameterCommand.class);
  }

  @Override
  @Nullable
  public RmsOneParameterCommand getOneParameterCommand() {
    return findChildByClass(RmsOneParameterCommand.class);
  }

  @Override
  @Nullable
  public RmsThreeParameterCommand getThreeParameterCommand() {
    return findChildByClass(RmsThreeParameterCommand.class);
  }

  @Override
  @Nullable
  public RmsTwoParameterCommand getTwoParameterCommand() {
    return findChildByClass(RmsTwoParameterCommand.class);
  }

}
