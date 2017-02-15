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

import org.eclipse.emf.common.notify.NotificationChain ;

import org.eclipse.emf.common.util.EList ;

import org.eclipse.emf.ecore.EClass ;
import org.eclipse.emf.ecore.InternalEObject ;

import org.eclipse.emf.ecore.impl.EObjectImpl ;

import org.eclipse.emf.ecore.util.EObjectContainmentEList ;
import org.eclipse.emf.ecore.util.InternalEList ;

import org.osate.ba.aadlba.BehaviorState ;

import org.osate.ba.aadlba.impl.BehaviorStateImpl ;
import org.osate.ba.declarative.DeclarativeBehaviorStateSet ;
import org.osate.ba.declarative.DeclarativePackage ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior State Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.ba.declarative.impl.DeclarativeBehaviorStateSetImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativeBehaviorStateSetImpl extends BehaviorStateImpl
                                             implements
                                             DeclarativeBehaviorStateSet
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<BehaviorState> states ;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarativeBehaviorStateSetImpl()
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
    return DeclarativePackage.Literals.DECLARATIVE_BEHAVIOR_STATE_SET ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviorState> getStates()
  {
    if(states == null)
    {
      states = new EObjectContainmentEList<BehaviorState>(BehaviorState.class,
                                                          this,
                                                          DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES) ;
    }
    return states ;
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
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES :
        return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs) ;
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
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES :
        return getStates() ;
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
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES :
        getStates().clear() ;
        getStates().addAll((Collection<? extends BehaviorState>) newValue) ;
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
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES :
        getStates().clear() ;
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
      case DeclarativePackage.DECLARATIVE_BEHAVIOR_STATE_SET__STATES :
        return states != null && !states.isEmpty() ;
    }
    return super.eIsSet(featureID) ;
  }

} //DeclarativeBehaviorStateSetImpl
