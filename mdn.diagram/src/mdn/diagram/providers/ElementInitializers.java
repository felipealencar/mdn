/*
 * 
 */
package mdn.diagram.providers;

import mdn.diagram.part.MdnDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MdnDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MdnDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
