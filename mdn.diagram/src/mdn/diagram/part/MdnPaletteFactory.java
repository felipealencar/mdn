/*
 * 
 */
package mdn.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		paletteContainer.add(createApp1CreationTool());
		paletteContainer.add(createAppMonitor2CreationTool());
		paletteContainer.add(createCondition3CreationTool());
		paletteContainer.add(createController4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createHost6CreationTool());
		paletteContainer.add(createOpenFlowSwitch7CreationTool());
		paletteContainer.add(createPacketHeader8CreationTool());
		paletteContainer.add(createRule9CreationTool());
		paletteContainer.add(createSwitch10CreationTool());
		paletteContainer.add(createTime11CreationTool());
		paletteContainer.add(createTraffic12CreationTool());
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
		paletteContainer.add(createActionPacketHeader1CreationTool());
		paletteContainer.add(createAppRule2CreationTool());
		paletteContainer.add(createAppToNetworkNode3CreationTool());
		paletteContainer.add(createConditionPacket4CreationTool());
		paletteContainer.add(createConditionTime5CreationTool());
		paletteContainer.add(createConditionTraffic6CreationTool());
		paletteContainer.add(createControllerApp7CreationTool());
		paletteContainer.add(createHostSwitch8CreationTool());
		paletteContainer.add(createRuleCondition9CreationTool());
		paletteContainer.add(createSourceHostRule10CreationTool());
		paletteContainer.add(createSwitchController11CreationTool());
		paletteContainer.add(createSwitches12CreationTool());
		paletteContainer.add(createTargetGroupRule13CreationTool());
		paletteContainer.add(createTargetHostRule14CreationTool());
		paletteContainer.add(createTargetSwitch15CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApp1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.App1CreationTool_title,
				Messages.App1CreationTool_desc,
				Collections.singletonList(MdnElementTypes.App_2020));
		entry.setId("createApp1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAppMonitor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AppMonitor2CreationTool_title,
				Messages.AppMonitor2CreationTool_desc,
				Collections.singletonList(MdnElementTypes.AppMonitor_2019));
		entry.setId("createAppMonitor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Condition3CreationTool_title,
				Messages.Condition3CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Condition_2013));
		entry.setId("createCondition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Controller4CreationTool_title,
				Messages.Controller4CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Controller_2001));
		entry.setId("createController4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/controller.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Group5CreationTool_title,
				Messages.Group5CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Group_2018));
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.Group_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHost6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MdnElementTypes.Host_2002);
		types.add(MdnElementTypes.Host_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Host6CreationTool_title,
				Messages.Host6CreationTool_desc, types);
		entry.setId("createHost6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/host.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpenFlowSwitch7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.OpenFlowSwitch7CreationTool_title,
				Messages.OpenFlowSwitch7CreationTool_desc,
				Collections.singletonList(MdnElementTypes.OpenFlowSwitch_2022));
		entry.setId("createOpenFlowSwitch7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/openflowswitch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPacketHeader8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PacketHeader8CreationTool_title,
				Messages.PacketHeader8CreationTool_desc,
				Collections.singletonList(MdnElementTypes.PacketHeader_2016));
		entry.setId("createPacketHeader8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/packetheader.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRule9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Rule9CreationTool_title,
				Messages.Rule9CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Rule_2021));
		entry.setId("createRule9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/policy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Switch10CreationTool_title,
				Messages.Switch10CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Switch_2003));
		entry.setId("createSwitch10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/switch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTime11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Time11CreationTool_title,
				Messages.Time11CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Time_2015));
		entry.setId("createTime11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/time.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraffic12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Traffic12CreationTool_title,
				Messages.Traffic12CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Traffic_2014));
		entry.setId("createTraffic12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/traffic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionPacketHeader1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ActionPacketHeader1CreationTool_title,
				Messages.ActionPacketHeader1CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.AppActionPacketHeader_4029));
		entry.setId("createActionPacketHeader1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.AppActionPacketHeader_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAppRule2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.AppRule2CreationTool_title,
				Messages.AppRule2CreationTool_desc,
				Collections.singletonList(MdnElementTypes.AppAppRule_4032));
		entry.setId("createAppRule2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.AppAppRule_4032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAppToNetworkNode3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.AppToNetworkNode3CreationTool_title,
				Messages.AppToNetworkNode3CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.AppAppToNetworkNode_4030));
		entry.setId("createAppToNetworkNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.AppAppToNetworkNode_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionPacket4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConditionPacket4CreationTool_title,
				Messages.ConditionPacket4CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionPacket_4019));
		entry.setId("createConditionPacket4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionPacket_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionTime5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConditionTime5CreationTool_title,
				Messages.ConditionTime5CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionTime_4017));
		entry.setId("createConditionTime5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionTime_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionTraffic6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConditionTraffic6CreationTool_title,
				Messages.ConditionTraffic6CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ConditionConditionTraffic_4018));
		entry.setId("createConditionTraffic6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ConditionConditionTraffic_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControllerApp7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ControllerApp7CreationTool_title,
				Messages.ControllerApp7CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.AppControllerApp_4031));
		entry.setId("createControllerApp7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.AppControllerApp_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHostSwitch8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HostSwitch8CreationTool_title,
				Messages.HostSwitch8CreationTool_desc,
				Collections.singletonList(MdnElementTypes.HostHostSwitch_4004));
		entry.setId("createHostSwitch8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.HostHostSwitch_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleCondition9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RuleCondition9CreationTool_title,
				Messages.RuleCondition9CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleRuleCondition_4026));
		entry.setId("createRuleCondition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleRuleCondition_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSourceHostRule10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.SourceHostRule10CreationTool_title,
				Messages.SourceHostRule10CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleSourceHostRule_4024));
		entry.setId("createSourceHostRule10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleSourceHostRule_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchController11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.SwitchController11CreationTool_title,
				Messages.SwitchController11CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.SwitchSwitchController_4006));
		entry.setId("createSwitchController11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.SwitchSwitchController_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitches12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Switches12CreationTool_title,
				Messages.Switches12CreationTool_desc,
				Collections.singletonList(MdnElementTypes.SwitchSwitches_4022));
		entry.setId("createSwitches12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.SwitchSwitches_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetGroupRule13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TargetGroupRule13CreationTool_title,
				Messages.TargetGroupRule13CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleTargetGroupRule_4028));
		entry.setId("createTargetGroupRule13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleTargetGroupRule_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetHostRule14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TargetHostRule14CreationTool_title,
				Messages.TargetHostRule14CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.RuleTargetHostRule_4025));
		entry.setId("createTargetHostRule14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.RuleTargetHostRule_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetSwitch15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TargetSwitch15CreationTool_title,
				Messages.TargetSwitch15CreationTool_desc,
				Collections.singletonList(MdnElementTypes.AppTargetSwitch_4033));
		entry.setId("createTargetSwitch15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.AppTargetSwitch_4033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
