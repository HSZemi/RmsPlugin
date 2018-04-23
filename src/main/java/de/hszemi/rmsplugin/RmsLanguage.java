package de.hszemi.rmsplugin;

import com.intellij.lang.Language;

public class RmsLanguage extends Language {
	public static final RmsLanguage INSTANCE = new RmsLanguage();

	private RmsLanguage() {
		super("Rms");
	}
}