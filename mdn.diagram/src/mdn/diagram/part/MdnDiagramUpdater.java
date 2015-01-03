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

import mdn.Controller;
import mdn.Host;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.Sdn;
import mdn.Switch;
import mdn.diagram.edit.parts.ControllerControllerSwitchEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
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
		Controller modelElement = (Controller) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_ControllerSwitch_4003(modelElement));
		return result;
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getHost_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getSwitch_2003IncomingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Controller_ControllerSwitch_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Host_HostSwitch_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MdnLinkDescriptor> getController_2001OutgoingLinks(
			View view) {
		Controller modelElement = (Controller) view.getElement();
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_ControllerSwitch_4003(modelElement));
		return result;
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
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MdnLinkDescriptor> getIncomingFeatureModelFacetLinks_Controller_ControllerSwitch_4003(
			Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MdnPackage.eINSTANCE
					.getController_ControllerSwitch()) {
				result.add(new MdnLinkDescriptor(setting.getEObject(), target,
						MdnElementTypes.ControllerControllerSwitch_4003,
						ControllerControllerSwitchEditPart.VISUAL_ID));
			}
		}
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
	private static Collection<MdnLinkDescriptor> getOutgoingFeatureModelFacetLinks_Controller_ControllerSwitch_4003(
			Controller source) {
		LinkedList<MdnLinkDescriptor> result = new LinkedList<MdnLinkDescriptor>();
		for (Iterator<?> destinations = source.getControllerSwitch().iterator(); destinations
				.hasNext();) {
			Switch destination = (Switch) destinations.next();
			result.add(new MdnLinkDescriptor(source, destination,
					MdnElementTypes.ControllerControllerSwitch_4003,
					ControllerControllerSwitchEditPart.VISUAL_ID));
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
