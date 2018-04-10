package de.hszemi.rmsplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.psi.RmsTypes;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class RmsSyntaxHighlighter extends SyntaxHighlighterBase {
	public static final Set<IElementType> HEADERS = headers();
	public static final Set<IElementType> MACROS = macros();
	public static final Set<IElementType> BRACKETS = brackets();

	private static Set<IElementType> headers() {
		LinkedHashSet<IElementType> headers = new LinkedHashSet<>();
		headers.add(RmsTypes.HEADER_CLIFF_GENERATION);
		headers.add(RmsTypes.HEADER_CONNECTION_GENERATION);
		headers.add(RmsTypes.HEADER_ELEVATION_GENERATION);
		headers.add(RmsTypes.HEADER_LAND_GENERATION);
		headers.add(RmsTypes.HEADER_OBJECTS_GENERATION);
		headers.add(RmsTypes.HEADER_PLAYER_SETUP);
		headers.add(RmsTypes.HEADER_TERRAIN_GENERATION);
		return headers;
	}
	private static Set<IElementType> macros() {
		LinkedHashSet<IElementType> macros = new LinkedHashSet<>();
		macros.add(RmsTypes.KEYWORD_HASHMACRO);
		return macros;
	}
	private static Set<IElementType> brackets() {
		LinkedHashSet<IElementType> brackets = new LinkedHashSet<>();
		brackets.add(RmsTypes.LEFT_BRACKET);
		brackets.add(RmsTypes.RIGHT_BRACKET);
		return brackets;
	}

	public static final TextAttributesKey SECTION_HEADER =
			createTextAttributesKey("Rms_SECTION_HEADER", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
	public static final TextAttributesKey KEYWORD_CONST =
			createTextAttributesKey("Rms_KEYWORD_CONST", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey CONST_NAME =
			createTextAttributesKey("Rms_CONST_NAME", DefaultLanguageHighlighterColors.STATIC_FIELD);
	public static final TextAttributesKey INTEGER =
			createTextAttributesKey("Rms_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey COMMENT =
			createTextAttributesKey("Rms_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BRACES =
			createTextAttributesKey("Rms_BRACKETS", DefaultLanguageHighlighterColors.BRACES);
	public static final TextAttributesKey BAD_CHARACTER =
			createTextAttributesKey("Rms_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

	private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
	private static final TextAttributesKey[] CONST_SECTION_HEADER = new TextAttributesKey[]{SECTION_HEADER};
	private static final TextAttributesKey[] INTEGER_KEYS = new TextAttributesKey[]{INTEGER};
	private static final TextAttributesKey[] CONST_NAME_KEYS = new TextAttributesKey[]{CONST_NAME};
	private static final TextAttributesKey[] KEYWORD_CONST_KEYS = new TextAttributesKey[]{KEYWORD_CONST};
	private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
	private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		return new RmsLexerAdapter();
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if (tokenType.equals(RmsTypes.INTEGER)) {
			return INTEGER_KEYS;
		} else if (HEADERS.contains(tokenType)) {
			return CONST_SECTION_HEADER;
		} else if (tokenType.equals(RmsTypes.CONST_NAME)) {
			return CONST_NAME_KEYS;
		} else if (MACROS.contains(tokenType)) {
			return KEYWORD_CONST_KEYS;
		} else if (BRACKETS.contains(tokenType)) {
			return BRACES_KEYS;
		} else if (tokenType.equals(RmsTypes.COMMENT)) {
			return COMMENT_KEYS;
		} else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
			return BAD_CHAR_KEYS;
		} else {
			return EMPTY_KEYS;
		}
	}
}