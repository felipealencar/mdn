/**
 */
package mdn.impl;

import java.util.Collection;
import mdn.Action;
import mdn.Condition;
import mdn.Host;
import mdn.MdnPackage;
import mdn.Policy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.PolicyImpl#getSourceHostPolicy <em>Source Host Policy</em>}</li>
 *   <li>{@link mdn.impl.PolicyImpl#getTargetHostPolicy <em>Target Host Policy</em>}</li>
 *   <li>{@link mdn.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdn.impl.PolicyImpl#getPolicyCondition <em>Policy Condition</em>}</li>
 *   <li>{@link mdn.impl.PolicyImpl#getPolicyAction <em>Policy Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends EObjectImpl implements Policy
{
  /**
   * The cached value of the '{@link #getSourceHostPolicy() <em>Source Host Policy</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceHostPolicy()
   * @generated
   * @ordered
   */
  protected EList<Host> sourceHostPolicy;

  /**
   * The cached value of the '{@link #getTargetHostPolicy() <em>Target Host Policy</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetHostPolicy()
   * @generated
   * @ordered
   */
  protected EList<Host> targetHostPolicy;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolicyCondition() <em>Policy Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyCondition()
   * @generated
   * @ordered
   */
  protected Condition policyCondition;

  /**
   * The cached value of the '{@link #getPolicyAction() <em>Policy Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyAction()
   * @generated
   * @ordered
   */
  protected Action policyAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyImpl()
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
    return MdnPackage.Literals.POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Host> getSourceHostPolicy()
  {
    if (sourceHostPolicy == null)
    {
      sourceHostPolicy = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.POLICY__SOURCE_HOST_POLICY);
    }
    return sourceHostPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Host> getTargetHostPolicy()
  {
    if (targetHostPolicy == null)
    {
      targetHostPolicy = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.POLICY__TARGET_HOST_POLICY);
    }
    return targetHostPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getPolicyCondition()
  {
    if (policyCondition != null && policyCondition.eIsProxy())
    {
      InternalEObject oldPolicyCondition = (InternalEObject)policyCondition;
      policyCondition = (Condition)eResolveProxy(oldPolicyCondition);
      if (policyCondition != oldPolicyCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.POLICY__POLICY_CONDITION, oldPolicyCondition, policyCondition));
      }
    }
    return policyCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition basicGetPolicyCondition()
  {
    return policyCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicyCondition(Condition newPolicyCondition)
  {
    Condition oldPolicyCondition = policyCondition;
    policyCondition = newPolicyCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.POLICY__POLICY_CONDITION, oldPolicyCondition, policyCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getPolicyAction()
  {
    if (policyAction != null && policyAction.eIsProxy())
    {
      InternalEObject oldPolicyAction = (InternalEObject)policyAction;
      policyAction = (Action)eResolveProxy(oldPolicyAction);
      if (policyAction != oldPolicyAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.POLICY__POLICY_ACTION, oldPolicyAction, policyAction));
      }
    }
    return policyAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetPolicyAction()
  {
    return policyAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicyAction(Action newPolicyAction)
  {
    Action oldPolicyAction = policyAction;
    policyAction = newPolicyAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.POLICY__POLICY_ACTION, oldPolicyAction, policyAction));
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
      case MdnPackage.POLICY__SOURCE_HOST_POLICY:
        return getSourceHostPolicy();
      case MdnPackage.POLICY__TARGET_HOST_POLICY:
        return getTargetHostPolicy();
      case MdnPackage.POLICY__NAME:
        return getName();
      case MdnPackage.POLICY__POLICY_CONDITION:
        if (resolve) return getPolicyCondition();
        return basicGetPolicyCondition();
      case MdnPackage.POLICY__POLICY_ACTION:
        if (resolve) return getPolicyAction();
        return basicGetPolicyAction();
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
      case MdnPackage.POLICY__SOURCE_HOST_POLICY:
        getSourceHostPolicy().clear();
        getSourceHostPolicy().addAll((Collection<? extends Host>)newValue);
        return;
      case MdnPackage.POLICY__TARGET_HOST_POLICY:
        getTargetHostPolicy().clear();
        getTargetHostPolicy().addAll((Collection<? extends Host>)newValue);
        return;
      case MdnPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case MdnPackage.POLICY__POLICY_CONDITION:
        setPolicyCondition((Condition)newValue);
        return;
      case MdnPackage.POLICY__POLICY_ACTION:
        setPolicyAction((Action)newValue);
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
      case MdnPackage.POLICY__SOURCE_HOST_POLICY:
        getSourceHostPolicy().clear();
        return;
      case MdnPackage.POLICY__TARGET_HOST_POLICY:
        getTargetHostPolicy().clear();
        return;
      case MdnPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MdnPackage.POLICY__POLICY_CONDITION:
        setPolicyCondition((Condition)null);
        return;
      case MdnPackage.POLICY__POLICY_ACTION:
        setPolicyAction((Action)null);
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
      case MdnPackage.POLICY__SOURCE_HOST_POLICY:
        return sourceHostPolicy != null && !sourceHostPolicy.isEmpty();
      case MdnPackage.POLICY__TARGET_HOST_POLICY:
        return targetHostPolicy != null && !targetHostPolicy.isEmpty();
      case MdnPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MdnPackage.POLICY__POLICY_CONDITION:
        return policyCondition != null;
      case MdnPackage.POLICY__POLICY_ACTION:
        return policyAction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PolicyImpl
