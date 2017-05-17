/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.Instruction;
import mdn.Instructions;
import mdn.MdnPackage;
import mdn.OpenFlowSwitch;
import mdn.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.InstructionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mdn.impl.InstructionImpl#getTableId <em>Table Id</em>}</li>
 *   <li>{@link mdn.impl.InstructionImpl#getInstructionSwitch <em>Instruction Switch</em>}</li>
 *   <li>{@link mdn.impl.InstructionImpl#getInstructionRules <em>Instruction Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends EObjectImpl implements Instruction {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructions> type;

	/**
	 * The default value of the '{@link #getTableId() <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableId()
	 * @generated
	 * @ordered
	 */
	protected static final int TABLE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTableId() <em>Table Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableId()
	 * @generated
	 * @ordered
	 */
	protected int tableId = TABLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructionSwitch() <em>Instruction Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSwitch()
	 * @generated
	 * @ordered
	 */
	protected OpenFlowSwitch instructionSwitch;

	/**
	 * The cached value of the '{@link #getInstructionRules() <em>Instruction Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> instructionRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getType() {
		if (type == null) {
			type = new EDataTypeEList<Instructions>(Instructions.class, this, MdnPackage.INSTRUCTION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTableId() {
		return tableId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableId(int newTableId) {
		int oldTableId = tableId;
		tableId = newTableId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.INSTRUCTION__TABLE_ID, oldTableId, tableId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFlowSwitch getInstructionSwitch() {
		if (instructionSwitch != null && instructionSwitch.eIsProxy()) {
			InternalEObject oldInstructionSwitch = (InternalEObject)instructionSwitch;
			instructionSwitch = (OpenFlowSwitch)eResolveProxy(oldInstructionSwitch);
			if (instructionSwitch != oldInstructionSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH, oldInstructionSwitch, instructionSwitch));
			}
		}
		return instructionSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFlowSwitch basicGetInstructionSwitch() {
		return instructionSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionSwitch(OpenFlowSwitch newInstructionSwitch) {
		OpenFlowSwitch oldInstructionSwitch = instructionSwitch;
		instructionSwitch = newInstructionSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH, oldInstructionSwitch, instructionSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getInstructionRules() {
		if (instructionRules == null) {
			instructionRules = new EObjectResolvingEList<Rule>(Rule.class, this, MdnPackage.INSTRUCTION__INSTRUCTION_RULES);
		}
		return instructionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.INSTRUCTION__TYPE:
				return getType();
			case MdnPackage.INSTRUCTION__TABLE_ID:
				return getTableId();
			case MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH:
				if (resolve) return getInstructionSwitch();
				return basicGetInstructionSwitch();
			case MdnPackage.INSTRUCTION__INSTRUCTION_RULES:
				return getInstructionRules();
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
			case MdnPackage.INSTRUCTION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Instructions>)newValue);
				return;
			case MdnPackage.INSTRUCTION__TABLE_ID:
				setTableId((Integer)newValue);
				return;
			case MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH:
				setInstructionSwitch((OpenFlowSwitch)newValue);
				return;
			case MdnPackage.INSTRUCTION__INSTRUCTION_RULES:
				getInstructionRules().clear();
				getInstructionRules().addAll((Collection<? extends Rule>)newValue);
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
			case MdnPackage.INSTRUCTION__TYPE:
				getType().clear();
				return;
			case MdnPackage.INSTRUCTION__TABLE_ID:
				setTableId(TABLE_ID_EDEFAULT);
				return;
			case MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH:
				setInstructionSwitch((OpenFlowSwitch)null);
				return;
			case MdnPackage.INSTRUCTION__INSTRUCTION_RULES:
				getInstructionRules().clear();
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
			case MdnPackage.INSTRUCTION__TYPE:
				return type != null && !type.isEmpty();
			case MdnPackage.INSTRUCTION__TABLE_ID:
				return tableId != TABLE_ID_EDEFAULT;
			case MdnPackage.INSTRUCTION__INSTRUCTION_SWITCH:
				return instructionSwitch != null;
			case MdnPackage.INSTRUCTION__INSTRUCTION_RULES:
				return instructionRules != null && !instructionRules.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", tableId: ");
		result.append(tableId);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
