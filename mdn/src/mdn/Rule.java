/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link mdn.Rule#getName <em>Name</em>}</li>
 *   <li>{@link mdn.Rule#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link mdn.Rule#getRuleAction <em>Rule Action</em>}</li>
 *   <li>{@link mdn.Rule#getTargetGroupRule <em>Target Group Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getRule()
 * @model annotation="gmf.node figure='figures.PolicyFigure' label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/policy.gif' label.placement='external'"
 * @generated
 */
public interface Rule extends EObject
{
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
   *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0' tool.name='sourceHost'"
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
   *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0' tool.name='targetHost'"
   * @generated
   */
  EList<Host> getTargetHostRule();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mdn.MdnPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdn.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rule Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Condition</em>' reference.
   * @see #setRuleCondition(Condition)
   * @see mdn.MdnPackage#getRule_RuleCondition()
   * @model transient="true"
   *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
   * @generated
   */
  Condition getRuleCondition();

  /**
   * Sets the value of the '{@link mdn.Rule#getRuleCondition <em>Rule Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Condition</em>' reference.
   * @see #getRuleCondition()
   * @generated
   */
  void setRuleCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Rule Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Action</em>' reference.
   * @see #setRuleAction(Action)
   * @see mdn.MdnPackage#getRule_RuleAction()
   * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0' tool.name='ruleAction'"
   * @generated
   */
  Action getRuleAction();

  /**
   * Sets the value of the '{@link mdn.Rule#getRuleAction <em>Rule Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Action</em>' reference.
   * @see #getRuleAction()
   * @generated
   */
  void setRuleAction(Action value);

  /**
   * Returns the value of the '<em><b>Target Group Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Group Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Group Rule</em>' reference.
   * @see #setTargetGroupRule(Group)
   * @see mdn.MdnPackage#getRule_TargetGroupRule()
   * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0' tool.name='targetGroup'"
   * @generated
   */
  Group getTargetGroupRule();

  /**
   * Sets the value of the '{@link mdn.Rule#getTargetGroupRule <em>Target Group Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Group Rule</em>' reference.
   * @see #getTargetGroupRule()
   * @generated
   */
  void setTargetGroupRule(Group value);

} // Rule
