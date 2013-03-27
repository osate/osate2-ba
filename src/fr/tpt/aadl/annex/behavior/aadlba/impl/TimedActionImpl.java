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
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorTime;
import fr.tpt.aadl.annex.behavior.aadlba.TimedAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.TimedActionImpl#getLowerTime <em>Lower Time</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.TimedActionImpl#getUpperTime <em>Upper Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedActionImpl extends BehaviorElementImpl implements TimedAction
{
  /**
   * The cached value of the '{@link #getLowerTime() <em>Lower Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerTime()
   * @generated
   * @ordered
   */
  protected BehaviorTime lowerTime;

  /**
   * The cached value of the '{@link #getUpperTime() <em>Upper Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperTime()
   * @generated
   * @ordered
   */
  protected BehaviorTime upperTime;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimedActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AadlBaPackage.Literals.TIMED_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorTime getLowerTime()
  {
    return lowerTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerTime(BehaviorTime newLowerTime, NotificationChain msgs)
  {
    BehaviorTime oldLowerTime = lowerTime;
    lowerTime = newLowerTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AadlBaPackage.TIMED_ACTION__LOWER_TIME, oldLowerTime, newLowerTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerTime(BehaviorTime newLowerTime)
  {
    if (newLowerTime != lowerTime)
    {
      NotificationChain msgs = null;
      if (lowerTime != null)
        msgs = ((InternalEObject)lowerTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.TIMED_ACTION__LOWER_TIME, null, msgs);
      if (newLowerTime != null)
        msgs = ((InternalEObject)newLowerTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.TIMED_ACTION__LOWER_TIME, null, msgs);
      msgs = basicSetLowerTime(newLowerTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.TIMED_ACTION__LOWER_TIME, newLowerTime, newLowerTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorTime getUpperTime()
  {
    return upperTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperTime(BehaviorTime newUpperTime, NotificationChain msgs)
  {
    BehaviorTime oldUpperTime = upperTime;
    upperTime = newUpperTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AadlBaPackage.TIMED_ACTION__UPPER_TIME, oldUpperTime, newUpperTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperTime(BehaviorTime newUpperTime)
  {
    if (newUpperTime != upperTime)
    {
      NotificationChain msgs = null;
      if (upperTime != null)
        msgs = ((InternalEObject)upperTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.TIMED_ACTION__UPPER_TIME, null, msgs);
      if (newUpperTime != null)
        msgs = ((InternalEObject)newUpperTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.TIMED_ACTION__UPPER_TIME, null, msgs);
      msgs = basicSetUpperTime(newUpperTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.TIMED_ACTION__UPPER_TIME, newUpperTime, newUpperTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AadlBaPackage.TIMED_ACTION__LOWER_TIME:
        return basicSetLowerTime(null, msgs);
      case AadlBaPackage.TIMED_ACTION__UPPER_TIME:
        return basicSetUpperTime(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AadlBaPackage.TIMED_ACTION__LOWER_TIME:
        return getLowerTime();
      case AadlBaPackage.TIMED_ACTION__UPPER_TIME:
        return getUpperTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AadlBaPackage.TIMED_ACTION__LOWER_TIME:
        setLowerTime((BehaviorTime)newValue);
        return;
      case AadlBaPackage.TIMED_ACTION__UPPER_TIME:
        setUpperTime((BehaviorTime)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AadlBaPackage.TIMED_ACTION__LOWER_TIME:
        setLowerTime((BehaviorTime)null);
        return;
      case AadlBaPackage.TIMED_ACTION__UPPER_TIME:
        setUpperTime((BehaviorTime)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AadlBaPackage.TIMED_ACTION__LOWER_TIME:
        return lowerTime != null;
      case AadlBaPackage.TIMED_ACTION__UPPER_TIME:
        return upperTime != null;
    }
    return super.eIsSet(featureID);
  }

} //TimedActionImpl
