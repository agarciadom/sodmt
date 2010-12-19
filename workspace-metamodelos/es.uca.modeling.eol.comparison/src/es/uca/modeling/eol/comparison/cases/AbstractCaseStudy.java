package es.uca.modeling.eol.comparison.cases;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
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

import serviceProcess.ActivityPerformanceAnnotation;
import serviceProcess.FlowNode;
import serviceProcess.ProcessControlFlow;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessPackage;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

public abstract class AbstractCaseStudy implements ICaseStudy {

	private static final String RAWTEXT_FIELD_SEPARATOR = "; ";
	private static final String PARAM_GLOBALLIMIT = "globalLimit";
	private static final String PARAM_ITERATIONS = "iterationsPerSize";
	private static final String PARAM_PERCENTAGE_MANUAL = "percentageManual";
	private static final String PARAM_MAX_WEIGHT = "maxManualWeight";
	private static final String PARAM_RANDOM_SEED = "randomSeed";

	private int fIterations = 5;
	private int fPercentageManual = 20;
	private int fRandomSeed = 0;
	private double fMaxWeight = 10;
	private double fGlobalLimit = 100;

	@Override
	public String getParameter(String name) {
		if (PARAM_GLOBALLIMIT.equals(name)) {
			return Double.toString(fGlobalLimit);
		} else if (PARAM_ITERATIONS.equals(name)) {
			return Integer.toString(fIterations);
		} else if (PARAM_PERCENTAGE_MANUAL.equals(name)) {
			return Integer.toString(fPercentageManual);
		} else if (PARAM_MAX_WEIGHT.equals(name)) {
			return Double.toString(fMaxWeight);
		} else if (PARAM_RANDOM_SEED.equals(name)) {
			return Integer.toString(fRandomSeed);
		} else return null;
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_GLOBALLIMIT, PARAM_ITERATIONS, PARAM_MAX_WEIGHT, PARAM_PERCENTAGE_MANUAL, PARAM_RANDOM_SEED);
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
			try {
				if (monitor.isCanceled()) {
					result.setSuccessful(false);
					return;
				}

				// Build the model, which will be reused by both algorithms
				final FlowNode startNode = getStartNode(model);
				final List<EObject> endNodes = getEndNodes(model);
				long totalOld = 0, totalNew = 0;
				final Random rnd = new Random(fRandomSeed);
				for (int i = 0; i < fIterations; ++i) {
					addRandomManualAnnotations(model, rnd);

					totalOld += oldAlgo.runAndTimeMillis(model, fGlobalLimit, startNode);
					final Map<String, Double> annotationsOld = computeAnnotationMap(model);

					totalNew += newAlgo.runAndTimeMillis(model, fGlobalLimit, endNodes);
					final Map<String, Double> annotationsNew = computeAnnotationMap(model);

					// If the results are not the same, the algorithms are not comparable
					checkResultsMatch(annotationsNew, annotationsOld);
				}
				final double averageTimeNew = totalNew/(fIterations*1000.0d);
				final double averageTimeOld = totalOld/(fIterations*1000.0d);

				// Update the current results
				final int size = getModelSize(model);
				addToSeries(newAlgoSeries, size, averageTimeNew);
				addToSeries(oldAlgoSeries, size, averageTimeOld);
				updateRawText(result, size, averageTimeNew, averageTimeOld);
				monitor.worked(1);
			} finally {
				model.dispose();
			}
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
			} else if (PARAM_PERCENTAGE_MANUAL.equals(name)) {
				fPercentageManual = Integer.valueOf(value);
			} else if (PARAM_MAX_WEIGHT.equals(name)) {
				fMaxWeight = Double.valueOf(value);
			} else if (PARAM_RANDOM_SEED.equals(name)) {
				fRandomSeed = Integer.valueOf(value);
			} else {
				throw new IllegalArgumentException("Unknown parameter: " + name);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected void configureRandomManualAnnotations(
			EmfModel model, Random rnd,
			Map<String, ActivityPerformanceAnnotation> annotationMap,
			final double globalLimit, final double maxWeight) {
		// TODO: generate weights
		double available = globalLimit;
		for (ActivityPerformanceAnnotation ann : annotationMap.values()) {
			final double timeLimit = rnd.nextDouble() * available;
			ann.setSecsTimeLimit(timeLimit);
			ann.setWeight(rnd.nextDouble()*maxWeight);
			available -= timeLimit;
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

	protected static EmfModel createModel(final String basename)
			throws EolModelLoadingException {
		EmfModel model = EmfModelFactory.getInstance().createEmfModel("",
				new File(basename + ".model"), ServiceProcessPackage.eINSTANCE);
		model.setReadOnLoad(false);
		model.setStoredOnDisposal(false);
		model.load();
		return model;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static FlowNode addNode(EmfModel model, final EList nodes, String type)
			throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		final FlowNode node = (FlowNode) model.createInstance(type);
		nodes.add(node);
		return node;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static void addEdge(EmfModel model, final EList edges,
			FlowNode source, final FlowNode target)
			throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		final ProcessControlFlow edge = (ProcessControlFlow) model
				.createInstance("ProcessControlFlow");
		edge.setSource(source);
		edge.setTarget(target);
		edges.add(edge);
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

	private Map<String, Double> computeAnnotationMap(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		final Map<String, Double> mapResults = new HashMap<String, Double>();
		for (EObject o : model.getAllOfKind("ServiceActivity")) {
			ServiceActivity node = (ServiceActivity) o;
			if (node.getAnnotation() != null) {
				mapResults.put(node.getName(), node.getAnnotation()
						.getSecsTimeLimit());
			}
		}
		return mapResults;
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


	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addRandomManualAnnotations(EmfModel model, Random rnd) throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {
		// Remove all manual annotations
		final List<EObject> manualAnnotations = new ArrayList<EObject>(model.getAllOfType("ActivityPerformanceAnnotation"));
		for (EObject o : manualAnnotations) {
			model.deleteElement(o);
		}

		// Select the service activities to be annotated at random
		final List<EObject> shuffledNodes = new ArrayList<EObject>(model.getAllOfKind("ServiceActivity"));
		Collections.shuffle(shuffledNodes, rnd);
		final long nShuffled = Math.round(shuffledNodes.size() / 100.0d * fPercentageManual);
		final List<EObject> annotatedNodes = shuffledNodes.subList(0, (int)nShuffled);

		// Create their manual annotations
		final ServiceProcess process = (ServiceProcess)model.getAllOfKind("ServiceProcess").iterator().next();
		final EList annotations = process.getActivityPerformance();
		final Map<String, ActivityPerformanceAnnotation> annotationMap
			= new HashMap<String, ActivityPerformanceAnnotation>();
		for (EObject node : annotatedNodes) {
			final ServiceActivity activity = (ServiceActivity)node;

			ActivityPerformanceAnnotation ann
				= (ActivityPerformanceAnnotation)model.createInstance("ActivityPerformanceAnnotation");
			ann.setManuallyAdded(true);
			ann.setExecNode(activity);
			annotations.add(ann);
			annotationMap.put(activity.getName(), ann);
		}

		// Hand annotations to method in the subclass
		configureRandomManualAnnotations(model, rnd, annotationMap, fGlobalLimit, fMaxWeight);
	}

}