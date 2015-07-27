/*
 * 
 */
package mdn.diagram.navigator;

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
import mdn.diagram.part.MdnDiagramEditorPlugin;
import mdn.diagram.part.MdnVisualIDRegistry;
import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MdnNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MdnDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MdnDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MdnNavigatorItem
				&& !isOwnView(((MdnNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MdnNavigatorGroup) {
			MdnNavigatorGroup group = (MdnNavigatorGroup) element;
			return MdnDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MdnNavigatorItem) {
			MdnNavigatorItem navigatorItem = (MdnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?mdn?Sdn", MdnElementTypes.Sdn_1000); //$NON-NLS-1$
		case ActionActionForwardToNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Action?actionForwardToNode", MdnElementTypes.ActionActionForwardToNode_4013); //$NON-NLS-1$
		case RuleRuleActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Rule?ruleAction", MdnElementTypes.RuleRuleAction_4027); //$NON-NLS-1$
		case ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Controller", MdnElementTypes.Controller_2001); //$NON-NLS-1$
		case TimeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Time", MdnElementTypes.Time_2015); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Condition", MdnElementTypes.Condition_2013); //$NON-NLS-1$
		case SwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Switch", MdnElementTypes.Switch_2003); //$NON-NLS-1$
		case HostEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Host", MdnElementTypes.Host_2002); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Group", MdnElementTypes.Group_2018); //$NON-NLS-1$
		case Host2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?mdn?Host", MdnElementTypes.Host_3001); //$NON-NLS-1$
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Switch?switchController", MdnElementTypes.SwitchSwitchController_4006); //$NON-NLS-1$
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Rule?targetHostRule", MdnElementTypes.RuleTargetHostRule_4025); //$NON-NLS-1$
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Condition?conditionPacket", MdnElementTypes.ConditionConditionPacket_4019); //$NON-NLS-1$
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Rule?targetGroupRule", MdnElementTypes.RuleTargetGroupRule_4028); //$NON-NLS-1$
		case ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Action", MdnElementTypes.Action_2012); //$NON-NLS-1$
		case SwitchSwitchesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Switch?switches", MdnElementTypes.SwitchSwitches_4022); //$NON-NLS-1$
		case ConditionConditionTimeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Condition?conditionTime", MdnElementTypes.ConditionConditionTime_4017); //$NON-NLS-1$
		case HostHostSwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Host?hostSwitch", MdnElementTypes.HostHostSwitch_4004); //$NON-NLS-1$
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Rule?sourceHostRule", MdnElementTypes.RuleSourceHostRule_4024); //$NON-NLS-1$
		case TrafficEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Traffic", MdnElementTypes.Traffic_2014); //$NON-NLS-1$
		case PacketHeaderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?PacketHeader", MdnElementTypes.PacketHeader_2016); //$NON-NLS-1$
		case RuleRuleConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Rule?ruleCondition", MdnElementTypes.RuleRuleCondition_4026); //$NON-NLS-1$
		case ActionActionPacketHeaderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Action?actionPacketHeader", MdnElementTypes.ActionActionPacketHeader_4012); //$NON-NLS-1$
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Condition?conditionTraffic", MdnElementTypes.ConditionConditionTraffic_4018); //$NON-NLS-1$
		case RuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Rule", MdnElementTypes.Rule_2017); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MdnDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MdnElementTypes.isKnownElementType(elementType)) {
			image = MdnElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MdnNavigatorGroup) {
			MdnNavigatorGroup group = (MdnNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MdnNavigatorItem) {
			MdnNavigatorItem navigatorItem = (MdnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MdnVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000Text(view);
		case ActionActionForwardToNodeEditPart.VISUAL_ID:
			return getActionActionForwardToNode_4013Text(view);
		case RuleRuleActionEditPart.VISUAL_ID:
			return getRuleRuleAction_4027Text(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001Text(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2015Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2013Text(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003Text(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2018Text(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001Text(view);
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getSwitchSwitchController_4006Text(view);
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return getRuleTargetHostRule_4025Text(view);
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return getConditionConditionPacket_4019Text(view);
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			return getRuleTargetGroupRule_4028Text(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2012Text(view);
		case SwitchSwitchesEditPart.VISUAL_ID:
			return getSwitchSwitches_4022Text(view);
		case ConditionConditionTimeEditPart.VISUAL_ID:
			return getConditionConditionTime_4017Text(view);
		case HostHostSwitchEditPart.VISUAL_ID:
			return getHostHostSwitch_4004Text(view);
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return getRuleSourceHostRule_4024Text(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2014Text(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2016Text(view);
		case RuleRuleConditionEditPart.VISUAL_ID:
			return getRuleRuleCondition_4026Text(view);
		case ActionActionPacketHeaderEditPart.VISUAL_ID:
			return getActionActionPacketHeader_4012Text(view);
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			return getConditionConditionTraffic_4018Text(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2017Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSdn_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConditionConditionTime_4017Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ConditionConditionTime_4017,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTraffic_2014Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Traffic_2014,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry
						.getType(TrafficOperatorUnitValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionConditionTraffic_4018Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ConditionConditionTraffic_4018,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRuleTargetHostRule_4025Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.RuleTargetHostRule_4025,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTime_2015Text(View view) {
		IParser parser = MdnParserProvider
				.getParser(
						MdnElementTypes.Time_2015,
						view.getElement() != null ? view.getElement() : view,
						MdnVisualIDRegistry
								.getType(TimeOperatorBeginDateEndDatEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionActionForwardToNode_4013Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ActionActionForwardToNode_4013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCondition_2013Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Condition_2013,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry
						.getType(ConditionConditionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRuleRuleCondition_4026Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.RuleRuleCondition_4026,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPacketHeader_2016Text(View view) {
		IParser parser = MdnParserProvider
				.getParser(
						MdnElementTypes.PacketHeader_2016,
						view.getElement() != null ? view.getElement() : view,
						MdnVisualIDRegistry
								.getType(PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRuleRuleAction_4027Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.RuleRuleAction_4027,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRuleTargetGroupRule_4028Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.RuleTargetGroupRule_4028,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHost_3001Text(View view) {
		IParser parser = MdnParserProvider.getParser(MdnElementTypes.Host_3001,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(HostName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getController_2001Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Controller_2001,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(ControllerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRuleSourceHostRule_4024Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.RuleSourceHostRule_4024,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitch_2003Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Switch_2003,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(SwitchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2018Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Group_2018,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHostHostSwitch_4004Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.HostHostSwitch_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionActionPacketHeader_4012Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ActionActionPacketHeader_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_2012Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.Action_2012,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(ActionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRule_2017Text(View view) {
		IParser parser = MdnParserProvider.getParser(MdnElementTypes.Rule_2017,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(RuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchSwitches_4022Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.SwitchSwitches_4022,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHost_2002Text(View view) {
		IParser parser = MdnParserProvider.getParser(MdnElementTypes.Host_2002,
				view.getElement() != null ? view.getElement() : view,
				MdnVisualIDRegistry.getType(HostNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionConditionPacket_4019Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ConditionConditionPacket_4019,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchSwitchController_4006Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.SwitchSwitchController_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SdnEditPart.MODEL_ID
				.equals(MdnVisualIDRegistry.getModelID(view));
	}

}
