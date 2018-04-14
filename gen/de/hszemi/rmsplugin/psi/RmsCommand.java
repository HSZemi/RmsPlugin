// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RmsCommand extends PsiElement {

  @Nullable
  RmsBracketsCommand getBracketsCommand();

  @Nullable
  RmsHashmacro getHashmacro();

  @Nullable
  RmsHeader getHeader();

  @Nullable
  RmsIfBlock getIfBlock();

  @Nullable
  RmsRandomBlock getRandomBlock();

  @Nullable
  RmsSimpleCommand getSimpleCommand();

}
