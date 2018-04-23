package de.hszemi.rmsplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class RmsColorSettingsPage implements ColorSettingsPage {
	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
			new AttributesDescriptor("Comment", RmsSyntaxHighlighter.COMMENT),
			new AttributesDescriptor("Const keyword", RmsSyntaxHighlighter.KEYWORD_CONST),
			new AttributesDescriptor("Const name", RmsSyntaxHighlighter.CONST_NAME),
			new AttributesDescriptor("Integer", RmsSyntaxHighlighter.INTEGER),
			new AttributesDescriptor("Section header", RmsSyntaxHighlighter.SECTION_HEADER),
	};

	@Nullable
	@Override
	public Icon getIcon() {
		return RmsIcons.FILE;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new RmsSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return "/* For more information visit www.AoCZone.net */\n" +
				"\n" +
				"#const AMOUNT_FOOD 0\n" +
				"#const GAIA_SET_PLAYER_DATA -10\n" +
				"\n" +
				"/* ************ ARENA ************ */" +
				"\n" +
				"<LAND_GENERATION>\n" +
				"CLG\n" +
				"CLG\n";
	}

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Rms";
	}
}