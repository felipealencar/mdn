/*
 * 
 */
package mdn.diagram.providers;

import java.lang.ref.WeakReference;

import mdn.diagram.edit.parts.MdnEditPartFactory;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.part.MdnVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
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
