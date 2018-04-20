// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RmsBracketsCommand extends PsiElement {

  @Nullable
  RmsIfBlock getIfBlock();

  @Nullable
  RmsNoParameterCommand getNoParameterCommand();

  @NotNull
  List<RmsNonBracketsCommandInBrackets> getNonBracketsCommandInBracketsList();

  @Nullable
  RmsOneParameterCommand getOneParameterCommand();

  @Nullable
  RmsRandomBlock getRandomBlock();

}
