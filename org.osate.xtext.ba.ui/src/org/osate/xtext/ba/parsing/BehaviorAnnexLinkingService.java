package org.osate.xtext.ba.parsing;

import java.util.Collections ;
import java.util.List ;

import org.eclipse.emf.ecore.EObject ;
import org.eclipse.emf.ecore.EReference ;
import org.eclipse.xtext.linking.ILinkingService ;
import org.eclipse.xtext.naming.IQualifiedNameProvider ;
import org.eclipse.xtext.naming.QualifiedName ;
import org.eclipse.xtext.nodemodel.INode ;
import org.osate.annexsupport.AnnexLinkingService ;
import org.osate.ba.naming.BehaviorAnnexQualifiedNameProvider ;
import org.osate.ba.utils.AadlBaUtils ;
import org.osate.core.OsateCorePlugin ;
import org.osate.xtext.aadl2.properties.linking.PropertiesLinkingService ;

import com.google.inject.Injector ;

public class BehaviorAnnexLinkingService implements AnnexLinkingService
{

  final private Injector injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.Ba");
  
  private ILinkingService linkingService;
  
  private IQualifiedNameProvider nameProvider;
  
  protected  ILinkingService getLinkingService(){
    if (linkingService == null){
      linkingService =  injector.getInstance(org.osate.xtext.ba.BehaviorAnnexLinkingService.class);
    }
    return linkingService;
  }
  
  
  protected  IQualifiedNameProvider getNameProvider(){
    if (nameProvider == null){
      nameProvider =  injector.getInstance(BehaviorAnnexQualifiedNameProvider.class);
    }
    return nameProvider;
  }
  @Override
  public List<EObject> resolveAnnexReference(String annexName, EObject context,
                                             EReference reference, INode node)
  {
    if (annexName.equalsIgnoreCase(AadlBaUtils.ANNEX_NAME)){
      return getLinkingService().getLinkedObjects(context, reference, node) ;
      } else {
        return Collections.<EObject> emptyList();
      }
  }

  @Override
  public QualifiedName getFullyQualifiedName(EObject obj)
  {
	  return null;
//	  return getNameProvider().getFullyQualifiedName(obj);
  }

}
