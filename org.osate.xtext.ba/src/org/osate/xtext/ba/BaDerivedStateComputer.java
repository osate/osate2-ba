package org.osate.xtext.ba;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisToParseErrorReporterAdapter;
import org.osate.aadl2.modelsupport.errorreporting.LogParseErrorReporter;
import org.osate.aadl2.modelsupport.errorreporting.MarkerParseErrorReporter;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporterFactory;
import org.osate.ba.AadlBaResolver;
import org.osate.ba.aadlba.AadlBaFactory;
import org.osate.ba.aadlba.BehaviorAnnex;
import org.osate.ba.aadlba.BehaviorState;
import org.osate.ba.aadlba.BehaviorVariable;
import org.osate.ba.aadlba.BehaviorVariableHolder;
import org.osate.ba.aadlba.Target;
import org.osate.ba.analyzers.AadlBaNameResolver;
import org.osate.ba.analyzers.DeclarativeUtils;
import org.osate.core.OsateCorePlugin;

public class BaDerivedStateComputer implements IDerivedStateComputer {

	private final ParseErrorReporterFactory parseErrorLoggerFactory = new LogParseErrorReporter.Factory(
			OsateCorePlugin.getDefault().getBundle());
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		final AnalysisErrorReporterManager resolveErrManager = new AnalysisErrorReporterManager(
				new AnalysisToParseErrorReporterAdapter.Factory(new MarkerParseErrorReporter.Factory(
						"org.osate.aadl2.modelsupport.ParseErrorMarker", parseErrorLoggerFactory)));

		
		if(!resource.getErrors().isEmpty())
		  return;
		
		TreeIterator<EObject> iter = resource.getAllContents();
		while(iter.hasNext())
		{
			EObject obj = iter.next();
			if(obj instanceof BehaviorAnnex)
			{
				System.out.println("About to resolve names");
				BehaviorAnnex ba = (BehaviorAnnex) obj;
				
				DeclarativeUtils.reinstanciateBehaviorStates(ba);
				DeclarativeUtils.reinstanciateBehaviorVariables(ba);
				
				AadlBaResolver resolver = new AadlBaResolver();
				resolver.doResolution(ba, resolveErrManager);
				
				EList<BehaviorState> lstates = ba.getStates() ;
				for(BehaviorState bs : lstates)
					if(bs.isInitial())
						ba.setInitialState(bs);
				
				DeclarativeUtils.reinstanciateBehaviorTransitions(ba);
				System.out.println("Resolve names done");
				
			}
		}

	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		// TODO Auto-generated method stub
		
	}

}
