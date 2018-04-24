package de.hszemi.rmsplugin;

import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.commands.Command;
import de.hszemi.rmsplugin.psi.RmsTypes;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RmsAnnotator implements Annotator {
	@Override
	public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
		IElementType elementType = element.getNode().getElementType();
		if (elementType == RmsTypes.COMMAND_NAME) {

			if (!Command.allCommands.contains(element.getText())) {
				TextRange range = new TextRange(element.getTextRange().getStartOffset(),
						element.getTextRange().getEndOffset());
				holder.createErrorAnnotation(range, "Unknown command");
			}
		} else if(elementType == RmsTypes.COMMENT){
			String text = element.getText();
			if(!text.startsWith("/* ")){
				int startOffset = element.getTextRange().getStartOffset();
				TextRange startRange = new TextRange(startOffset,
						startOffset+2);
				holder.createErrorAnnotation(startRange, "Comment start markers must have a space at the end");
			}
			if(!text.endsWith(" */")){
				int endOffset = element.getTextRange().getEndOffset();
				TextRange startRange = new TextRange(endOffset-2,
						endOffset);
				holder.createErrorAnnotation(startRange, "Comment end markers must have a space at the front");
			}
		}
	}
}