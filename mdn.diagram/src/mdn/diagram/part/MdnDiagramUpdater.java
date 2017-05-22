/*
 * 
 */
package mdn.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mdn.App;
import mdn.AppMonitor;
import mdn.AppObject;
import mdn.Condition;
import mdn.Controller;
import mdn.Group;
import mdn.Host;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.OpenFlowSwitch;
import mdn.PacketHeader;
import mdn.Rule;
import mdn.Sdn;
import mdn.Switch;
import mdn.Time;
import mdn.Traffic;
import mdn.diagram.edit.parts.AppActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.AppAppRuleEditPart;
import mdn.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import mdn.diagram.edit.parts.AppControllerAppEditPart;
import mdn.diagram.edit.parts.AppEditPart;
import mdn.diagram.edit.parts.AppMonitorEditPart;
import mdn.diagram.edit.parts.AppTargetSwitchEditPart;
import mdn.diagram.edit.parts.ConditionConditionPacketEditPart;
import mdn.diagram.edit.parts.ConditionConditionTimeEditPart;
import mdn.diagram.edit.parts.ConditionConditionTrafficEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.edit.parts.GroupGroupHostsGroupCompartmentEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.OpenFlowSwitchEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.edit.parts.RuleRuleConditionEditPart;
import mdn.diagram.edit.parts.RuleSourceHostRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetHostRuleEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchesEditPart;
import mdn.diagram.edit.parts.TimeEditPart;
import mdn.diagram.edit.parts.TrafficEditPart;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MdnDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<MdnNodeDescriptor> getSemanticChildren(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000SemanticChildren(view);
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			return getGroupGroupHostsGroupCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnNodeDescriptor> getSdn_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sdn modelElement = (Sdn) view.getElement();
		LinkedList<MdnNodeDescriptor> result = new LinkedList<MdnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			NetworkNode childElement = (NetworkNode) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OpenFlowSwitchEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControllerEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HostEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getApps().iterator(); it.hasNext();) {
			App childElement = (App) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AppMonitorEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRuleObjects().iterator(); it
				.hasNext();) {
			AppObject childElement = (AppObject) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrafficEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PacketHeaderEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGroups().iterator(); it.hasNext();) {
			Group childElement = (Group) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnNodeDescriptor> getGroupGroupHostsGroupCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<MdnNodeDescriptor> result = new LinkedList<MdnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHostsGroup().iterator(); it
				.hasNext();) {
			Host childElement = (Host) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Host2EditPart.VISUAL_ID) {
				result.add(new MdnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getContainedLinks(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000ContainedLinks(view);
		case OpenFlowSwitchEditPart.VISUAL_ID:
			return getOpenFlowSwitch_2022ContainedLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001ContainedLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002ContainedLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003ContainedLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2019ContainedLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2021ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2013ContainedLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2014ContainedLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2015ContainedLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2016ContainedLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2020ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2018ContainedLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getIncomingLinks(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case OpenFlowSwitchEditPart.VISUAL_ID:
			return getOpenFlowSwitch_2022IncomingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001IncomingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002IncomingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003IncomingLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2019IncomingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2021IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2013IncomingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2014IncomingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2015IncomingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2016IncomingLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2020IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2018IncomingLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getOutgoingLinks(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case OpenFlowSwitchEditPart.VISUAL_ID:
			return getOpenFlowSwitch_2022OutgoingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001OutgoingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002OutgoingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003OutgoingLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2019OutgoingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2021OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2013OutgoingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2014OutgoingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2015OutgoingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2016OutgoingLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2020OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2018OutgoingLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSdn_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getOpenFlowSwitch_2022ContainedLinks(
			View view) {
		OpenFlowSwitch modelElement = (OpenFlowSwitch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getController_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_2002ContainedLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003ContainedLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAppMonitor_2019ContainedLinks(
			View view) {
		AppMonitor modelElement = (AppMonitor) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_TargetSwitch_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getRule_2021ContainedLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4024(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2013ContainedLinks(
			View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getApp_2020ContainedLinks(View view) {
		App modelElement = (App) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_TargetSwitch_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getGroup_2018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_3001ContainedLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getOpenFlowSwitch_2022IncomingLinks(
			View view) {
		OpenFlowSwitch modelElement = (OpenFlowSwitch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Host_HostSwitch_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_Switches_4022(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_TargetSwitch_4033(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getController_2001IncomingLinks(
			View view) {
		Controller modelElement = (Controller) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_SwitchController_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_ControllerApp_4031(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_2002IncomingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003IncomingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Host_HostSwitch_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_Switches_4022(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_TargetSwitch_4033(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAppMonitor_2019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getRule_2021IncomingLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppRule_4032(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2013IncomingLinks(
			View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_RuleCondition_4026(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2014IncomingLinks(View view) {
		Traffic modelElement = (Traffic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionTraffic_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2015IncomingLinks(View view) {
		Time modelElement = (Time) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionTime_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2016IncomingLinks(
			View view) {
		PacketHeader modelElement = (PacketHeader) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_App_ActionPacketHeader_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionPacket_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getApp_2020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getGroup_2018IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetGroupRule_4028(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_3001IncomingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getOpenFlowSwitch_2022OutgoingLinks(
			View view) {
		OpenFlowSwitch modelElement = (OpenFlowSwitch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getController_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_2002OutgoingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003OutgoingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAppMonitor_2019OutgoingLinks(
			View view) {
		AppMonitor modelElement = (AppMonitor) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_TargetSwitch_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getRule_2021OutgoingLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4024(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4025(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2013OutgoingLinks(
			View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getApp_2020OutgoingLinks(View view) {
		App modelElement = (App) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4029(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4032(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_TargetSwitch_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getGroup_2018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_3001OutgoingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Host_HostSwitch_4004(
			Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getHost_HostSwitch()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.HostHostSwitch_4004,
						HostHostSwitchEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_SwitchController_4006(
			Controller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getSwitch_SwitchController()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.SwitchSwitchController_4006,
						SwitchSwitchControllerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_Switches_4022(
			Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getSwitch_Switches()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.SwitchSwitches_4022,
						SwitchSwitchesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4024(
			Host target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getRule_SourceHostRule()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.RuleSourceHostRule_4024,
						RuleSourceHostRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4025(
			Host target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getRule_TargetHostRule()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.RuleTargetHostRule_4025,
						RuleTargetHostRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_RuleCondition_4026(
			Condition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getRule_RuleCondition()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.RuleRuleCondition_4026,
						RuleRuleConditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_TargetGroupRule_4028(
			Group target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getRule_TargetGroupRule()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.RuleTargetGroupRule_4028,
						RuleTargetGroupRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_App_ActionPacketHeader_4029(
			PacketHeader target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getApp_ActionPacketHeader()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.AppActionPacketHeader_4029,
						AppActionPacketHeaderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
			NetworkNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getApp_AppToNetworkNode()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.AppAppToNetworkNode_4030,
						AppAppToNetworkNodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_App_ControllerApp_4031(
			Controller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getApp_ControllerApp()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.AppControllerApp_4031,
						AppControllerAppEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_App_AppRule_4032(
			Rule target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getApp_AppRule()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.AppAppRule_4032,
						AppAppRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_App_TargetSwitch_4033(
			Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getApp_TargetSwitch()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.AppTargetSwitch_4033,
						AppTargetSwitchEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionTime_4017(
			Time target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getCondition_ConditionTime()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ConditionConditionTime_4017,
						ConditionConditionTimeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionTraffic_4018(
			Traffic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getCondition_ConditionTraffic()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ConditionConditionTraffic_4018,
						ConditionConditionTrafficEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionPacket_4019(
			PacketHeader target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getCondition_ConditionPacket()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ConditionConditionPacket_4019,
						ConditionConditionPacketEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4004(
			Host source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Switch destination = source.getHostSwitch();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.HostHostSwitch_4004,
				HostHostSwitchEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(
			Switch source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitchController().iterator(); destinations
				.hasNext();) {
			Controller destination = (Controller) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.SwitchSwitchController_4006,
					SwitchSwitchControllerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_Switches_4022(
			Switch source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitches().iterator(); destinations
				.hasNext();) {
			Switch destination = (Switch) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.SwitchSwitches_4022,
					SwitchSwitchesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4024(
			Rule source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getSourceHostRule().iterator(); destinations
				.hasNext();) {
			Host destination = (Host) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.RuleSourceHostRule_4024,
					RuleSourceHostRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4025(
			Rule source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargetHostRule().iterator(); destinations
				.hasNext();) {
			Host destination = (Host) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.RuleTargetHostRule_4025,
					RuleTargetHostRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4026(
			Rule source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getRuleCondition().iterator(); destinations
				.hasNext();) {
			Condition destination = (Condition) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.RuleRuleCondition_4026,
					RuleRuleConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4028(
			Rule source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargetGroupRule().iterator(); destinations
				.hasNext();) {
			Group destination = (Group) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.RuleTargetGroupRule_4028,
					RuleTargetGroupRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4029(
			App source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getActionPacketHeader()
				.iterator(); destinations.hasNext();) {
			PacketHeader destination = (PacketHeader) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.AppActionPacketHeader_4029,
					AppActionPacketHeaderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4030(
			App source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		NetworkNode destination = source.getAppToNetworkNode();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.AppAppToNetworkNode_4030,
				AppAppToNetworkNodeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_ControllerApp_4031(
			App source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getControllerApp().iterator(); destinations
				.hasNext();) {
			Controller destination = (Controller) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.AppControllerApp_4031,
					AppControllerAppEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_AppRule_4032(
			App source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getAppRule().iterator(); destinations
				.hasNext();) {
			Rule destination = (Rule) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.AppAppRule_4032,
					AppAppRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_TargetSwitch_4033(
			App source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargetSwitch().iterator(); destinations
				.hasNext();) {
			Switch destination = (Switch) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.AppTargetSwitch_4033,
					AppTargetSwitchEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4017(
			Condition source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Time destination = source.getConditionTime();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.ConditionConditionTime_4017,
				ConditionConditionTimeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4018(
			Condition source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Traffic destination = source.getConditionTraffic();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.ConditionConditionTraffic_4018,
				ConditionConditionTrafficEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4019(
			Condition source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		PacketHeader destination = source.getConditionPacket();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.ConditionConditionPacket_4019,
				ConditionConditionPacketEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MdnNodeDescriptor> getSemanticChildren(View view) {
			return MdnDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MdnLinkDescriptor> getContainedLinks(View view) {
			return MdnDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MdnLinkDescriptor> getIncomingLinks(View view) {
			return MdnDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MdnLinkDescriptor> getOutgoingLinks(View view) {
			return MdnDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
