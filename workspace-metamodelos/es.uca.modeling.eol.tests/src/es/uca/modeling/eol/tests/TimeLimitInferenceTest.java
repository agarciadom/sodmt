package es.uca.modeling.eol.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.junit.Test;

import serviceProcess.FlowNode;
import serviceProcess.ServiceActivity;

/**
 * Tests for the time inference algorithm.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class TimeLimitInferenceTest extends AbstractTimeLimitTest {

	@Test
	public void minimal() throws EolRuntimeException {
		assertOldAndNewResultsAreEqual(1, true, "minimal.model");
	}

	@Test
	public void sequenceSucessful() throws EolRuntimeException {
		assertOldAndNewResultsAreEqual(1, true, "sequence.model");
	}

	@Test
	public void sequenceNotEnoughTime() throws EolRuntimeException {
		// There is a manual time constraint asking for 0.3 seconds:
		// the algorithm should fail, as there is not enough time even
		// for the manual constraint
		assertOldAndNewResultsAreEqual(0.2, false, "sequence.model");
	}

	@Test
	public void sequenceAllTimeUsedByManual() throws EolRuntimeException {
		// There is a manual time constraint asking for 0.3 seconds:
		// the algorithm should fail, as all the available time has been
		// used up by the manual constraints
		assertOldAndNewResultsAreEqual(0.3, false, "sequence.model");
	}

	@Test
	public void denseDAG() throws EolRuntimeException {
		assertOldAndNewResultsAreEqual(20, true, "dense.model");
	}

	@Test
	public void twoDipolesSuccessful() throws EolRuntimeException {
		assertOldAndNewResultsAreEqual(100, true, "two-dipoles.model");
	}

	@Test
	public void twoDipolesA40Successful() throws EolRuntimeException {
		assertOldAndNewResultsAreEqual(100, true, "two-dipoles-Aneeds40.model");
	}

	private void assertOldAndNewResultsAreEqual(double globalLimit,
			boolean shouldSucceed, String modelPath) throws EolRuntimeException {
		Map<String, Double> oldResults = inferTimeLimitsWithOldAlgorithm(
				globalLimit, shouldSucceed, modelPath);
		Map<String, Double> newResults = inferTimeLimits(globalLimit,
				shouldSucceed, modelPath);
		assertEquals(
				"Both old and new results report the same number of constraints",
				oldResults.size(), newResults.size());
		for (String key : oldResults.keySet()) {
			final Double oldResult = oldResults.get(key);
			final Double newResult = newResults.get(key);
			assertEquals("Constraint for activity " + key
					+ " should be the same for the old and new algorithms",
					oldResult, newResult, 0.001);
		}
	}

	private Map<String, Double> buildTimeLimitMapFromModel(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> activities = model.getAllOfKind("ServiceActivity");
		Map<String, Double> mapNameToActivity = new HashMap<String, Double>();
		for (EObject o : activities) {
			ServiceActivity a = (ServiceActivity) o;
			if (a.getAnnotation() != null) {
				mapNameToActivity.put(a.getName(), a.getAnnotation()
						.getSecsTimeLimit());
			}
		}
		clearModels();

		return mapNameToActivity;
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
			final FlowNode node = (FlowNode)o;
			if (node.getIncoming().isEmpty()) {
				startNode = node;
			}
		}
		return startNode;
	}

	private Map<String, Double> inferTimeLimits(double globalLimit,
			boolean shouldSucceed, String modelPath)
			throws EolModelLoadingException,
			EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = loadModel(modelPath);
		List<EObject> endNodes = getEndNodes(model);
		assertEquals(shouldSucceed, (Boolean) callOperation("distributeTime", globalLimit, endNodes));
		return buildTimeLimitMapFromModel(model);
	}

	private Map<String, Double> inferTimeLimitsWithOldAlgorithm(double globalLimit, boolean shouldSucceed, String modelPath) throws EolRuntimeException {
		EmfModel model = loadModel(modelPath);
		FlowNode startNode = getStartNode(model);
		assertEquals(shouldSucceed, (Boolean) callOperation("annotateTimeLimits", globalLimit, startNode));
		return buildTimeLimitMapFromModel(model);
	}
}
