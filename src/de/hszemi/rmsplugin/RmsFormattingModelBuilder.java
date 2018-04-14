package de.hszemi.rmsplugin;


import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import de.hszemi.rmsplugin.psi.RmsTypes;
import org.jetbrains.annotations.*;

public class RmsFormattingModelBuilder implements FormattingModelBuilder {
	@NotNull
	@Override
	public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
		return FormattingModelProvider
				.createFormattingModelForPsiFile(element.getContainingFile(),
						new RmsBlock(element.getNode(),
								Wrap.createWrap(WrapType.NONE, false),
								Alignment.createAlignment(),
								createSpaceBuilder(settings)),
						settings);
	}

	private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
		return new SpacingBuilder(settings, RmsLanguage.INSTANCE)
				.after(RmsTypes.COMMAND).lineBreakInCode()
				.after(RmsTypes.PERCENT_CHANCE_COMMAND).lineBreakInCode();
	}

	@Nullable
	@Override
	public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
		return null;
	}
}
