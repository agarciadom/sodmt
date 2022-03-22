package es.uca.modeling.eol.comparison.model;

import org.jfree.chart.JFreeChart;

/**
 * Results for a case study.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class CaseStudyResult extends AbstractModel {

	private boolean fSuccessful = false;
	private String fRawText = "";
	private JFreeChart fChart = null;

	public CaseStudyResult(boolean bSuccess, String text, JFreeChart chart) {
		fSuccessful = bSuccess;
		fRawText = text;
		fChart = chart;
	}

	public boolean isSuccessful() {
		return fSuccessful;
	}

	public void setSuccessful(boolean newValue) {
		firePropertyChange("successful", fSuccessful, fSuccessful = newValue);
	}

	public String getRawText() {
		return fRawText;
	}

	public void setRawText(String newValue) {
		firePropertyChange("rawText", fRawText, fRawText = newValue);
	}

	public JFreeChart getChart() {
		return fChart;
	}

	public void setChart(JFreeChart newValue) {
		firePropertyChange("chart", fChart, fChart = newValue);
	}
}
