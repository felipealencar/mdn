/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Policy#getSourceHostPolicy <em>Source Host Policy</em>}</li>
 *   <li>{@link mdn.Policy#getTargetHostPolicy <em>Target Host Policy</em>}</li>
 *   <li>{@link mdn.Policy#getName <em>Name</em>}</li>
 *   <li>{@link mdn.Policy#getPolicyCondition <em>Policy Condition</em>}</li>
 *   <li>{@link mdn.Policy#getPolicyAction <em>Policy Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getPolicy()
 * @model annotation="gmf.node figure='figures.PolicyFigure' label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/policy.gif' label.placement='external'"
 * @generated
 */
public interface Policy extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Host Policy</b></em>' reference list.
   * The list contents are of type {@link mdn.Host}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Host Policy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Host Policy</em>' reference list.
   * @see mdn.MdnPackage#getPolicy_SourceHostPolicy()
   * @model transient="true"
   *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0' tool.name='sourceHost'"
   * @generated
   */
  EList<Host> getSourceHostPolicy();

  /**
   * Returns the value of the '<em><b>Target Host Policy</b></em>' reference list.
   * The list contents are of type {@link mdn.Host}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Host Policy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Host Policy</em>' reference list.
   * @see mdn.MdnPackage#getPolicy_TargetHostPolicy()
   * @model transient="true"
   *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0' tool.name='targetHost'"
   * @generated
   */
  EList<Host> getTargetHostPolicy();

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
   * @see mdn.MdnPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdn.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Policy Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy Condition</em>' reference.
   * @see #setPolicyCondition(Condition)
   * @see mdn.MdnPackage#getPolicy_PolicyCondition()
   * @model transient="true"
   *        annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
   * @generated
   */
  Condition getPolicyCondition();

  /**
   * Sets the value of the '{@link mdn.Policy#getPolicyCondition <em>Policy Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy Condition</em>' reference.
   * @see #getPolicyCondition()
   * @generated
   */
  void setPolicyCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Policy Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy Action</em>' reference.
   * @see #setPolicyAction(Action)
   * @see mdn.MdnPackage#getPolicy_PolicyAction()
   * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
   * @generated
   */
  Action getPolicyAction();

  /**
   * Sets the value of the '{@link mdn.Policy#getPolicyAction <em>Policy Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy Action</em>' reference.
   * @see #getPolicyAction()
   * @generated
   */
  void setPolicyAction(Action value);

} // Policy
