/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

package org.osate.ba.analyzers;

import java.util.ArrayList ;
import java.util.List ;

import org.eclipse.emf.ecore.InternalEObject ;
import org.osate.aadl2.Element ;
import org.osate.aadl2.ModalPropertyValue ;
import org.osate.aadl2.PropertyAssociation ;
import org.osate.aadl2.Subprogram ;
import org.osate.ba.aadlba.* ;
import org.osate.ba.declarative.DeclarativeBehaviorStateSet ;
import org.osate.ba.declarative.DeclarativeBehaviorTransition ;
import org.osate.ba.declarative.DeclarativeBehaviorVariableSet ;
import org.osate.ba.declarative.DeclarativePropertyName ;
import org.osate.ba.declarative.DeclarativePropertyReference ;
import org.osate.ba.utils.AadlBaVisitors ;


/**
 * A collection of util methods for AADLBA Front End's declarative meta model.
 */
public class DeclarativeUtils
{
  
  /**
   * Instanciates the behavior variables from the given behavior annex's
   * declarative behavior variables.<BR><BR>
   * 
   * Declarative behavior variables define several variable identifiers.
   * Behavior variables define one variable identifier only.
   * 
   * @param ba the given behavior annex
   */
  public static void reinstanciateBehaviorVariables(BehaviorAnnex ba)
  {
    List<BehaviorVariable> clones = new ArrayList<BehaviorVariable>();
    for(BehaviorVariable tmpBv : ba.getVariables())
    {
      Boolean isDeclarative = tmpBv instanceof DeclarativeBehaviorVariableSet;
      if(!isDeclarative)
      {
        clones.add(tmpBv);
        continue;
      }
      
      DeclarativeBehaviorVariableSet dbv = (DeclarativeBehaviorVariableSet) tmpBv;
      for(BehaviorVariable var: dbv.getVariables())
      {
        BehaviorVariable currentClone = AadlBaFactory.eINSTANCE.createBehaviorVariable();
        currentClone.setName(var.getName());
        currentClone.setDataClassifier(dbv.getDataClassifier());
        currentClone.setLocationReference(dbv.getLocationReference());
        clones.add(currentClone);
      }
      
    }
    ba.unsetVariables();
    ba.getVariables().addAll(clones) ;
  }
  
  /**
   * Instanciates the behavior states from the given behavior annex's
   * declarative behavior states.<BR><BR>
   * 
   * Declarative behavior states define several state identifiers.
   * Behavior states define one state identifier only.
   * 
   * @param ba the given behavior annex
   */
  public static void reinstanciateBehaviorStates(BehaviorAnnex ba)
  {
    
    List<BehaviorState> clones = new ArrayList<BehaviorState>();
    for(BehaviorState tmpBs : ba.getStates())
    {
      Boolean isDeclarative = tmpBs instanceof DeclarativeBehaviorStateSet;
      if(!isDeclarative)
      {
        clones.add(tmpBs);
        continue;
      }
      
      DeclarativeBehaviorStateSet dbs = (DeclarativeBehaviorStateSet) tmpBs;
      for(BehaviorState s: dbs.getStates())
      {
        BehaviorState currentClone = AadlBaFactory.eINSTANCE.createBehaviorState();
        currentClone.setName(s.getName());
        currentClone.setBindedMode(dbs.getBindedMode());
        currentClone.setComplete(dbs.isComplete());
        currentClone.setFinal(dbs.isFinal());
        currentClone.setInitial(dbs.isInitial());
        currentClone.setLocationReference(dbs.getLocationReference());
        clones.add(currentClone);
      }
      
    }
    ba.unsetStates();
    ba.getStates().addAll(clones) ;
    
  }
  
  /**
   * Instanciates the behavior transitions from the given behavior annex's
   * declarative behavior transitions.<BR><BR>
   * 
   * declarative behavior transitions design many source states to one
   * destination state. behavior transitions design one source state to one
   * destination state.
   * 
   * @param ba the given behavior annex
   */
  public static void reinstanciateBehaviorTransitions(BehaviorAnnex ba)
  {
    DeclarativeBehaviorTransition dbt = null ;
    List<BehaviorTransition> clones = new ArrayList<BehaviorTransition>();
    BehaviorTransition currentClone = null ;
    
    for(BehaviorTransition tmpBt : ba.getTransitions())
    {
      Boolean isDeclarative = tmpBt instanceof DeclarativeBehaviorTransition;
      if(!isDeclarative)
      {
        clones.add(tmpBt);
        continue;
      }
      dbt = (DeclarativeBehaviorTransition) tmpBt ;
      
      for(BehaviorState srcState : dbt.getSrcStates())
      {
        currentClone = AadlBaFactory.eINSTANCE.createBehaviorTransition() ;
        currentClone.setName(dbt.getName()) ;
        
        for(BehaviorState s: ba.getStates())
          if(s.getName().equalsIgnoreCase(srcState.getName()))
          {
            currentClone.setSourceState(s) ;
            break;
          }
        
        currentClone.setCondition(dbt.getCondition()) ;
        
        BehaviorState dstState = (BehaviorState) dbt.getDestinationState();
        for(BehaviorState s: ba.getStates())
          if(s.getName().equalsIgnoreCase(dstState.getName()))
          {
            currentClone.setSourceState(s) ;
            break;
          }
        
        BehaviorActionBlock babClone = cloneBehaviorActionBlock(dbt.getActionBlock());
        
        currentClone.setActionBlock(babClone) ;
        currentClone.setPriority(dbt.getPriority()) ;
        currentClone.setLocationReference(dbt.getLocationReference()) ;
        clones.add(currentClone) ;
        
      }
    }
    
    ba.unsetTransitions();
    ba.getTransitions().addAll(clones) ;
  }
  
  private static BehaviorActionBlock cloneBehaviorActionBlock(
                                                              BehaviorActionBlock actionBlock)
  {
    if(actionBlock == null)
      return null;
    BehaviorActionBlock currentClone = AadlBaFactory.eINSTANCE.createBehaviorActionBlock();
    BehaviorActions actionsClone = cloneBehaviorActions(actionBlock.getContent());
    currentClone.setContent(actionsClone);
    BehaviorTime timeout = actionBlock.getTimeout();
    if(timeout != null)
    {
      BehaviorTime timeoutClone = cloneBehaviorTime(timeout);
      currentClone.setTimeout(timeoutClone);
    }
    currentClone.setLocationReference(actionBlock.getLocationReference());
    return currentClone;
  }

  private static BehaviorTime cloneBehaviorTime(BehaviorTime timeout)
  {
    BehaviorTime btClone;
    if(timeout instanceof CompletionRelativeTimeout)
    {
      CompletionRelativeTimeout crt = AadlBaFactory.eINSTANCE.createCompletionRelativeTimeout();
      btClone = crt;
    }
    else
      btClone = AadlBaFactory.eINSTANCE.createBehaviorTime();
    IntegerValue ivClone = cloneIntegerValue(timeout.getIntegerValue());
    btClone.setIntegerValue(ivClone);
    btClone.setUnit(timeout.getUnit());
    btClone.setLocationReference(timeout.getLocationReference());
    return btClone;
  }

  private static IntegerValue cloneIntegerValue(IntegerValue integerValue)
  {
    IntegerValue ivClone;
    if(integerValue instanceof IntegerValueConstant)
    {
      IntegerValueConstant ivc = (IntegerValueConstant) integerValue;
      ivClone = cloneIntegerValueConstant(ivc);
    }
    else
    {
      IntegerValueVariable ivv = (IntegerValueVariable) integerValue;
      ivClone = cloneIntegerValueVariable(ivv);
    }
    ivClone.setLocationReference(integerValue.getLocationReference());
    return ivClone;
  }

