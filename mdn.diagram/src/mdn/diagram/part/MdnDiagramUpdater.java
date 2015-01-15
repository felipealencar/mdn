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

import mdn.Action;
import mdn.Condition;
import mdn.Controller;
import mdn.Host;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.PacketHeader;
import mdn.Policy;
import mdn.PolicyObject;
import mdn.Sdn;
import mdn.Switch;
import mdn.diagram.edit.parts.ActionActionForwardToNodeEditPart;
import mdn.diagram.edit.parts.ActionActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.ActionEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.HostSourceHostPolicyEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.PolicyEditPart;
import mdn.diagram.edit.parts.PolicyPolicyActionEditPart;
import mdn.diagram.edit.parts.PolicyPolicyConditionEditPart;
import mdn.diagram.edit.parts.PolicyTargetHostPolicyEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchEditPart;
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
		for (Iterator<?> it = modelElement.getPolicyObjects().iterator(); it
				.hasNext();) {
			PolicyObject childElement = (PolicyObject) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getPolicies().iterator(); it
				.hasNext();) {
			Policy childElement = (Policy) it.next();
			int visualID = MdnVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PolicyEditPart.VISUAL_ID) {
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
		case ControllerEditPart.VISUAL_ID:
			return getController_2001ContainedLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002ContainedLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2011ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2010ContainedLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007ContainedLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008ContainedLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009ContainedLinks(view);
		case PolicyEditPart.VISUAL_ID:
			return getPolicy_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getIncomingLinks(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case ControllerEditPart.VISUAL_ID:
			return getController_2001IncomingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002IncomingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2011IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2010IncomingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007IncomingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008IncomingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009IncomingLinks(view);
		case PolicyEditPart.VISUAL_ID:
			return getPolicy_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getOutgoingLinks(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case ControllerEditPart.VISUAL_ID:
			return getController_2001OutgoingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002OutgoingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2011OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2010OutgoingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007OutgoingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008OutgoingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009OutgoingLinks(view);
		case PolicyEditPart.VISUAL_ID:
			return getPolicy_2004OutgoingLinks(view);
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_SourceHostPolicy_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003ContainedLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switch_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAction_2011ContainedLinks(View view) {
		Action modelElement = (Action) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_ActionPacketHeader_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPolicy_2004ContainedLinks(View view) {
		Policy modelElement = (Policy) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_TargetHostPolicy_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_PolicyCondition_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_PolicyAction_4015(modelElement));
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
		result.addAll(getIncomingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Policy_TargetHostPolicy_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_Switch_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAction_2011IncomingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Policy_PolicyAction_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2010IncomingLinks(
			View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Policy_PolicyCondition_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2009IncomingLinks(
			View view) {
		PacketHeader modelElement = (PacketHeader) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_ActionPacketHeader_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPolicy_2004IncomingLinks(View view) {
		Policy modelElement = (Policy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Host_SourceHostPolicy_4007(
				modelElement, crossReferences));
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_SourceHostPolicy_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003OutgoingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switch_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getAction_2011OutgoingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_ActionPacketHeader_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getCondition_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTraffic_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getTime_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPacketHeader_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getPolicy_2004OutgoingLinks(View view) {
		Policy modelElement = (Policy) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_TargetHostPolicy_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_PolicyCondition_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Policy_PolicyAction_4015(modelElement));
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
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Host_SourceHostPolicy_4007(
			Policy target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getHost_SourceHostPolicy()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.HostSourceHostPolicy_4007,
						HostSourceHostPolicyEditPart.VISUAL_ID));
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
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_Switch_4008(
			Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getSwitch_Switch()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.SwitchSwitch_4008,
						SwitchSwitchEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Policy_TargetHostPolicy_4009(
			Host target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getPolicy_TargetHostPolicy()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.PolicyTargetHostPolicy_4009,
						PolicyTargetHostPolicyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Policy_PolicyCondition_4016(
			Condition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getPolicy_PolicyCondition()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.PolicyPolicyCondition_4016,
						PolicyPolicyConditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Policy_PolicyAction_4015(
			Action target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getPolicy_PolicyAction()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.PolicyPolicyAction_4015,
						PolicyPolicyActionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Action_ActionPacketHeader_4012(
			PacketHeader target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getAction_ActionPacketHeader()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ActionActionPacketHeader_4012,
						ActionActionPacketHeaderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(
			NetworkNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getAction_ActionForwardToNode()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ActionActionForwardToNode_4013,
						ActionActionForwardToNodeEditPart.VISUAL_ID));
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
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Host_SourceHostPolicy_4007(
			Host source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Policy destination = source.getSourceHostPolicy();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.HostSourceHostPolicy_4007,
				HostSourceHostPolicyEditPart.VISUAL_ID));
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
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_Switch_4008(
			Switch source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitch().iterator(); destinations
				.hasNext();) {
			Switch destination = (Switch) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.SwitchSwitch_4008,
					SwitchSwitchEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Policy_TargetHostPolicy_4009(
			Policy source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Host destination = source.getTargetHostPolicy();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.PolicyTargetHostPolicy_4009,
				PolicyTargetHostPolicyEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Policy_PolicyCondition_4016(
			Policy source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Condition destination = source.getPolicyCondition();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.PolicyPolicyCondition_4016,
				PolicyPolicyConditionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Policy_PolicyAction_4015(
			Policy source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Action destination = source.getPolicyAction();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.PolicyPolicyAction_4015,
				PolicyPolicyActionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Action_ActionPacketHeader_4012(
			Action source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		PacketHeader destination = source.getActionPacketHeader();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.ActionActionPacketHeader_4012,
				ActionActionPacketHeaderEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Action_ActionForwardToNode_4013(
			Action source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		NetworkNode destination = source.getActionForwardToNode();
		if (destination == null) {
			return result;
		}
		result.add(new MdnLinkDescriptor(source, destination,
				MdnElementTypes.ActionActionForwardToNode_4013,
				ActionActionForwardToNodeEditPart.VISUAL_ID));
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
