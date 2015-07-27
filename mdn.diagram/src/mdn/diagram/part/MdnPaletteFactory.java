/*
 * 
 */
package mdn.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createCondition2CreationTool());
		paletteContainer.add(createController3CreationTool());
		paletteContainer.add(createGroup4CreationTool());
		paletteContainer.add(createHost5CreationTool());
		paletteContainer.add(createPacketHeader6CreationTool());
		paletteContainer.add(createRule7CreationTool());
		paletteContainer.add(createSwitch8CreationTool());
		paletteContainer.add(createTime9CreationTool());
		paletteContainer.add(createTraffic10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createActionForwardToNode1CreationTool());
		paletteContainer.add(createActionPacketHeader2CreationTool());
		paletteContainer.add(createConditionPacket3CreationTool());
		paletteContainer.add(createConditionTime4CreationTool());
		paletteContainer.add(createConditionTraffic5CreationTool());
		paletteContainer.add(createHostSwitch6CreationTool());
		paletteContainer.add(createRuleCondition7CreationTool());
		paletteContainer.add(createSwitchController8CreationTool());
		paletteContainer.add(createSwitches9CreationTool());
		paletteContainer.add(createRuleAction10CreationTool());
		paletteContainer.add(createSourceHost11CreationTool());
		paletteContainer.add(createTargetGroup12CreationTool());
		paletteContainer.add(createTargetHost13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Action1CreationTool_title,
				Messages.Action1CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Action_2012));
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Condition2CreationTool_title,
				Messages.Condition2CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Condition_2013));
		entry.setId("createCondition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Controller3CreationTool_title,
				Messages.Controller3CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Controller_2001));
		entry.setId("createController3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/controller.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Group4CreationTool_title,
				Messages.Group4CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Group_2018));
		entry.setId("createGroup4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.Group_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHost5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MdnElementTypes.Host_2002);
		types.add(MdnElementTypes.Host_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Host5CreationTool_title,
				Messages.Host5CreationTool_desc, types);
		entry.setId("createHost5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/host.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPacketHeader6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PacketHeader6CreationTool_title,
				Messages.PacketHeader6CreationTool_desc,
				Collections.singletonList(MdnElementTypes.PacketHeader_2016));
		entry.setId("createPacketHeader6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/packetheader.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRule7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Rule7CreationTool_title,
				Messages.Rule7CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Rule_2017));
		entry.setId("createRule7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/policy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Switch8CreationTool_title,
				Messages.Switch8CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Switch_2003));
		entry.setId("createSwitch8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/switch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTime9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Time9CreationTool_title,
				Messages.Time9CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Time_2015));
		entry.setId("createTime9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/time.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraffic10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traffic10CreationTool_title,
				Messages.Traffic10CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Traffic_2014));
		entry.setId("createTraffic10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/traffic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionForwardToNode1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActionForwardToNode1CreationTool_title,
				Messages.ActionForwardToNode1CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ActionActionForwardToNode_4013));
		entry.setId("createActionForwardToNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ActionActionForwardToNode_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionPacketHeader2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActionPacketHeader2CreationTool_title,
				Messages.ActionPacketHeader2CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ActionActionPacketHeader_4012));
		entry.setId("createActionPacketHeader2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ActionActionPacketHeader_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionPacket3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConditionPacket3CreationTool_title,
				Messages.ConditionPacket3CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionPacket_4019));
		entry.setId("createConditionPacket3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionPacket_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionTime4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConditionTime4CreationTool_title,
				Messages.ConditionTime4CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionTime_4017));
		entry.setId("createConditionTime4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionTime_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionTraffic5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConditionTraffic5CreationTool_title,
				Messages.ConditionTraffic5CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionTraffic_4018));
		entry.setId("createConditionTraffic5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionTraffic_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHostSwitch6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HostSwitch6CreationTool_title,
				Messages.HostSwitch6CreationTool_desc,
				Collections.singletonList(MdnElementTypes.HostHostSwitch_4004));
		entry.setId("createHostSwitch6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.HostHostSwitch_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleCondition7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RuleCondition7CreationTool_title,
				Messages.RuleCondition7CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleRuleCondition_4026));
		entry.setId("createRuleCondition7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleRuleCondition_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchController8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SwitchController8CreationTool_title,
				Messages.SwitchController8CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.SwitchSwitchController_4006));
		entry.setId("createSwitchController8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.SwitchSwitchController_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitches9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Switches9CreationTool_title,
				Messages.Switches9CreationTool_desc,
				Collections.singletonList(MdnElementTypes.SwitchSwitches_4022));
		entry.setId("createSwitches9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.SwitchSwitches_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleAction10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RuleAction10CreationTool_title,
				Messages.RuleAction10CreationTool_desc,
				Collections.singletonList(MdnElementTypes.RuleRuleAction_4027));
		entry.setId("createRuleAction10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleRuleAction_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSourceHost11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SourceHost11CreationTool_title,
				Messages.SourceHost11CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleSourceHostRule_4024));
		entry.setId("createSourceHost11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleSourceHostRule_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetGroup12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TargetGroup12CreationTool_title,
				Messages.TargetGroup12CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleTargetGroupRule_4028));
		entry.setId("createTargetGroup12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleTargetGroupRule_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetHost13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TargetHost13CreationTool_title,
				Messages.TargetHost13CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleTargetHostRule_4025));
		entry.setId("createTargetHost13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleTargetHostRule_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
