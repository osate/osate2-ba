package org.osate.ba.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.NamedElement;

public class BehaviorAnnexQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	// Enable to limit indexing to global items
	// Duplicates checking only applies to global items
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof NamedElement){
			if (((NamedElement)obj).getName() == null) return null;
			return getConverter().toQualifiedName(getTheName((NamedElement)obj));
		}
	   return null;
	}
	
	protected String getTheName(NamedElement namedElement){
		NamedElement root = namedElement.getElementRoot();
		return root.getName() + "::behavior_specification::" + namedElement.getName();
	}


}
