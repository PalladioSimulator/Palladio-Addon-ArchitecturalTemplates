/**
 */
package org.palladiosimulator.architecturaltemplates.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesFactory;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.architecturaltemplates.Role} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class RoleItemProvider extends EntityItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public RoleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStereotypePropertyDescriptor(object);
			addSuperRolesPropertyDescriptor(object);
			addRoleIncludingInheritedPropertyDescriptor(object);
			addConstraintsIncludingInheritedPropertyDescriptor(object);
			addCompletionIncludingInheritedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stereotype feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addStereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_stereotype_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_stereotype_feature", "_UI_Role_type"),
						ArchitecturaltemplatesPackage.Literals.ROLE__STEREOTYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Super Roles feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addSuperRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_superRoles_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_superRoles_feature", "_UI_Role_type"),
						ArchitecturaltemplatesPackage.Literals.ROLE__SUPER_ROLES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Role Including Inherited feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleIncludingInheritedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_roleIncludingInherited_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_roleIncludingInherited_feature",
								"_UI_Role_type"),
						ArchitecturaltemplatesPackage.Literals.ROLE__ROLE_INCLUDING_INHERITED, false, false, false,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Constraints Including Inherited feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addConstraintsIncludingInheritedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Role_constraintsIncludingInherited_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Role_constraintsIncludingInherited_feature",
						"_UI_Role_type"),
				ArchitecturaltemplatesPackage.Literals.ROLE__CONSTRAINTS_INCLUDING_INHERITED, false, false, false, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Completion Including Inherited feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addCompletionIncludingInheritedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Role_completionIncludingInherited_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Role_completionIncludingInherited_feature",
						"_UI_Role_type"),
				ArchitecturaltemplatesPackage.Literals.ROLE__COMPLETION_INCLUDING_INHERITED, false, false, false, null,
				null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
	 * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArchitecturaltemplatesPackage.Literals.ROLE__COMPLETION);
			childrenFeatures.add(ArchitecturaltemplatesPackage.Literals.ROLE__CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Role.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Role"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Role) object).getEntityName();
		return label == null || label.length() == 0 ? getString("_UI_Role_type")
				: getString("_UI_Role_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Role.class)) {
		case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
		case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ArchitecturaltemplatesPackage.Literals.ROLE__COMPLETION,
				ArchitecturaltemplatesFactory.eINSTANCE.createQVTOCompletion()));

		newChildDescriptors.add(createChildParameter(ArchitecturaltemplatesPackage.Literals.ROLE__CONSTRAINTS,
				ArchitecturaltemplatesFactory.eINSTANCE.createOCLConstraint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArchitecturaltemplatesEditPlugin.INSTANCE;
	}

}
