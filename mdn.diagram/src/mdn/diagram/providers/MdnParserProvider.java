/*
 * 
 */
package mdn.diagram.providers;

import mdn.MdnPackage;
import mdn.diagram.edit.parts.ControllerNameEditPart;
import mdn.diagram.edit.parts.HostNameEditPart;
import mdn.diagram.edit.parts.SwitchNameEditPart;
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
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5001Parser();
		case HostNameEditPart.VISUAL_ID:
			return getHostName_5002Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5003Parser();
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
