/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.diagram.edit.commands.AppAppToNetworkNodeCreateCommand;
import mdn.diagram.edit.commands.AppAppToNetworkNodeReorientCommand;
import mdn.diagram.edit.commands.AppTargetSwitchCreateCommand;
import mdn.diagram.edit.commands.AppTargetSwitchReorientCommand;
import mdn.diagram.edit.commands.HostHostSwitchCreateCommand;
import mdn.diagram.edit.commands.HostHostSwitchReorientCommand;
import mdn.diagram.edit.commands.SwitchSwitchControllerCreateCommand;
import mdn.diagram.edit.commands.SwitchSwitchControllerReorientCommand;
import mdn.diagram.edit.commands.SwitchSwitchesCreateCommand;
import mdn.diagram.edit.commands.SwitchSwitchesReorientCommand;
import mdn.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import mdn.diagram.edit.parts.AppTargetSwitchEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchesEditPart;
import mdn.diagram.part.MdnVisualIDRegistry;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SwitchItemSemanticEditPolicy extends MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SwitchItemSemanticEditPolicy() {
		super(MdnElementTypes.Switch_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == HostHostSwitchEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == SwitchSwitchesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == AppAppToNetworkNodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == AppTargetSwitchEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == SwitchSwitchControllerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == SwitchSwitchesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.HostHostSwitch_4004 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.SwitchSwitchController_4006 == req.getElementType()) {
			return getGEFWrapper(new SwitchSwitchControllerCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.SwitchSwitches_4022 == req.getElementType()) {
			return getGEFWrapper(new SwitchSwitchesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppTargetSwitch_4033 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.HostHostSwitch_4004 == req.getElementType()) {
			return getGEFWrapper(new HostHostSwitchCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.SwitchSwitchController_4006 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.SwitchSwitches_4022 == req.getElementType()) {
			return getGEFWrapper(new SwitchSwitchesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return getGEFWrapper(new AppAppToNetworkNodeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppTargetSwitch_4033 == req.getElementType()) {
			return getGEFWrapper(new AppTargetSwitchCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case HostHostSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new HostHostSwitchReorientCommand(req));
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getGEFWrapper(new SwitchSwitchControllerReorientCommand(req));
		case SwitchSwitchesEditPart.VISUAL_ID:
			return getGEFWrapper(new SwitchSwitchesReorientCommand(req));
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppToNetworkNodeReorientCommand(req));
		case AppTargetSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new AppTargetSwitchReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
