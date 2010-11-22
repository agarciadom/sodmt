package es.uca.modeling.eol.comparison.model;

/**
 * Proxy wrapper for a configuration parameter of a {@link ICaseStudy}.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class ParameterProxy {

	private ICaseStudy fCaseStudy;
	private String fParameterName;

	public ParameterProxy(ICaseStudy iCaseStudy, String name) {
		this.fCaseStudy = iCaseStudy;
		this.fParameterName = name;
	}

	public ICaseStudy getCaseStudy() {
		return fCaseStudy;
	}

	public String getParameterName() {
		return fParameterName;
	}

	public String getParameterValue() {
		return fCaseStudy.getParameter(fParameterName);
	}

	public void setParameterValue(String value) throws IllegalArgumentException {
		fCaseStudy.setParameter(fParameterName, value);
	}
}
