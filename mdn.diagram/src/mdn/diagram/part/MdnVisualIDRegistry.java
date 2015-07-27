/*
 * 
 */
package mdn.diagram.part;

import mdn.MdnPackage;
import mdn.Sdn;
import mdn.diagram.edit.parts.ActionActionForwardToNodeEditPart;
import mdn.diagram.edit.parts.ActionActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.ActionEditPart;
import mdn.diagram.edit.parts.ActionTypeEditPart;
import mdn.diagram.edit.parts.ConditionConditionEditPart;
import mdn.diagram.edit.parts.ConditionConditionPacketEditPart;
import mdn.diagram.edit.parts.ConditionConditionTimeEditPart;
import mdn.diagram.edit.parts.ConditionConditionTrafficEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.ControllerNameEditPart;
import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.edit.parts.GroupGroupHostsGroupCompartmentEditPart;
import mdn.diagram.edit.parts.GroupNameEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.HostName2EditPart;
import mdn.diagram.edit.parts.HostNameEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.PacketHeaderOperatorHeaderValueEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.edit.parts.RuleNameEditPart;
import mdn.diagram.edit.parts.RuleRuleActionEditPart;
import mdn.diagram.edit.parts.RuleRuleConditionEditPart;
import mdn.diagram.edit.parts.RuleSourceHostRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetHostRuleEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchNameEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchesEditPart;
import mdn.diagram.edit.parts.TimeEditPart;
import mdn.diagram.edit.parts.TimeOperatorBeginDateEndDatEditPart;
import mdn.diagram.edit.parts.TrafficEditPart;
import mdn.diagram.edit.parts.TrafficOperatorUnitValueEditPart;
import mdn.diagram.edit.parts.WrappingLabel10EditPart;
import mdn.diagram.edit.parts.WrappingLabel11EditPart;
import mdn.diagram.edit.parts.WrappingLabel12EditPart;
import mdn.diagram.edit.parts.WrappingLabel13EditPart;
import mdn.diagram.edit.parts.WrappingLabel2EditPart;
import mdn.diagram.edit.parts.WrappingLabel3EditPart;
import mdn.diagram.edit.parts.WrappingLabel4EditPart;
import mdn.diagram.edit.parts.WrappingLabel5EditPart;
import mdn.diagram.edit.parts.WrappingLabel6EditPart;
import mdn.diagram.edit.parts.WrappingLabel7EditPart;
import mdn.diagram.edit.parts.WrappingLabel8EditPart;
import mdn.diagram.edit.parts.WrappingLabel9EditPart;
import mdn.diagram.edit.parts.WrappingLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MdnVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mdn.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SdnEditPart.MODEL_ID.equals(view.getType())) {
				return SdnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mdn.diagram.part.MdnVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MdnDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MdnPackage.eINSTANCE.getSdn().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Sdn) domainElement)) {
			return SdnEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mdn.diagram.part.MdnVisualIDRegistry
				.getModelID(containerView);
		if (!SdnEditPart.MODEL_ID.equals(containerModelID)
				&& !"mdn".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SdnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mdn.diagram.part.MdnVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SdnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SdnEditPart.VISUAL_ID:
			if (MdnPackage.eINSTANCE.getController().isSuperTypeOf(
					domainElement.eClass())) {
				return ControllerEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getHost().isSuperTypeOf(
					domainElement.eClass())) {
				return HostEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getSwitch().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getTraffic().isSuperTypeOf(
					domainElement.eClass())) {
				return TrafficEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getTime().isSuperTypeOf(
					domainElement.eClass())) {
				return TimeEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getPacketHeader().isSuperTypeOf(
					domainElement.eClass())) {
				return PacketHeaderEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getRule().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleEditPart.VISUAL_ID;
			}
			if (MdnPackage.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			if (MdnPackage.eINSTANCE.getHost().isSuperTypeOf(
					domainElement.eClass())) {
				return Host2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mdn.diagram.part.MdnVisualIDRegistry
				.getModelID(containerView);
		if (!SdnEditPart.MODEL_ID.equals(containerModelID)
				&& !"mdn".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SdnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mdn.diagram.part.MdnVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SdnEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SdnEditPart.VISUAL_ID:
			if (ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrafficEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PacketHeaderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerEditPart.VISUAL_ID:
			if (ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HostEditPart.VISUAL_ID:
			if (HostNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchEditPart.VISUAL_ID:
			if (SwitchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionEditPart.VISUAL_ID:
			if (ActionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TrafficEditPart.VISUAL_ID:
			if (TrafficOperatorUnitValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeEditPart.VISUAL_ID:
			if (TimeOperatorBeginDateEndDatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PacketHeaderEditPart.VISUAL_ID:
			if (PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleEditPart.VISUAL_ID:
			if (RuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Host2EditPart.VISUAL_ID:
			if (HostName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			if (Host2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HostHostSwitchEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchSwitchesEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleConditionEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleActionEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionActionPacketHeaderEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionActionForwardToNodeEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionTimeEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionPacketEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Sdn element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SdnEditPart.VISUAL_ID:
			return false;
		case ControllerEditPart.VISUAL_ID:
		case HostEditPart.VISUAL_ID:
		case SwitchEditPart.VISUAL_ID:
		case ActionEditPart.VISUAL_ID:
		case ConditionEditPart.VISUAL_ID:
		case TrafficEditPart.VISUAL_ID:
		case TimeEditPart.VISUAL_ID:
		case PacketHeaderEditPart.VISUAL_ID:
		case RuleEditPart.VISUAL_ID:
		case Host2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return mdn.diagram.part.MdnVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mdn.diagram.part.MdnVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mdn.diagram.part.MdnVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return mdn.diagram.part.MdnVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mdn.diagram.part.MdnVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mdn.diagram.part.MdnVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
