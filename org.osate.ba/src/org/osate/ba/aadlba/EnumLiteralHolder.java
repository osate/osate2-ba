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
package org.osate.ba.aadlba;

import org.osate.aadl2.EnumerationLiteral;
import org.osate.ba.utils.visitor.IBAVisitable ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.osate.ba.aadlba.AadlBaPackage#getEnumLiteralHolder()
 * @model
 * @generated
 */
public interface EnumLiteralHolder extends PropertyElementHolder, IBAVisitable
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model enumLiteralRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='element = enumLiteral ;'"
   * @generated
   */
  void setEnumLiteral(EnumerationLiteral enumLiteral);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (EnumerationLiteral) element;'"
   * @generated
   */
  EnumerationLiteral getEnumLiteral();
} // EnumLiteralHolder