  private static IntegerValueConstant cloneIntegerValueConstant(
                                                        IntegerValueConstant ivc)
  {
    IntegerValueConstant ivcClone=null;
    if(ivc instanceof BehaviorPropertyConstant)
    {
      BehaviorPropertyConstant bpc = (BehaviorPropertyConstant) ivc;
      BehaviorPropertyConstant bpcClone = 
          AadlBaFactory.eINSTANCE.createBehaviorPropertyConstant();
      
      bpcClone.setLocationReference(ivc.getLocationReference());
      
      bpcClone.setPropertySet(bpc.getPropertySet());
      bpcClone.setProperty(bpc.getProperty());
      ivcClone=bpcClone;
    }
    else if(ivc instanceof BehaviorIntegerLiteral)
    {
      BehaviorIntegerLiteral bil = (BehaviorIntegerLiteral) ivc;
      BehaviorIntegerLiteral bilClone =
          AadlBaFactory.eINSTANCE.createBehaviorIntegerLiteral();
      
      bilClone.setLocationReference(ivc.getLocationReference());
      
      bilClone.setBase(bil.getBase());
      bilClone.setUnit(bil.getUnit());
      
      bilClone.setValue(bil.getValue());
      ivcClone = bilClone;
    }
    else if(ivc instanceof PropertyReference)
    {
      PropertyReference pr = (PropertyReference) ivc;
      PropertyReference prClone = clonePropertyReference(pr);
      ivcClone = prClone;
    }
    return ivcClone;
  }

  private static PropertyReference clonePropertyReference(PropertyReference pr)
  {
    PropertyReference prClone=null;
    if(pr instanceof ClassifierFeaturePropertyReference)
    {
      ClassifierFeaturePropertyReference cfpr = 
          (ClassifierFeaturePropertyReference) pr;
      ClassifierFeaturePropertyReference cfprClone = 
          AadlBaFactory.eINSTANCE.createClassifierFeaturePropertyReference();
      
      ClassifierFeatureHolder cfh = cloneClassifierFeatureHolder(cfpr.getComponent());
      cfprClone.setComponent(cfh);
      
      prClone = cfprClone;
    }
    else if(pr instanceof ClassifierPropertyReference)
    {
      ClassifierPropertyReference cpr = 
          (ClassifierPropertyReference) pr;
      ClassifierPropertyReference cprClone = 
          AadlBaFactory.eINSTANCE.createClassifierPropertyReference();
      
      cprClone.setClassifier(cpr.getClassifier());
      for(PropertyNameHolder pnh : cpr.getProperties())
      {
        PropertyNameHolder pnhClone = clonePropertyNameHolder(pnh);
        cprClone.getProperties().add(pnhClone);
      }
      
      prClone = cprClone;
    }
    else if(pr instanceof PropertySetPropertyReference)
    {
      PropertySetPropertyReference pspr =
          (PropertySetPropertyReference) pr;
      
      PropertySetPropertyReference psprClone = 
          AadlBaFactory.eINSTANCE.createPropertySetPropertyReference();
      
      psprClone.setPropertySet(pspr.getPropertySet());
      
      for(PropertyNameHolder pnh : pspr.getProperties())
      {
        PropertyNameHolder pnhClone = clonePropertyNameHolder(pnh);
        psprClone.getProperties().add(pnhClone);
      }
      
      prClone = psprClone;
    }
    prClone.setLocationReference(pr.getLocationReference());
    return prClone;
    
  }

  private static PropertyNameHolder clonePropertyNameHolder(
                                                            PropertyNameHolder pnh)
  {
    PropertyNameHolder pnhClone = AadlBaFactory.eINSTANCE.createPropertyNameHolder();
    PropertyElementHolder pehClone = clonePropertyElementHolder(pnh.getProperty());
    pnhClone.setProperty(pehClone);
    PropertyNameField pnfClone = clonePropertyNameField(pnh.getField());
    pnhClone.setField(pnfClone);
    pnhClone.setLocationReference(pnh.getLocationReference());
    return pnhClone;
  }

  private static PropertyElementHolder clonePropertyElementHolder(
                                                                  PropertyElementHolder peh)
  {
    PropertyElementHolder pehClone=null;
    if(peh instanceof BasicPropertyHolder)
    {
      BasicPropertyHolder bph = (BasicPropertyHolder) peh;
      BasicPropertyHolder bphClone = cloneBasicPropertyHolder(bph);
      pehClone = bphClone;
    }
    else if(peh instanceof EnumLiteralHolder)
    {
      EnumLiteralHolder elh = (EnumLiteralHolder) peh;
      EnumLiteralHolder elhClone = cloneEnumLiteralHolder(elh);
      pehClone = elhClone;
    }
    else if(peh instanceof PropertyAssociationHolder)
    {
      PropertyAssociationHolder pah = (PropertyAssociationHolder) peh;
      PropertyAssociationHolder pahClone = clonePropertyAssociationHolder(pah);
      pehClone = pahClone;
    }
    else if(peh instanceof PropertyExpressionHolder)
    {
      PropertyExpressionHolder propExpHolder = (PropertyExpressionHolder) peh;
      PropertyExpressionHolder propExpHolderClone = clonePropertyExpressionHolder(propExpHolder);
      pehClone = propExpHolderClone;
    }
    else if(peh instanceof PropertyTypeHolder)
    {
      PropertyTypeHolder pth = (PropertyTypeHolder) peh;
      PropertyTypeHolder pthClone = clonePropertyTypeHolder(pth);
      pehClone = pthClone;
    }
    pehClone.setLocationReference(peh.getLocationReference());
    return pehClone;
  }

  private static BasicPropertyHolder cloneBasicPropertyHolder(
                                                              BasicPropertyHolder bph)
  {
    BasicPropertyHolder bphClone = 
        AadlBaFactory.eINSTANCE.createBasicPropertyHolder();
    bphClone.setBasicProperty(bph.getBasicProperty());
    bphClone.setLocationReference(bph.getLocationReference());
    return bphClone ;
  }

  private static EnumLiteralHolder cloneEnumLiteralHolder(EnumLiteralHolder elh)
  {
    EnumLiteralHolder elhClone = 
        AadlBaFactory.eINSTANCE.createEnumLiteralHolder();
    elhClone.setEnumLiteral(elh.getEnumLiteral());
    elhClone.setLocationReference(elh.getLocationReference());
    return elhClone;
  }

  private static PropertyAssociationHolder clonePropertyAssociationHolder(
                                                                          PropertyAssociationHolder pah)
  {
    PropertyAssociationHolder pahClone = 
        AadlBaFactory.eINSTANCE.createPropertyAssociationHolder();
    pahClone.setPropertyAssociation(pah.getPropertyAssociation());
    pahClone.setLocationReference(pah.getLocationReference());
    return pahClone;
  }

  private static PropertyExpressionHolder clonePropertyExpressionHolder(
                                                                        PropertyExpressionHolder propExpHolder)
  {
    PropertyExpressionHolder pehClone = 
        AadlBaFactory.eINSTANCE.createPropertyExpressionHolder();
    pehClone.setPropertyExpression(propExpHolder.getPropertyExpression());
    pehClone.setLocationReference(propExpHolder.getLocationReference());
    return pehClone ;
  }

  private static PropertyTypeHolder clonePropertyTypeHolder(
                                                            PropertyTypeHolder pth)
  {
    PropertyTypeHolder pthClone = 
        AadlBaFactory.eINSTANCE.createPropertyTypeHolder();
    pthClone.setPropertyType(pth.getPropertyType());
    pthClone.setLocationReference(pth.getLocationReference());
    return pthClone;
  }

  private static PropertyNameField clonePropertyNameField(
                                                          PropertyNameField field)
  {
    PropertyNameField fieldClone=null;
    if(field instanceof LowerBound)
    {
      LowerBound lb = (LowerBound) field;
      LowerBound lbClone = cloneLowerBound(lb);
      fieldClone = lbClone;
    }
    else if(field instanceof UpperBound)
    {
      UpperBound ub = (UpperBound) field;
      UpperBound ubClone = cloneUpperBound(ub);
      fieldClone = ubClone;
    }
    fieldClone.setLocationReference(field.getLocationReference());
    return fieldClone;
  }

  private static LowerBound cloneLowerBound(LowerBound lb)
  {
    LowerBound lbClone = 
        AadlBaFactory.eINSTANCE.createLowerBound();
    lbClone.setLocationReference(lb.getLocationReference());
    return lbClone;
  }

  private static UpperBound cloneUpperBound(UpperBound ub)
  {
    UpperBound ubClone = 
        AadlBaFactory.eINSTANCE.createUpperBound();
    ubClone.setLocationReference(ub.getLocationReference());
    return ubClone;
  }

