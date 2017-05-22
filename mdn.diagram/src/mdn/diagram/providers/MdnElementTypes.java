/*
 * 
 */
package mdn.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.AppActionPacketHeaderEditPart;
import mdn.diagram.edit.parts.AppAppRuleEditPart;
import mdn.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import mdn.diagram.edit.parts.AppControllerAppEditPart;
import mdn.diagram.edit.parts.AppEditPart;
import mdn.diagram.edit.parts.AppMonitorEditPart;
import mdn.diagram.edit.parts.AppTargetSwitchEditPart;
import mdn.diagram.edit.parts.ConditionConditionPacketEditPart;
import mdn.diagram.edit.parts.ConditionConditionTimeEditPart;
import mdn.diagram.edit.parts.ConditionConditionTrafficEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.HostHostSwitchEditPart;
import mdn.diagram.edit.parts.OpenFlowSwitchEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.edit.parts.RuleRuleConditionEditPart;
import mdn.diagram.edit.parts.RuleSourceHostRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import mdn.diagram.edit.parts.RuleTargetHostRuleEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.edit.parts.SwitchSwitchesEditPart;
import mdn.diagram.edit.parts.TimeEditPart;
import mdn.diagram.edit.parts.TrafficEditPart;
import mdn.diagram.part.MdnDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MdnDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

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
	public static final IElementType OpenFlowSwitch_2022 = getElementType("mdn.diagram.OpenFlowSwitch_2022"); //$NON-NLS-1$

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
	public static final IElementType AppMonitor_2019 = getElementType("mdn.diagram.AppMonitor_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rule_2021 = getElementType("mdn.diagram.Rule_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_2013 = getElementType("mdn.diagram.Condition_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Traffic_2014 = getElementType("mdn.diagram.Traffic_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Time_2015 = getElementType("mdn.diagram.Time_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PacketHeader_2016 = getElementType("mdn.diagram.PacketHeader_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType App_2020 = getElementType("mdn.diagram.App_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_2018 = getElementType("mdn.diagram.Group_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Host_3001 = getElementType("mdn.diagram.Host_3001"); //$NON-NLS-1$
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
	public static final IElementType SwitchSwitches_4022 = getElementType("mdn.diagram.SwitchSwitches_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RuleSourceHostRule_4024 = getElementType("mdn.diagram.RuleSourceHostRule_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RuleTargetHostRule_4025 = getElementType("mdn.diagram.RuleTargetHostRule_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RuleRuleCondition_4026 = getElementType("mdn.diagram.RuleRuleCondition_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RuleTargetGroupRule_4028 = getElementType("mdn.diagram.RuleTargetGroupRule_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AppActionPacketHeader_4029 = getElementType("mdn.diagram.AppActionPacketHeader_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AppAppToNetworkNode_4030 = getElementType("mdn.diagram.AppAppToNetworkNode_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AppControllerApp_4031 = getElementType("mdn.diagram.AppControllerApp_4031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AppAppRule_4032 = getElementType("mdn.diagram.AppAppRule_4032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AppTargetSwitch_4033 = getElementType("mdn.diagram.AppTargetSwitch_4033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConditionConditionTime_4017 = getElementType("mdn.diagram.ConditionConditionTime_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionConditionTraffic_4018 = getElementType("mdn.diagram.ConditionConditionTraffic_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionConditionPacket_4019 = getElementType("mdn.diagram.ConditionConditionPacket_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
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

			elements.put(OpenFlowSwitch_2022,
					MdnPackage.eINSTANCE.getOpenFlowSwitch());

			elements.put(Controller_2001, MdnPackage.eINSTANCE.getController());

			elements.put(Host_2002, MdnPackage.eINSTANCE.getHost());

			elements.put(Switch_2003, MdnPackage.eINSTANCE.getSwitch());

			elements.put(AppMonitor_2019, MdnPackage.eINSTANCE.getAppMonitor());

			elements.put(Rule_2021, MdnPackage.eINSTANCE.getRule());

			elements.put(Condition_2013, MdnPackage.eINSTANCE.getCondition());

			elements.put(Traffic_2014, MdnPackage.eINSTANCE.getTraffic());

			elements.put(Time_2015, MdnPackage.eINSTANCE.getTime());

			elements.put(PacketHeader_2016,
					MdnPackage.eINSTANCE.getPacketHeader());

			elements.put(App_2020, MdnPackage.eINSTANCE.getApp());

			elements.put(Group_2018, MdnPackage.eINSTANCE.getGroup());

			elements.put(Host_3001, MdnPackage.eINSTANCE.getHost());

			elements.put(HostHostSwitch_4004,
					MdnPackage.eINSTANCE.getHost_HostSwitch());

			elements.put(SwitchSwitchController_4006,
					MdnPackage.eINSTANCE.getSwitch_SwitchController());

			elements.put(SwitchSwitches_4022,
					MdnPackage.eINSTANCE.getSwitch_Switches());

			elements.put(RuleSourceHostRule_4024,
					MdnPackage.eINSTANCE.getRule_SourceHostRule());

			elements.put(RuleTargetHostRule_4025,
					MdnPackage.eINSTANCE.getRule_TargetHostRule());

			elements.put(RuleRuleCondition_4026,
					MdnPackage.eINSTANCE.getRule_RuleCondition());

			elements.put(RuleTargetGroupRule_4028,
					MdnPackage.eINSTANCE.getRule_TargetGroupRule());

			elements.put(AppActionPacketHeader_4029,
					MdnPackage.eINSTANCE.getApp_ActionPacketHeader());

			elements.put(AppAppToNetworkNode_4030,
					MdnPackage.eINSTANCE.getApp_AppToNetworkNode());

			elements.put(AppControllerApp_4031,
					MdnPackage.eINSTANCE.getApp_ControllerApp());

			elements.put(AppAppRule_4032, MdnPackage.eINSTANCE.getApp_AppRule());

			elements.put(AppTargetSwitch_4033,
					MdnPackage.eINSTANCE.getApp_TargetSwitch());

			elements.put(ConditionConditionTime_4017,
					MdnPackage.eINSTANCE.getCondition_ConditionTime());

			elements.put(ConditionConditionTraffic_4018,
					MdnPackage.eINSTANCE.getCondition_ConditionTraffic());

			elements.put(ConditionConditionPacket_4019,
					MdnPackage.eINSTANCE.getCondition_ConditionPacket());
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
			KNOWN_ELEMENT_TYPES.add(OpenFlowSwitch_2022);
			KNOWN_ELEMENT_TYPES.add(Controller_2001);
			KNOWN_ELEMENT_TYPES.add(Host_2002);
			KNOWN_ELEMENT_TYPES.add(Switch_2003);
			KNOWN_ELEMENT_TYPES.add(AppMonitor_2019);
			KNOWN_ELEMENT_TYPES.add(Rule_2021);
			KNOWN_ELEMENT_TYPES.add(Condition_2013);
			KNOWN_ELEMENT_TYPES.add(Traffic_2014);
			KNOWN_ELEMENT_TYPES.add(Time_2015);
			KNOWN_ELEMENT_TYPES.add(PacketHeader_2016);
			KNOWN_ELEMENT_TYPES.add(App_2020);
			KNOWN_ELEMENT_TYPES.add(Group_2018);
			KNOWN_ELEMENT_TYPES.add(Host_3001);
			KNOWN_ELEMENT_TYPES.add(HostHostSwitch_4004);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitchController_4006);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitches_4022);
			KNOWN_ELEMENT_TYPES.add(RuleSourceHostRule_4024);
			KNOWN_ELEMENT_TYPES.add(RuleTargetHostRule_4025);
			KNOWN_ELEMENT_TYPES.add(RuleRuleCondition_4026);
			KNOWN_ELEMENT_TYPES.add(RuleTargetGroupRule_4028);
			KNOWN_ELEMENT_TYPES.add(AppActionPacketHeader_4029);
			KNOWN_ELEMENT_TYPES.add(AppAppToNetworkNode_4030);
			KNOWN_ELEMENT_TYPES.add(AppControllerApp_4031);
			KNOWN_ELEMENT_TYPES.add(AppAppRule_4032);
			KNOWN_ELEMENT_TYPES.add(AppTargetSwitch_4033);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionTime_4017);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionTraffic_4018);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionPacket_4019);
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
		case OpenFlowSwitchEditPart.VISUAL_ID:
			return OpenFlowSwitch_2022;
		case ControllerEditPart.VISUAL_ID:
			return Controller_2001;
		case HostEditPart.VISUAL_ID:
			return Host_2002;
		case SwitchEditPart.VISUAL_ID:
			return Switch_2003;
		case AppMonitorEditPart.VISUAL_ID:
			return AppMonitor_2019;
		case RuleEditPart.VISUAL_ID:
			return Rule_2021;
		case ConditionEditPart.VISUAL_ID:
			return Condition_2013;
		case TrafficEditPart.VISUAL_ID:
			return Traffic_2014;
		case TimeEditPart.VISUAL_ID:
			return Time_2015;
		case PacketHeaderEditPart.VISUAL_ID:
			return PacketHeader_2016;
		case AppEditPart.VISUAL_ID:
			return App_2020;
		case GroupEditPart.VISUAL_ID:
			return Group_2018;
		case Host2EditPart.VISUAL_ID:
			return Host_3001;
		case HostHostSwitchEditPart.VISUAL_ID:
			return HostHostSwitch_4004;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return SwitchSwitchController_4006;
		case SwitchSwitchesEditPart.VISUAL_ID:
			return SwitchSwitches_4022;
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return RuleSourceHostRule_4024;
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return RuleTargetHostRule_4025;
		case RuleRuleConditionEditPart.VISUAL_ID:
			return RuleRuleCondition_4026;
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			return RuleTargetGroupRule_4028;
		case AppActionPacketHeaderEditPart.VISUAL_ID:
			return AppActionPacketHeader_4029;
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return AppAppToNetworkNode_4030;
		case AppControllerAppEditPart.VISUAL_ID:
			return AppControllerApp_4031;
		case AppAppRuleEditPart.VISUAL_ID:
			return AppAppRule_4032;
		case AppTargetSwitchEditPart.VISUAL_ID:
			return AppTargetSwitch_4033;
		case ConditionConditionTimeEditPart.VISUAL_ID:
			return ConditionConditionTime_4017;
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			return ConditionConditionTraffic_4018;
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return ConditionConditionPacket_4019;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return mdn.diagram.providers.MdnElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return mdn.diagram.providers.MdnElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return mdn.diagram.providers.MdnElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
