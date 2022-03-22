package es.uca.modeling.eol.comparison.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;

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
	private CaseStudyResult fLastResult;

	public CaseStudyConfigurationModel(CaseStudyRegistry reg) {
		fRegistry = reg;
		fCaseName = fRegistry.get(fRegistry.list().iterator().next()).getName();
		fLastResult = new CaseStudyResult(true, "", createEmptyChart());
	}

	/* CASE STUDIES */

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

	/* PARAMETERS FOR THE CURRENT CASE STUDY */

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

	/* RESULTS */

	public void setLastResult(CaseStudyResult res) {
		firePropertyChange("lastResult", fLastResult, this.fLastResult = res);
	}

	public CaseStudyResult getLastResult() {
		return fLastResult;
	}

	/* UTILITY METHODS */

	private JFreeChart createEmptyChart() {
		XYSeriesCollection coll = new XYSeriesCollection();
		return ChartFactory.createXYLineChart(
			"Execution times", "Size", "Time (secs)", coll,
			PlotOrientation.VERTICAL, true, true, false);
	}

}
