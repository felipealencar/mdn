/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Instruction#getType <em>Type</em>}</li>
 *   <li>{@link mdn.Instruction#getTableId <em>Table Id</em>}</li>
 *   <li>{@link mdn.Instruction#getInstructionSwitch <em>Instruction Switch</em>}</li>
 *   <li>{@link mdn.Instruction#getInstructionRules <em>Instruction Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link mdn.Instructions}.
	 * The literals are from the enumeration {@link mdn.Instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see mdn.Instructions
	 * @see mdn.MdnPackage#getInstruction_Type()
	 * @model unique="false"
	 * @generated
	 */
	EList<Instructions> getType();

	/**
	 * Returns the value of the '<em><b>Table Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Id</em>' attribute.
	 * @see #setTableId(int)
	 * @see mdn.MdnPackage#getInstruction_TableId()
	 * @model
	 * @generated
	 */
	int getTableId();

	/**
	 * Sets the value of the '{@link mdn.Instruction#getTableId <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Id</em>' attribute.
	 * @see #getTableId()
	 * @generated
	 */
	void setTableId(int value);

	/**
	 * Returns the value of the '<em><b>Instruction Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Switch</em>' reference.
	 * @see #setInstructionSwitch(OpenFlowSwitch)
	 * @see mdn.MdnPackage#getInstruction_InstructionSwitch()
	 * @model
	 * @generated
	 */
	OpenFlowSwitch getInstructionSwitch();

	/**
	 * Sets the value of the '{@link mdn.Instruction#getInstructionSwitch <em>Instruction Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Switch</em>' reference.
	 * @see #getInstructionSwitch()
	 * @generated
	 */
	void setInstructionSwitch(OpenFlowSwitch value);

	/**
	 * Returns the value of the '<em><b>Instruction Rules</b></em>' reference list.
	 * The list contents are of type {@link mdn.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Rules</em>' reference list.
	 * @see mdn.MdnPackage#getInstruction_InstructionRules()
	 * @model
	 * @generated
	 */
	EList<Rule> getInstructionRules();

} // Instruction
