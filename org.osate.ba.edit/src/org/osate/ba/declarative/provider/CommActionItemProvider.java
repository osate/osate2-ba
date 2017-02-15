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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.ba.aadlba.AadlBaFactory;

import org.osate.ba.aadlba.provider.BehaviorElementItemProvider;

import org.osate.ba.declarative.CommAction;
import org.osate.ba.declarative.DeclarativeFactory;
import org.osate.ba.declarative.DeclarativePackage;

/**
 * This is the item provider adapter for a {@link org.osate.ba.declarative.CommAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommActionItemProvider extends BehaviorElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommActionItemProvider(AdapterFactory adapterFactory) {
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

			addOsateRefPropertyDescriptor(object);
			addBaRefPropertyDescriptor(object);
			addPortFreezePropertyDescriptor(object);
			addPortDequeuePropertyDescriptor(object);
			addLockPropertyDescriptor(object);
			addUnlockPropertyDescriptor(object);
			addSubprogramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Osate Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsateRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeclarativeBehaviorElement_osateRef_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeclarativeBehaviorElement_osateRef_feature",
						"_UI_DeclarativeBehaviorElement_type"),
				DeclarativePackage.Literals.DECLARATIVE_BEHAVIOR_ELEMENT__OSATE_REF, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Ba Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeclarativeBehaviorElement_baRef_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeclarativeBehaviorElement_baRef_feature",
						"_UI_DeclarativeBehaviorElement_type"),
				DeclarativePackage.Literals.DECLARATIVE_BEHAVIOR_ELEMENT__BA_REF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Freeze feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortFreezePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommAction_portFreeze_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommAction_portFreeze_feature",
								"_UI_CommAction_type"),
						DeclarativePackage.Literals.COMM_ACTION__PORT_FREEZE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Dequeue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortDequeuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommAction_portDequeue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommAction_portDequeue_feature",
								"_UI_CommAction_type"),
						DeclarativePackage.Literals.COMM_ACTION__PORT_DEQUEUE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommAction_lock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommAction_lock_feature",
								"_UI_CommAction_type"),
						DeclarativePackage.Literals.COMM_ACTION__LOCK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unlock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommAction_unlock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommAction_unlock_feature",
								"_UI_CommAction_type"),
						DeclarativePackage.Literals.COMM_ACTION__UNLOCK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subprogram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubprogramPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommAction_subprogram_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommAction_subprogram_feature",
								"_UI_CommAction_type"),
						DeclarativePackage.Literals.COMM_ACTION__SUBPROGRAM, true, false, true, null, null, null));
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
			childrenFeatures.add(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS);
			childrenFeatures.add(DeclarativePackage.Literals.COMM_ACTION__TARGET);
			childrenFeatures.add(DeclarativePackage.Literals.COMM_ACTION__QUALIFIED_NAME);
			childrenFeatures.add(DeclarativePackage.Literals.COMM_ACTION__REFERENCE);
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
	 * This returns CommAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CommAction commAction = (CommAction) object;
		return getString("_UI_CommAction_type") + " " + commAction.isPortFreeze();
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

		switch (notification.getFeatureID(CommAction.class)) {
		case DeclarativePackage.COMM_ACTION__PORT_FREEZE:
		case DeclarativePackage.COMM_ACTION__PORT_DEQUEUE:
		case DeclarativePackage.COMM_ACTION__LOCK:
		case DeclarativePackage.COMM_ACTION__UNLOCK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DeclarativePackage.COMM_ACTION__PARAMETERS:
		case DeclarativePackage.COMM_ACTION__TARGET:
		case DeclarativePackage.COMM_ACTION__QUALIFIED_NAME:
		case DeclarativePackage.COMM_ACTION__REFERENCE:
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

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				DeclarativeFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createValueExpression()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createAny()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createBehaviorVariableHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createDataAccessHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createDataAccessPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createDataComponentReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createDataSubcomponentHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createEventDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createEventPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createFeaturePrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createParameterHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createPortPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createStructUnionElementHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__PARAMETERS,
				AadlBaFactory.eINSTANCE.createTarget()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				DeclarativeFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createBehaviorVariableHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createDataAccessHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createDataAccessPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createDataComponentReference()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createDataSubcomponentHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createEventDataPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createEventPortHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createFeaturePrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createParameterHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createPortPrototypeHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createStructUnionElementHolder()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__TARGET,
				AadlBaFactory.eINSTANCE.createTarget()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__QUALIFIED_NAME,
				DeclarativeFactory.eINSTANCE.createQualifiedNamedElement()));

		newChildDescriptors.add(createChildParameter(DeclarativePackage.Literals.COMM_ACTION__REFERENCE,
				DeclarativeFactory.eINSTANCE.createReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == DeclarativePackage.Literals.COMM_ACTION__PARAMETERS
				|| childFeature == DeclarativePackage.Literals.COMM_ACTION__TARGET
				|| childFeature == DeclarativePackage.Literals.COMM_ACTION__REFERENCE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DeclarativeEditPlugin.INSTANCE;
	}

}
