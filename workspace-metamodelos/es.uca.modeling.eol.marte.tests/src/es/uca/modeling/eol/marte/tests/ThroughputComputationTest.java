package es.uca.modeling.eol.marte.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.uml2.uml.ExecutableNode;
import org.junit.Test;

/**
 * Tests that MDT UML2 models annotated with the Papyrus implementation of the
 * OMG MARTE profile are correctly annotated with the computed throughputs.
 *
 *  @author Antonio García-Domínguez
 *  @version 1.0
 */
public class ThroughputComputationTest extends AbstractInferenceTest {

	public ThroughputComputationTest() {
		super(THROUGHPUT_EOL_PATH);
	}

	@Test
	public void throughputsForHandleOrderAreOK() throws EolRuntimeException {
		final Map<String, Double> throughputMap = computeThroughputs(MODEL_PATH, ACTIVITY_HANDLE_ORDER);

		assertThroughput(throughputMap, "Evaluate Order", 1.0);
		assertThroughput(throughputMap, "Create Invoice", 0.8);
		assertThroughput(throughputMap, "Perform Payment", 0.8);
		assertThroughput(throughputMap, "Ship Order", 0.8);
		assertThroughput(throughputMap, "Close Order", 1.0);
	}

	@Test
	public void throughputsForSeqWithRepAreOK() throws EolRuntimeException {
		final Map<String, Double> throughputMap = computeThroughputs(MODEL_PATH, ACTIVITY_SEQ_WITH_REPS);

		assertThroughput(throughputMap, "A", 1.0);
		assertThroughput(throughputMap, "B", 1.0);
		assertThroughput(throughputMap, "C", 1.0);
	}

	private void assertThroughput(final Map<String, Double> throughputMap,
			final String activityName, final Double expectedThroughput) {
		assertEquals(activityName + " should handle 1 request/second",
				expectedThroughput, throughputMap.get(activityName), 0.001);
	}

	private Map<String, Double> computeThroughputs(String modelPath, String activityName)
			throws EolModelLoadingException, EolRuntimeException,
			EolModelElementTypeNotFoundException {
		EmfModel model = loadMarteModel(modelPath);
		Boolean result = (Boolean)callOperation("annotateThroughput", getStartNode(model, activityName));
		assertTrue("Annotation was successful", result);
		final Map<String, Double> throughputMap = computeThroughputMap(model, activityName);
		return throughputMap;
	}

	private Map<String, Double> computeThroughputMap(EmfModel model, String activityName)
			throws EolModelElementTypeNotFoundException {
		final Map<String, Double> throughputMap = new HashMap<String, Double>();
		final List<ExecutableNode> execNodes = getExecutableNodes(model, activityName);

		for (ExecutableNode exec : execNodes) {
			for (EObject oStereotype : exec.getStereotypeApplications()) {
				if (!(oStereotype instanceof GaScenario)) continue;
				
				final GaScenario scenario = (GaScenario)oStereotype;
				final Map<String, String> scenarioTHMap = getKeyvalMap(scenario.getThroughput().get(0));
				final Double throughput = Double.valueOf(scenarioTHMap.get("value"));
				throughputMap.put(exec.getName(), throughput);
			}
		}
		return throughputMap;
	}

}

