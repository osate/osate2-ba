package org.osate.xtext.ba;

import java.util.Collections ;
import java.util.List ;

import org.eclipse.emf.ecore.EClass ;
import org.eclipse.emf.ecore.EObject ;
import org.eclipse.emf.ecore.EReference ;
import org.eclipse.uml2.uml.NamedElement ;
import org.eclipse.xtext.EcoreUtil2 ;
import org.eclipse.xtext.linking.impl.IllegalNodeException ;
import org.eclipse.xtext.nodemodel.INode ;
import org.osate.aadl2.Element ;
import org.osate.ba.aadlba.AadlBaPackage ;
import org.osate.ba.aadlba.BehaviorAnnex ;
import org.osate.ba.aadlba.BehaviorElement ;
import org.osate.ba.aadlba.BehaviorState ;
import org.osate.ba.aadlba.BehaviorVariable ;
import org.osate.ba.utils.AadlBaUtils ;
import org.osate.xtext.aadl2.properties.linking.PropertiesLinkingService ;

public class BehaviorAnnexLinkingService extends PropertiesLinkingService 
{

  @Override
  public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
      throws IllegalNodeException {
    final EClass requiredType = reference.getEReferenceType();
    if (requiredType == null)
      return Collections.<EObject> emptyList();
    BehaviorElement cxt = (BehaviorElement) context;
    BehaviorAnnex ba = AadlBaUtils.getBehaviorAnnex(cxt);
    if(ba==null)
      return Collections.<EObject> emptyList();
    final String name = getCrossRefNodeAsString(node);
    
    if(AadlBaPackage.eINSTANCE.getBehaviorState()==requiredType)
    {
      for(EObject obj:EcoreUtil2.getAllContentsOfType(ba, BehaviorState.class))
      {
        BehaviorState bs = (BehaviorState) obj;
        if(bs == null || bs.getName()==null || name == null)
        	return Collections.<EObject> emptyList();
        if(bs.getName().equals(name))
          return Collections.singletonList(bs);
      }
    }
    
    if(AadlBaPackage.eINSTANCE.getBehaviorVariable()==requiredType)
    {
      for(EObject obj:EcoreUtil2.getAllContentsOfType(ba, BehaviorVariable.class))
      {
        BehaviorVariable bv = (BehaviorVariable) obj;
        if(bv == null || bv.getName()==null || name == null)
        	return Collections.<EObject> emptyList();
        if(bv.getName().equals(name))
          return Collections.singletonList(bv);
      }
    }
    
    return super.getLinkedObjects(context, reference, node);
    
  }
  
}
