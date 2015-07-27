/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.diagram.edit.commands.ActionActionForwardToNodeCreateCommand;
import mdn.diagram.edit.commands.ActionActionForwardToNodeReorientCommand;
import mdn.diagram.edit.commands.ActionActionPacketHeaderCreateCommand;
import mdn.diagram.edit.commands.ActionActionPacketHeaderReorientCommand;
import mdn.diagram.edit.commands.RuleRuleActionCreateCommand;
import mdn.diagram.edit.commands.RuleRuleActionReorientCommand;
import mdn.diagram.edit.parts.ActionActionForwardToNodeEditPart;
import mdn.diagram.edit.parts.ActionActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.RuleRuleActionEditPart;
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
public class ActionItemSemanticEditPolicy extends MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionItemSemanticEditPolicy() {
		super(MdnElementTypes.Action_2012);
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
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == RuleRuleActionEditPart.VISUAL_ID) {
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
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == ActionActionPacketHeaderEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == ActionActionForwardToNodeEditPart.VISUAL_ID) {
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
		if (MdnElementTypes.RuleRuleAction_4027 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.ActionActionPacketHeader_4012 == req
				.getElementType()) {
			return getGEFWrapper(new ActionActionPacketHeaderCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.ActionActionForwardToNode_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ActionActionForwardToNodeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.RuleRuleAction_4027 == req.getElementType()) {
			return getGEFWrapper(new RuleRuleActionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.ActionActionPacketHeader_4012 == req
				.getElementType()) {
			return null;
		}
		if (MdnElementTypes.ActionActionForwardToNode_4013 == req
				.getElementType()) {
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
		case RuleRuleActionEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleRuleActionReorientCommand(req));
		case ActionActionPacketHeaderEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionActionPacketHeaderReorientCommand(
					req));
		case ActionActionForwardToNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionActionForwardToNodeReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
