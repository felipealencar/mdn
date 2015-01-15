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

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionConditionEditPart.VISUAL_ID:
				return new ConditionConditionEditPart(view);

			case TrafficEditPart.VISUAL_ID:
				return new TrafficEditPart(view);

			case TrafficOperatorUnitValueEditPart.VISUAL_ID:
				return new TrafficOperatorUnitValueEditPart(view);

			case TimeEditPart.VISUAL_ID:
				return new TimeEditPart(view);

			case TimeOperatorBeginDateEndDatEditPart.VISUAL_ID:
				return new TimeOperatorBeginDateEndDatEditPart(view);

			case PacketHeaderEditPart.VISUAL_ID:
				return new PacketHeaderEditPart(view);

			case PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID:
				return new PacketHeaderOperatorHeaderValueEditPart(view);

			case PolicyEditPart.VISUAL_ID:
				return new PolicyEditPart(view);

			case PolicyNameEditPart.VISUAL_ID:
				return new PolicyNameEditPart(view);

			case HostHostSwitchEditPart.VISUAL_ID:
				return new HostHostSwitchEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case HostSourceHostPolicyEditPart.VISUAL_ID:
				return new HostSourceHostPolicyEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case SwitchSwitchControllerEditPart.VISUAL_ID:
				return new SwitchSwitchControllerEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case SwitchSwitchEditPart.VISUAL_ID:
				return new SwitchSwitchEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case PolicyTargetHostPolicyEditPart.VISUAL_ID:
				return new PolicyTargetHostPolicyEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case PolicyPolicyConditionEditPart.VISUAL_ID:
				return new PolicyPolicyConditionEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case PolicyPolicyActionEditPart.VISUAL_ID:
				return new PolicyPolicyActionEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case ActionActionPacketHeaderEditPart.VISUAL_ID:
				return new ActionActionPacketHeaderEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case ActionActionForwardToNodeEditPart.VISUAL_ID:
				return new ActionActionForwardToNodeEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

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
