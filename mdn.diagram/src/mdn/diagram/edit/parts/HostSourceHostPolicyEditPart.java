/*
 * 
 */
package mdn.diagram.edit.parts;

import mdn.diagram.edit.policies.HostSourceHostPolicyItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class HostSourceHostPolicyEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public HostSourceHostPolicyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HostSourceHostPolicyItemSemanticEditPolicy());
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
		return new HostSourceHostPolicyFigure();
	}

	/**
	 * @generated
	 */
	public HostSourceHostPolicyFigure getPrimaryShape() {
		return (HostSourceHostPolicyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HostSourceHostPolicyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HostSourceHostPolicyFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
