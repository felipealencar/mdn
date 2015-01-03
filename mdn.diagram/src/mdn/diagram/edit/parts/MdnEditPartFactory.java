/*
 * 
 */
package mdn.diagram.edit.parts;

import mdn.diagram.part.MdnVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MdnEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MdnVisualIDRegistry.getVisualID(view)) {

			case SdnEditPart.VISUAL_ID:
				return new SdnEditPart(view);

			case ControllerEditPart.VISUAL_ID:
				return new ControllerEditPart(view);

			case ControllerNameEditPart.VISUAL_ID:
				return new ControllerNameEditPart(view);

			case HostEditPart.VISUAL_ID:
				return new HostEditPart(view);

			case HostNameEditPart.VISUAL_ID:
				return new HostNameEditPart(view);

			case SwitchEditPart.VISUAL_ID:
				return new SwitchEditPart(view);

			case SwitchNameEditPart.VISUAL_ID:
				return new SwitchNameEditPart(view);

			case ControllerControllerSwitchEditPart.VISUAL_ID:
				return new ControllerControllerSwitchEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case HostHostSwitchEditPart.VISUAL_ID:
				return new HostHostSwitchEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case SwitchSwitchControllerEditPart.VISUAL_ID:
				return new SwitchSwitchControllerEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
