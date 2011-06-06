package es.uca.modeling.eol.comparison.views;

import org.eclipse.swt.widgets.Composite;
import org.jfree.chart.JFreeChart;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * {@link ChartComposite} which always forces a redraw when {@link #setChart(JFreeChart)} is called.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class AutoRedrawChartComposite extends ChartComposite {

	public AutoRedrawChartComposite(Composite comp, int style) {
		super(comp, style);
	}

	@Override
	public void setChart(JFreeChart chart) {
		super.setChart(chart);
		if (chart != null) {
			this.forceRedraw();
		}
	}
}
