package es.uca.modeling.eol.comparison.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Model bean for selecting and configuring a case study.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class CaseStudyConfigurationModel extends AbstractModel {

	public static final String PROPEV_NAME = "name";
	private CaseStudyRegistry fRegistry;
	private String fCaseName = "";
	private Map<String, String> fCaseParams = new HashMap<String, String>();

	public CaseStudyConfigurationModel(CaseStudyRegistry reg) {
		fRegistry = reg;
		fCaseName = fRegistry.get(fRegistry.list().iterator().next()).getName();
		updateParameterMap();
	}

	public Collection<String> getCaseStudies() {
		return fRegistry.list();
	}

	public String getCaseStudyName() {
		return fCaseName;
	}

	public void setCaseStudyName(String caseName) {
		final String old = fCaseName;
		fCaseName = caseName;
		updateParameterMap();

		// Note about evaluation order: this is OK according to JLS, 15.7.4
		firePropertyChange(PROPEV_NAME, old, fCaseName);
	}

	public Map<String, String> getParameters() {
		return fCaseParams;
	}

	public String getParameter(String name) {
		return fCaseParams.get(name);
	}

	public void setParameter(String name, String value) {
		final String old = fCaseParams.put(name, value);
		firePropertyChange("param_" + name, old, value);
	}

	private void updateParameterMap() {
		fCaseParams.clear();
		for (String name : fRegistry.get(fCaseName).getParameterNames()) {
			fCaseParams.put(name, "");
		}
	}

}
