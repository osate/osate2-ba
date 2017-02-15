/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package org.osate.ba.declarative.impl ;

import java.util.Collection ;

import org.eclipse.emf.common.notify.Notification ;
import org.eclipse.emf.common.notify.NotificationChain ;

import org.eclipse.emf.common.util.EList ;

import org.eclipse.emf.ecore.EClass ;
import org.eclipse.emf.ecore.EObject ;
import org.eclipse.emf.ecore.InternalEObject ;

import org.eclipse.emf.ecore.impl.ENotificationImpl ;
import org.eclipse.emf.ecore.impl.EObjectImpl ;

import org.eclipse.emf.ecore.util.EObjectContainmentEList ;
import org.eclipse.emf.ecore.util.InternalEList ;

import org.osate.aadl2.DataClassifier ;

import org.osate.ba.aadlba.BehaviorVariable ;

import org.osate.ba.aadlba.impl.BehaviorVariableImpl ;
import org.osate.ba.declarative.DeclarativeBehaviorVariableSet ;
import org.osate.ba.declarative.DeclarativePackage ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Variable Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.ba.declarative.impl.DeclarativeBehaviorVariableSetImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativeBehaviorVariableSetImpl extends BehaviorVariableImpl
                                                implements
                                                DeclarativeBehaviorVariableSet
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<BehaviorVariable> variables ;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarativeBehaviorVariableSetImpl()
  {
    super() ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeclarativePackage.Literals.DECLARATIVE_BEHAVIOR_VARIABLE_SET ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviorVariable> getVariables()
  {
    if(variables == null)
    {
      variables = new EObjectContainmentEList<BehaviorVariable>(
                                                                BehaviorVariable.class,
                                                                this,
                                                                DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES) ;
    }
    return variables ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd,
                                          int featureID, NotificationChain msgs)
  {
    switch ( featureID )
    {
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES :
        return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs) ;
    }
    return super.eInverseRemove(otherEnd, featureID, msgs) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch ( featureID )
    {
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES :
        return getVariables() ;
    }
    return super.eGet(featureID, resolve, coreType) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch ( featureID )
    {
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES :
        getVariables().clear() ;
        getVariables().addAll((Collection<? extends BehaviorVariable>) newValue) ;
        return ;
    }
    super.eSet(featureID, newValue) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch ( featureID )
    {
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES :
        getVariables().clear() ;
        return ;
    }
    super.eUnset(featureID) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch ( featureID )
    {
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_VARIABLE_SET__VARIABLES :
        return variables != null && !variables.isEmpty() ;
    }
    return super.eIsSet(featureID) ;
  }

} //DeclarativeBehaviorVariableSetImpl
