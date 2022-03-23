/*
 * 
 */
package serviceComposition.diagram.providers;

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
		ElementInitializers cached = serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
