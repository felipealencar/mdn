/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Rule#getSourceHostRule <em>Source Host Rule</em>}</li>
 *   <li>{@link mdn.Rule#getTargetHostRule <em>Target Host Rule</em>}</li>
 *   <li>{@link mdn.Rule#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link mdn.Rule#getTargetGroupRule <em>Target Group Rule</em>}</li>
 *   <li>{@link mdn.Rule#getActions <em>Actions</em>}</li>
 *   <li>{@link mdn.Rule#getFlowRule <em>Flow Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getRule()
 * @model annotation="gmf.node figure='RuleFigure' label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/policy.gif' label.placement='external'"
 * @generated
 */
public interface Rule extends AppObject {
	/**
	 * Returns the value of the '<em><b>Source Host Rule</b></em>' reference list.
	 * The list contents are of type {@link mdn.Host}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Host Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Host Rule</em>' reference list.
	 * @see mdn.MdnPackage#getRule_SourceHostRule()
	 * @model transient="true"
	 *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Host> getSourceHostRule();

	/**
	 * Returns the value of the '<em><b>Target Host Rule</b></em>' reference list.
	 * The list contents are of type {@link mdn.Host}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Host Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Host Rule</em>' reference list.
	 * @see mdn.MdnPackage#getRule_TargetHostRule()
	 * @model transient="true"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Host> getTargetHostRule();

	/**
	 * Returns the value of the '<em><b>Rule Condition</b></em>' reference list.
	 * The list contents are of type {@link mdn.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Condition</em>' reference list.
	 * @see mdn.MdnPackage#getRule_RuleCondition()
	 * @model transient="true"
	 *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Condition> getRuleCondition();

	/**
	 * Returns the value of the '<em><b>Target Group Rule</b></em>' reference list.
	 * The list contents are of type {@link mdn.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Group Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Group Rule</em>' reference list.
	 * @see mdn.MdnPackage#getRule_TargetGroupRule()
	 * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Group> getTargetGroupRule();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute.
	 * The default value is <code>"ADD"</code>.
	 * The literals are from the enumeration {@link mdn.Actions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute.
	 * @see mdn.Actions
	 * @see #setActions(Actions)
	 * @see mdn.MdnPackage#getRule_Actions()
	 * @model default="ADD"
	 * @generated
	 */
	Actions getActions();

	/**
	 * Sets the value of the '{@link mdn.Rule#getActions <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' attribute.
	 * @see mdn.Actions
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Actions value);

	/**
	 * Returns the value of the '<em><b>Flow Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Rule</em>' reference.
	 * @see #setFlowRule(Flow)
	 * @see mdn.MdnPackage#getRule_FlowRule()
	 * @model
	 * @generated
	 */
	Flow getFlowRule();

	/**
	 * Sets the value of the '{@link mdn.Rule#getFlowRule <em>Flow Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Rule</em>' reference.
	 * @see #getFlowRule()
	 * @generated
	 */
	void setFlowRule(Flow value);

} // Rule
