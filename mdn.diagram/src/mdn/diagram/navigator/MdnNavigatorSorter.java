/*
 * 
 */
package mdn.diagram.navigator;

import mdn.diagram.part.MdnVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MdnNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4018;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4017;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MdnNavigatorItem) {
			MdnNavigatorItem item = (MdnNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MdnVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
