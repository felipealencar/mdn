/*
 * 
 */
package mdn.diagram.part;

import mdn.MdnPackage;
import mdn.Sdn;
import mdn.diagram.edit.parts.ControllerControllerSwitchEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.ControllerNameEditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.HostNameEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchNameEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.WrappingLabel2EditPart;
import mdn.diagram.edit.parts.WrappingLabel3EditPart;
import mdn.diagram.edit.parts.WrappingLabel4EditPart;
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
		case ControllerControllerSwitchEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HostHostSwitchEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
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
