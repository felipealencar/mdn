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
public class AppAppToNetworkNodeItemSemanticEditPolicy extends
		MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AppAppToNetworkNodeItemSemanticEditPolicy() {
		super(MdnElementTypes.AppAppToNetworkNode_4030);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
