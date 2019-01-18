/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl.provider;


import java.util.Collection;
import java.util.List;

import nii.bigclout.ecaadapter.dsl.DslFactory;
import nii.bigclout.ecaadapter.dsl.DslPackage;
import nii.bigclout.ecaadapter.dsl.PlusElement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nii.bigclout.ecaadapter.dsl.PlusElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlusElementItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusElementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DslPackage.Literals.PLUS_ELEMENT__LEFT);
			childrenFeatures.add(DslPackage.Literals.PLUS_ELEMENT__RIGHT);
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
	 * This returns PlusElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlusElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PlusElement_type");
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

		switch (notification.getFeatureID(PlusElement.class)) {
			case DslPackage.PLUS_ELEMENT__LEFT:
			case DslPackage.PLUS_ELEMENT__RIGHT:
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
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createOrElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createAndElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createDiffElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createLargerElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createLargerEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createSmallerElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createSmallerEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createPlusElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createMinusElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createMultiplicationElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createDivisionElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createModuloElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createNumber_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createBoolean_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createResource_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createState_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__LEFT,
				 DslFactory.eINSTANCE.createNegateElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createOrElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createAndElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createDiffElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createLargerElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createLargerEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createSmallerElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createSmallerEqualElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createPlusElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createMinusElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createMultiplicationElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createDivisionElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createModuloElement()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createNumber_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createBoolean_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createResource_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createState_Object()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.PLUS_ELEMENT__RIGHT,
				 DslFactory.eINSTANCE.createNegateElement()));
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

		boolean qualify =
			childFeature == DslPackage.Literals.PLUS_ELEMENT__LEFT ||
			childFeature == DslPackage.Literals.PLUS_ELEMENT__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
