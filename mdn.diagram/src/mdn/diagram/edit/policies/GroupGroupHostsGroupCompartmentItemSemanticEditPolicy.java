/*
 * 
 */
package mdn.diagram.edit.policies;

import mdn.diagram.edit.commands.Host2CreateCommand;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class GroupGroupHostsGroupCompartmentItemSemanticEditPolicy extends
		MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupGroupHostsGroupCompartmentItemSemanticEditPolicy() {
		super(MdnElementTypes.Group_2018);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MdnElementTypes.Host_3001 == req.getElementType()) {
			return getGEFWrapper(new Host2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
