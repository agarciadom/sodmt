package es.uca.modeling.eol.comparison.cases;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.swt.widgets.Display;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import serviceProcess.FlowNode;
import serviceProcess.ProcessControlFlow;
import serviceProcess.ProcessFinish;
import serviceProcess.ProcessStart;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessPackage;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;
import es.uca.modeling.eol.comparison.model.ICaseStudy;

/**
 * Case study for a sequential graph.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class SequenceCaseStudy implements ICaseStudy {

	private static final String RAWTEXT_FIELD_SEPARATOR = "; ";
	private static final String MAIN_EOL_BUNDLE = "es.uca.modeling.eol";
	private static final String MAIN_EOL_PATH = "/wizards/time_limits_sp.eol";
	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private static final String PARAM_GLOBALLIMIT = "globalLimit";
	private int fMinSize = 0, fMaxSize = 10;
	private double fGlobalLimit = 100;

	@Override
	public String getName() {
		return "Sequence";
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		} else if (PARAM_MINSIZE.equals(name)) {
			return Integer.toString(fMinSize);
		} else if (PARAM_GLOBALLIMIT.equals(name)) {
			return Double.toString(fGlobalLimit);
		} else return null;
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_MINSIZE, PARAM_MAXSIZE, PARAM_GLOBALLIMIT);
	}

	@Override
	public void run(IProgressMonitor monitor, CaseStudyResult result) throws Exception {

		validateConfiguration();
		final EolModule eolModule = loadModule(MAIN_EOL_PATH);

		final XYSeries newAlgoSeries = new XYSeries("Collapsed paths");
		final XYSeries oldAlgoSeries = new XYSeries("All paths");
		initXYLineChart(result, newAlgoSeries, oldAlgoSeries);

		monitor.beginTask("Comparing execution times", fMaxSize - fMinSize + 1);
		for (int size = fMinSize; size <= fMaxSize; ++size) {
			if (monitor.isCanceled()) {
				result.setSuccessful(false);
				return;
			}

			// Build the model, which will be reused by both algorithms
			EmfModel model = buildModel(size);
			eolModule.getContext().getModelRepository().addModel(model);

			// Run both algorithms and measure their running times
			final long startOld = System.currentTimeMillis();
			final Map<String, Double> resultsOld = runOldAlgorithm(eolModule, model);
			final double oldTime = (System.currentTimeMillis() - startOld)/1000.0;

			final long startNew = System.currentTimeMillis();
			final Map<String, Double> resultsNew = runNewAlgorithm(eolModule, model);
			final double newTime = (System.currentTimeMillis() - startNew)/1000.0;

			// If the results are not the same, the algorithms are not comparable
			eolModule.getContext().getModelRepository().removeModel(model);
			model.dispose();
			checkResultsMatch(resultsNew, resultsOld);

			// Update the current results
			addToSeries(newAlgoSeries, size, newTime);
			addToSeries(oldAlgoSeries, size, oldTime);
			updateRawText(result, size, newTime, oldTime);
			monitor.worked(1);
		}
		monitor.done();
		result.setSuccessful(true);
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_MAXSIZE.equals(name)) {
				fMaxSize = Integer.valueOf(value);
			} else if (PARAM_MINSIZE.equals(name)) {
				fMinSize = Integer.valueOf(value);
			} else if (PARAM_GLOBALLIMIT.equals(name)) {
				fGlobalLimit = Double.valueOf(value);
			} else {
				throw new IllegalArgumentException("Unknown parameter: " + name);
			}
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
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

	private boolean approximatelyEqual(double x, double y, double relativeError) {
		final double max = Math.max(x, y);
		return Math.abs((x-y)/max) <= relativeError;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private EmfModel buildModel(int size)
		throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException,
			EolModelLoadingException
	{
		EmfModel model
			= EmfModelFactory.getInstance().createEmfModel("",
					new File("size" + size + ".model"), ServiceProcessPackage.eINSTANCE);
		model.setReadOnLoad(false);
		model.setStoredOnDisposal(false);
		model.load();

		final ServiceProcess process = (ServiceProcess)model.createInstance("ServiceProcess");
		final EList nodes = process.getNodes();
		final EList edges = process.getEdges();

		final ProcessStart start = (ProcessStart)model.createInstance("ProcessStart");
		final ProcessFinish finish = (ProcessFinish)model.createInstance("ProcessFinish");
		nodes.add(start);
		nodes.add(finish);

		FlowNode previousNode = start;
		for (int i = 0; i < size; ++i) {
			final ServiceActivity activity
				= (ServiceActivity)model.createInstance("ServiceActivity");
			activity.setName("A" + i);
			nodes.add(activity);

			final ProcessControlFlow edge
				= (ProcessControlFlow)model.createInstance("ProcessControlFlow");
			edges.add(edge);

			edge.setSource(previousNode);
			edge.setTarget(activity);
			previousNode = activity;
		}

		final ProcessControlFlow lastEdge
			= (ProcessControlFlow)model.createInstance("ProcessControlFlow");
		edges.add(lastEdge);
		lastEdge.setSource(previousNode);
		lastEdge.setTarget(finish);

		return model;
	}

	private void checkResultsMatch(final Map<String, Double> resultsNew,
			final Map<String, Double> resultsOld) {
		boolean bEqual = resultsNew.size() == resultsOld.size();

		if (bEqual) {
			for (String key : resultsOld.keySet()) {
				if (!resultsNew.containsKey(key)
						|| !approximatelyEqual(resultsOld.get(key), resultsNew.get(key), 0.001)) {
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

	private Map<String, Double> computeOperationResult(EolModule module,
			EmfModel model, final String operationName, final Object... args)
			throws EolRuntimeException, EolModelElementTypeNotFoundException {
		final EolOperation operation = module.getOperations().getOperation(operationName);
		operation.execute(null, Arrays.asList(args), module.getContext());
		module.getContext().getExtendedProperties().clear();

		final Map<String, Double> mapResults = new HashMap<String, Double>();
		for (EObject o : model.getAllOfKind("ServiceActivity")) {
			ServiceActivity node = (ServiceActivity)o;
			mapResults.put(node.getName(), node.getAnnotation().getSecsTimeLimit());
		}
		return mapResults;
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
				"Execution times", "Size", "Time (secs)", collection,
				PlotOrientation.VERTICAL, true, true, false);
		result.setRawText(headerBuilder.toString());
		result.setChart(chart);
	}

	private EolModule loadModule(String path) throws Exception {
		URI uri = Platform.getBundle(MAIN_EOL_BUNDLE).getEntry(path).toURI();
		EolModule module = new EolModule();
		module.parse(uri);
		module.execute();
		return module;
	}

	private Map<String, Double> runNewAlgorithm(EolModule module, EmfModel model) throws EolRuntimeException {
		return computeOperationResult(module, model,
			"distributeTime", new Object[]{fGlobalLimit, getEndNodes(model)});
	}

	private Map<String, Double> runOldAlgorithm(EolModule module, EmfModel model)
		throws EolRuntimeException
	{
		return computeOperationResult(module, model,
			"annotateTimeLimits", fGlobalLimit, getStartNode(model));
	}

	private void updateRawText(CaseStudyResult result, int size,
		final double newTime, final double oldTime) {
		result.setRawText(result.getRawText()
			+ String.format("%d%s%g%s%g\n", size,
					RAWTEXT_FIELD_SEPARATOR, newTime,
					RAWTEXT_FIELD_SEPARATOR, oldTime));
	}

	private void validateConfiguration() {
		if (fMinSize > fMaxSize) {
			throw new IllegalArgumentException(PARAM_MINSIZE + " must be smaller than " + PARAM_MAXSIZE);
		}
		if (fGlobalLimit <= 0) {
			throw new IllegalArgumentException(PARAM_GLOBALLIMIT + " must be greater than 0");
		}
	}

}
