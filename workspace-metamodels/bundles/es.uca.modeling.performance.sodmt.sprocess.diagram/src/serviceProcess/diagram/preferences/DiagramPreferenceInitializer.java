/*
 * 
 */
package serviceProcess.diagram.preferences;

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
		serviceProcess.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		serviceProcess.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		serviceProcess.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		serviceProcess.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		serviceProcess.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return serviceProcess.diagram.part.ServiceProcessDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
