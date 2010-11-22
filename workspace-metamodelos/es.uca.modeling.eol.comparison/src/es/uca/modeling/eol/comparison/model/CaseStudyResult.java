package es.uca.modeling.eol.comparison.model;

import org.jfree.chart.JFreeChart;

/**
 * Results for a case study.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class CaseStudyResult {

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

	public String getRawText() {
		return fRawText;
	}

	public JFreeChart getChart() {
		return fChart;
	}

}