  private static ClassifierFeatureHolder cloneClassifierFeatureHolder(
                                                                      ClassifierFeatureHolder cfh)
  {
    ClassifierFeatureHolder cfhClone=null;
    if(cfh instanceof BehaviorVariableHolder)
    {
      BehaviorVariableHolder bvh = (BehaviorVariableHolder) cfh;
      BehaviorVariableHolder bvhClone = cloneBehaviorVariableHolder(bvh);
      cfhClone = bvhClone;
    }
    else if (cfh instanceof FeatureHolder)
    {
      FeatureHolder fh = (FeatureHolder) cfh;
      FeatureHolder fhClone = cloneFeatureHolder(fh);
      cfhClone = fhClone;
    }
    else if(cfh instanceof PrototypeHolder)
    {
      PrototypeHolder ph = (PrototypeHolder) cfh;
      PrototypeHolder phClone = clonePrototypeHolder(ph);
      cfhClone = phClone;
    }
    else if(cfh instanceof SubcomponentHolder)
    {
      SubcomponentHolder sh = (SubcomponentHolder) cfh;
      SubcomponentHolder shClone = cloneSubcomponentHolder(sh);
      cfhClone = shClone;
    }
    cfhClone.setLocationReference(cfh.getLocationReference());
    return cfhClone;
  }

  private static SubcomponentHolder cloneSubcomponentHolder(
                                                            SubcomponentHolder sh)
  {
    SubcomponentHolder shClone=null;
    if(sh instanceof DataSubcomponentHolder)
    {
      DataSubcomponentHolder dsh = (DataSubcomponentHolder) sh;
      DataSubcomponentHolder dshClone = cloneDataSubcomponentHolder(dsh);
      shClone = dshClone;
    }
    else if(sh instanceof SubprogramSubcomponentHolder)
    {
      SubprogramSubcomponentHolder ssh = (SubprogramSubcomponentHolder) sh;
      SubprogramSubcomponentHolder sshClone = cloneSubprogramSubcomponentHolder(ssh);
      shClone = sshClone;
    }
    shClone.setLocationReference(sh.getLocationReference());
    return shClone;
  }

  private static SubprogramSubcomponentHolder cloneSubprogramSubcomponentHolder(
                                                                                SubprogramSubcomponentHolder ssh)
  {
    SubprogramSubcomponentHolder sshClone = AadlBaFactory.eINSTANCE.createSubprogramSubcomponentHolder();
    sshClone.setSubprogramSubcomponent(ssh.getSubprogramSubcomponent());
    sshClone.setLocationReference(ssh.getLocationReference());
    return sshClone ;
  }

  private static PrototypeHolder clonePrototypeHolder(PrototypeHolder ph)
  {
    PrototypeHolder phClone=null;
    if(ph instanceof DataAccessPrototypeHolder)
    {
      DataAccessPrototypeHolder daph = (DataAccessPrototypeHolder) ph;
      DataAccessPrototypeHolder daphClone = cloneDataAccessPrototypeHolder(daph);
      phClone = daphClone;
    }
    else if(ph instanceof FeaturePrototypeHolder)
    {
      FeaturePrototypeHolder fph = (FeaturePrototypeHolder) ph;
      FeaturePrototypeHolder fphClone = cloneFeaturePrototypeHolder(fph);
      phClone = fphClone;
    }
    else if(ph instanceof PortPrototypeHolder)
    {
      PortPrototypeHolder pph = (PortPrototypeHolder) ph;
      PortPrototypeHolder pphClone = clonePortPrototypeHolder(pph);
      phClone = pphClone;
    }
    else if(ph instanceof SubprogramPrototypeHolder)
    {
      SubprogramPrototypeHolder sph = (SubprogramPrototypeHolder) ph;
      SubprogramPrototypeHolder sphClone = cloneSubprogramPrototypeHolder(sph);
      phClone = sphClone;
    }
    phClone.setLocationReference(ph.getLocationReference());
    return phClone;
  }

  private static SubprogramPrototypeHolder cloneSubprogramPrototypeHolder(
                                                                          SubprogramPrototypeHolder sph)
  {
    SubprogramPrototypeHolder sphClone = AadlBaFactory.eINSTANCE.createSubprogramPrototypeHolder();
    sphClone.setPrototype(sph.getPrototype());
    sphClone.setLocationReference(sph.getLocationReference());
    return sphClone;
  }

  private static FeatureHolder cloneFeatureHolder(FeatureHolder fh)
  {
    FeatureHolder fhClone=null;
    if(fh instanceof DataAccessHolder)
    {
      DataAccessHolder dah = (DataAccessHolder) fh;
      DataAccessHolder dahClone = cloneDataAccessHolder(dah);
      fhClone = dahClone;
    }
    else if(fh instanceof InternalFeatureHolder)
    {
      InternalFeatureHolder ifh = (InternalFeatureHolder) fh;
      InternalFeatureHolder ifhClone = cloneInternalFeatureHolder(ifh);
      fhClone = ifhClone;
    }
    else if(fh instanceof ParameterHolder)
    {
      ParameterHolder ph = (ParameterHolder) fh;
      ParameterHolder phClone = cloneParameterHolder(ph);
      fhClone = phClone;
    }
    else if (fh instanceof PortHolder)
    {
      PortHolder ph = (PortHolder) fh;
      PortHolder phClone = clonePortHolder(ph);
      fhClone = phClone;
    }
    else if (fh instanceof SubprogramAccessHolder)
    {
      SubprogramAccessHolder sah = (SubprogramAccessHolder) fh;
      SubprogramAccessHolder sahClone = cloneSubprogramAccessHolder(sah);
      fhClone = sahClone;
    }
    fhClone.setLocationReference(fh.getLocationReference());
    return fhClone;
  }

  private static InternalFeatureHolder cloneInternalFeatureHolder(
                                                                  InternalFeatureHolder ifh)
  {
    InternalFeatureHolder ifhClone = AadlBaFactory.eINSTANCE.createInternalFeatureHolder();
    ifhClone.setInternalFeature(ifh.getInternalFeature());
    ifhClone.setLocationReference(ifh.getLocationReference());
    return ifhClone;
  }

  private static SubprogramAccessHolder cloneSubprogramAccessHolder(
                                                                    SubprogramAccessHolder sah)
  {
    SubprogramAccessHolder sahClone = AadlBaFactory.eINSTANCE.createSubprogramAccessHolder();
    sahClone.setSubprogramAccess(sah.getSubprogramAccess());
    sahClone.setLocationReference(sah.getLocationReference());
    return sahClone ;
  }

  private static IntegerValueVariable cloneIntegerValueVariable(
                                                        IntegerValueVariable ivv)
  {
    IntegerValueVariable ivvClone=null;
    if(ivv instanceof DataComponentReference)
    {
      DataComponentReference dcr = (DataComponentReference) ivv;
      DataComponentReference dcrClone = cloneDataComponentReference(dcr);
      ivvClone = dcrClone;
    }
    else if(ivv instanceof DataHolder)
    {
      DataHolder dh = (DataHolder) ivv;
      DataHolder dhClone = cloneDataHolder(dh);
      ivvClone = dhClone;
    }
    else if(ivv instanceof PortHolder)
    {
      PortHolder ph = (PortHolder) ivv;
      if(ph instanceof ActualPortHolder)
      {
        ActualPortHolder aph = (ActualPortHolder) ph;
        ActualPortHolder aphClone = cloneActualPortHolder(aph);
        ivvClone = aphClone;
      }
      else if(ph instanceof PortPrototypeHolder)
      {
        PortPrototypeHolder pph = (PortPrototypeHolder) ph;
        PortPrototypeHolder pphClone = clonePortPrototypeHolder(pph);
        ivvClone = pphClone;
      }
    }
    ivvClone.setLocationReference(ivv.getLocationReference());
    return ivvClone;
  }

