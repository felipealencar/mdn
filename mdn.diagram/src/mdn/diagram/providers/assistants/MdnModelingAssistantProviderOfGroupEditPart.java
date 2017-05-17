/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfGroupEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((GroupEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(GroupEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MdnElementTypes.RuleTargetGroupRule_4028);
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
		return doGetTypesForSource((GroupEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(GroupEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.RuleTargetGroupRule_4028) {
			types.add(MdnElementTypes.Rule_2021);
		}
		return types;
	}

}
