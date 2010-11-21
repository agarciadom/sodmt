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
		dataset.addValue(1, "A", "a");
		dataset.addValue(2, "A", "b");
		dataset.addValue(3, "A", "c");
	
		dataset.addValue(4, "B", "a");
		dataset.addValue(5, "B", "b");
		dataset.addValue(6, "B", "c");
	
		dataset.addValue(7, "C", "a");
		dataset.addValue(8, "C", "b");
		dataset.addValue(9, "C", "c");
	
		JFreeChart chart = ChartFactory.createLineChart(
				"Execution times", "Input size", "Time (s)",
				dataset,
				PlotOrientation.VERTICAL,
				true, true, false);
		
		return new ChartComposite(parent, SWT.NONE, chart, true);
	}

}