  private static DataHolder cloneDataHolder(DataHolder dh)
  {
    DataHolder dhClone=null;
    if(dh instanceof BehaviorVariableHolder)
    {
      BehaviorVariableHolder bvh = (BehaviorVariableHolder) dh;
      BehaviorVariableHolder bvhClone = cloneBehaviorVariableHolder(bvh);
      dhClone = bvhClone;
    }
    else if(dh instanceof DataAccessHolder)
    {
      DataAccessHolder dah = (DataAccessHolder) dh;
      DataAccessHolder dahClone = cloneDataAccessHolder(dah);
      dhClone = dahClone;
    }
    else if(dh instanceof DataAccessPrototypeHolder)
    {
      DataAccessPrototypeHolder daph = (DataAccessPrototypeHolder) dh;
      DataAccessPrototypeHolder daphClone = cloneDataAccessPrototypeHolder(daph);
      dhClone = daphClone;
    }
    else if(dh instanceof DataSubcomponentHolder)
    {
      DataSubcomponentHolder dsh = (DataSubcomponentHolder) dh;
      DataSubcomponentHolder dshClone = cloneDataSubcomponentHolder(dsh);
      dhClone = dshClone;
    }
    else if(dh instanceof FeaturePrototypeHolder)
    {
      FeaturePrototypeHolder fph = (FeaturePrototypeHolder) dh;
      FeaturePrototypeHolder fphClone = cloneFeaturePrototypeHolder(fph);
      dhClone = fphClone;
    }
    else if(dh instanceof IterativeVariableHolder)
    {
      IterativeVariableHolder ivh = (IterativeVariableHolder) dh;
      IterativeVariableHolder ivhClone = AadlBaFactory.eINSTANCE.createIterativeVariableHolder();
      ivhClone.setIterativeVariable(ivh.getIterativeVariable());
      ivhClone.setLocationReference(dh.getLocationReference());
      dhClone = ivhClone;
    }
    else if(dh instanceof ParameterHolder)
    {
      ParameterHolder ph = (ParameterHolder) dh;
      ParameterHolder phClone = cloneParameterHolder(ph);
      dhClone = phClone;
    }
    else if(dh instanceof StructUnionElementHolder)
    {
      StructUnionElementHolder sueh = (StructUnionElementHolder) dh;
      StructUnionElementHolder suehClone = cloneStructUnionElementHolder(sueh);
      dhClone = suehClone;
    }
    return dhClone;
  }

  private static BehaviorActions cloneBehaviorActions(BehaviorActions behaviorActions)
  {
    BehaviorActions behaviorActionsClone = null;
    if(behaviorActions instanceof BehaviorAction)
    {
      BehaviorAction ba = (BehaviorAction) behaviorActions;
      behaviorActionsClone = cloneBehaviorAction(ba);
    }
    else if(behaviorActions instanceof BehaviorActionCollection)
    { 
      BehaviorActionCollection bac = (BehaviorActionCollection) behaviorActions;
      if(behaviorActions instanceof BehaviorActionSet)
        behaviorActionsClone = AadlBaFactory.eINSTANCE.createBehaviorActionSet();
      else
        behaviorActionsClone = AadlBaFactory.eINSTANCE.createBehaviorActionSequence();
      behaviorActionsClone.setLocationReference(behaviorActions.getLocationReference());
      BehaviorActionCollection bacClone = 
          (BehaviorActionCollection) behaviorActionsClone;
      bacClone.setLocationReference(bac.getLocationReference());
      for(BehaviorAction ba: bac.getActions())
        bacClone.getActions().add(cloneBehaviorAction(ba));
    }
    return behaviorActionsClone;
  }

  private static BehaviorAction cloneBehaviorAction(BehaviorAction behaviorAction)
  {
    BehaviorAction behaviorActionClone;
    if(behaviorAction instanceof BasicAction)
    {
      BasicAction basicAction = (BasicAction) behaviorAction;
      behaviorActionClone = cloneBasicAction(basicAction);
    }
    else 
      if(behaviorAction instanceof CondStatement)
      {
        CondStatement condStatement = (CondStatement) behaviorAction;
        behaviorActionClone = cloneCondStatement(condStatement);
      }
      else
      {
        BehaviorActionBlock bab = (BehaviorActionBlock) behaviorAction;
        behaviorActionClone = cloneBehaviorActionBlock(bab);
      }
    return behaviorActionClone ;
  }
  
  private static CondStatement cloneCondStatement(CondStatement condStatement)
  {
    CondStatement condStatementClone = null;
    if(condStatement instanceof IfStatement)
    {
      IfStatement is = (IfStatement) condStatement;
      IfStatement isClone = AadlBaFactory.eINSTANCE.createIfStatement();
      isClone.setElif(is.isElif());
      
      ValueExpression veClone = cloneValueExpression(is.getLogicalValueExpression());
      isClone.setLogicalValueExpression(veClone);
      ElseStatement elseStatement = is.getElseStatement();
      if(elseStatement!=null)
      {
        ElseStatement esClone = (ElseStatement)
            cloneCondStatement(is.getElseStatement());
        isClone.setElseStatement(esClone);
      }
      condStatementClone = isClone;
    }
    else if(condStatement instanceof ElseStatement)
    {
      ElseStatement esClone = AadlBaFactory.eINSTANCE.createElseStatement();
      esClone.setLocationReference(condStatement.getLocationReference());
      condStatementClone = esClone;
    }
    else if(condStatement instanceof LoopStatement)
    {
      LoopStatement ls = (LoopStatement) condStatement;
      LoopStatement lsClone = cloneLoopStatement(ls);
      condStatementClone = lsClone;
    }
    BehaviorActions baClone = cloneBehaviorActions(condStatement.getBehaviorActions());
    condStatementClone.setBehaviorActions(baClone);
    return condStatementClone;
  }

  private static ValueExpression cloneValueExpression(
                                                      ValueExpression valueExpression)
  {
    ValueExpression valueExpressionClone = null;
    if(valueExpression instanceof Any)
    {
      Any anyClone = AadlBaFactory.eINSTANCE.createAny();
      anyClone.setLocationReference(valueExpression.getLocationReference());
      valueExpressionClone = anyClone;
    }
    else
    {
      valueExpressionClone = AadlBaFactory.eINSTANCE.createValueExpression();
      valueExpressionClone.setLocationReference(valueExpression.getLocationReference());
    }
    for(LogicalOperator op: valueExpression.getLogicalOperators())
    {
      valueExpressionClone.getLogicalOperators().add(op);
    }
    for(Relation rel:valueExpression.getRelations())
    {
      Relation relationClone = cloneRelation(rel);
      valueExpressionClone.getRelations().add(relationClone);
    }
    return valueExpressionClone;
  }

  private static Relation cloneRelation(Relation rel)
  {
    Relation relationClone = AadlBaFactory.eINSTANCE.createRelation();
    SimpleExpression seClone = cloneSimpleExpression(rel.getFirstExpression());
    relationClone.setFirstExpression(seClone);
    if(rel.getSecondExpression() !=null)
    {
      seClone = cloneSimpleExpression(rel.getSecondExpression());
      relationClone.setSecondExpression(seClone);
    }
    relationClone.setRelationalOperator(rel.getRelationalOperator());
    relationClone.setLocationReference(rel.getLocationReference());
    return relationClone;
  }

  
  
  private static SimpleExpression cloneSimpleExpression(
                                                        SimpleExpression simpleExpression)
  {
    SimpleExpression simpleExpressionClone = AadlBaFactory.eINSTANCE.createSimpleExpression();
    simpleExpressionClone.setLocationReference(simpleExpression.getLocationReference());
    simpleExpressionClone.setUnaryAddingOperator(simpleExpression.getUnaryAddingOperator());
    for(Term term: simpleExpression.getTerms())
    {
      Term termClone = cloneTerm(term);
      simpleExpressionClone.getTerms().add(termClone);
    }
    simpleExpressionClone.setLocationReference(simpleExpression.getLocationReference());
    return simpleExpressionClone;
  }

  private static Term cloneTerm(Term term)
  {
    Term termClone = AadlBaFactory.eINSTANCE.createTerm();
    for(MultiplyingOperator op:term.getMultiplyingOperators())
    {
      termClone.getMultiplyingOperators().add(op);
    }
    for(Factor fact:term.getFactors())
    {
      Factor factorClone = cloneFactor(fact);
      termClone.getFactors().add(factorClone);
    }
    termClone.setLocationReference(term.getLocationReference());
    return termClone;
  }

  private static Factor cloneFactor(Factor fact)
  {
    Factor factorClone = AadlBaFactory.eINSTANCE.createFactor();
    factorClone.setUnaryBooleanOperator(fact.getUnaryBooleanOperator());
    factorClone.setBinaryNumericOperator(fact.getBinaryNumericOperator());
    factorClone.setUnaryNumericOperator(fact.getUnaryNumericOperator());
    Value val = cloneValue(fact.getFirstValue());
    factorClone.setFirstValue(val);
    val = cloneValue(fact.getSecondValue());
    factorClone.setSecondValue(val);
    factorClone.setLocationReference(fact.getLocationReference());
    return factorClone;
  }

