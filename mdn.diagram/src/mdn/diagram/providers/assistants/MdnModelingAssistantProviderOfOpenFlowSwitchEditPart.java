/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.OpenFlowSwitchEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfOpenFlowSwitchEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((OpenFlowSwitchEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			OpenFlowSwitchEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MdnElementTypes.SwitchSwitchController_4006);
		types.add(MdnElementTypes.SwitchSwitches_4022);
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
		return doGetRelTypesOnSourceAndTarget(
				(OpenFlowSwitchEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			OpenFlowSwitchEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MdnElementTypes.SwitchSwitchController_4006);
		}
		if (targetEditPart instanceof OpenFlowSwitchEditPart) {
			types.add(MdnElementTypes.SwitchSwitches_4022);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MdnElementTypes.SwitchSwitches_4022);
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
		return doGetTypesForTarget((OpenFlowSwitchEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			OpenFlowSwitchEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.SwitchSwitchController_4006) {
			types.add(MdnElementTypes.Controller_2001);
		} else if (relationshipType == MdnElementTypes.SwitchSwitches_4022) {
			types.add(MdnElementTypes.OpenFlowSwitch_2022);
			types.add(MdnElementTypes.Switch_2003);
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
		return doGetRelTypesOnTarget((OpenFlowSwitchEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			OpenFlowSwitchEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MdnElementTypes.HostHostSwitch_4004);
		types.add(MdnElementTypes.SwitchSwitches_4022);
		types.add(MdnElementTypes.AppAppToNetworkNode_4030);
		types.add(MdnElementTypes.AppTargetSwitch_4033);
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
		return doGetTypesForSource((OpenFlowSwitchEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			OpenFlowSwitchEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MdnElementTypes.HostHostSwitch_4004) {
			types.add(MdnElementTypes.Host_2002);
			types.add(MdnElementTypes.Host_3001);
		} else if (relationshipType == MdnElementTypes.SwitchSwitches_4022) {
			types.add(MdnElementTypes.OpenFlowSwitch_2022);
			types.add(MdnElementTypes.Switch_2003);
		} else if (relationshipType == MdnElementTypes.AppAppToNetworkNode_4030) {
			types.add(MdnElementTypes.AppMonitor_2019);
			types.add(MdnElementTypes.App_2020);
		} else if (relationshipType == MdnElementTypes.AppTargetSwitch_4033) {
			types.add(MdnElementTypes.AppMonitor_2019);
			types.add(MdnElementTypes.App_2020);
		}
		return types;
	}

}
