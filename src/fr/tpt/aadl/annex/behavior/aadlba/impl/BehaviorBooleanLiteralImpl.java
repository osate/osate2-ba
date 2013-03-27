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
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorBooleanLiteral;
import fr.tpt.aadl.annex.behavior.utils.AadlBaLocationReference ;

import org.eclipse.emf.ecore.EClass;

import org.osate.aadl2.impl.BooleanLiteralImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BehaviorBooleanLiteralImpl extends BooleanLiteralImpl implements BehaviorBooleanLiteral
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviorBooleanLiteralImpl()
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
    return AadlBaPackage.Literals.BEHAVIOR_BOOLEAN_LITERAL;
  }

  @Override
  public AadlBaLocationReference getAadlBaLocationReference()
  {
    return (AadlBaLocationReference) this.getLocationReference() ;
  }
} //BehaviorBooleanLiteralImpl
