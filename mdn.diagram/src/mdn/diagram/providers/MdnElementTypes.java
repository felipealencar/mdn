/*
 * 
 */
package mdn.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.ActionActionForwardToNodeEditPart;
import mdn.diagram.edit.parts.ActionActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.ActionEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.HostSourceHostPolicyEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.PolicyEditPart;
import mdn.diagram.edit.parts.PolicyPolicyActionEditPart;
import mdn.diagram.edit.parts.PolicyPolicyConditionEditPart;
import mdn.diagram.edit.parts.PolicyTargetHostPolicyEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchEditPart;
import mdn.diagram.edit.parts.TimeEditPart;
import mdn.diagram.edit.parts.TrafficEditPart;
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
	public static final IElementType Action_2011 = getElementType("mdn.diagram.Action_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Condition_2010 = getElementType("mdn.diagram.Condition_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Traffic_2007 = getElementType("mdn.diagram.Traffic_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Time_2008 = getElementType("mdn.diagram.Time_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PacketHeader_2009 = getElementType("mdn.diagram.PacketHeader_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Policy_2004 = getElementType("mdn.diagram.Policy_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HostHostSwitch_4004 = getElementType("mdn.diagram.HostHostSwitch_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HostSourceHostPolicy_4007 = getElementType("mdn.diagram.HostSourceHostPolicy_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwitchSwitchController_4006 = getElementType("mdn.diagram.SwitchSwitchController_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwitchSwitch_4008 = getElementType("mdn.diagram.SwitchSwitch_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PolicyTargetHostPolicy_4009 = getElementType("mdn.diagram.PolicyTargetHostPolicy_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PolicyPolicyCondition_4016 = getElementType("mdn.diagram.PolicyPolicyCondition_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PolicyPolicyAction_4015 = getElementType("mdn.diagram.PolicyPolicyAction_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionActionPacketHeader_4012 = getElementType("mdn.diagram.ActionActionPacketHeader_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionActionForwardToNode_4013 = getElementType("mdn.diagram.ActionActionForwardToNode_4013"); //$NON-NLS-1$

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

			elements.put(Action_2011, MdnPackage.eINSTANCE.getAction());

			elements.put(Condition_2010, MdnPackage.eINSTANCE.getCondition());

			elements.put(Traffic_2007, MdnPackage.eINSTANCE.getTraffic());

			elements.put(Time_2008, MdnPackage.eINSTANCE.getTime());

			elements.put(PacketHeader_2009,
					MdnPackage.eINSTANCE.getPacketHeader());

			elements.put(Policy_2004, MdnPackage.eINSTANCE.getPolicy());

			elements.put(HostHostSwitch_4004,
					MdnPackage.eINSTANCE.getHost_HostSwitch());

			elements.put(HostSourceHostPolicy_4007,
					MdnPackage.eINSTANCE.getHost_SourceHostPolicy());

			elements.put(SwitchSwitchController_4006,
					MdnPackage.eINSTANCE.getSwitch_SwitchController());

			elements.put(SwitchSwitch_4008,
					MdnPackage.eINSTANCE.getSwitch_Switch());

			elements.put(PolicyTargetHostPolicy_4009,
					MdnPackage.eINSTANCE.getPolicy_TargetHostPolicy());

			elements.put(PolicyPolicyCondition_4016,
					MdnPackage.eINSTANCE.getPolicy_PolicyCondition());

			elements.put(PolicyPolicyAction_4015,
					MdnPackage.eINSTANCE.getPolicy_PolicyAction());

			elements.put(ActionActionPacketHeader_4012,
					MdnPackage.eINSTANCE.getAction_ActionPacketHeader());

			elements.put(ActionActionForwardToNode_4013,
					MdnPackage.eINSTANCE.getAction_ActionForwardToNode());
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
			KNOWN_ELEMENT_TYPES.add(Action_2011);
			KNOWN_ELEMENT_TYPES.add(Condition_2010);
			KNOWN_ELEMENT_TYPES.add(Traffic_2007);
			KNOWN_ELEMENT_TYPES.add(Time_2008);
			KNOWN_ELEMENT_TYPES.add(PacketHeader_2009);
			KNOWN_ELEMENT_TYPES.add(Policy_2004);
			KNOWN_ELEMENT_TYPES.add(HostHostSwitch_4004);
			KNOWN_ELEMENT_TYPES.add(HostSourceHostPolicy_4007);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitchController_4006);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitch_4008);
			KNOWN_ELEMENT_TYPES.add(PolicyTargetHostPolicy_4009);
			KNOWN_ELEMENT_TYPES.add(PolicyPolicyCondition_4016);
			KNOWN_ELEMENT_TYPES.add(PolicyPolicyAction_4015);
			KNOWN_ELEMENT_TYPES.add(ActionActionPacketHeader_4012);
			KNOWN_ELEMENT_TYPES.add(ActionActionForwardToNode_4013);
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
		case ActionEditPart.VISUAL_ID:
			return Action_2011;
		case ConditionEditPart.VISUAL_ID:
			return Condition_2010;
		case TrafficEditPart.VISUAL_ID:
			return Traffic_2007;
		case TimeEditPart.VISUAL_ID:
			return Time_2008;
		case PacketHeaderEditPart.VISUAL_ID:
			return PacketHeader_2009;
		case PolicyEditPart.VISUAL_ID:
			return Policy_2004;
		case HostHostSwitchEditPart.VISUAL_ID:
			return HostHostSwitch_4004;
		case HostSourceHostPolicyEditPart.VISUAL_ID:
			return HostSourceHostPolicy_4007;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return SwitchSwitchController_4006;
		case SwitchSwitchEditPart.VISUAL_ID:
			return SwitchSwitch_4008;
		case PolicyTargetHostPolicyEditPart.VISUAL_ID:
			return PolicyTargetHostPolicy_4009;
		case PolicyPolicyConditionEditPart.VISUAL_ID:
			return PolicyPolicyCondition_4016;
		case PolicyPolicyActionEditPart.VISUAL_ID:
			return PolicyPolicyAction_4015;
		case ActionActionPacketHeaderEditPart.VISUAL_ID:
			return ActionActionPacketHeader_4012;
		case ActionActionForwardToNodeEditPart.VISUAL_ID:
			return ActionActionForwardToNode_4013;
		}
		return null;
	}

}
