package es.uca.modeling.eol.comparison.cases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.swt.widgets.Display;
import org.jfree.data.xy.XYSeries;

import serviceProcess.FlowNode;
import es.uca.modeling.eol.comparison.model.CaseStudyResult;

public class AbstractCaseStudy {

	protected static final String RAWTEXT_FIELD_SEPARATOR = "; ";

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

	protected List<EObject> getEndNodes(EmfModel model)
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

	protected FlowNode getStartNode(EmfModel model)
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