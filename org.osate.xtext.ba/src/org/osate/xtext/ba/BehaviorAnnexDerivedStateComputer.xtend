package org.osate.xtext.ba

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource

class BehaviorAnnexDerivedStateComputer implements IDerivedStateComputer {
	
	override discardDerivedState(DerivedStateAwareResource resource) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
		println("HELLO !!!")
		// BehaviorVariables: namesDeclaration
		// BehaviorTransitions: sourceStatesDeclaration
		// BehaviorElement: elementHolderDeclaration
		// warning; used in many places
		/*
		 * 
		 * Target may be
		 * BehaviorVariableHolder 
		 * | DataAccessHolder 
		 * | DataAccessPrototypeHolder 
		 * | DataComponentReference 
		 * | DataPortHolder 
		 * | DataSubcomponentHolder
		 * | EventDataPortHolder 
		 * | EventPortHolder 
		 * | FeaturePrototypeHolder
		 * | ParameterHolder 
		 * | PortPrototypeHolder 
		 * | StructUnionElementHolder
		 */
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
		
	}
	
}