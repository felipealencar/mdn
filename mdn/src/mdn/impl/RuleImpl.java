/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.Actions;
import mdn.Condition;
import mdn.Flow;
import mdn.Group;
import mdn.Host;
import mdn.MdnPackage;
import mdn.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link mdn.impl.RuleImpl#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getTargetGroupRule <em>Target Group Rule</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link mdn.impl.RuleImpl#getFlowRule <em>Flow Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends AppObjectImpl implements Rule {
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
	 * The cached value of the '{@link #getRuleCondition() <em>Rule Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> ruleCondition;

	/**
	 * The cached value of the '{@link #getTargetGroupRule() <em>Target Group Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroupRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> targetGroupRule;

	/**
	 * The default value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected static final Actions ACTIONS_EDEFAULT = Actions.ADD;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected Actions actions = ACTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowRule() <em>Flow Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowRule()
	 * @generated
	 * @ordered
	 */
	protected Flow flowRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Host> getSourceHostRule() {
		if (sourceHostRule == null) {
			sourceHostRule = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.RULE__SOURCE_HOST_RULE);
		}
		return sourceHostRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Host> getTargetHostRule() {
		if (targetHostRule == null) {
			targetHostRule = new EObjectResolvingEList<Host>(Host.class, this, MdnPackage.RULE__TARGET_HOST_RULE);
		}
		return targetHostRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getRuleCondition() {
		if (ruleCondition == null) {
			ruleCondition = new EObjectResolvingEList<Condition>(Condition.class, this, MdnPackage.RULE__RULE_CONDITION);
		}
		return ruleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getTargetGroupRule() {
		if (targetGroupRule == null) {
			targetGroupRule = new EObjectResolvingEList<Group>(Group.class, this, MdnPackage.RULE__TARGET_GROUP_RULE);
		}
		return targetGroupRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(Actions newActions) {
		Actions oldActions = actions;
		actions = newActions == null ? ACTIONS_EDEFAULT : newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__ACTIONS, oldActions, actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getFlowRule() {
		if (flowRule != null && flowRule.eIsProxy()) {
			InternalEObject oldFlowRule = (InternalEObject)flowRule;
			flowRule = (Flow)eResolveProxy(oldFlowRule);
			if (flowRule != oldFlowRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.RULE__FLOW_RULE, oldFlowRule, flowRule));
			}
		}
		return flowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow basicGetFlowRule() {
		return flowRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowRule(Flow newFlowRule) {
		Flow oldFlowRule = flowRule;
		flowRule = newFlowRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.RULE__FLOW_RULE, oldFlowRule, flowRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.RULE__SOURCE_HOST_RULE:
				return getSourceHostRule();
			case MdnPackage.RULE__TARGET_HOST_RULE:
				return getTargetHostRule();
			case MdnPackage.RULE__RULE_CONDITION:
				return getRuleCondition();
			case MdnPackage.RULE__TARGET_GROUP_RULE:
				return getTargetGroupRule();
			case MdnPackage.RULE__ACTIONS:
				return getActions();
			case MdnPackage.RULE__FLOW_RULE:
				if (resolve) return getFlowRule();
				return basicGetFlowRule();
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
			case MdnPackage.RULE__SOURCE_HOST_RULE:
				getSourceHostRule().clear();
				getSourceHostRule().addAll((Collection<? extends Host>)newValue);
				return;
			case MdnPackage.RULE__TARGET_HOST_RULE:
				getTargetHostRule().clear();
				getTargetHostRule().addAll((Collection<? extends Host>)newValue);
				return;
			case MdnPackage.RULE__RULE_CONDITION:
				getRuleCondition().clear();
				getRuleCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case MdnPackage.RULE__TARGET_GROUP_RULE:
				getTargetGroupRule().clear();
				getTargetGroupRule().addAll((Collection<? extends Group>)newValue);
				return;
			case MdnPackage.RULE__ACTIONS:
				setActions((Actions)newValue);
				return;
			case MdnPackage.RULE__FLOW_RULE:
				setFlowRule((Flow)newValue);
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
			case MdnPackage.RULE__SOURCE_HOST_RULE:
				getSourceHostRule().clear();
				return;
			case MdnPackage.RULE__TARGET_HOST_RULE:
				getTargetHostRule().clear();
				return;
			case MdnPackage.RULE__RULE_CONDITION:
				getRuleCondition().clear();
				return;
			case MdnPackage.RULE__TARGET_GROUP_RULE:
				getTargetGroupRule().clear();
				return;
			case MdnPackage.RULE__ACTIONS:
				setActions(ACTIONS_EDEFAULT);
				return;
			case MdnPackage.RULE__FLOW_RULE:
				setFlowRule((Flow)null);
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
			case MdnPackage.RULE__SOURCE_HOST_RULE:
				return sourceHostRule != null && !sourceHostRule.isEmpty();
			case MdnPackage.RULE__TARGET_HOST_RULE:
				return targetHostRule != null && !targetHostRule.isEmpty();
			case MdnPackage.RULE__RULE_CONDITION:
				return ruleCondition != null && !ruleCondition.isEmpty();
			case MdnPackage.RULE__TARGET_GROUP_RULE:
				return targetGroupRule != null && !targetGroupRule.isEmpty();
			case MdnPackage.RULE__ACTIONS:
				return actions != ACTIONS_EDEFAULT;
			case MdnPackage.RULE__FLOW_RULE:
				return flowRule != null;
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
		result.append(" (actions: ");
		result.append(actions);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
