/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.xtext.format.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.avaloq.tools.ddk.xtext.format.services.FormatGrammarAccess;

public class FormatParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FormatGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.avaloq.tools.ddk.xtext.format.parser.antlr.internal.InternalFormatParser createParser(XtextTokenStream stream) {
		return new com.avaloq.tools.ddk.xtext.format.parser.antlr.internal.InternalFormatParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "FormatConfiguration";
	}
	
	public FormatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FormatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
