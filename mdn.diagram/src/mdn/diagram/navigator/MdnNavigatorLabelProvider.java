/*
 * 
 */
package mdn.diagram.navigator;

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
		case HostEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Host", MdnElementTypes.Host_2002); //$NON-NLS-1$
		case SwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Switch", MdnElementTypes.Switch_2003); //$NON-NLS-1$
		case SdnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?mdn?Sdn", MdnElementTypes.Sdn_1000); //$NON-NLS-1$
		case ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?mdn?Controller", MdnElementTypes.Controller_2001); //$NON-NLS-1$
		case ControllerControllerSwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Controller?controllerSwitch", MdnElementTypes.ControllerControllerSwitch_4003); //$NON-NLS-1$
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Switch?switchController", MdnElementTypes.SwitchSwitchController_4006); //$NON-NLS-1$
		case HostHostSwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?mdn?Host?hostSwitch", MdnElementTypes.HostHostSwitch_4004); //$NON-NLS-1$
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
		case HostEditPart.VISUAL_ID:
			return getHost_2002Text(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003Text(view);
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000Text(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001Text(view);
		case ControllerControllerSwitchEditPart.VISUAL_ID:
			return getControllerControllerSwitch_4003Text(view);
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getSwitchSwitchController_4006Text(view);
		case HostHostSwitchEditPart.VISUAL_ID:
			return getHostHostSwitch_4004Text(view);
		}
		return getUnknownElementText(view);
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
	private String getControllerControllerSwitch_4003Text(View view) {
		IParser parser = MdnParserProvider.getParser(
				MdnElementTypes.ControllerControllerSwitch_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MdnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
