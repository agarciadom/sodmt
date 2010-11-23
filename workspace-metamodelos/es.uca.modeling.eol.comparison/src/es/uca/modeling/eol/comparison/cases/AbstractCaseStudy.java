package es.uca.modeling.eol.comparison.cases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.swt.widgets.Display;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import serviceProcess.FlowNode;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

public abstract class AbstractCaseStudy implements ICaseStudy {

	private static final String RAWTEXT_FIELD_SEPARATOR = "; ";
	private static final String PARAM_GLOBALLIMIT = "globalLimit";
	private static final String PARAM_ITERATIONS = "iterationsPerSize";

	private int fIterations = 5;
	private double fGlobalLimit = 100;

	@Override
	public String getParameter(String name) {
		if (PARAM_GLOBALLIMIT.equals(name)) {
			return Double.toString(fGlobalLimit);
		} else if (PARAM_ITERATIONS.equals(name)) {
			return Integer.toString(fIterations);
		} else return null;
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_ITERATIONS, PARAM_GLOBALLIMIT);
	}

	@Override
	public void run(IProgressMonitor monitor, CaseStudyResult result) throws Exception {
		validateConfiguration();
		final InferenceAlgorithm oldAlgo = new InferenceAlgorithm(InferenceAlgorithm.OPERATION_OLD);
		final InferenceAlgorithm newAlgo = new InferenceAlgorithm(InferenceAlgorithm.OPERATION_NEW);
		final XYSeries newAlgoSeries = new XYSeries("Collapsed paths");
		final XYSeries oldAlgoSeries = new XYSeries("All paths");
		initXYLineChart(result, newAlgoSeries, oldAlgoSeries);

		List<EmfModel> models = buildModels();

		monitor.beginTask("Comparing execution times", models.size());
		for (EmfModel model : models) {
			if (monitor.isCanceled()) {
				result.setSuccessful(false);
				return;
			}

			// Build the model, which will be reused by both algorithms
			final int size = getModelSize(model);
			final Map<String, Double> annotationsOld
				= oldAlgo.timeAndRun(fIterations, model, fGlobalLimit, getStartNode(model));
			final Map<String, Double> annotationsNew
				= newAlgo.timeAndRun(fIterations, model, fGlobalLimit, getEndNodes(model));

			// If the results are not the same, the algorithms are not comparable
			model.dispose();
			checkResultsMatch(annotationsNew, annotationsOld);

			// Update the current results
			addToSeries(newAlgoSeries, size, newAlgo.getAverageTime());
			addToSeries(oldAlgoSeries, size, oldAlgo.getAverageTime());
			updateRawText(result, size, newAlgo.getAverageTime(), oldAlgo.getAverageTime());
			monitor.worked(1);
		}
		monitor.done();
		result.setSuccessful(true);
	}

	@Override
	public void setParameter(String name, String value) throws IllegalArgumentException {
		try {
			if (PARAM_GLOBALLIMIT.equals(name)) {
				fGlobalLimit = Double.valueOf(value);
			} else if (PARAM_ITERATIONS.equals(name)) {
				fIterations = Integer.valueOf(value);
			} else {
				throw new IllegalArgumentException("Unknown parameter: " + name);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected abstract List<EmfModel> buildModels()
		throws EolModelLoadingException,
			EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException;

	protected void validateConfiguration() {
		if (fGlobalLimit <= 0) {
			throw new IllegalArgumentException(PARAM_GLOBALLIMIT + " must be greater than 0");
		}
		if (fIterations <= 0) {
			throw new IllegalArgumentException(PARAM_ITERATIONS + " must be greater than 0");
		}
	}

	/**
	 * Adds a value to a series. Ensures the addition is done in the SWT thread,
	 * so the chart is properly updated.
	 */
	private void addToSeries(final XYSeries series, final double x,
			final double y) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				series.add(x, y);
			}
		});
	}

	private boolean approximatelyEqual(double x, double y, double relativeError) {
		final double max = Math.max(x, y);
		return Math.abs((x - y) / max) <= relativeError;
	}

	private void checkResultsMatch(final Map<String, Double> resultsNew,
			final Map<String, Double> resultsOld) {
		boolean bEqual = resultsNew.size() == resultsOld.size();

		if (bEqual) {
			for (String key : resultsOld.keySet()) {
				if (!resultsNew.containsKey(key)
						|| !approximatelyEqual(resultsOld.get(key),
								resultsNew.get(key), 0.001)) {
					bEqual = false;
					break;
				}
			}
		}

		if (!bEqual) {
			throw new IllegalStateException(
					"Results from the old and the new algorithm do not match."
							+ "\nOld algorithm: " + resultsOld.toString()
							+ "\nNew algorithm: " + resultsNew.toString());
		}
	}

	private List<EObject> getEndNodes(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> flowNodes = model.getAllOfKind("FlowNode");
		List<EObject> endNodes = new ArrayList<EObject>();
		for (EObject o : flowNodes) {
			final FlowNode node = (FlowNode) o;
			if (node.getOutgoing().isEmpty()) {
				endNodes.add(node);
			}
		}
		return endNodes;
	}

	private int getModelSize(EmfModel model) throws EolModelElementTypeNotFoundException {
		return model.getAllOfKind("ServiceActivity").size();
	}

	private FlowNode getStartNode(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> flowNodes = model.getAllOfKind("FlowNode");
		FlowNode startNode = null;
		for (EObject o : flowNodes) {
			final FlowNode node = (FlowNode) o;
			if (node.getIncoming().isEmpty()) {
				startNode = node;
			}
		}
		return startNode;
	}

	private void initXYLineChart(CaseStudyResult result, final XYSeries... allSeries) {
		XYSeriesCollection collection = new XYSeriesCollection();
		StringBuilder headerBuilder = new StringBuilder();
		headerBuilder.append("size");
		for (XYSeries series : allSeries) {
			collection.addSeries(series);
			headerBuilder.append(RAWTEXT_FIELD_SEPARATOR);
			headerBuilder.append(series.getKey());
		}
		headerBuilder.append('\n');

		JFreeChart chart = ChartFactory.createXYLineChart(
				"Average execution times for case " + getName(),
				"Size (number of ServiceActivities)", "Time (secs)", collection,
				PlotOrientation.VERTICAL, true, true, false);
		chart.addSubtitle(new ShortTextTitle(
				"Using " + fIterations + " samples, " +
				"with global limit = " + fGlobalLimit));
		result.setRawText(headerBuilder.toString());
		result.setChart(chart);
	}

	private void updateRawText(CaseStudyResult result, int size,
			final double newTime, final double oldTime) {
		result.setRawText(result.getRawText()
				+ String.format("%d%s%g%s%g\n", size,
						RAWTEXT_FIELD_SEPARATOR, newTime,
						RAWTEXT_FIELD_SEPARATOR, oldTime));
	}

}