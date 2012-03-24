package es.uca.modeling.eol.comparison.cases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.swt.widgets.Display;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.title.ShortTextTitle;
import org.jfree.data.statistics.BoxAndWhiskerCalculator;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;

import serviceProcess.ActivityPerformanceAnnotation;
import serviceProcess.ControlFlow;
import serviceProcess.DecisionNode;
import serviceProcess.FlowEdge;
import serviceProcess.FlowNode;
import serviceProcess.ProcessControlFlow;
import serviceProcess.ProcessPerformanceAnnotation;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessPackage;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

public abstract class AbstractCaseStudy implements ICaseStudy {

	private static final int NANOS_TO_SECONDS = 1000000000;
	private static final String RAWTEXT_FIELD_SEPARATOR = "; ";
	private static final String PARAM_GLOBAL_TIMELIMIT = "globalLimit";
	private static final String PARAM_GLOBAL_THROUGHPUT = "globalThroughput";
	private static final String PARAM_ITERATIONS = "iterationsPerSize";
	private static final String PARAM_PERCENTAGE_MANUAL = "percentageManual";
	private static final String PARAM_MAX_WEIGHT = "maxManualWeight";
	private static final String PARAM_RANDOM_SEED = "randomSeed";
	private static final String PARAM_OLD_ENABLED = "enableOldTime";
	private static final String PARAM_THROUGHPUT_ENABLED = "enableThroughput";

	private int fIterations = 5;
	private int fPercentageManual = 20;
	private int fRandomSeed = 0;
	private double fMaxWeight = 10;
	private double fGlobalLimit = 100;
	private double fGlobalThroughput = 10;
	private boolean fOldTimeAlgoEnabled = true;
	private boolean fThroughputAlgoEnabled = true;

