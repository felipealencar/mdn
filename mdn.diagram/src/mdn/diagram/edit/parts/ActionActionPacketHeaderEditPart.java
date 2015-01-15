/*
 * 
 */
package mdn.diagram.edit.parts;

import mdn.diagram.edit.policies.ActionActionPacketHeaderItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ActionActionPacketHeaderEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public ActionActionPacketHeaderEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActionActionPacketHeaderItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ActionActionPacketHeaderFigure();
	}

	/**
	 * @generated
	 */
	public ActionActionPacketHeaderFigure getPrimaryShape() {
		return (ActionActionPacketHeaderFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ActionActionPacketHeaderFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ActionActionPacketHeaderFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
