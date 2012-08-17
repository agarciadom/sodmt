/*
 * 
 */
package serviceComposition.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ServiceCompositionNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) {
			serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem item = (serviceComposition.diagram.navigator.ServiceCompositionNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return serviceComposition.diagram.part.ServiceCompositionVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
