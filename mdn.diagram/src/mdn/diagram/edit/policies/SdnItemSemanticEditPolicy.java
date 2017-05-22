/*
 * 
 */
package mdn.diagram.edit.policies;

import mdn.diagram.edit.commands.AppCreateCommand;
import mdn.diagram.edit.commands.AppMonitorCreateCommand;
import mdn.diagram.edit.commands.ConditionCreateCommand;
import mdn.diagram.edit.commands.ControllerCreateCommand;
import mdn.diagram.edit.commands.GroupCreateCommand;
import mdn.diagram.edit.commands.HostCreateCommand;
import mdn.diagram.edit.commands.OpenFlowSwitchCreateCommand;
import mdn.diagram.edit.commands.PacketHeaderCreateCommand;
import mdn.diagram.edit.commands.RuleCreateCommand;
import mdn.diagram.edit.commands.SwitchCreateCommand;
import mdn.diagram.edit.commands.TimeCreateCommand;
import mdn.diagram.edit.commands.TrafficCreateCommand;
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
		if (MdnElementTypes.OpenFlowSwitch_2022 == req.getElementType()) {
			return getGEFWrapper(new OpenFlowSwitchCreateCommand(req));
		}
		if (MdnElementTypes.Controller_2001 == req.getElementType()) {
			return getGEFWrapper(new ControllerCreateCommand(req));
		}
		if (MdnElementTypes.Host_2002 == req.getElementType()) {
			return getGEFWrapper(new HostCreateCommand(req));
		}
		if (MdnElementTypes.Switch_2003 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		if (MdnElementTypes.AppMonitor_2019 == req.getElementType()) {
			return getGEFWrapper(new AppMonitorCreateCommand(req));
		}
		if (MdnElementTypes.Rule_2021 == req.getElementType()) {
			return getGEFWrapper(new RuleCreateCommand(req));
		}
		if (MdnElementTypes.Condition_2013 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		if (MdnElementTypes.Traffic_2014 == req.getElementType()) {
			return getGEFWrapper(new TrafficCreateCommand(req));
		}
		if (MdnElementTypes.Time_2015 == req.getElementType()) {
			return getGEFWrapper(new TimeCreateCommand(req));
		}
		if (MdnElementTypes.PacketHeader_2016 == req.getElementType()) {
			return getGEFWrapper(new PacketHeaderCreateCommand(req));
		}
		if (MdnElementTypes.App_2020 == req.getElementType()) {
			return getGEFWrapper(new AppCreateCommand(req));
		}
		if (MdnElementTypes.Group_2018 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
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
