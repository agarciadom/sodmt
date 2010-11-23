package es.uca.modeling.eol.comparison.cases;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

/**
 * Case study for a sequential graph.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class SequenceCaseStudy implements ICaseStudy {

	private static final String RAW_TEXT_HEADER = "size new old\n";
	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private int fMinSize, fMaxSize;

	@Override
	public String getName() {
		return "Sequence";
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_MINSIZE, PARAM_MAXSIZE);
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		} else if (PARAM_MINSIZE.equals(name)) {
			return Integer.toString(fMinSize);
		} else return null;
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_MAXSIZE.equals(name)) {
				fMaxSize = Integer.valueOf(value);
			} else if (PARAM_MINSIZE.equals(name)) {
				fMinSize = Integer.valueOf(value);
			}
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	@Override
	public void run(IProgressMonitor monitor, CaseStudyResult result)
			throws IllegalArgumentException {

		validateConfiguration();

		final XYSeries newAlgoSeries = new XYSeries("new");
		final XYSeries oldAlgoSeries = new XYSeries("old");
		initResults(result, newAlgoSeries, oldAlgoSeries);

		monitor.beginTask("Comparing execution times", fMaxSize - fMinSize + 1);
		for (int size = fMinSize; size <= fMaxSize; ++size) {
			if (monitor.isCanceled()) {
				result.setSuccessful(false);
				return;
			}

			final double newTime = size * 1.5;
			final double oldTime = size * 2;

			addToSeries(newAlgoSeries, size, newTime);
			addToSeries(oldAlgoSeries, size, oldTime);
			updateRawText(result, size, newTime, oldTime);
			monitor.worked(1);
		}
		monitor.done();
		result.setSuccessful(true);
	}

	private void updateRawText(CaseStudyResult result, int size,
			final double newTime, final double oldTime) {
		result.setRawText(result.getRawText() + String.format("%d %g %g\n", size, newTime, oldTime));
	}

	private void validateConfiguration() {
		if (fMinSize > fMaxSize) {
			throw new IllegalArgumentException("minSize cannot be larger than maxSize: aborting");
		}
	}

	private void initResults(CaseStudyResult result,
			final XYSeries newAlgoSeries, final XYSeries oldAlgoSeries) {
		XYSeriesCollection collection = new XYSeriesCollection();
		collection.addSeries(oldAlgoSeries);
		collection.addSeries(newAlgoSeries);
		JFreeChart chart = ChartFactory.createXYLineChart(
				"Execution times", "Size", "Time (secs)", collection,
				PlotOrientation.VERTICAL, true, true, false);
		result.setRawText(RAW_TEXT_HEADER);
		result.setChart(chart);
	}

	/**
	 * Adds a value to a series. Ensures the addition is done in the SWT
	 * thread, so the chart is properly updated.
	 */
	private void addToSeries(final XYSeries series, final double x, final double y) {
		Display.getDefault().syncExec(new Runnable(){
			public void run() {
				series.add(x, y);
			}
		});
	}
}
