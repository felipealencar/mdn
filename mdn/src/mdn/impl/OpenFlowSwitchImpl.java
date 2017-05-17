/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.MdnPackage;
import mdn.OpenFlowSwitch;
import mdn.PacketHeaders;
import mdn.Switch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Flow Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getTableSpace <em>Table Space</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getSwitchIsOpenFlow <em>Switch Is Open Flow</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getRequiredHeaders <em>Required Headers</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getSupportedProtocols <em>Supported Protocols</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getOptionalHeaders <em>Optional Headers</em>}</li>
 *   <li>{@link mdn.impl.OpenFlowSwitchImpl#getAvailableTableSpace <em>Available Table Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenFlowSwitchImpl extends EObjectImpl implements OpenFlowSwitch {
	/**
	 * The default value of the '{@link #getTableSpace() <em>Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSpace()
	 * @generated
	 * @ordered
	 */
	protected static final float TABLE_SPACE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTableSpace() <em>Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSpace()
	 * @generated
	 * @ordered
	 */
	protected float tableSpace = TABLE_SPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchIsOpenFlow() <em>Switch Is Open Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchIsOpenFlow()
	 * @generated
	 * @ordered
	 */
	protected Switch switchIsOpenFlow;

	/**
	 * The cached value of the '{@link #getRequiredHeaders() <em>Required Headers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<PacketHeaders> requiredHeaders;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportedProtocols() <em>Supported Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProtocols()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_PROTOCOLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedProtocols() <em>Supported Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProtocols()
	 * @generated
	 * @ordered
	 */
	protected String supportedProtocols = SUPPORTED_PROTOCOLS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalHeaders() <em>Optional Headers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<PacketHeaders> optionalHeaders;

	/**
	 * The default value of the '{@link #getAvailableTableSpace() <em>Available Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTableSpace()
	 * @generated
	 * @ordered
	 */
	protected static final float AVAILABLE_TABLE_SPACE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvailableTableSpace() <em>Available Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTableSpace()
	 * @generated
	 * @ordered
	 */
	protected float availableTableSpace = AVAILABLE_TABLE_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenFlowSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.OPEN_FLOW_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTableSpace() {
		return tableSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableSpace(float newTableSpace) {
		float oldTableSpace = tableSpace;
		tableSpace = newTableSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE, oldTableSpace, tableSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getSwitchIsOpenFlow() {
		if (switchIsOpenFlow != null && switchIsOpenFlow.eIsProxy()) {
			InternalEObject oldSwitchIsOpenFlow = (InternalEObject)switchIsOpenFlow;
			switchIsOpenFlow = (Switch)eResolveProxy(oldSwitchIsOpenFlow);
			if (switchIsOpenFlow != oldSwitchIsOpenFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW, oldSwitchIsOpenFlow, switchIsOpenFlow));
			}
		}
		return switchIsOpenFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetSwitchIsOpenFlow() {
		return switchIsOpenFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchIsOpenFlow(Switch newSwitchIsOpenFlow) {
		Switch oldSwitchIsOpenFlow = switchIsOpenFlow;
		switchIsOpenFlow = newSwitchIsOpenFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW, oldSwitchIsOpenFlow, switchIsOpenFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PacketHeaders> getRequiredHeaders() {
		if (requiredHeaders == null) {
			requiredHeaders = new EDataTypeEList<PacketHeaders>(PacketHeaders.class, this, MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS);
		}
		return requiredHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.OPEN_FLOW_SWITCH__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportedProtocols() {
		return supportedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedProtocols(String newSupportedProtocols) {
		String oldSupportedProtocols = supportedProtocols;
		supportedProtocols = newSupportedProtocols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS, oldSupportedProtocols, supportedProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PacketHeaders> getOptionalHeaders() {
		if (optionalHeaders == null) {
			optionalHeaders = new EDataTypeEList<PacketHeaders>(PacketHeaders.class, this, MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS);
		}
		return optionalHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvailableTableSpace() {
		return availableTableSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableTableSpace(float newAvailableTableSpace) {
		float oldAvailableTableSpace = availableTableSpace;
		availableTableSpace = newAvailableTableSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE, oldAvailableTableSpace, availableTableSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE:
				return getTableSpace();
			case MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW:
				if (resolve) return getSwitchIsOpenFlow();
				return basicGetSwitchIsOpenFlow();
			case MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS:
				return getRequiredHeaders();
			case MdnPackage.OPEN_FLOW_SWITCH__VERSION:
				return getVersion();
			case MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS:
				return getSupportedProtocols();
			case MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS:
				return getOptionalHeaders();
			case MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE:
				return getAvailableTableSpace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE:
				setTableSpace((Float)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW:
				setSwitchIsOpenFlow((Switch)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS:
				getRequiredHeaders().clear();
				getRequiredHeaders().addAll((Collection<? extends PacketHeaders>)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__VERSION:
				setVersion((String)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS:
				setSupportedProtocols((String)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS:
				getOptionalHeaders().clear();
				getOptionalHeaders().addAll((Collection<? extends PacketHeaders>)newValue);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE:
				setAvailableTableSpace((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE:
				setTableSpace(TABLE_SPACE_EDEFAULT);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW:
				setSwitchIsOpenFlow((Switch)null);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS:
				getRequiredHeaders().clear();
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS:
				setSupportedProtocols(SUPPORTED_PROTOCOLS_EDEFAULT);
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS:
				getOptionalHeaders().clear();
				return;
			case MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE:
				setAvailableTableSpace(AVAILABLE_TABLE_SPACE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdnPackage.OPEN_FLOW_SWITCH__TABLE_SPACE:
				return tableSpace != TABLE_SPACE_EDEFAULT;
			case MdnPackage.OPEN_FLOW_SWITCH__SWITCH_IS_OPEN_FLOW:
				return switchIsOpenFlow != null;
			case MdnPackage.OPEN_FLOW_SWITCH__REQUIRED_HEADERS:
				return requiredHeaders != null && !requiredHeaders.isEmpty();
			case MdnPackage.OPEN_FLOW_SWITCH__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MdnPackage.OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS:
				return SUPPORTED_PROTOCOLS_EDEFAULT == null ? supportedProtocols != null : !SUPPORTED_PROTOCOLS_EDEFAULT.equals(supportedProtocols);
			case MdnPackage.OPEN_FLOW_SWITCH__OPTIONAL_HEADERS:
				return optionalHeaders != null && !optionalHeaders.isEmpty();
			case MdnPackage.OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE:
				return availableTableSpace != AVAILABLE_TABLE_SPACE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tableSpace: ");
		result.append(tableSpace);
		result.append(", requiredHeaders: ");
		result.append(requiredHeaders);
		result.append(", version: ");
		result.append(version);
		result.append(", supportedProtocols: ");
		result.append(supportedProtocols);
		result.append(", optionalHeaders: ");
		result.append(optionalHeaders);
		result.append(", availableTableSpace: ");
		result.append(availableTableSpace);
		result.append(')');
		return result.toString();
	}

} //OpenFlowSwitchImpl
