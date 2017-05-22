/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.diagram.edit.commands.AppActionPacketHeaderCreateCommand;
import mdn.diagram.edit.commands.AppActionPacketHeaderReorientCommand;
import mdn.diagram.edit.commands.AppAppRuleCreateCommand;
import mdn.diagram.edit.commands.AppAppRuleReorientCommand;
import mdn.diagram.edit.commands.AppAppToNetworkNodeCreateCommand;
import mdn.diagram.edit.commands.AppAppToNetworkNodeReorientCommand;
import mdn.diagram.edit.commands.AppControllerAppCreateCommand;
import mdn.diagram.edit.commands.AppControllerAppReorientCommand;
import mdn.diagram.edit.commands.AppTargetSwitchCreateCommand;
import mdn.diagram.edit.commands.AppTargetSwitchReorientCommand;
import mdn.diagram.edit.parts.AppActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.AppAppRuleEditPart;
import mdn.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import mdn.diagram.edit.parts.AppControllerAppEditPart;
import mdn.diagram.edit.parts.AppTargetSwitchEditPart;
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
public class AppItemSemanticEditPolicy extends MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AppItemSemanticEditPolicy() {
		super(MdnElementTypes.App_2020);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == AppActionPacketHeaderEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == AppAppToNetworkNodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == AppControllerAppEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == AppAppRuleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == AppTargetSwitchEditPart.VISUAL_ID) {
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
		if (MdnElementTypes.AppActionPacketHeader_4029 == req.getElementType()) {
			return getGEFWrapper(new AppActionPacketHeaderCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return getGEFWrapper(new AppAppToNetworkNodeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppControllerApp_4031 == req.getElementType()) {
			return getGEFWrapper(new AppControllerAppCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppRule_4032 == req.getElementType()) {
			return getGEFWrapper(new AppAppRuleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppTargetSwitch_4033 == req.getElementType()) {
			return getGEFWrapper(new AppTargetSwitchCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.AppActionPacketHeader_4029 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppControllerApp_4031 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppAppRule_4032 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppTargetSwitch_4033 == req.getElementType()) {
			return null;
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
		case AppActionPacketHeaderEditPart.VISUAL_ID:
			return getGEFWrapper(new AppActionPacketHeaderReorientCommand(req));
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppToNetworkNodeReorientCommand(req));
		case AppControllerAppEditPart.VISUAL_ID:
			return getGEFWrapper(new AppControllerAppReorientCommand(req));
		case AppAppRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppRuleReorientCommand(req));
		case AppTargetSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new AppTargetSwitchReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
