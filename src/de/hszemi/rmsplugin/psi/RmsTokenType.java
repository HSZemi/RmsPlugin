package de.hszemi.rmsplugin.psi;

import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.RmsLanguage;
import org.jetbrains.annotations.*;

public class RmsTokenType extends IElementType {
	public RmsTokenType(@NotNull @NonNls String debugName) {
		super(debugName, RmsLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "RmsTokenType." + super.toString();
	}
}