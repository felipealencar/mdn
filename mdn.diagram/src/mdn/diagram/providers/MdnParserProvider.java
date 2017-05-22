/*
 * 
 */
package mdn.diagram.providers;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.AppMonitorNameEditPart;
import mdn.diagram.edit.parts.AppNameEditPart;
import mdn.diagram.edit.parts.ConditionConditionEditPart;
import mdn.diagram.edit.parts.ControllerNameEditPart;
import mdn.diagram.edit.parts.GroupNameEditPart;
import mdn.diagram.edit.parts.HostName2EditPart;
import mdn.diagram.edit.parts.HostNameEditPart;
import mdn.diagram.edit.parts.OpenFlowSwitchNameEditPart;
import mdn.diagram.edit.parts.PacketHeaderOperatorHeaderValueEditPart;
import mdn.diagram.edit.parts.RuleNameEditPart;
import mdn.diagram.edit.parts.SwitchNameEditPart;
import mdn.diagram.edit.parts.TimeOperatorBeginDateEndDatEditPart;
import mdn.diagram.edit.parts.TrafficOperatorUnitValueEditPart;
import mdn.diagram.parsers.MessageFormatParser;
import mdn.diagram.part.MdnVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class MdnParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser openFlowSwitchName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getOpenFlowSwitchName_5023Parser() {
		if (openFlowSwitchName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			openFlowSwitchName_5023Parser = parser;
		}
		return openFlowSwitchName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser controllerName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5001Parser() {
		if (controllerName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controllerName_5001Parser = parser;
		}
		return controllerName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser hostName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getHostName_5002Parser() {
		if (hostName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hostName_5002Parser = parser;
		}
		return hostName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser switchName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSwitchName_5003Parser() {
		if (switchName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5003Parser = parser;
		}
		return switchName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser appMonitorName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAppMonitorName_5020Parser() {
		if (appMonitorName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getApp_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appMonitorName_5020Parser = parser;
		}
		return appMonitorName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser ruleName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getRuleName_5022Parser() {
		if (ruleName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getAppObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ruleName_5022Parser = parser;
		}
		return ruleName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionCondition_5013Parser;

	/**
	 * @generated
	 */
	private IParser getConditionCondition_5013Parser() {
		if (conditionCondition_5013Parser == null) {
			EAttribute editableFeature = MdnPackage.eINSTANCE
					.getCondition_Condition();
			EnumParser parser = new EnumParser(editableFeature);
			conditionCondition_5013Parser = parser;
		}
		return conditionCondition_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser trafficOperatorUnitValue_5014Parser;

	/**
	 * @generated
	 */
	private IParser getTrafficOperatorUnitValue_5014Parser() {
		if (trafficOperatorUnitValue_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getTraffic_Operator(),
					MdnPackage.eINSTANCE.getTraffic_Unit(),
					MdnPackage.eINSTANCE.getTraffic_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {2}{1}"); //$NON-NLS-1$
			trafficOperatorUnitValue_5014Parser = parser;
		}
		return trafficOperatorUnitValue_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeOperatorBeginDateEndDate_5015Parser;

	/**
	 * @generated
	 */
	private IParser getTimeOperatorBeginDateEndDate_5015Parser() {
		if (timeOperatorBeginDateEndDate_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getTime_Operator(),
					MdnPackage.eINSTANCE.getTime_BeginDate(),
					MdnPackage.eINSTANCE.getTime_EndDate() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			timeOperatorBeginDateEndDate_5015Parser = parser;
		}
		return timeOperatorBeginDateEndDate_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser packetHeaderOperatorHeaderValue_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPacketHeaderOperatorHeaderValue_5016Parser() {
		if (packetHeaderOperatorHeaderValue_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getPacketHeader_Operator(),
					MdnPackage.eINSTANCE.getPacketHeader_Header(),
					MdnPackage.eINSTANCE.getPacketHeader_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			packetHeaderOperatorHeaderValue_5016Parser = parser;
		}
		return packetHeaderOperatorHeaderValue_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser appName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getAppName_5021Parser() {
		if (appName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getApp_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appName_5021Parser = parser;
		}
		return appName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getGroupName_5019Parser() {
		if (groupName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getGroup_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5019Parser = parser;
		}
		return groupName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser hostName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getHostName_5018Parser() {
		if (hostName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hostName_5018Parser = parser;
		}
		return hostName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case OpenFlowSwitchNameEditPart.VISUAL_ID:
			return getOpenFlowSwitchName_5023Parser();
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5001Parser();
		case HostNameEditPart.VISUAL_ID:
			return getHostName_5002Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5003Parser();
		case AppMonitorNameEditPart.VISUAL_ID:
			return getAppMonitorName_5020Parser();
		case RuleNameEditPart.VISUAL_ID:
			return getRuleName_5022Parser();

		case ConditionConditionEditPart.VISUAL_ID:
			return getConditionCondition_5013Parser();
		case TrafficOperatorUnitValueEditPart.VISUAL_ID:
			return getTrafficOperatorUnitValue_5014Parser();
		case TimeOperatorBeginDateEndDatEditPart.VISUAL_ID:
			return getTimeOperatorBeginDateEndDate_5015Parser();
		case PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID:
			return getPacketHeaderOperatorHeaderValue_5016Parser();
		case AppNameEditPart.VISUAL_ID:
			return getAppName_5021Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5019Parser();
		case HostName2EditPart.VISUAL_ID:
			return getHostName_5018Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MdnVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MdnVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MdnElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
