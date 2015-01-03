/*
 * 
 */
package mdn.diagram.edit.policies;

import mdn.diagram.edit.commands.ControllerCreateCommand;
import mdn.diagram.edit.commands.HostCreateCommand;
import mdn.diagram.edit.commands.SwitchCreateCommand;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SdnItemSemanticEditPolicy extends MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SdnItemSemanticEditPolicy() {
		super(MdnElementTypes.Sdn_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MdnElementTypes.Controller_2001 == req.getElementType()) {
			return getGEFWrapper(new ControllerCreateCommand(req));
		}
		if (MdnElementTypes.Host_2002 == req.getElementType()) {
			return getGEFWrapper(new HostCreateCommand(req));
		}
		if (MdnElementTypes.Switch_2003 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
