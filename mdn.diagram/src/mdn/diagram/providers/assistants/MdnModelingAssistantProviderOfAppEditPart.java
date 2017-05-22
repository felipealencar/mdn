/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mdn.diagram.edit.parts.AppEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.OpenFlowSwitchEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfAppEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AppEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(AppEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(MdnElementTypes.AppActionPacketHeader_4029);
		types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		types.add(MdnElementTypes.AppControllerApp_4031);
		types.add(MdnElementTypes.AppAppRule_4032);
		types.add(MdnElementTypes.AppTargetSwitch_4033);
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
		return doGetRelTypesOnSourceAndTarget((AppEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AppEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PacketHeaderEditPart) {
			types.add(MdnElementTypes.AppActionPacketHeader_4029);
		}
		if (targetEditPart instanceof OpenFlowSwitchEditPart) {
			types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		}
		if (targetEditPart instanceof HostEditPart) {
			types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MdnElementTypes.AppControllerApp_4031);
		}
		if (targetEditPart instanceof RuleEditPart) {
			types.add(MdnElementTypes.AppAppRule_4032);
		}
		if (targetEditPart instanceof OpenFlowSwitchEditPart) {
			types.add(MdnElementTypes.AppTargetSwitch_4033);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MdnElementTypes.AppTargetSwitch_4033);
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
		return doGetTypesForTarget((AppEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(AppEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.AppActionPacketHeader_4029) {
			types.add(MdnElementTypes.PacketHeader_2016);
		} else if (relationshipType == MdnElementTypes.AppAppToNetworkNode_4030) {
			types.add(MdnElementTypes.OpenFlowSwitch_2022);
			types.add(MdnElementTypes.Controller_2001);
			types.add(MdnElementTypes.Host_2002);
			types.add(MdnElementTypes.Switch_2003);
			types.add(MdnElementTypes.Host_3001);
		} else if (relationshipType == MdnElementTypes.AppControllerApp_4031) {
			types.add(MdnElementTypes.Controller_2001);
		} else if (relationshipType == MdnElementTypes.AppAppRule_4032) {
			types.add(MdnElementTypes.Rule_2021);
		} else if (relationshipType == MdnElementTypes.AppTargetSwitch_4033) {
			types.add(MdnElementTypes.OpenFlowSwitch_2022);
			types.add(MdnElementTypes.Switch_2003);
		}
		return types;
	}

}
