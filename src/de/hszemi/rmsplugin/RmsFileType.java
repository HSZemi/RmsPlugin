package de.hszemi.rmsplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class RmsFileType extends LanguageFileType {
	public static final RmsFileType INSTANCE = new RmsFileType();

	private RmsFileType() {
		super(RmsLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "RMS file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "RMS language file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "rms";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return RmsIcons.FILE;
	}
}