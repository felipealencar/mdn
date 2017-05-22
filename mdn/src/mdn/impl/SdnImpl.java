/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.App;
import mdn.AppObject;
import mdn.Group;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.Sdn;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sdn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.SdnImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mdn.impl.SdnImpl#getApps <em>Apps</em>}</li>
 *   <li>{@link mdn.impl.SdnImpl#getRuleObjects <em>Rule Objects</em>}</li>
 *   <li>{@link mdn.impl.SdnImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdnImpl extends EObjectImpl implements Sdn {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkNode> nodes;

	/**
	 * The cached value of the '{@link #getApps() <em>Apps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApps()
	 * @generated
	 * @ordered
	 */
	protected EList<App> apps;

	/**
	 * The cached value of the '{@link #getRuleObjects() <em>Rule Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<AppObject> ruleObjects;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.SDN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NetworkNode>(NetworkNode.class, this, MdnPackage.SDN__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getApps() {
		if (apps == null) {
			apps = new EObjectContainmentEList<App>(App.class, this, MdnPackage.SDN__APPS);
		}
		return apps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppObject> getRuleObjects() {
		if (ruleObjects == null) {
			ruleObjects = new EObjectContainmentEList<AppObject>(AppObject.class, this, MdnPackage.SDN__RULE_OBJECTS);
		}
		return ruleObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, MdnPackage.SDN__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdnPackage.SDN__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case MdnPackage.SDN__APPS:
				return ((InternalEList<?>)getApps()).basicRemove(otherEnd, msgs);
			case MdnPackage.SDN__RULE_OBJECTS:
				return ((InternalEList<?>)getRuleObjects()).basicRemove(otherEnd, msgs);
			case MdnPackage.SDN__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.SDN__NODES:
				return getNodes();
			case MdnPackage.SDN__APPS:
				return getApps();
			case MdnPackage.SDN__RULE_OBJECTS:
				return getRuleObjects();
			case MdnPackage.SDN__GROUPS:
				return getGroups();
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
			case MdnPackage.SDN__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NetworkNode>)newValue);
				return;
			case MdnPackage.SDN__APPS:
				getApps().clear();
				getApps().addAll((Collection<? extends App>)newValue);
				return;
			case MdnPackage.SDN__RULE_OBJECTS:
				getRuleObjects().clear();
				getRuleObjects().addAll((Collection<? extends AppObject>)newValue);
				return;
			case MdnPackage.SDN__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
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
			case MdnPackage.SDN__NODES:
				getNodes().clear();
				return;
			case MdnPackage.SDN__APPS:
				getApps().clear();
				return;
			case MdnPackage.SDN__RULE_OBJECTS:
				getRuleObjects().clear();
				return;
			case MdnPackage.SDN__GROUPS:
				getGroups().clear();
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
			case MdnPackage.SDN__NODES:
				return nodes != null && !nodes.isEmpty();
			case MdnPackage.SDN__APPS:
				return apps != null && !apps.isEmpty();
			case MdnPackage.SDN__RULE_OBJECTS:
				return ruleObjects != null && !ruleObjects.isEmpty();
			case MdnPackage.SDN__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SdnImpl
