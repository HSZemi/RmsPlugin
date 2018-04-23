package de.hszemi.rmsplugin;


import com.intellij.testFramework.ParsingTestCase;

public class ParsingTest extends ParsingTestCase {
	public ParsingTest() {
		super("", "rms", new RmsParserDefinition());
	}

	public void testComment() {
		doTest(true);
	}

	@Override
	protected String getTestDataPath() {
		return "src/test/resources/parsing";
	}

	@Override
	protected boolean skipSpaces() {
		return false;
	}

	@Override
	protected boolean includeRanges() {
		return true;
	}


}