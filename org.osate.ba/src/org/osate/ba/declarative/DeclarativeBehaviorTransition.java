/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2013 TELECOM ParisTech and CNRS
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

package org.osate.ba.declarative ;

import org.eclipse.emf.common.util.EList ;
import org.osate.ba.aadlba.BehaviorState ;
import org.osate.ba.aadlba.BehaviorTransition ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.ba.declarative.DeclarativeBehaviorTransition#getSrcStates <em>Src States</em>}</li>
 * </ul>
 *
 * @see org.osate.ba.declarative.DeclarativePackage#getDeclarativeBehaviorTransition()
 * @model
 * @generated
 */
public interface DeclarativeBehaviorTransition extends BehaviorTransition,
                                               DeclarativeBehaviorElement
{
  /**
   * Returns the value of the '<em><b>Src States</b></em>' reference list.
   * The list contents are of type {@link org.osate.ba.aadlba.BehaviorState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src States</em>' reference list.
   * @see org.osate.ba.declarative.DeclarativePackage#getDeclarativeBehaviorTransition_SrcStates()
   * @model required="true"
   * @generated
   */
  EList<BehaviorState> getSrcStates() ;

} // DeclarativeBehaviorTransition
