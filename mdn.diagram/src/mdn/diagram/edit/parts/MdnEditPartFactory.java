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

			case OpenFlowSwitchEditPart.VISUAL_ID:
				return new OpenFlowSwitchEditPart(view);

			case OpenFlowSwitchNameEditPart.VISUAL_ID:
				return new OpenFlowSwitchNameEditPart(view);

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

			case AppMonitorEditPart.VISUAL_ID:
				return new AppMonitorEditPart(view);

			case AppMonitorNameEditPart.VISUAL_ID:
				return new AppMonitorNameEditPart(view);

			case RuleEditPart.VISUAL_ID:
				return new RuleEditPart(view);

			case RuleNameEditPart.VISUAL_ID:
				return new RuleNameEditPart(view);

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

			case AppEditPart.VISUAL_ID:
				return new AppEditPart(view);

			case AppNameEditPart.VISUAL_ID:
				return new AppNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case Host2EditPart.VISUAL_ID:
				return new Host2EditPart(view);

			case HostName2EditPart.VISUAL_ID:
				return new HostName2EditPart(view);

			case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
				return new GroupGroupHostsGroupCompartmentEditPart(view);

			case HostHostSwitchEditPart.VISUAL_ID:
				return new HostHostSwitchEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case SwitchSwitchControllerEditPart.VISUAL_ID:
				return new SwitchSwitchControllerEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case SwitchSwitchesEditPart.VISUAL_ID:
				return new SwitchSwitchesEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case RuleSourceHostRuleEditPart.VISUAL_ID:
				return new RuleSourceHostRuleEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case RuleTargetHostRuleEditPart.VISUAL_ID:
				return new RuleTargetHostRuleEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case RuleRuleConditionEditPart.VISUAL_ID:
				return new RuleRuleConditionEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case RuleTargetGroupRuleEditPart.VISUAL_ID:
				return new RuleTargetGroupRuleEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case AppActionPacketHeaderEditPart.VISUAL_ID:
				return new AppActionPacketHeaderEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case AppAppToNetworkNodeEditPart.VISUAL_ID:
				return new AppAppToNetworkNodeEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case AppControllerAppEditPart.VISUAL_ID:
				return new AppControllerAppEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case AppAppRuleEditPart.VISUAL_ID:
				return new AppAppRuleEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case AppTargetSwitchEditPart.VISUAL_ID:
				return new AppTargetSwitchEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case ConditionConditionTimeEditPart.VISUAL_ID:
				return new ConditionConditionTimeEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case ConditionConditionTrafficEditPart.VISUAL_ID:
				return new ConditionConditionTrafficEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case ConditionConditionPacketEditPart.VISUAL_ID:
				return new ConditionConditionPacketEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

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
