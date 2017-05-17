/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import mdn.diagram.edit.parts.TrafficEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfTrafficEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TrafficEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(TrafficEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MdnElementTypes.ConditionConditionTraffic_4018);
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
		return doGetTypesForSource((TrafficEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(TrafficEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.ConditionConditionTraffic_4018) {
			types.add(MdnElementTypes.Condition_2013);
		}
		return types;
	}

}