  private static Value cloneValue(Value val)
  {
    Value valueClone = null;
    if(val instanceof ValueConstant)
    {
      ValueConstant valueConstant = (ValueConstant) val;
      ValueConstant valueConstantClone = cloneValueConstant(valueConstant);
      valueClone = valueConstantClone;
    }
    else if(val instanceof ValueExpression)
    {
      ValueExpression valExpression = (ValueExpression) val;
      ValueExpression valueExpressionClone = cloneValueExpression(valExpression);
      valueClone = valueExpressionClone;
    }
    else if(val instanceof ValueVariable)
    {
      ValueVariable valueVariable = (ValueVariable) val;
      ValueVariable valueVariableClone = cloneValueVariable(valueVariable);
      valueClone = valueVariableClone;
    }
    return valueClone;
  }

  private static ValueConstant cloneValueConstant(ValueConstant valueConstant)
  {
    ValueConstant valueConstantClone = null;
    if(valueConstant instanceof BehaviorPropertyConstant)
    {
      BehaviorPropertyConstant bpc = (BehaviorPropertyConstant) valueConstant;
      BehaviorPropertyConstant bpcClone = cloneBehaviorPropertyConstant(bpc);
      valueConstantClone = bpcClone;
    }
    else if(valueConstant instanceof Literal)
    {
      Literal l = (Literal) valueConstant;
      Literal lClone = cloneLiteral(l);
      valueConstantClone = lClone;
    }
    else if(valueConstant instanceof IntegerValueConstant)
    {
      IntegerValueConstant ivc = (IntegerValueConstant) valueConstant;
      IntegerValueConstant ivcClone = cloneIntegerValueConstant(ivc);
      valueConstantClone = ivcClone;
    }
    else if(valueConstant instanceof PropertyReference)
    {
      PropertyReference pr = (PropertyReference) valueConstant;
      PropertyReference prClone = clonePropertyReference(pr);
      valueConstantClone = prClone;
    }
    return valueConstantClone;
  }

  private static BehaviorPropertyConstant cloneBehaviorPropertyConstant(
                                                                        BehaviorPropertyConstant bpc)
  {
    BehaviorPropertyConstant bpcClone = 
        AadlBaFactory.eINSTANCE.createBehaviorPropertyConstant();
    bpcClone.setProperty(bpc.getProperty());
    bpcClone.setLocationReference(bpc.getLocationReference());
    return bpcClone ;
  }

  private static Literal cloneLiteral(Literal l)
  {
    Literal lClone = null;
    if(l instanceof BehaviorBooleanLiteral)
    {
      BehaviorBooleanLiteral bbl = (BehaviorBooleanLiteral) l;
      BehaviorBooleanLiteral bblClone = cloneBehaviorBooleanLiteral(bbl);
      lClone = bblClone;
    }
    else if(l instanceof BehaviorStringLiteral)
    {
      BehaviorStringLiteral bsl = (BehaviorStringLiteral) l;
      BehaviorStringLiteral bslClone = cloneBehaviorStringLiteral(bsl);
      lClone = bslClone;
    }
    else if(l instanceof NumericLiteral)
    {
      NumericLiteral nl = (NumericLiteral) l;
      NumericLiteral nlClone = cloneNumericLiteral(nl);
      lClone = nlClone;
    }
    return lClone;
  }

  private static BehaviorBooleanLiteral cloneBehaviorBooleanLiteral(
                                                                    BehaviorBooleanLiteral bbl)
  {
    BehaviorBooleanLiteral bblClone = 
        AadlBaFactory.eINSTANCE.createBehaviorBooleanLiteral();
    bblClone.setValue(bbl.getValue());
    bblClone.setLocationReference(bbl.getLocationReference());
    return bblClone;
  }

  private static BehaviorStringLiteral cloneBehaviorStringLiteral(
                                                                  BehaviorStringLiteral bsl)
  {
    BehaviorStringLiteral bslClone = 
        AadlBaFactory.eINSTANCE.createBehaviorStringLiteral();
    bslClone.setValue(bsl.getValue());
    bslClone.setLocationReference(bsl.getLocationReference());
    return bslClone;
  }

  private static NumericLiteral cloneNumericLiteral(NumericLiteral nl)
  {
    NumericLiteral nlClone = null;
    if(nl instanceof BehaviorIntegerLiteral)
    {
      BehaviorIntegerLiteral bil = (BehaviorIntegerLiteral) nl;
      BehaviorIntegerLiteral bilClone = cloneBehaviorIntegerLiteral(bil);
      nlClone = bilClone;
    }
    else if(nl instanceof BehaviorRealLiteral)
    {
      BehaviorRealLiteral brl = (BehaviorRealLiteral) nl;
      BehaviorRealLiteral brlClone = cloneBehaviorRealLiteral(brl);
      nlClone = brlClone;
    }
    return nlClone;
  }

  private static BehaviorIntegerLiteral cloneBehaviorIntegerLiteral(
                                                                    BehaviorIntegerLiteral bil)
  {
    BehaviorIntegerLiteral bilClone = 
        AadlBaFactory.eINSTANCE.createBehaviorIntegerLiteral();
    bilClone.setBase(bil.getBase());
    bilClone.setValue(bil.getValue());
    bilClone.setUnit(bil.getUnit());
    bilClone.setLocationReference(bil.getLocationReference());
    return bilClone ;
  }

  private static BehaviorRealLiteral cloneBehaviorRealLiteral(
                                                              BehaviorRealLiteral brl)
  {
    BehaviorRealLiteral brlClone = 
        AadlBaFactory.eINSTANCE.createBehaviorRealLiteral();
    brlClone.setValue(brl.getValue());
    brlClone.setUnit(brl.getUnit());
    brlClone.setLocationReference(brl.getLocationReference());
    return brlClone;
  }

  private static ValueVariable cloneValueVariable(ValueVariable valueVariable)
  {
    ValueVariable valueVariableClone=null;
    if(valueVariable instanceof DataComponentReference)
    {
      DataComponentReference dcr = (DataComponentReference) valueVariable;
      DataComponentReference dcrClone = cloneDataComponentReference(dcr);
      valueVariableClone = dcrClone;
    }
    else if(valueVariable instanceof DataHolder)
    {
      DataHolder dh = (DataHolder) valueVariable;
      DataHolder dhClone = cloneDataHolder(dh);
      valueVariableClone = dhClone;
    }
    else if(valueVariable instanceof IntegerValueVariable)
    {
      IntegerValueVariable ivv = (IntegerValueVariable) valueVariable;
      IntegerValueVariable ivvClone = cloneIntegerValueVariable(ivv);
      valueVariableClone = ivvClone;
    }
    else if(valueVariable instanceof PortHolder)
    {
      PortHolder ph = (PortHolder) valueVariable;
      PortHolder phClone = clonePortHolder(ph);
      valueVariableClone = phClone;
    }
    return valueVariableClone;
  }

  private static PortHolder clonePortHolder(PortHolder ph)
  {
    PortHolder phClone = null;
    if(ph instanceof ActualPortHolder)
    {
      ActualPortHolder aph = (ActualPortHolder) ph;
      ActualPortHolder aphClone = cloneActualPortHolder(aph);
      phClone = aphClone;
    }
    else if(ph instanceof PortPrototypeHolder)
    {
      PortPrototypeHolder pph = (PortPrototypeHolder) ph;
      PortPrototypeHolder pphClone = clonePortPrototypeHolder(pph);
      phClone = pphClone;
    }
    return phClone;
  }

