/*
 * 
 */
package serviceProcess.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ServiceProcessNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4010;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4009;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) {
			serviceProcess.diagram.navigator.ServiceProcessNavigatorItem item = (serviceProcess.diagram.navigator.ServiceProcessNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return serviceProcess.diagram.part.ServiceProcessVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
