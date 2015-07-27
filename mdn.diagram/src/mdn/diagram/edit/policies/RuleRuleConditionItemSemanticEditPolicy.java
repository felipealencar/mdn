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
public class RuleRuleConditionItemSemanticEditPolicy extends
		MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleRuleConditionItemSemanticEditPolicy() {
		super(MdnElementTypes.RuleRuleCondition_4026);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
