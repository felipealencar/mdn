/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfRuleEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RuleEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(RuleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MdnElementTypes.RuleSourceHostRule_4024);
		types.add(MdnElementTypes.RuleTargetHostRule_4025);
		types.add(MdnElementTypes.RuleRuleCondition_4026);
		types.add(MdnElementTypes.RuleTargetGroupRule_4028);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RuleEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			RuleEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HostEditPart) {
			types.add(MdnElementTypes.RuleSourceHostRule_4024);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MdnElementTypes.RuleSourceHostRule_4024);
		}
		if (targetEditPart instanceof HostEditPart) {
			types.add(MdnElementTypes.RuleTargetHostRule_4025);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MdnElementTypes.RuleTargetHostRule_4025);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(MdnElementTypes.RuleRuleCondition_4026);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(MdnElementTypes.RuleTargetGroupRule_4028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RuleEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(RuleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.RuleSourceHostRule_4024) {
			types.add(MdnElementTypes.Host_2002);
			types.add(MdnElementTypes.Host_3001);
		} else if (relationshipType == MdnElementTypes.RuleTargetHostRule_4025) {
			types.add(MdnElementTypes.Host_2002);
			types.add(MdnElementTypes.Host_3001);
		} else if (relationshipType == MdnElementTypes.RuleRuleCondition_4026) {
			types.add(MdnElementTypes.Condition_2013);
		} else if (relationshipType == MdnElementTypes.RuleTargetGroupRule_4028) {
			types.add(MdnElementTypes.Group_2018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RuleEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(RuleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MdnElementTypes.AppAppRule_4032);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RuleEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(RuleEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.AppAppRule_4032) {
			types.add(MdnElementTypes.AppMonitor_2019);
			types.add(MdnElementTypes.App_2020);
		}
		return types;
	}

}
