/*
 * 
 */
package mdn.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.ControllerControllerSwitchEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.part.MdnDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MdnElementTypes {

	/**
	 * @generated
	 */
	private MdnElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Sdn_1000 = getElementType("mdn.diagram.Sdn_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller_2001 = getElementType("mdn.diagram.Controller_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Host_2002 = getElementType("mdn.diagram.Host_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Switch_2003 = getElementType("mdn.diagram.Switch_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControllerControllerSwitch_4003 = getElementType("mdn.diagram.ControllerControllerSwitch_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HostHostSwitch_4004 = getElementType("mdn.diagram.HostHostSwitch_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwitchSwitchController_4006 = getElementType("mdn.diagram.SwitchSwitchController_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MdnDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Sdn_1000, MdnPackage.eINSTANCE.getSdn());

			elements.put(Controller_2001, MdnPackage.eINSTANCE.getController());

			elements.put(Host_2002, MdnPackage.eINSTANCE.getHost());

			elements.put(Switch_2003, MdnPackage.eINSTANCE.getSwitch());

			elements.put(ControllerControllerSwitch_4003,
					MdnPackage.eINSTANCE.getController_ControllerSwitch());

			elements.put(HostHostSwitch_4004,
					MdnPackage.eINSTANCE.getHost_HostSwitch());

			elements.put(SwitchSwitchController_4006,
					MdnPackage.eINSTANCE.getSwitch_SwitchController());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Sdn_1000);
			KNOWN_ELEMENT_TYPES.add(Controller_2001);
			KNOWN_ELEMENT_TYPES.add(Host_2002);
			KNOWN_ELEMENT_TYPES.add(Switch_2003);
			KNOWN_ELEMENT_TYPES.add(ControllerControllerSwitch_4003);
			KNOWN_ELEMENT_TYPES.add(HostHostSwitch_4004);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitchController_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SdnEditPart.VISUAL_ID:
			return Sdn_1000;
		case ControllerEditPart.VISUAL_ID:
			return Controller_2001;
		case HostEditPart.VISUAL_ID:
			return Host_2002;
		case SwitchEditPart.VISUAL_ID:
			return Switch_2003;
		case ControllerControllerSwitchEditPart.VISUAL_ID:
			return ControllerControllerSwitch_4003;
		case HostHostSwitchEditPart.VISUAL_ID:
			return HostHostSwitch_4004;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return SwitchSwitchController_4006;
		}
		return null;
	}

}
