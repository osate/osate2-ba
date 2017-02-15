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
package org.osate.ba.declarative ;

import org.eclipse.emf.common.util.EList ;

import org.eclipse.emf.ecore.EObject ;

import org.osate.aadl2.DataClassifier ;

import org.osate.ba.aadlba.BehaviorVariable ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Variable Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.ba.declarative.DeclarativeBehaviorVariableSet#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.osate.ba.declarative.DeclarativePackage#getDeclarativeBehaviorVariableSet()
 * @model
 * @generated
 */
public interface DeclarativeBehaviorVariableSet extends EObject,
                                                BehaviorVariable
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.ba.aadlba.BehaviorVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.osate.ba.declarative.DeclarativePackage#getDeclarativeBehaviorVariableSet_Variables()
   * @model containment="true" required="true"
   * @generated
   */
  EList<BehaviorVariable> getVariables() ;

} // DeclarativeBehaviorVariableSet
