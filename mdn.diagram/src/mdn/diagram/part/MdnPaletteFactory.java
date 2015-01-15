/*
 * 
 */
package mdn.diagram.part;

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
		paletteContainer.add(createHost4CreationTool());
		paletteContainer.add(createPacketHeader5CreationTool());
		paletteContainer.add(createPolicy6CreationTool());
		paletteContainer.add(createSwitch7CreationTool());
		paletteContainer.add(createTime8CreationTool());
		paletteContainer.add(createTraffic9CreationTool());
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
		paletteContainer.add(createHostSwitch3CreationTool());
		paletteContainer.add(createPolicyAction4CreationTool());
		paletteContainer.add(createPolicyCondition5CreationTool());
		paletteContainer.add(createSourceHostPolicy6CreationTool());
		paletteContainer.add(createSwitch7CreationTool());
		paletteContainer.add(createSwitchController8CreationTool());
		paletteContainer.add(createTargetHostPolicy9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Action1CreationTool_title,
				Messages.Action1CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Action_2011));
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
				Collections.singletonList(MdnElementTypes.Condition_2010));
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
	private ToolEntry createHost4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Host4CreationTool_title,
				Messages.Host4CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Host_2002));
		entry.setId("createHost4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/host.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPacketHeader5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PacketHeader5CreationTool_title,
				Messages.PacketHeader5CreationTool_desc,
				Collections.singletonList(MdnElementTypes.PacketHeader_2009));
		entry.setId("createPacketHeader5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/packetheader.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPolicy6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Policy6CreationTool_title,
				Messages.Policy6CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Policy_2004));
		entry.setId("createPolicy6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/policy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Switch7CreationTool_title,
				Messages.Switch7CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Switch_2003));
		entry.setId("createSwitch7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/switch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTime8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Time8CreationTool_title,
				Messages.Time8CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Time_2008));
		entry.setId("createTime8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/time.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraffic9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traffic9CreationTool_title,
				Messages.Traffic9CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Traffic_2007));
		entry.setId("createTraffic9CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createHostSwitch3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HostSwitch3CreationTool_title,
				Messages.HostSwitch3CreationTool_desc,
				Collections.singletonList(MdnElementTypes.HostHostSwitch_4004));
		entry.setId("createHostSwitch3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.HostHostSwitch_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPolicyAction4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PolicyAction4CreationTool_title,
				Messages.PolicyAction4CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.PolicyPolicyAction_4015));
		entry.setId("createPolicyAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.PolicyPolicyAction_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPolicyCondition5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PolicyCondition5CreationTool_title,
				Messages.PolicyCondition5CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.PolicyPolicyCondition_4016));
		entry.setId("createPolicyCondition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.PolicyPolicyCondition_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSourceHostPolicy6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SourceHostPolicy6CreationTool_title,
				Messages.SourceHostPolicy6CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.HostSourceHostPolicy_4007));
		entry.setId("createSourceHostPolicy6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.HostSourceHostPolicy_4007));
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
	private ToolEntry createTargetHostPolicy9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TargetHostPolicy9CreationTool_title,
				Messages.TargetHostPolicy9CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.PolicyTargetHostPolicy_4009));
		entry.setId("createTargetHostPolicy9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.PolicyTargetHostPolicy_4009));
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