  private static LoopStatement cloneLoopStatement(LoopStatement ls)
  {
    LoopStatement lsClone = null;
    if(ls instanceof ForOrForAllStatement)
    {
      ForOrForAllStatement fofas = (ForOrForAllStatement) ls;
      ForOrForAllStatement fofasClone = AadlBaFactory.eINSTANCE.createForOrForAllStatement();
      fofasClone.setForAll(fofas.isForAll());
      ElementValues evClone = cloneElementValues(fofas.getIteratedValues());
      fofasClone.setIteratedValues(evClone);
      IterativeVariable ivClone = cloneIterativeVariable(fofas.getIterativeVariable());
      fofasClone.setIterativeVariable(ivClone);
      fofasClone.setLocationReference(ls.getLocationReference());
      
      lsClone = fofasClone;
    }
    else if(ls instanceof WhileOrDoUntilStatement)
    {
      WhileOrDoUntilStatement wodus = (WhileOrDoUntilStatement) ls;
      WhileOrDoUntilStatement wodusClone = AadlBaFactory.eINSTANCE.createWhileOrDoUntilStatement();
      
      wodusClone.setDoUntil(wodus.isDoUntil());
      ValueExpression valueExpressionClone = cloneValueExpression(wodus.getLogicalValueExpression());
      wodusClone.setLogicalValueExpression(valueExpressionClone);
      wodusClone.setLocationReference(ls.getLocationReference());
      
      lsClone = wodusClone;
    }
    BehaviorActions behaviorActionsClone = cloneBehaviorActions(ls.getBehaviorActions());
    lsClone.setBehaviorActions(behaviorActionsClone);
    
    return lsClone;
  }

  private static ElementValues cloneElementValues(ElementValues iteratedValues)
  {
    ElementValues elementValuesClone=null;
    if(iteratedValues instanceof BehaviorVariableHolder)
    {
      BehaviorVariableHolder bvh = (BehaviorVariableHolder) iteratedValues;
      BehaviorVariableHolder bvhClone = cloneBehaviorVariableHolder(bvh);
      elementValuesClone = bvhClone;
    }
    else if(iteratedValues instanceof DataAccessHolder)
    {
      DataAccessHolder dah = (DataAccessHolder) iteratedValues;
      DataAccessHolder dahClone = cloneDataAccessHolder(dah);
      elementValuesClone = dahClone;
    }
    else if(iteratedValues instanceof DataAccessPrototypeHolder)
    {
      DataAccessPrototypeHolder daph = (DataAccessPrototypeHolder) iteratedValues;
      DataAccessPrototypeHolder daphClone = cloneDataAccessPrototypeHolder(daph);
      elementValuesClone = daphClone;
    }
    else if(iteratedValues instanceof DataComponentReference)
    {
      DataComponentReference dcr = (DataComponentReference) iteratedValues;
      DataComponentReference dcrClone = cloneDataComponentReference(dcr);
      elementValuesClone = dcrClone;
    }
    else if(iteratedValues instanceof DataSubcomponentHolder)
    {
      DataSubcomponentHolder dsh = (DataSubcomponentHolder) iteratedValues;
      DataSubcomponentHolder dshClone = cloneDataSubcomponentHolder(dsh);
      elementValuesClone = dshClone;
    }
    else if(iteratedValues instanceof EventDataPortHolder)
    {
      EventDataPortHolder edph = (EventDataPortHolder) iteratedValues;
      EventDataPortHolder edphClone = cloneEventDataPortHolder(edph);
      elementValuesClone = edphClone;
    }
    else if(iteratedValues instanceof FeaturePrototypeHolder)
    {
      FeaturePrototypeHolder fph = (FeaturePrototypeHolder) iteratedValues;
      FeaturePrototypeHolder fphClone = cloneFeaturePrototypeHolder(fph);
      elementValuesClone = fphClone;
    }
    else if(iteratedValues instanceof IntegerRange)
    {
      IntegerRange ir = (IntegerRange) iteratedValues;
      IntegerRange irClone = cloneIntegerRange(ir);
      elementValuesClone = irClone;
    }
    else if(iteratedValues instanceof ParameterHolder)
    {
      ParameterHolder ph = (ParameterHolder) iteratedValues;
      ParameterHolder phClone = cloneParameterHolder(ph);
      elementValuesClone = phClone;
    }
    else if(iteratedValues instanceof StructUnionElementHolder)
    {
      StructUnionElementHolder sueh = (StructUnionElementHolder) iteratedValues;
      StructUnionElementHolder suehClone = cloneStructUnionElementHolder(sueh);
      elementValuesClone = suehClone;
    }
    return elementValuesClone;
  }

  private static IntegerRange cloneIntegerRange(IntegerRange ir)
  {
    IntegerRange irClone = AadlBaFactory.eINSTANCE.createIntegerRange();
    IntegerValue lowerValueClone = cloneIntegerValue(ir.getLowerIntegerValue());
    irClone.setLowerIntegerValue(lowerValueClone);
    IntegerValue upperValueClone = cloneIntegerValue(ir.getUpperIntegerValue());
    irClone.setUpperIntegerValue(upperValueClone);
    irClone.setLocationReference(ir.getLocationReference());
    return irClone;
  }

  private static IterativeVariable cloneIterativeVariable(
                                                          IterativeVariable iterativeVariable)
  {
    IterativeVariable iterativeVariableClone = AadlBaFactory.eINSTANCE.createIterativeVariable();
    iterativeVariableClone.setDataClassifier(iterativeVariable.getDataClassifier());
    iterativeVariableClone.setName(iterativeVariable.getName());
    iterativeVariableClone.setLocationReference(iterativeVariable.getLocationReference());
    return iterativeVariableClone ;
  }

  private static BehaviorAction cloneBasicAction(BasicAction behaviorAction)
  {
    BehaviorAction behaviorActionClone=null;
    if(behaviorAction instanceof AssignmentAction)
    {
      AssignmentAction aa = (AssignmentAction) behaviorAction;
      AssignmentAction aaClone = AadlBaFactory.eINSTANCE.createAssignmentAction();
      Target tClone = cloneTarget(aa.getTarget());
      aaClone.setTarget(tClone);
      aaClone.setLocationReference(behaviorAction.getLocationReference());
      ValueExpression valueExpressionClone = cloneValueExpression(aa.getValueExpression());
      aaClone.setValueExpression(valueExpressionClone);
      behaviorActionClone = aaClone;
    }
    else if(behaviorAction instanceof CommunicationAction)
    {
      CommunicationAction ca = (CommunicationAction) behaviorAction; 
      CommunicationAction caClone = cloneCommunicationAction(ca);
      behaviorActionClone = caClone;
    }
    else if(behaviorAction instanceof TimedAction)
    {
      TimedAction ta = (TimedAction) behaviorAction;
      TimedAction taClone = cloneTimedAction(ta);
      behaviorActionClone = taClone;
    }
    return behaviorActionClone;
  }

  private static TimedAction cloneTimedAction(TimedAction ta)
  {
    TimedAction taClone = AadlBaFactory.eINSTANCE.createTimedAction();
    BehaviorTime lowerTimeClone = cloneBehaviorTime(ta.getLowerTime());
    taClone.setLowerTime(lowerTimeClone);
    if(ta.getUpperTime() != null)
    {
      BehaviorTime upperTimeClone = cloneBehaviorTime(ta.getUpperTime());
      taClone.setUpperTime(upperTimeClone);
    }
    taClone.setLocationReference(ta.getLocationReference());
    return taClone ;
  }

  private static CommunicationAction cloneCommunicationAction(
                                                              CommunicationAction ca)
  {
    CommunicationAction caClone=null;
    if(ca instanceof PortDequeueAction)
    {
      PortDequeueAction pda = (PortDequeueAction) ca;
      PortDequeueAction pdaClone = AadlBaFactory.eINSTANCE.createPortDequeueAction();
      pdaClone.setLocationReference(ca.getLocationReference());
      caClone = pdaClone;
      ActualPortHolder aph = pda.getPort();
      ActualPortHolder aphClone = cloneActualPortHolder(aph);
      pdaClone.setPort(aphClone);
      Target t = pda.getTarget();
      Target tClone = cloneTarget(t);
      pdaClone.setTarget(tClone);
    }
    else if(ca instanceof PortFreezeAction)
    {
      PortFreezeAction pfaClone = AadlBaFactory.eINSTANCE.createPortFreezeAction();
      pfaClone.setLocationReference(ca.getLocationReference());
      caClone = pfaClone;
    }
    else if(ca instanceof PortSendAction)
    {
      PortSendAction psaClone = AadlBaFactory.eINSTANCE.createPortSendAction();
      psaClone.setLocationReference(ca.getLocationReference());
      caClone = psaClone;
    }
    else if(ca instanceof SharedDataAction)
    {
      SharedDataAction sda = (SharedDataAction) ca;
      SharedDataAction sdaClone = cloneSharedDataAction(sda);
      caClone = sdaClone;
    }
    else if(ca instanceof SubprogramCallAction)
    {
      SubprogramCallAction sca = (SubprogramCallAction) ca;
      SubprogramCallAction scaClone = AadlBaFactory.eINSTANCE.createSubprogramCallAction();
      CalledSubprogramHolder shClone = cloneCalledSubprogramHolder(sca.getSubprogram());
      scaClone.setSubprogram(shClone);
      for(ParameterLabel pl: sca.getParameterLabels())
      {
        ParameterLabel plClone = cloneParameterLabel(pl);
        scaClone.getParameterLabels().add(plClone);
      }
      scaClone.setLocationReference(ca.getLocationReference());
      caClone = scaClone;
    }
    return caClone;
  }

