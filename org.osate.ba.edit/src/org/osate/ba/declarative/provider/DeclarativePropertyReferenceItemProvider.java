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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.ba.declarative.DeclarativeFactory;
import org.osate.ba.declarative.DeclarativePackage;
import org.osate.ba.declarative.DeclarativePropertyReference;

/**
 * This is the item provider adapter for a {@link org.osate.ba.declarative.DeclarativePropertyReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarativePropertyReferenceItemProvider extends DeclarativeBehaviorElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativePropertyReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addPropertySetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertySetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeclarativePropertyReference_propertySet_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeclarativePropertyReference_propertySet_feature",
						"_UI_DeclarativePropertyReference_type"),
				DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__PROPERTY_SET, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__QUALIFIED_NAME);
			childrenFeatures.add(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__REFERENCE);
			childrenFeatures.add(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__PROPERTY_NAMES);
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
	 * This returns DeclarativePropertyReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeclarativePropertyReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DeclarativePropertyReference declarativePropertyReference = (DeclarativePropertyReference) object;
		return getString("_UI_DeclarativePropertyReference_type") + " " + declarativePropertyReference.isPropertySet();
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

		switch (notification.getFeatureID(DeclarativePropertyReference.class)) {
		case DeclarativePackage.DECLARATIVE_PROPERTY_REFERENCE__PROPERTY_SET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DeclarativePackage.DECLARATIVE_PROPERTY_REFERENCE__QUALIFIED_NAME:
		case DeclarativePackage.DECLARATIVE_PROPERTY_REFERENCE__REFERENCE:
		case DeclarativePackage.DECLARATIVE_PROPERTY_REFERENCE__PROPERTY_NAMES:
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

		newChildDescriptors
				.add(createChildParameter(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__QUALIFIED_NAME,
						DeclarativeFactory.eINSTANCE.createQualifiedNamedElement()));

		newChildDescriptors
				.add(createChildParameter(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__REFERENCE,
						DeclarativeFactory.eINSTANCE.createReference()));

		newChildDescriptors
				.add(createChildParameter(DeclarativePackage.Literals.DECLARATIVE_PROPERTY_REFERENCE__PROPERTY_NAMES,
						DeclarativeFactory.eINSTANCE.createDeclarativePropertyName()));
	}

}
