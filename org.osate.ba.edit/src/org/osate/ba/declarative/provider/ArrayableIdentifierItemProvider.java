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
package org.osate.ba.declarative.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.ba.aadlba.AadlBaFactory;

import org.osate.ba.declarative.ArrayableIdentifier;
import org.osate.ba.declarative.DeclarativeFactory;
import org.osate.ba.declarative.DeclarativePackage;

/**
 * This is the item provider adapter for a {@link org.osate.ba.declarative.ArrayableIdentifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayableIdentifierItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayableIdentifierItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ArrayableIdentifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayableIdentifier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArrayableIdentifier) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ArrayableIdentifier_type")
				: getString("_UI_ArrayableIdentifier_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArrayableIdentifier.class)) {
		case DeclarativePackage.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				DeclarativeFactory.eINSTANCE.createDeclarativePropertyReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				DeclarativeFactory.eINSTANCE.createNamedValue()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				DeclarativeFactory.eINSTANCE.createQualifiedNamedElement()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				DeclarativeFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorPropertyConstant()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorRealLiteral()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorStringLiteral()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createBehaviorVariableHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createClassifierFeaturePropertyReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createClassifierPropertyReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createDataAccessHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createDataAccessPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createDataComponentReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createDataSubcomponentHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createEventDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createEventPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createFeaturePrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createIterativeVariableHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createParameterHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPortCountValue()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPortDequeueValue()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPortFreezeAction()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPortFreshValue()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPortPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createPropertySetPropertyReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.ARRAYABLE_IDENTIFIER__ARRAY_INDEXES,
				AadlBaFactory.eINSTANCE.createStructUnionElementHolder()));
	}

}
