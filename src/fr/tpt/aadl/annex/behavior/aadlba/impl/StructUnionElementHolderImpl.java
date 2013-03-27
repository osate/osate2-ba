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
import fr.tpt.aadl.annex.behavior.aadlba.ElementValues;
import fr.tpt.aadl.annex.behavior.aadlba.IndexableElement;
import fr.tpt.aadl.annex.behavior.aadlba.IntegerValue;
import fr.tpt.aadl.annex.behavior.aadlba.ParameterLabel;
import fr.tpt.aadl.annex.behavior.aadlba.StructUnionElement;
import fr.tpt.aadl.annex.behavior.aadlba.StructUnionElementHolder;
import fr.tpt.aadl.annex.behavior.aadlba.Target;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Union Element Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.StructUnionElementHolderImpl#getArrayIndexes <em>Array Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructUnionElementHolderImpl extends DataHolderImpl implements StructUnionElementHolder
{
  /**
   * The cached value of the '{@link #getArrayIndexes() <em>Array Indexes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayIndexes()
   * @generated
   * @ordered
   */
  protected EList<IntegerValue> arrayIndexes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructUnionElementHolderImpl()
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
    return AadlBaPackage.Literals.STRUCT_UNION_ELEMENT_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerValue> getArrayIndexes()
  {
    if (arrayIndexes == null)
    {
      arrayIndexes = new EObjectContainmentEList.Unsettable<IntegerValue>(IntegerValue.class, this, AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES);
    }
    return arrayIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetArrayIndexes()
  {
    if (arrayIndexes != null) ((InternalEList.Unsettable<?>)arrayIndexes).unset();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetArrayIndexes()
  {
    return arrayIndexes != null && ((InternalEList.Unsettable<?>)arrayIndexes).isSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructUnionElement(StructUnionElement structUnionElement)
  {
    element = structUnionElement ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructUnionElement getStructUnionElement()
  {
    return (StructUnionElement) element;
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
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES:
        return ((InternalEList<?>)getArrayIndexes()).basicRemove(otherEnd, msgs);
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
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES:
        return getArrayIndexes();
    }
    return super.eGet(featureID, resolve, coreType);
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
    switch (featureID)
    {
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES:
        getArrayIndexes().clear();
        getArrayIndexes().addAll((Collection<? extends IntegerValue>)newValue);
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
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES:
        unsetArrayIndexes();
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
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES:
        return isSetArrayIndexes();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == IndexableElement.class)
    {
      switch (derivedFeatureID)
      {
        case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES: return AadlBaPackage.INDEXABLE_ELEMENT__ARRAY_INDEXES;
        default: return -1;
      }
    }
    if (baseClass == ParameterLabel.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Target.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementValues.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == IndexableElement.class)
    {
      switch (baseFeatureID)
      {
        case AadlBaPackage.INDEXABLE_ELEMENT__ARRAY_INDEXES: return AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER__ARRAY_INDEXES;
        default: return -1;
      }
    }
    if (baseClass == ParameterLabel.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Target.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementValues.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //StructUnionElementHolderImpl
