/*
 * 
 */
package serviceComposition.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		serviceComposition.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		serviceComposition.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		serviceComposition.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		serviceComposition.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		serviceComposition.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return serviceComposition.diagram.part.ServiceCompositionDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
