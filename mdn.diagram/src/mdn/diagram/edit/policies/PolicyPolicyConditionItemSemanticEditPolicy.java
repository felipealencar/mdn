/*
 * 
 */
package mdn.diagram.edit.policies;

import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PolicyPolicyConditionItemSemanticEditPolicy extends
		MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PolicyPolicyConditionItemSemanticEditPolicy() {
		super(MdnElementTypes.PolicyPolicyCondition_4016);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
