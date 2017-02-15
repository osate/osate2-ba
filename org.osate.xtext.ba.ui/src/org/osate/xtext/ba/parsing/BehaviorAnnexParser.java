package org.osate.xtext.ba.parsing;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.parser.antlr.BaParser ;
import org.osate.xtext.services.BaGrammarAccess ;

import com.google.inject.Injector;

public class BehaviorAnnexParser implements AnnexParser { 
	// Need to get aadl resources for resolving components
	// For resolving package names etc
	
	
    private Injector injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.Ba");

	private BaParser baParser ;

	protected  BaParser getParser() {
			if (baParser == null) {
				if (injector == null){
					
					injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.Ba");
				}
				baParser = injector.getInstance(BaParser.class);
			}
		return baParser;
	}

	protected  BaGrammarAccess getGrammarAccess() {
		return getParser().getGrammarAccess();
	}
	
	public AnnexLibrary parseAnnexLibrary
			(
				String annexName, String source,
				String filename, int line, int column, ParseErrorReporter errReporter
			) {
		return null;

	 }

	public AnnexSubclause parseAnnexSubclause
			(
				String annexName, String source, String filename, 
				int line, int column, ParseErrorReporter errReporter
			) {
	  AnnexSubclause eas = (AnnexSubclause) AnnexParseUtil.parse(getParser(),
	                                                             source,
	                                                             getGrammarAccess().getBehaviorAnnexSubclauseRule(),
	                                                             filename,
	                                                             line,
	                                                             column,
	                                                             errReporter);
		 return eas;
	 }



}