package de.hszemi.rmsplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.hszemi.rmsplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RmsFile extends PsiFileBase {
	public RmsFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, RmsLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return RmsFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Rms File";
	}

	@Override
	public Icon getIcon(int flags) {
		return super.getIcon(flags);
	}
}