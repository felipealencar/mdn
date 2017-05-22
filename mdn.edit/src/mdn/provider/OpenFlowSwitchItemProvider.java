/**
 */
package mdn.provider;


import java.util.Collection;
import java.util.List;

import mdn.MdnPackage;
import mdn.OpenFlowSwitch;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mdn.OpenFlowSwitch} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenFlowSwitchItemProvider 
	extends SwitchItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFlowSwitchItemProvider(AdapterFactory adapterFactory) {
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

			addTableSpacePropertyDescriptor(object);
			addRequiredHeadersPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addSupportedProtocolsPropertyDescriptor(object);
			addOptionalHeadersPropertyDescriptor(object);
			addAvailableTableSpacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_tableSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_tableSpace_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__TABLE_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Headers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredHeadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_requiredHeaders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_requiredHeaders_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__REQUIRED_HEADERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_version_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Protocols feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedProtocolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_supportedProtocols_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_supportedProtocols_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional Headers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalHeadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_optionalHeaders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_optionalHeaders_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available Table Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableTableSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenFlowSwitch_availableTableSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenFlowSwitch_availableTableSpace_feature", "_UI_OpenFlowSwitch_type"),
				 MdnPackage.Literals.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OpenFlowSwitch.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpenFlowSwitch"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OpenFlowSwitch)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OpenFlowSwitch_type") :
			getString("_UI_OpenFlowSwitch_type") + " " + label;
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

		switch (notification.getFeatureID(OpenFlowSwitch.class)) {
			case MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE:
			case MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS:
			case MdnPackage.OPEN_FLOW_SWITCH__VERSION:
			case MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS:
			case MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS:
			case MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
