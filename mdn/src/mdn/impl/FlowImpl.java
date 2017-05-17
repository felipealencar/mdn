/**
 */
package mdn.impl;

import mdn.Flow;
import mdn.Host;
import mdn.MdnPackage;
import mdn.PacketHeaders;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.FlowImpl#getMatchFields <em>Match Fields</em>}</li>
 *   <li>{@link mdn.impl.FlowImpl#getMatchValues <em>Match Values</em>}</li>
 *   <li>{@link mdn.impl.FlowImpl#getFlowSourceHost <em>Flow Source Host</em>}</li>
 *   <li>{@link mdn.impl.FlowImpl#getFlowDestinationHost <em>Flow Destination Host</em>}</li>
 *   <li>{@link mdn.impl.FlowImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends EObjectImpl implements Flow {
	/**
	 * The default value of the '{@link #getMatchFields() <em>Match Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFields()
	 * @generated
	 * @ordered
	 */
	protected static final PacketHeaders MATCH_FIELDS_EDEFAULT = PacketHeaders.IN_PORT;

	/**
	 * The cached value of the '{@link #getMatchFields() <em>Match Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFields()
	 * @generated
	 * @ordered
	 */
	protected PacketHeaders matchFields = MATCH_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchValues() <em>Match Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchValues()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchValues() <em>Match Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchValues()
	 * @generated
	 * @ordered
	 */
	protected String matchValues = MATCH_VALUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowSourceHost() <em>Flow Source Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowSourceHost()
	 * @generated
	 * @ordered
	 */
	protected Host flowSourceHost;

	/**
	 * The cached value of the '{@link #getFlowDestinationHost() <em>Flow Destination Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDestinationHost()
	 * @generated
	 * @ordered
	 */
	protected Host flowDestinationHost;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketHeaders getMatchFields() {
		return matchFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchFields(PacketHeaders newMatchFields) {
		PacketHeaders oldMatchFields = matchFields;
		matchFields = newMatchFields == null ? MATCH_FIELDS_EDEFAULT : newMatchFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.FLOW__MATCH_FIELDS, oldMatchFields, matchFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchValues() {
		return matchValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchValues(String newMatchValues) {
		String oldMatchValues = matchValues;
		matchValues = newMatchValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.FLOW__MATCH_VALUES, oldMatchValues, matchValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host getFlowSourceHost() {
		if (flowSourceHost != null && flowSourceHost.eIsProxy()) {
			InternalEObject oldFlowSourceHost = (InternalEObject)flowSourceHost;
			flowSourceHost = (Host)eResolveProxy(oldFlowSourceHost);
			if (flowSourceHost != oldFlowSourceHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.FLOW__FLOW_SOURCE_HOST, oldFlowSourceHost, flowSourceHost));
			}
		}
		return flowSourceHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host basicGetFlowSourceHost() {
		return flowSourceHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowSourceHost(Host newFlowSourceHost) {
		Host oldFlowSourceHost = flowSourceHost;
		flowSourceHost = newFlowSourceHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.FLOW__FLOW_SOURCE_HOST, oldFlowSourceHost, flowSourceHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host getFlowDestinationHost() {
		if (flowDestinationHost != null && flowDestinationHost.eIsProxy()) {
			InternalEObject oldFlowDestinationHost = (InternalEObject)flowDestinationHost;
			flowDestinationHost = (Host)eResolveProxy(oldFlowDestinationHost);
			if (flowDestinationHost != oldFlowDestinationHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.FLOW__FLOW_DESTINATION_HOST, oldFlowDestinationHost, flowDestinationHost));
			}
		}
		return flowDestinationHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host basicGetFlowDestinationHost() {
		return flowDestinationHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowDestinationHost(Host newFlowDestinationHost) {
		Host oldFlowDestinationHost = flowDestinationHost;
		flowDestinationHost = newFlowDestinationHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.FLOW__FLOW_DESTINATION_HOST, oldFlowDestinationHost, flowDestinationHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.FLOW__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.FLOW__MATCH_FIELDS:
				return getMatchFields();
			case MdnPackage.FLOW__MATCH_VALUES:
				return getMatchValues();
			case MdnPackage.FLOW__FLOW_SOURCE_HOST:
				if (resolve) return getFlowSourceHost();
				return basicGetFlowSourceHost();
			case MdnPackage.FLOW__FLOW_DESTINATION_HOST:
				if (resolve) return getFlowDestinationHost();
				return basicGetFlowDestinationHost();
			case MdnPackage.FLOW__PRIORITY:
				return getPriority();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdnPackage.FLOW__MATCH_FIELDS:
				setMatchFields((PacketHeaders)newValue);
				return;
			case MdnPackage.FLOW__MATCH_VALUES:
				setMatchValues((String)newValue);
				return;
			case MdnPackage.FLOW__FLOW_SOURCE_HOST:
				setFlowSourceHost((Host)newValue);
				return;
			case MdnPackage.FLOW__FLOW_DESTINATION_HOST:
				setFlowDestinationHost((Host)newValue);
				return;
			case MdnPackage.FLOW__PRIORITY:
				setPriority((Integer)newValue);
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
			case MdnPackage.FLOW__MATCH_FIELDS:
				setMatchFields(MATCH_FIELDS_EDEFAULT);
				return;
			case MdnPackage.FLOW__MATCH_VALUES:
				setMatchValues(MATCH_VALUES_EDEFAULT);
				return;
			case MdnPackage.FLOW__FLOW_SOURCE_HOST:
				setFlowSourceHost((Host)null);
				return;
			case MdnPackage.FLOW__FLOW_DESTINATION_HOST:
				setFlowDestinationHost((Host)null);
				return;
			case MdnPackage.FLOW__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case MdnPackage.FLOW__MATCH_FIELDS:
				return matchFields != MATCH_FIELDS_EDEFAULT;
			case MdnPackage.FLOW__MATCH_VALUES:
				return MATCH_VALUES_EDEFAULT == null ? matchValues != null : !MATCH_VALUES_EDEFAULT.equals(matchValues);
			case MdnPackage.FLOW__FLOW_SOURCE_HOST:
				return flowSourceHost != null;
			case MdnPackage.FLOW__FLOW_DESTINATION_HOST:
				return flowDestinationHost != null;
			case MdnPackage.FLOW__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (matchFields: ");
		result.append(matchFields);
		result.append(", matchValues: ");
		result.append(matchValues);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //FlowImpl
