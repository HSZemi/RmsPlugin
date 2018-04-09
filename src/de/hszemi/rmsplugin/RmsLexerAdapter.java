package de.hszemi.rmsplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class RmsLexerAdapter extends FlexAdapter {
	public RmsLexerAdapter() {
		super(new RmsLexer((Reader) null));
	}
}
