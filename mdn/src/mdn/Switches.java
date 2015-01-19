/**
 */
package mdn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Switches#getTarget <em>Target</em>}</li>
 *   <li>{@link mdn.Switches#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getSwitches()
 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='solid' color='0,0,0' source='source' target='target' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Switches extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Switch)
   * @see mdn.MdnPackage#getSwitches_Target()
   * @model required="true"
   * @generated
   */
  Switch getTarget();

  /**
   * Sets the value of the '{@link mdn.Switches#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Switch value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Switch)
   * @see mdn.MdnPackage#getSwitches_Source()
   * @model required="true"
   * @generated
   */
  Switch getSource();

  /**
   * Sets the value of the '{@link mdn.Switches#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Switch value);

} // Switches
