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
		paletteContainer.add(createController1CreationTool());
		paletteContainer.add(createHost2CreationTool());
		paletteContainer.add(createSwitch3CreationTool());
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
		paletteContainer.add(createControllerSwitch1CreationTool());
		paletteContainer.add(createHostSwitch2CreationTool());
		paletteContainer.add(createSwitchController3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Controller1CreationTool_title,
				Messages.Controller1CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Controller_2001));
		entry.setId("createController1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/controller.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHost2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Host2CreationTool_title,
				Messages.Host2CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Host_2002));
		entry.setId("createHost2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/host.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControllerSwitch1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ControllerSwitch1CreationTool_title,
				Messages.ControllerSwitch1CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.ControllerControllerSwitch_4003));
		entry.setId("createControllerSwitch1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.ControllerControllerSwitch_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHostSwitch2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HostSwitch2CreationTool_title,
				Messages.HostSwitch2CreationTool_desc,
				Collections.singletonList(MdnElementTypes.HostHostSwitch_4004));
		entry.setId("createHostSwitch2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.HostHostSwitch_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchController3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SwitchController3CreationTool_title,
				Messages.SwitchController3CreationTool_desc,
				Collections
						.singletonList(MdnElementTypes.SwitchSwitchController_4006));
		entry.setId("createSwitchController3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnElementTypes
				.getImageDescriptor(MdnElementTypes.SwitchSwitchController_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Switch3CreationTool_title,
				Messages.Switch3CreationTool_desc,
				Collections.singletonList(MdnElementTypes.Switch_2003));
		entry.setId("createSwitch3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MdnDiagramEditorPlugin
				.findImageDescriptor("/mdn.edit/icons/full/obj16/switch.gif")); //$NON-NLS-1$
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
