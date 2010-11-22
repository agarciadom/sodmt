package es.uca.modeling.eol.comparison.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

	public CaseStudyConfigurationModel(CaseStudyRegistry reg) {
		fRegistry = reg;
		fCaseName = fRegistry.get(fRegistry.list().iterator().next()).getName();
	}

	public Collection<String> getCaseStudies() {
		return fRegistry.list();
	}

	public String getCaseStudyName() {
		return fCaseName;
	}

	public void setCaseStudyName(String caseName) {
		// Note about evaluation order: this is OK according to JLS, 15.7.4
		firePropertyChange(PROPEV_NAME, fCaseName, fCaseName = caseName);
	}

	public ICaseStudy getCaseStudy() {
		return fRegistry.get(fCaseName);
	}

	public List<ParameterProxy> getParameters() {
		List<ParameterProxy> proxies = new ArrayList<ParameterProxy>();
		final ICaseStudy currentCase = getCaseStudy();
		for (String name : currentCase.getParameterNames()) {
			proxies.add(new ParameterProxy(currentCase, name));
		}
		return proxies;
	}

	public ParameterProxy getParameter(String name) {
		return new ParameterProxy(getCaseStudy(), name);
	}

	public void setParameter(String name, String value) {
		getCaseStudy().setParameter(name, value);
	}

}
