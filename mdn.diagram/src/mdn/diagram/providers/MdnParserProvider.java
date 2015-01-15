/*
 * 
 */
package mdn.diagram.providers;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.ActionTypeEditPart;
import mdn.diagram.edit.parts.ConditionConditionEditPart;
import mdn.diagram.edit.parts.ControllerNameEditPart;
import mdn.diagram.edit.parts.HostNameEditPart;
import mdn.diagram.edit.parts.PacketHeaderOperatorHeaderValueEditPart;
import mdn.diagram.edit.parts.PolicyNameEditPart;
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
	private IParser actionType_5011Parser;

	/**
	 * @generated
	 */
	private IParser getActionType_5011Parser() {
		if (actionType_5011Parser == null) {
			EAttribute editableFeature = MdnPackage.eINSTANCE.getAction_Type();
			EnumParser parser = new EnumParser(editableFeature);
			actionType_5011Parser = parser;
		}
		return actionType_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionCondition_5010Parser;

	/**
	 * @generated
	 */
	private IParser getConditionCondition_5010Parser() {
		if (conditionCondition_5010Parser == null) {
			EAttribute editableFeature = MdnPackage.eINSTANCE
					.getCondition_Condition();
			EnumParser parser = new EnumParser(editableFeature);
			conditionCondition_5010Parser = parser;
		}
		return conditionCondition_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser trafficOperatorUnitValue_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTrafficOperatorUnitValue_5007Parser() {
		if (trafficOperatorUnitValue_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getTraffic_Operator(),
					MdnPackage.eINSTANCE.getTraffic_Unit(),
					MdnPackage.eINSTANCE.getTraffic_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {2}{1}"); //$NON-NLS-1$
			trafficOperatorUnitValue_5007Parser = parser;
		}
		return trafficOperatorUnitValue_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeOperatorBeginDateEndDate_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTimeOperatorBeginDateEndDate_5008Parser() {
		if (timeOperatorBeginDateEndDate_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getTime_Operator(),
					MdnPackage.eINSTANCE.getTime_BeginDate(),
					MdnPackage.eINSTANCE.getTime_EndDate() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			timeOperatorBeginDateEndDate_5008Parser = parser;
		}
		return timeOperatorBeginDateEndDate_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser packetHeaderOperatorHeaderValue_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPacketHeaderOperatorHeaderValue_5009Parser() {
		if (packetHeaderOperatorHeaderValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MdnPackage.eINSTANCE.getPacketHeader_Operator(),
					MdnPackage.eINSTANCE.getPacketHeader_Header(),
					MdnPackage.eINSTANCE.getPacketHeader_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: [{1}]{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: [{1}]{2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: [{1}]{2}"); //$NON-NLS-1$
			packetHeaderOperatorHeaderValue_5009Parser = parser;
		}
		return packetHeaderOperatorHeaderValue_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser policyName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPolicyName_5004Parser() {
		if (policyName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MdnPackage.eINSTANCE
					.getPolicy_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			policyName_5004Parser = parser;
		}
		return policyName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5001Parser();
		case HostNameEditPart.VISUAL_ID:
			return getHostName_5002Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5003Parser();

		case ActionTypeEditPart.VISUAL_ID:
			return getActionType_5011Parser();

		case ConditionConditionEditPart.VISUAL_ID:
			return getConditionCondition_5010Parser();
		case TrafficOperatorUnitValueEditPart.VISUAL_ID:
			return getTrafficOperatorUnitValue_5007Parser();
		case TimeOperatorBeginDateEndDatEditPart.VISUAL_ID:
			return getTimeOperatorBeginDateEndDate_5008Parser();
		case PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID:
			return getPacketHeaderOperatorHeaderValue_5009Parser();
		case PolicyNameEditPart.VISUAL_ID:
			return getPolicyName_5004Parser();
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
