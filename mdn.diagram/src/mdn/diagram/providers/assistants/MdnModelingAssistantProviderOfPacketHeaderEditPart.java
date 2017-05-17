/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfPacketHeaderEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PacketHeaderEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(PacketHeaderEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MdnElementTypes.AppActionPacketHeader_4029);
		types.add(MdnElementTypes.ConditionConditionPacket_4019);
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
		return doGetTypesForSource((PacketHeaderEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(PacketHeaderEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.AppActionPacketHeader_4029) {
			types.add(MdnElementTypes.AppMonitor_2019);
			types.add(MdnElementTypes.App_2020);
		} else if (relationshipType == MdnElementTypes.ConditionConditionPacket_4019) {
			types.add(MdnElementTypes.Condition_2013);
		}
		return types;
	}

}
