/*
 * 
 */
package mdn.diagram.providers;

import mdn.diagram.edit.parts.MdnEditPartFactory;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.part.MdnVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class MdnEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MdnEditPartProvider() {
		super(new MdnEditPartFactory(), MdnVisualIDRegistry.TYPED_INSTANCE,
				SdnEditPart.MODEL_ID);
	}

}
