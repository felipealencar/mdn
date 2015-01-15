/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.Policy;
import mdn.PolicyObject;
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
 *   <li>{@link mdn.impl.SdnImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link mdn.impl.SdnImpl#getPolicyObjects <em>Policy Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdnImpl extends EObjectImpl implements Sdn
{
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
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<Policy> policies;

  /**
   * The cached value of the '{@link #getPolicyObjects() <em>Policy Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyObjects()
   * @generated
   * @ordered
   */
  protected EList<PolicyObject> policyObjects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SdnImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MdnPackage.Literals.SDN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetworkNode> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<NetworkNode>(NetworkNode.class, this, MdnPackage.SDN__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Policy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<Policy>(Policy.class, this, MdnPackage.SDN__POLICIES);
    }
    return policies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PolicyObject> getPolicyObjects()
  {
    if (policyObjects == null)
    {
      policyObjects = new EObjectContainmentEList<PolicyObject>(PolicyObject.class, this, MdnPackage.SDN__POLICY_OBJECTS);
    }
    return policyObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MdnPackage.SDN__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case MdnPackage.SDN__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
      case MdnPackage.SDN__POLICY_OBJECTS:
        return ((InternalEList<?>)getPolicyObjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MdnPackage.SDN__NODES:
        return getNodes();
      case MdnPackage.SDN__POLICIES:
        return getPolicies();
      case MdnPackage.SDN__POLICY_OBJECTS:
        return getPolicyObjects();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MdnPackage.SDN__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends NetworkNode>)newValue);
        return;
      case MdnPackage.SDN__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends Policy>)newValue);
        return;
      case MdnPackage.SDN__POLICY_OBJECTS:
        getPolicyObjects().clear();
        getPolicyObjects().addAll((Collection<? extends PolicyObject>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MdnPackage.SDN__NODES:
        getNodes().clear();
        return;
      case MdnPackage.SDN__POLICIES:
        getPolicies().clear();
        return;
      case MdnPackage.SDN__POLICY_OBJECTS:
        getPolicyObjects().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MdnPackage.SDN__NODES:
        return nodes != null && !nodes.isEmpty();
      case MdnPackage.SDN__POLICIES:
        return policies != null && !policies.isEmpty();
      case MdnPackage.SDN__POLICY_OBJECTS:
        return policyObjects != null && !policyObjects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SdnImpl
