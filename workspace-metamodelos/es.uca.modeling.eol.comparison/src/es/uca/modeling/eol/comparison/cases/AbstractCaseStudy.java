package es.uca.modeling.eol.comparison.cases;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.swt.widgets.Display;
import org.jfree.data.xy.XYSeries;

import serviceProcess.FlowNode;
import serviceProcess.ServiceActivity;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;

public class AbstractCaseStudy {

	protected static final String RAWTEXT_FIELD_SEPARATOR = "; ";

	private static final String MAIN_EOL_BUNDLE = "es.uca.modeling.eol";
	private static final String MAIN_EOL_PATH = "/wizards/time_limits_sp.eol";

	/**
	 * Adds a value to a series. Ensures the addition is done in the SWT thread,
	 * so the chart is properly updated.
	 */
	protected void addToSeries(final XYSeries series, final double x,
			final double y) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				series.add(x, y);
			}
		});
	}

	protected void checkResultsMatch(final Map<String, Double> resultsNew,
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

	protected EolModule loadModule() throws Exception {
		URI uri = Platform.getBundle(MAIN_EOL_BUNDLE).getEntry(MAIN_EOL_PATH).toURI();
		EolModule module = new EolModule();
		module.parse(uri);
		module.execute();
		return module;
	}

	protected Map<String, Double> runNewAlgorithm(EolModule module,
			EmfModel model, double globalLimit) throws EolRuntimeException {
		return computeOperationResult(module, model, "distributeTime",
				new Object[] { globalLimit, getEndNodes(model) });
	}

	protected Map<String, Double> runOldAlgorithm(EolModule module,
			EmfModel model, double globalLimit) throws EolRuntimeException {
		return computeOperationResult(module, model, "annotateTimeLimits",
				globalLimit, getStartNode(model));
	}

	protected void updateRawText(CaseStudyResult result, int size,
			final double newTime, final double oldTime) {
		result.setRawText(result.getRawText()
				+ String.format("%d%s%g%s%g\n", size,
						RAWTEXT_FIELD_SEPARATOR, newTime,
						RAWTEXT_FIELD_SEPARATOR, oldTime));
	}

	private boolean approximatelyEqual(double x, double y, double relativeError) {
		final double max = Math.max(x, y);
		return Math.abs((x - y) / max) <= relativeError;
	}

	private Map<String, Double> computeOperationResult(EolModule module,
			EmfModel model, final String operationName, final Object... args)
			throws EolRuntimeException, EolModelElementTypeNotFoundException {
		final EolOperation operation = module.getOperations().getOperation(
				operationName);
		operation.execute(null, Arrays.asList(args), module.getContext());
		module.getContext().getExtendedProperties().clear();

		final Map<String, Double> mapResults = new HashMap<String, Double>();
		for (EObject o : model.getAllOfKind("ServiceActivity")) {
			ServiceActivity node = (ServiceActivity) o;
			mapResults.put(node.getName(), node.getAnnotation()
					.getSecsTimeLimit());
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

}