  private static CalledSubprogramHolder cloneCalledSubprogramHolder(
                                                        CalledSubprogramHolder subprogram)
  {
    if(subprogram instanceof SubprogramAccessHolder)
    {
      SubprogramAccessHolder sahClone = 
          AadlBaFactory.eINSTANCE.createSubprogramAccessHolder();
      sahClone.setSubprogramAccess(((SubprogramAccessHolder) subprogram).getSubprogramAccess());
      return sahClone;
    }
    else if(subprogram instanceof SubprogramHolder)
    {
      SubprogramHolder shClone = 
          AadlBaFactory.eINSTANCE.createSubprogramHolder();
      shClone.setSubprogram((Subprogram) subprogram.getElement());
      shClone.setLocationReference(subprogram.getLocationReference());;
      return shClone;
    }
    else if(subprogram instanceof SubprogramPrototypeHolder)
    {
      SubprogramPrototypeHolder sphClone =
          AadlBaFactory.eINSTANCE.createSubprogramPrototypeHolder();
      sphClone.setPrototype(((SubprogramPrototypeHolder) subprogram).getPrototype());
      sphClone.setLocationReference(subprogram.getLocationReference());
      return sphClone;
    }
    else if(subprogram instanceof SubprogramSubcomponentHolder)
    {
      SubprogramSubcomponentHolder sshClone =
          AadlBaFactory.eINSTANCE.createSubprogramSubcomponentHolder();
      sshClone.setSubcomponent(((SubprogramSubcomponentHolder) subprogram).getSubcomponent());
      sshClone.setLocationReference(subprogram.getLocationReference());
      return sshClone;
    }
    return null;
  }

  private static ParameterLabel cloneParameterLabel(ParameterLabel pl)
  {
    ParameterLabel plClone=null;
    if(pl instanceof Target)
    {
      Target t = (Target) pl;
      Target tClone = cloneTarget(t);
      plClone = tClone;
    }
    else if(pl instanceof ValueExpression)
    {
      ValueExpression ve = (ValueExpression) pl;
      ValueExpression veClone = cloneValueExpression(ve);
      plClone = veClone;
    }
    return plClone;
  }

  private static Target cloneTarget(Target t)
  {
    Target tClone=null;
    if(t instanceof BehaviorVariableHolder)
    {
      BehaviorVariableHolder bvh = (BehaviorVariableHolder) t;
      BehaviorVariableHolder bvhClone = cloneBehaviorVariableHolder(bvh);
      tClone = bvhClone;
    }
    else if(t instanceof DataAccessHolder)
    {
      DataAccessHolder dah = (DataAccessHolder) t;
      DataAccessHolder dahClone = cloneDataAccessHolder(dah);
      tClone = dahClone;
    }
    else if(t instanceof DataAccessPrototypeHolder)
    {
      DataAccessPrototypeHolder daph = (DataAccessPrototypeHolder) t;
      DataAccessPrototypeHolder daphClone = cloneDataAccessPrototypeHolder(daph);
      tClone = daphClone;
    }
    else if(t instanceof DataComponentReference)
    {
      DataComponentReference dcr = (DataComponentReference) t;
      DataComponentReference dcrClone = cloneDataComponentReference(dcr);
      tClone = dcrClone;
    }
    else if(t instanceof DataPortHolder)
    {
      DataPortHolder dph = (DataPortHolder) t;
      DataPortHolder dphClone = cloneDataPortHolder(dph);
      tClone = dphClone;
    }
    else if(t instanceof DataSubcomponentHolder)
    {
      DataSubcomponentHolder dsh = (DataSubcomponentHolder) t;
      DataSubcomponentHolder dshClone = cloneDataSubcomponentHolder(dsh);
      tClone = dshClone;
    }
    else if(t instanceof EventDataPortHolder)
    {
      EventDataPortHolder edph = (EventDataPortHolder) t;
      EventDataPortHolder edphClone = cloneEventDataPortHolder(edph);
      tClone = edphClone;
    }
    else if(t instanceof EventPortHolder)
    {
      EventPortHolder eph = (EventPortHolder) t;
      EventPortHolder ephClone = cloneEventPortHolder(eph);
      tClone = ephClone;
    }
    else if(t instanceof FeaturePrototypeHolder)
    {
      FeaturePrototypeHolder fph = (FeaturePrototypeHolder) t;
      FeaturePrototypeHolder fphClone = cloneFeaturePrototypeHolder(fph);
      tClone = fphClone;
    }
    else if(t instanceof ParameterHolder)
    {
      ParameterHolder ph = (ParameterHolder) t;
      ParameterHolder phClone = cloneParameterHolder(ph);
      tClone = phClone;
    }
    else if(t instanceof PortPrototypeHolder)
    {
      PortPrototypeHolder pph = (PortPrototypeHolder) t;
      PortPrototypeHolder pphClone = clonePortPrototypeHolder(pph);
      tClone = pphClone;
    }
    else if(t instanceof StructUnionElementHolder)
    {
      StructUnionElementHolder sueh = (StructUnionElementHolder) t;
      StructUnionElementHolder suehClone = cloneStructUnionElementHolder(sueh);
      tClone = suehClone;
    }
    return tClone;
  }

  private static StructUnionElementHolder cloneStructUnionElementHolder(
                                                                        StructUnionElementHolder sueh)
  {
    StructUnionElementHolder suehClone = AadlBaFactory.eINSTANCE.createStructUnionElementHolder();
    suehClone.setStructUnionElement(sueh.getStructUnionElement());
    suehClone.setLocationReference(sueh.getLocationReference());
    return suehClone ;
  }

  private static PortPrototypeHolder clonePortPrototypeHolder(
                                                              PortPrototypeHolder pph)
  {
    PortPrototypeHolder pphClone = AadlBaFactory.eINSTANCE.createPortPrototypeHolder();
    pphClone.setClassifierFeature(pph.getClassifierFeature());
    pphClone.setFeature(pph.getFeature());
    pphClone.setPrototype(pph.getPrototype());
    pphClone.setPrototypeBinding(pph.getPrototypeBinding());
    pphClone.setLocationReference(pph.getLocationReference());
    return pphClone ;
  }

  private static ParameterHolder cloneParameterHolder(ParameterHolder ph)
  {
    ParameterHolder phClone = AadlBaFactory.eINSTANCE.createParameterHolder();
    phClone.setParameter(ph.getParameter());
    phClone.setLocationReference(ph.getLocationReference());
    return phClone ;
  }

  private static FeaturePrototypeHolder cloneFeaturePrototypeHolder(
                                                                    FeaturePrototypeHolder fph)
  {
    FeaturePrototypeHolder fphClone = AadlBaFactory.eINSTANCE.createFeaturePrototypeHolder();
    fphClone.setClassifierFeature(fph.getClassifierFeature());
    fphClone.setPrototype(fph.getPrototype());
    fphClone.setPrototypeBinding(fph.getPrototypeBinding());
    fphClone.setLocationReference(fph.getLocationReference());
    return fphClone ;
  }

  private static EventPortHolder cloneEventPortHolder(EventPortHolder eph)
  {
    EventPortHolder ephClone = AadlBaFactory.eINSTANCE.createEventPortHolder();
    ephClone.setEventPort(eph.getEventPort());
    ephClone.setLocationReference(eph.getLocationReference());
    return ephClone;
  }

  private static EventDataPortHolder cloneEventDataPortHolder(
                                                              EventDataPortHolder edph)
  {
    EventDataPortHolder edphClone = AadlBaFactory.eINSTANCE.createEventDataPortHolder();
    edphClone.setEventDataPort(edph.geteventDataPort());
    edphClone.setLocationReference(edph.getLocationReference());
    return edphClone;
  }

