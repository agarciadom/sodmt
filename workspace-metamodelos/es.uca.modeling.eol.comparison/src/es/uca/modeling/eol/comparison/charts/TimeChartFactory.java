package es.uca.modeling.eol.comparison.charts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

public class TimeChartFactory {

	public static ChartComposite createChart(Composite parent) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	
		JFreeChart chart = ChartFactory.createLineChart(
				"Execution times", "Input size", "Time (s)",
				dataset,
				PlotOrientation.VERTICAL,
				true, true, false);
		
		return new ChartComposite(parent, SWT.NONE, chart, true);
	}

}
