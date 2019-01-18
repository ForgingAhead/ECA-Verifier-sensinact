/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.sensinact.studio.language.sensinact.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE;
import org.eclipse.sensinact.studio.language.sensinact.SensinactFactory;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DSL_CEP_BEFOREItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSL_CEP_BEFOREItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SensinactPackage.Literals.DSL_CEP_BEFORE__REF1);
			childrenFeatures.add(SensinactPackage.Literals.DSL_CEP_BEFORE__REF2);
			childrenFeatures.add(SensinactPackage.Literals.DSL_CEP_BEFORE__START);
			childrenFeatures.add(SensinactPackage.Literals.DSL_CEP_BEFORE__END);
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
	 * This returns DSL_CEP_BEFORE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DSL_CEP_BEFORE"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DSL_CEP_BEFORE_type");
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

		switch (notification.getFeatureID(DSL_CEP_BEFORE.class)) {
			case SensinactPackage.DSL_CEP_BEFORE__REF1:
			case SensinactPackage.DSL_CEP_BEFORE__REF2:
			case SensinactPackage.DSL_CEP_BEFORE__START:
			case SensinactPackage.DSL_CEP_BEFORE__END:
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
				(SensinactPackage.Literals.DSL_CEP_BEFORE__REF1,
				 SensinactFactory.eINSTANCE.createDSL_REF_CONDITION()));

		newChildDescriptors.add
			(createChildParameter
				(SensinactPackage.Literals.DSL_CEP_BEFORE__REF2,
				 SensinactFactory.eINSTANCE.createDSL_REF_CONDITION()));

		newChildDescriptors.add
			(createChildParameter
				(SensinactPackage.Literals.DSL_CEP_BEFORE__START,
				 SensinactFactory.eINSTANCE.createDSL_CEP_DURATION()));

		newChildDescriptors.add
			(createChildParameter
				(SensinactPackage.Literals.DSL_CEP_BEFORE__END,
				 SensinactFactory.eINSTANCE.createDSL_CEP_DURATION()));
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
			childFeature == SensinactPackage.Literals.DSL_CEP_BEFORE__REF1 ||
			childFeature == SensinactPackage.Literals.DSL_CEP_BEFORE__REF2 ||
			childFeature == SensinactPackage.Literals.DSL_CEP_BEFORE__START ||
			childFeature == SensinactPackage.Literals.DSL_CEP_BEFORE__END;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
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
		return SensinactEditPlugin.INSTANCE;
	}

}