  private static DataSubcomponentHolder cloneDataSubcomponentHolder(
                                                                    DataSubcomponentHolder dsh)
  {
    DataSubcomponentHolder dshClone = AadlBaFactory.eINSTANCE.createDataSubcomponentHolder();
    dshClone.setDataSubcomponent(dsh.getDataSubcomponent());
    dshClone.setLocationReference(dsh.getLocationReference());
    return dshClone ;
  }

  private static DataPortHolder cloneDataPortHolder(DataPortHolder dph)
  {
    DataPortHolder dphClone = AadlBaFactory.eINSTANCE.createDataPortHolder();
    dphClone.setDataPort(dph.getDataPort());
    dphClone.setLocationReference(dph.getLocationReference());
    return dphClone;
  }

  private static DataComponentReference cloneDataComponentReference(
                                                                    DataComponentReference dcr)
  {
    DataComponentReference dcrClone = AadlBaFactory.eINSTANCE.createDataComponentReference();
    for(DataHolder dh : dcr.getData())
    {
      DataHolder dhClone = cloneDataHolder(dh);
      dcrClone.getData().add(dhClone);
    }
    dcrClone.setLocationReference(dcr.getLocationReference());
    return dcrClone;
  }

  private static DataAccessPrototypeHolder cloneDataAccessPrototypeHolder(
                                                                          DataAccessPrototypeHolder daph)
  {
    DataAccessPrototypeHolder daphClone = AadlBaFactory.eINSTANCE.createDataAccessPrototypeHolder();
    daphClone.setClassifierFeature(daph.getClassifierFeature());
    daphClone.setPrototype(daph.getPrototype());
    daphClone.setPrototypeBinding(daph.getPrototypeBinding());
    daphClone.setLocationReference(daph.getLocationReference());
    return daphClone;
  }

  private static BehaviorVariableHolder cloneBehaviorVariableHolder(
                                                                    BehaviorVariableHolder bvh)
  {
    BehaviorVariableHolder bvhClone = 
        AadlBaFactory.eINSTANCE.createBehaviorVariableHolder();
    bvhClone.setVariable(bvh.getBehaviorVariable());
    bvhClone.setLocationReference(bvh.getLocationReference());
    return bvhClone;
  }

  private static SharedDataAction cloneSharedDataAction(SharedDataAction sda)
  {
    SharedDataAction sdaClone;
    if(sda instanceof LockAction)
    {
      LockAction la = AadlBaFactory.eINSTANCE.createLockAction();
      sdaClone = la;
      
    }
    else
    {
      UnlockAction ula = AadlBaFactory.eINSTANCE.createUnlockAction();
      sdaClone = ula;
    }
    DataAccessHolder dahClone = cloneDataAccessHolder(sda.getDataAccess());
    sdaClone.setDataAccess(dahClone);
    sdaClone.setLocationReference(sda.getLocationReference());
    return sdaClone ;
  }

  private static DataAccessHolder cloneDataAccessHolder(
                                                        DataAccessHolder dataAccess)
  {
    DataAccessHolder dahClone = AadlBaFactory.eINSTANCE.createDataAccessHolder();
    dahClone.setLocationReference(dataAccess.getLocationReference());
    dahClone.setDataAccess(dataAccess.getDataAccess());
    return dahClone;
  }
  
  private static ActualPortHolder cloneActualPortHolder(ActualPortHolder aph)
  {
    ActualPortHolder aphClone = null;
    if(aph instanceof DataPortHolder)
    {
      DataPortHolder dph = (DataPortHolder) aph;
      DataPortHolder dphClone = cloneDataPortHolder(dph);
      aphClone = dphClone;
    }
    else if(aph instanceof EventDataPortHolder)
    {
      EventDataPortHolder edph = (EventDataPortHolder) aph;
      EventDataPortHolder edphClone = cloneEventDataPortHolder(edph);
      aphClone = edphClone;
    }
    else if(aph instanceof EventPortHolder)
    {
      EventPortHolder eph = (EventPortHolder) aph;
      EventPortHolder ephClone = cloneEventPortHolder(eph);
      aphClone = ephClone;
    }
    else if(aph instanceof PortCountValue)
    {
      PortCountValue pcv = (PortCountValue) aph;
      PortCountValue pcvClone = AadlBaFactory.eINSTANCE.createPortCountValue();
      pcvClone.setPort(pcv.getPort());
      aphClone = pcvClone;
    }
    else if(aph instanceof PortDequeueValue)
    {
      PortDequeueValue pdv = (PortDequeueValue) aph;
      PortDequeueValue pdvClone = AadlBaFactory.eINSTANCE.createPortDequeueValue();
      pdvClone.setPort(pdv.getPort());
      aphClone = pdvClone;
    }
    else if(aph instanceof PortFreezeAction)
    {
      PortFreezeAction pfa = (PortFreezeAction) aph;
      PortFreezeAction pfaClone = AadlBaFactory.eINSTANCE.createPortFreezeAction();
      pfaClone.setPort(pfa.getPort());
      aphClone = pfaClone;
    }
    else if(aph instanceof PortFreshValue)
    {
      PortFreshValue pfv = (PortFreshValue) aph;
      PortFreshValue pfvClone = AadlBaFactory.eINSTANCE.createPortFreshValue();
      pfvClone.setPort(pfv.getPort());
      aphClone = pfvClone;
    }
    aphClone.setLocationReference(aph.getLocationReference());
    return aphClone;
  }
  
  /**
   * Set the given behavior annex as the EMF parent container to the given 
   * Element object.  
   * 
   * @param ba the given behavior annex
   * @param child the given Element object
   */
  public static void setEcontainer(BehaviorAnnex ba, Element child)
  {
    InternalEObject iChild = (InternalEObject) child ;
    InternalEObject iBa = (InternalEObject) ba ;
    iChild.eBasicSetContainer(iBa, AadlBaPackage.BEHAVIOR_ANNEX, null) ;
  }
  
  /**
   * Print on the standard output, the data of the given DeclarativePropertyReference
   * object.
   * 
   * @param dpr the given DeclarativePropertyReference object
   */
  public static void printDeclarativePropertyReference(
                                               DeclarativePropertyReference dpr)
  {
    System.out.println("*****") ;
    
    if(dpr.isPropertySet())
    {
      System.out.println("dpr comes from a property set") ;
    }
    
    if(dpr.getQualifiedName() != null)
    {
      System.out.println("qualified name : " + unparseElement(dpr.getQualifiedName().getOsateRef())) ;
    }
    
    if(dpr.getReference() != null)
    {
      if(dpr.getReference().getOsateRef() != null)
      {
        System.out.println("reference osate : " + unparseElement(dpr.getReference().getOsateRef())) ;
      } 
      else
      {
        System.out.println("reference ba : " + unparseElement(dpr.getReference().getBaRef())) ;
      }
    }
    
    if(dpr.getPropertyNames().isEmpty() == false)
    {
      for(DeclarativePropertyName dpn : dpr.getPropertyNames())
      {
        System.out.println("  property name : " + unparseElement(dpn.getOsateRef())) ;
        
        System.out.println("  property name id \'" + dpn.getPropertyName().getId() +
                           "\' : " + unparseElement(dpn.getPropertyName().getOsateRef())) ;
        if(null != dpn.getField())
        {
          System.out.println("  field : " + unparsePropertyNameField(dpn.getField())) ;
        }
        
        if(dpn.isSetIndexes())
        {
          for(IntegerValue iv : dpn.getIndexes())
          {
            System.out.println("  index : " + unparseElement(iv)) ;
          }
        }
      }
    }
    
    System.out.println("*****") ;
  }
  
  public static String unparseElement(Element el)
  {
    String result ;
    
    if(el instanceof PropertyAssociation)
    {
      PropertyAssociation pa = (PropertyAssociation) el ;
      
      result = "" ;
      
      for(ModalPropertyValue mpv : pa.getOwnedValues())
      {
        result += mpv.getOwnedValue().toString() + " ; " ; 
      }
    }
    else
    {
      result = el.toString() ;
    }
    
    return result ;
  }
  
  public static String unparsePropertyNameField(PropertyNameField field)
  {
    return field.toString() ;
  }
}