/*
 * 
 */
package serviceProcess.diagram.providers;

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
		ElementInitializers cached = serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