	@Override
	public String getParameter(String name) {
		if (PARAM_GLOBAL_TIMELIMIT.equals(name)) {
			return Double.toString(fGlobalLimit);
		} else if (PARAM_GLOBAL_THROUGHPUT.equals(name)) {
			return Double.toString(fGlobalThroughput);
		} else if (PARAM_ITERATIONS.equals(name)) {
			return Integer.toString(fIterations);
		} else if (PARAM_PERCENTAGE_MANUAL.equals(name)) {
			return Integer.toString(fPercentageManual);
		} else if (PARAM_MAX_WEIGHT.equals(name)) {
			return Double.toString(fMaxWeight);
		} else if (PARAM_RANDOM_SEED.equals(name)) {
			return Integer.toString(fRandomSeed);
		} else if (PARAM_OLD_ENABLED.equals(name)) {
			return Boolean.toString(fOldTimeAlgoEnabled);
		} else if (PARAM_THROUGHPUT_ENABLED.equals(name)) {
			return Boolean.toString(fThroughputAlgoEnabled);
		} else return null;
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_OLD_ENABLED, PARAM_THROUGHPUT_ENABLED, PARAM_GLOBAL_TIMELIMIT, PARAM_GLOBAL_THROUGHPUT, PARAM_ITERATIONS, PARAM_MAX_WEIGHT, PARAM_PERCENTAGE_MANUAL, PARAM_RANDOM_SEED);
	}

	@Override
	public void run(IProgressMonitor monitor, CaseStudyResult result) throws Exception {
		validateConfiguration();
		final InferenceAlgorithm oldAlgo = new InferenceAlgorithm(InferenceAlgorithm.OPERATION_OLD);
		final InferenceAlgorithm newAlgo = new InferenceAlgorithm(InferenceAlgorithm.OPERATION_NEW);
		final InferenceAlgorithm throughputAlgo = new InferenceAlgorithm(InferenceAlgorithm.OPERATION_THROUGHPUT);
		final YIntervalSeries
			seriesNew = new YIntervalSeries("Incremental"),
			seriesOld = new YIntervalSeries("Exhaustive"),
			seriesThroughput = new YIntervalSeries("Throughput");
		initXYLineChart(result, seriesNew, seriesOld, seriesThroughput);

		final Random rnd = new Random(fRandomSeed);
		List<EmfModel> models = buildModels();

		monitor.beginTask("Comparing execution times", models.size());
		for (EmfModel model : models) {
			try {
				if (monitor.isCanceled()) {
					result.setSuccessful(false);
					return;
				}

				addGlobalPerformanceConstraint(model);
				normalizeProbabilities(model);

				final FlowNode startNode = getStartNode(model);
				final List<EObject> endNodes = getEndNodes(model);
				final List<Long> lOldNanos = new ArrayList<Long>();
				final List<Long> lNewNanos = new ArrayList<Long>();
				final List<Long> lThroughputNanos = new ArrayList<Long>();

				for (int i = 0; i < fIterations; ++i) {
					addRandomManualAnnotations(model, rnd);

					final long throughputNanos =
							fThroughputAlgoEnabled
								? throughputAlgo.runAndTimeNanos(model, startNode)
								: 0;

					long oldNanos = 0;
					Map<String, Double> annotationsOld = null;
					if (fOldTimeAlgoEnabled) {
						oldNanos = oldAlgo.runAndTimeNanos(model, fGlobalLimit, startNode);
						annotationsOld = computeAnnotationMap(model);
					}

					final long newNanos = newAlgo.runAndTimeNanos(model, fGlobalLimit, endNodes);
					final Map<String, Double> annotationsNew = computeAnnotationMap(model);
					if (fOldTimeAlgoEnabled) {
						// If the results are not the same, the algorithms are not comparable
						checkResultsMatch(annotationsNew, annotationsOld);
					}

					lOldNanos.add(oldNanos);
					lNewNanos.add(newNanos);
					lThroughputNanos.add(throughputNanos);
				}

				// Update the current results
				final int size = getModelSize(model);
				final BoxAndWhiskerItem newStats
					= BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(lNewNanos);
				final BoxAndWhiskerItem oldStats
					= BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(lOldNanos);
				final BoxAndWhiskerItem throughputStats
					= BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(lThroughputNanos);
				addToSeries(seriesNew, size, newStats);
				addToSeries(seriesOld, size, oldStats);
				addToSeries(seriesThroughput, size, throughputStats);
				updateRawText(result, size, newStats, oldStats, throughputStats);
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
			if (PARAM_GLOBAL_TIMELIMIT.equals(name)) {
				fGlobalLimit = Double.valueOf(value);
			} else if (PARAM_GLOBAL_THROUGHPUT.equals(name)) {
				fGlobalThroughput = Double.valueOf(value);
			} else if (PARAM_ITERATIONS.equals(name)) {
				fIterations = Integer.valueOf(value);
			} else if (PARAM_PERCENTAGE_MANUAL.equals(name)) {
				fPercentageManual = Integer.valueOf(value);
			} else if (PARAM_MAX_WEIGHT.equals(name)) {
				fMaxWeight = Double.valueOf(value);
			} else if (PARAM_RANDOM_SEED.equals(name)) {
				fRandomSeed = Integer.valueOf(value);
			} else if (PARAM_OLD_ENABLED.equals(name)) {
				fOldTimeAlgoEnabled = Boolean.valueOf(value);
			} else if (PARAM_THROUGHPUT_ENABLED.equals(name)) {
				fThroughputAlgoEnabled = Boolean.valueOf(value);
			} else {
				throw new IllegalArgumentException("Unknown parameter: " + name);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@Override
	public String getDecoratedName() {
		return getName();
	}

	protected void configureRandomManualAnnotations(
			EmfModel model, Random rnd,
			Map<String, ActivityPerformanceAnnotation> annotationMap,
			final double globalLimit, final double maxWeight) {
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
			throw new IllegalArgumentException(PARAM_GLOBAL_TIMELIMIT + " must be greater than 0");
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

	private void addGlobalPerformanceConstraint(EmfModel model)
			throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		final ProcessPerformanceAnnotation ann
			= (ProcessPerformanceAnnotation)model.createInstance("ProcessPerformanceAnnotation");
		ann.setConcurrentUsers(fGlobalThroughput);
		ann.setSecsTimeLimit(fGlobalLimit);
		final ServiceProcess process = (ServiceProcess)model.getAllOfType("ServiceProcess").iterator().next();
		process.setProcessPerformance(ann);
	}

	/**
	 * Adds a value to a series. Ensures the addition is done in the SWT thread,
	 * so the chart is properly updated.
	 */
	private void addToSeries(final YIntervalSeries series, final double x, final BoxAndWhiskerItem statsInNanos) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				series.add(x,
					statsInNanos.getMean().doubleValue()/1000000000,
					statsInNanos.getMinOutlier().doubleValue()/1000000000,
					statsInNanos.getMaxOutlier().doubleValue()/1000000000);
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
		String firstNotEqualKey = null;

		for (String key : resultsOld.keySet()) {
			// The new method is more efficient, but more sensitive to the
			// approximation error from the usage of floating-point math.
			//
			// TODO: switch algorithms to use integer times/weights. Times
			// should be in the millisecond range.
			if (!resultsNew.containsKey(key)
					|| !approximatelyEqual(resultsOld.get(key),
							resultsNew.get(key), 0.125)) {
				firstNotEqualKey = key;
				break;
			}
		}

		if (firstNotEqualKey != null) {
			throw new IllegalStateException(
					"Results from the old and the new algorithm do not match, starting from key " + firstNotEqualKey + "."
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
		ServiceProcess process = (ServiceProcess)model.getAllOfType("ServiceProcess").iterator().next();
		int size = 0;
		for (Object o : process.getNodes()) {
			if (o instanceof ServiceActivity) {
				++size;
			}
		}
		return size;
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

	private void initXYLineChart(CaseStudyResult result, final YIntervalSeries... allSeries) {
		YIntervalSeriesCollection collection = new YIntervalSeriesCollection();

		// Note down the case study class and the parameters used to run the test
		StringBuilder headerBuilder = new StringBuilder("# " + this.getClass());
		for (String pName : getParameterNames()) {
			headerBuilder.append(" ");
			headerBuilder.append(pName);
			headerBuilder.append("='");
			headerBuilder.append(getParameter(pName));
			headerBuilder.append("' ");
		}
		headerBuilder.append("\n");

		headerBuilder.append("size");
		for (YIntervalSeries series : allSeries) {
			collection.addSeries(series);
			headerBuilder.append(RAWTEXT_FIELD_SEPARATOR);
			headerBuilder.append(series.getKey() + " mean");
			headerBuilder.append(RAWTEXT_FIELD_SEPARATOR);
			headerBuilder.append(series.getKey() + " median");
			headerBuilder.append(RAWTEXT_FIELD_SEPARATOR);
			headerBuilder.append(series.getKey() + " min");
			headerBuilder.append(RAWTEXT_FIELD_SEPARATOR);
			headerBuilder.append(series.getKey() + " max");
		}
		headerBuilder.append('\n');

		JFreeChart chart = ChartFactory.createXYLineChart(
				"Execution times for case " + getDecoratedName(),
				"Size (vertexes)", "Time (seconds)", collection,
				PlotOrientation.VERTICAL, true, true, false);

		final XYPlot plot = (XYPlot)chart.getPlot();
		plot.setBackgroundPaint(Color.WHITE);

		final NumberAxis yAxis = (NumberAxis)plot.getRangeAxis();
		yAxis.setNumberFormatOverride(NumberFormat.getInstance(Locale.ENGLISH));

		final NumberAxis xAxis = (NumberAxis)plot.getDomainAxis();
		xAxis.setNumberFormatOverride(NumberFormat.getInstance(Locale.ENGLISH));

		DeviationRenderer deviationrenderer = new DeviationRenderer(true, false);
		final BasicStroke strokeThickDashed = new BasicStroke(3F, 1, 1, 1.0f, new float[]{5,5}, 0.0f);
		final BasicStroke strokeThick = new BasicStroke(3F, 1, 1);
		deviationrenderer.setSeriesStroke(0, strokeThickDashed);
		deviationrenderer.setSeriesStroke(1, strokeThick);
		deviationrenderer.setSeriesPaint(1, new Color(0,150,0));
		deviationrenderer.setSeriesFillPaint(0, new Color(255, 200, 200));
		deviationrenderer.setSeriesFillPaint(1, new Color(50, 150, 50));
		plot.setRenderer(deviationrenderer);

		chart.addSubtitle(new ShortTextTitle(
			String.format(Locale.ENGLISH,
				"%d samples (%d%% annotated nodes, seed %d, maximum weight %g), with global limit = %g",
					fIterations, fPercentageManual, fRandomSeed, fMaxWeight, fGlobalLimit)));;
		result.setRawText(headerBuilder.toString());
		result.setChart(chart);
	}

	private void normalizeProbabilities(EmfModel model) throws EolModelElementTypeNotFoundException {
		final Collection<EObject> decisions = model.getAllOfKind("DecisionNode");
		
		for (EObject o : decisions) {
			final DecisionNode d = (DecisionNode)o;
			final double prob = d.getOutgoing().isEmpty() ? 1 : 1/d.getOutgoing().size();
		
			for (FlowEdge out : d.getOutgoing()) {
				if (out instanceof ControlFlow) {
					((ControlFlow)out).setProbability(prob);
				}
			}
		}
	}

	private void updateRawText(CaseStudyResult result, int size, final BoxAndWhiskerItem... allStatsNanos) {
		StringBuilder sb = new StringBuilder();
		sb.append(size);
		for (BoxAndWhiskerItem statsNanos : allStatsNanos) {
			sb.append(RAWTEXT_FIELD_SEPARATOR);
			sb.append(statsNanos.getMean().doubleValue() / NANOS_TO_SECONDS);
			sb.append(RAWTEXT_FIELD_SEPARATOR);
			sb.append(statsNanos.getMedian().doubleValue() / NANOS_TO_SECONDS);
			sb.append(RAWTEXT_FIELD_SEPARATOR);
			sb.append(statsNanos.getMinOutlier().doubleValue() / NANOS_TO_SECONDS);
			sb.append(RAWTEXT_FIELD_SEPARATOR);
			sb.append(statsNanos.getMaxOutlier().doubleValue() / NANOS_TO_SECONDS);
		}
		sb.append("\n");

		result.setRawText(result.getRawText() + sb.toString());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addRandomManualAnnotations(EmfModel model, Random rnd) throws EolRuntimeException {
		// Remove all manual annotations
		final List<EObject> manualAnnotations = new ArrayList<EObject>(model.getAllOfType("ActivityPerformanceAnnotation"));
		for (EObject o : manualAnnotations) {
			model.deleteElement(o);
		}

		// Compute how many service activities should be annotated at random
		final List<EObject> allActivities = new ArrayList<EObject>(model.getAllOfKind("ServiceActivity"));
		final long nShuffled = Math.round(allActivities.size() / 100.0d * fPercentageManual);

		// If any decision nodes exist, use the fork-join annotation method
		final List<EObject> allDecisions = new ArrayList<EObject>(model.getAllOfKind("ProcessDecision"));
		if (allDecisions.isEmpty()) {
			randomAnnotationsWithoutDecisions(model, rnd, allActivities, nShuffled);
		} else {
			randomAnnotationsWithDecisions(model, rnd, allDecisions, nShuffled);
		}
	}

	private void randomAnnotationsWithDecisions(EmfModel model, Random rnd, List<EObject> allDecisions, final long total) throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException
	{
		Collections.shuffle(allDecisions, rnd);
		double availableTime = 0.5 * fGlobalLimit;

		int annotatedActivities = 0;
		for (EObject o : allDecisions) {
			// Collect all the children activities
			final DecisionNode decision = (DecisionNode)o;
			final List<ServiceActivity> children = new ArrayList<ServiceActivity>();
			for (FlowEdge out : decision.getOutgoing()) {
				if (out.getTarget() instanceof ServiceActivity) {
					children.add((ServiceActivity)out.getTarget());
				}
			}

			// Compute random times and weights for them
			final List<Double> assignedTimes = new ArrayList<Double>(children.size());
			final List<Double> assignedWeights = new ArrayList<Double>(children.size());
			double maxAssigned = 0;
			for (int i = 0; i < children.size(); ++i) {
				assignedWeights.add(rnd.nextDouble() * fMaxWeight);

				final double newAssignedTime = rnd.nextDouble() * availableTime;
				assignedTimes.add(newAssignedTime);
				maxAssigned = Math.max(maxAssigned, newAssignedTime);
			}
			availableTime -= maxAssigned;

			// Add the annotations
			for (int i = 0; i < children.size(); ++i) {
				final ServiceActivity child = children.get(i);

				ActivityPerformanceAnnotation ann = createActivityPerformanceAnnotation(model, child);
				ann.setMinimumTime(assignedTimes.get(i));
				ann.setWeight(assignedWeights.get(i));
				if (++annotatedActivities >= total) {
					return;
				}
			}
		}
	}

	private void randomAnnotationsWithoutDecisions(EmfModel model, Random rnd,
			final List<EObject> allActivities, final long nShuffled)
			throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException
	{
		Collections.shuffle(allActivities, rnd);
		final List<EObject> annotatedNodes = allActivities.subList(0, (int)nShuffled);

		// Create their manual annotations
		final Map<String, ActivityPerformanceAnnotation> annotationMap = new HashMap<String, ActivityPerformanceAnnotation>();
		for (EObject node : annotatedNodes) {
			final ServiceActivity activity = (ServiceActivity)node;
			annotationMap.put(activity.getName(), createActivityPerformanceAnnotation(model, activity));
		}

		// Hand annotations to method in the subclass
		configureRandomManualAnnotations(model, rnd, annotationMap, fGlobalLimit, fMaxWeight);
	}

	private ActivityPerformanceAnnotation createActivityPerformanceAnnotation(
			EmfModel model, final ServiceActivity child)
			throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		final ServiceProcess process = (ServiceProcess)model.getAllOfKind("ServiceProcess").iterator().next();
		final EList<ActivityPerformanceAnnotation> annotations = process.getActivityPerformance();
	
		ActivityPerformanceAnnotation ann = (ActivityPerformanceAnnotation)model.createInstance("ActivityPerformanceAnnotation");
		ann.setManuallyAdded(true);
		ann.setExecNode(child);
		// Use a large value by default, to avoid having the algorithm ask us to increase the value and block the process
		ann.setConcurrentUsers(fGlobalThroughput);
		annotations.add(ann);
		return ann;
	}

}