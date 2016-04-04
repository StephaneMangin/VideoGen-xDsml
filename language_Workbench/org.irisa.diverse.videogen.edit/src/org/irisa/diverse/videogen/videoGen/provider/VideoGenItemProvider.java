/**
 */
package org.irisa.diverse.videogen.videoGen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;
import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

/**
 * This is the item provider adapter for a {@link org.irisa.diverse.videogen.videoGen.VideoGen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenItemProvider(AdapterFactory adapterFactory) {
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

			addMinDurationConstraintPropertyDescriptor(object);
			addMaxDurationConstraintPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Duration Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinDurationConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VideoGen_minDurationConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VideoGen_minDurationConstraint_feature", "_UI_VideoGen_type"),
				 VideoGenPackage.Literals.VIDEO_GEN__MIN_DURATION_CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Duration Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxDurationConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VideoGen_maxDurationConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VideoGen_maxDurationConstraint_feature", "_UI_VideoGen_type"),
				 VideoGenPackage.Literals.VIDEO_GEN__MAX_DURATION_CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES);
			childrenFeatures.add(VideoGenPackage.Literals.VIDEO_GEN__VIDEOS);
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
	 * This returns VideoGen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VideoGen"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VideoGen)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VideoGen_type") :
			getString("_UI_VideoGen_type") + " " + label;
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

		switch (notification.getFeatureID(VideoGen.class)) {
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
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

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES,
				 VideoGenFactory.eINSTANCE.createAlternatives()));

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES,
				 VideoGenFactory.eINSTANCE.createMandatory()));

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES,
				 VideoGenFactory.eINSTANCE.createOptional()));

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES,
				 VideoGenFactory.eINSTANCE.createIntroduction()));

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__SEQUENCES,
				 VideoGenFactory.eINSTANCE.createConclusion()));

		newChildDescriptors.add
			(createChildParameter
				(VideoGenPackage.Literals.VIDEO_GEN__VIDEOS,
				 VideoGenFactory.eINSTANCE.createVideo()));
	}

}
