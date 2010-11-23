package es.uca.modeling.eol.comparison.cases;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
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
public class SequenceCaseStudy extends AbstractCaseStudy implements ICaseStudy {

	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private static final String PARAM_GLOBALLIMIT = "globalLimit";
	private static final String PARAM_ITERATIONS = "iterationsPerSize";
	private int fMinSize = 0, fMaxSize = 10, fIterations = 5;
	double fGlobalLimit = 100;

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
		} else if (PARAM_ITERATIONS.equals(name)) {
			return Integer.toString(fIterations);
		} else return null;
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_MINSIZE, PARAM_MAXSIZE, PARAM_GLOBALLIMIT, PARAM_ITERATIONS);
	}

	@Override
	public void run(IProgressMonitor monitor, CaseStudyResult result) throws Exception {

		validateConfiguration();
		final EolModule eolModule = loadModule();

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
			Map<String, Double> resultsOld = null;
			for (int i = 0; i < fIterations; ++i) {
				resultsOld = runOldAlgorithm(eolModule, model, fGlobalLimit);
			}
			final double oldTime = (System.currentTimeMillis() - startOld)/(fIterations * 1000.0);

			final long startNew = System.currentTimeMillis();
			Map<String, Double> resultsNew = null;
			for (int i = 0; i < fIterations; ++i) {
				resultsNew = runNewAlgorithm(eolModule, model, fGlobalLimit);
			}
			final double newTime = (System.currentTimeMillis() - startNew)/(fIterations * 1000.0);

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
			} else if (PARAM_ITERATIONS.equals(name)) {
				fIterations = Integer.valueOf(value);
			} else {
				throw new IllegalArgumentException("Unknown parameter: " + name);
			}
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
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
				"Average execution times (over " + fIterations + " iterations)",
				"Size", "Time (secs)", collection,
				PlotOrientation.VERTICAL, true, true, false);
		result.setRawText(headerBuilder.toString());
		result.setChart(chart);
	}

	private void validateConfiguration() {
		if (fMinSize > fMaxSize) {
			throw new IllegalArgumentException(PARAM_MINSIZE + " must be smaller than " + PARAM_MAXSIZE);
		}
		if (fGlobalLimit <= 0) {
			throw new IllegalArgumentException(PARAM_GLOBALLIMIT + " must be greater than 0");
		}
		if (fIterations <= 0) {
			throw new IllegalArgumentException(PARAM_ITERATIONS + " must be greater than 0");
		}
	}

}
