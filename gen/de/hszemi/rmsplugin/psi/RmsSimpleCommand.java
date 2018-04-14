// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RmsSimpleCommand extends PsiElement {

  @Nullable
  RmsFourParameterCommand getFourParameterCommand();

  @Nullable
  RmsNoParameterCommand getNoParameterCommand();

  @Nullable
  RmsOneParameterCommand getOneParameterCommand();

  @Nullable
  RmsThreeParameterCommand getThreeParameterCommand();

  @Nullable
  RmsTwoParameterCommand getTwoParameterCommand();

}
