package de.hszemi.rmsplugin.psi;

import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.RmsLanguage;
import org.jetbrains.annotations.*;

public class RmsElementType extends IElementType {
	public RmsElementType(@NotNull @NonNls String debugName) {
		super(debugName, RmsLanguage.INSTANCE);
	}
}