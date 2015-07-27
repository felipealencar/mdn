/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.Action;
import mdn.Condition;
import mdn.Group;
import mdn.Host;
import mdn.MdnPackage;
import mdn.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.RuleImpl#getSourceHostRule <em>Source Host Rule</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getTargetHostRule <em>Target Host Rule</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getRuleAction <em>Rule Action</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getTargetGroupRule <em>Target Group Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule
{
  /**
   * The cached value of the '{@link #getSourceHostRule() <em>Source Host Rule</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceHostRule()
   * @generated
   * @ordered
   */
  protected EList<Host> sourceHostRule;

  /**
   * The cached value of the '{@link #getTargetHostRule() <em>Target Host Rule</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetHostRule()
   * @generated
   * @ordered
   */
  protected EList<Host> targetHostRule;

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
   * The cached value of the '{@link #getRuleCondition() <em>Rule Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleCondition()
   * @generated
   * @ordered
   */
  protected Condition ruleCondition;

  /**
   * The cached value of the '{@link #getRuleAction() <em>Rule Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleAction()
   * @generated
   * @ordered
   */
  protected Action ruleAction;

  /**
   * The cached value of the '{@link #getTargetGroupRule() <em>Target Group Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetGroupRule()
   * @generated
   * @ordered
   */
  protected Group targetGroupRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return MdnPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Host> getSourceHostRule()
  {
    if (sourceHostRule == null)
    {
      sourceHostRule = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.RULE__SOURCE_HOST_RULE);
    }
    return sourceHostRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Host> getTargetHostRule()
  {
    if (targetHostRule == null)
    {
      targetHostRule = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.RULE__TARGET_HOST_RULE);
    }
    return targetHostRule;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getRuleCondition()
  {
    if (ruleCondition != null && ruleCondition.eIsProxy())
    {
      InternalEObject oldRuleCondition = (InternalEObject)ruleCondition;
      ruleCondition = (Condition)eResolveProxy(oldRuleCondition);
      if (ruleCondition != oldRuleCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.RULE__RULE_CONDITION, oldRuleCondition, ruleCondition));
      }
    }
    return ruleCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition basicGetRuleCondition()
  {
    return ruleCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleCondition(Condition newRuleCondition)
  {
    Condition oldRuleCondition = ruleCondition;
    ruleCondition = newRuleCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__RULE_CONDITION, oldRuleCondition, ruleCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getRuleAction()
  {
    if (ruleAction != null && ruleAction.eIsProxy())
    {
      InternalEObject oldRuleAction = (InternalEObject)ruleAction;
      ruleAction = (Action)eResolveProxy(oldRuleAction);
      if (ruleAction != oldRuleAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.RULE__RULE_ACTION, oldRuleAction, ruleAction));
      }
    }
    return ruleAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetRuleAction()
  {
    return ruleAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleAction(Action newRuleAction)
  {
    Action oldRuleAction = ruleAction;
    ruleAction = newRuleAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__RULE_ACTION, oldRuleAction, ruleAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group getTargetGroupRule()
  {
    if (targetGroupRule != null && targetGroupRule.eIsProxy())
    {
      InternalEObject oldTargetGroupRule = (InternalEObject)targetGroupRule;
      targetGroupRule = (Group)eResolveProxy(oldTargetGroupRule);
      if (targetGroupRule != oldTargetGroupRule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.RULE__TARGET_GROUP_RULE, oldTargetGroupRule, targetGroupRule));
      }
    }
    return targetGroupRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group basicGetTargetGroupRule()
  {
    return targetGroupRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetGroupRule(Group newTargetGroupRule)
  {
    Group oldTargetGroupRule = targetGroupRule;
    targetGroupRule = newTargetGroupRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__TARGET_GROUP_RULE, oldTargetGroupRule, targetGroupRule));
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
      case MdnPackage.RULE__SOURCE_HOST_RULE:
        return getSourceHostRule();
      case MdnPackage.RULE__TARGET_HOST_RULE:
        return getTargetHostRule();
      case MdnPackage.RULE__NAME:
        return getName();
      case MdnPackage.RULE__RULE_CONDITION:
        if (resolve) return getRuleCondition();
        return basicGetRuleCondition();
      case MdnPackage.RULE__RULE_ACTION:
        if (resolve) return getRuleAction();
        return basicGetRuleAction();
      case MdnPackage.RULE__TARGET_GROUP_RULE:
        if (resolve) return getTargetGroupRule();
        return basicGetTargetGroupRule();
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
      case MdnPackage.RULE__SOURCE_HOST_RULE:
        getSourceHostRule().clear();
        getSourceHostRule().addAll((Collection<? extends Host>)newValue);
        return;
      case MdnPackage.RULE__TARGET_HOST_RULE:
        getTargetHostRule().clear();
        getTargetHostRule().addAll((Collection<? extends Host>)newValue);
        return;
      case MdnPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case MdnPackage.RULE__RULE_CONDITION:
        setRuleCondition((Condition)newValue);
        return;
      case MdnPackage.RULE__RULE_ACTION:
        setRuleAction((Action)newValue);
        return;
      case MdnPackage.RULE__TARGET_GROUP_RULE:
        setTargetGroupRule((Group)newValue);
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
      case MdnPackage.RULE__SOURCE_HOST_RULE:
        getSourceHostRule().clear();
        return;
      case MdnPackage.RULE__TARGET_HOST_RULE:
        getTargetHostRule().clear();
        return;
      case MdnPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MdnPackage.RULE__RULE_CONDITION:
        setRuleCondition((Condition)null);
        return;
      case MdnPackage.RULE__RULE_ACTION:
        setRuleAction((Action)null);
        return;
      case MdnPackage.RULE__TARGET_GROUP_RULE:
        setTargetGroupRule((Group)null);
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
      case MdnPackage.RULE__SOURCE_HOST_RULE:
        return sourceHostRule != null && !sourceHostRule.isEmpty();
      case MdnPackage.RULE__TARGET_HOST_RULE:
        return targetHostRule != null && !targetHostRule.isEmpty();
      case MdnPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MdnPackage.RULE__RULE_CONDITION:
        return ruleCondition != null;
      case MdnPackage.RULE__RULE_ACTION:
        return ruleAction != null;
      case MdnPackage.RULE__TARGET_GROUP_RULE:
        return targetGroupRule != null;
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

} //RuleImpl
