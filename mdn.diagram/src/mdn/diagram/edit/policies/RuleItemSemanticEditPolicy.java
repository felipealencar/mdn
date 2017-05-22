/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.diagram.edit.commands.AppAppRuleCreateCommand;
import mdn.diagram.edit.commands.AppAppRuleReorientCommand;
import mdn.diagram.edit.commands.RuleRuleConditionCreateCommand;
import mdn.diagram.edit.commands.RuleRuleConditionReorientCommand;
import mdn.diagram.edit.commands.RuleSourceHostRuleCreateCommand;
import mdn.diagram.edit.commands.RuleSourceHostRuleReorientCommand;
import mdn.diagram.edit.commands.RuleTargetGroupRuleCreateCommand;
import mdn.diagram.edit.commands.RuleTargetGroupRuleReorientCommand;
import mdn.diagram.edit.commands.RuleTargetHostRuleCreateCommand;
import mdn.diagram.edit.commands.RuleTargetHostRuleReorientCommand;
import mdn.diagram.edit.parts.AppAppRuleEditPart;
import mdn.diagram.edit.parts.RuleRuleConditionEditPart;
import mdn.diagram.edit.parts.RuleSourceHostRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetHostRuleEditPart;
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
public class RuleItemSemanticEditPolicy extends MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleItemSemanticEditPolicy() {
		super(MdnElementTypes.Rule_2021);
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
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == AppAppRuleEditPart.VISUAL_ID) {
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
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == RuleSourceHostRuleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == RuleTargetHostRuleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == RuleRuleConditionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(outgoingLink) == RuleTargetGroupRuleEditPart.VISUAL_ID) {
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
		if (MdnElementTypes.RuleSourceHostRule_4024 == req.getElementType()) {
			return getGEFWrapper(new RuleSourceHostRuleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.RuleTargetHostRule_4025 == req.getElementType()) {
			return getGEFWrapper(new RuleTargetHostRuleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.RuleRuleCondition_4026 == req.getElementType()) {
			return getGEFWrapper(new RuleRuleConditionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.RuleTargetGroupRule_4028 == req.getElementType()) {
			return getGEFWrapper(new RuleTargetGroupRuleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppRule_4032 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.RuleSourceHostRule_4024 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.RuleTargetHostRule_4025 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.RuleRuleCondition_4026 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.RuleTargetGroupRule_4028 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppAppRule_4032 == req.getElementType()) {
			return getGEFWrapper(new AppAppRuleCreateCommand(req,
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
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleSourceHostRuleReorientCommand(req));
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleTargetHostRuleReorientCommand(req));
		case RuleRuleConditionEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleRuleConditionReorientCommand(req));
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleTargetGroupRuleReorientCommand(req));
		case AppAppRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppRuleReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
