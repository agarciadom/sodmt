package es.uca.modeling.eol.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.junit.Test;

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
		inferTimeLimits(1, true, "minimal.model");
	}

	@Test
	public void sequenceSucessful() throws EolRuntimeException {
		Map<String, ServiceActivity> mapN2A
			= inferTimeLimits(1, true, "sequence.model");
		assertActivityHasTimeLimit(mapN2A, "A", 0.3);
		assertActivityHasTimeLimit(mapN2A, "B", 0.7);
	}

	@Test
	public void sequenceNotEnoughTime() throws EolRuntimeException {
		// There is a manual time constraint asking for 0.3 seconds:
		// the algorithm should fail, as there is not enough time even
		// for the manual constraint
		inferTimeLimits(0.2, false, "sequence.model");
	}

	@Test
	public void sequenceAllTimeUsedByManual() throws EolRuntimeException {
		// There is a manual time constraint asking for 0.3 seconds:
		// the algorithm should fail, as all the available time has been
		// used up by the manual constraints
		inferTimeLimits(0.3, false, "sequence.model");
	}

	@Test
	public void denseDAG() throws EolRuntimeException {
		final int globalLimit = 20;
		Map<String, ServiceActivity> mapN2A
			= inferTimeLimits(globalLimit, true, "dense.model");
		for (String a : mapN2A.keySet()) {
			assertActivityHasTimeLimit(mapN2A, a, globalLimit/mapN2A.size());
		}
	}

	@Test
	public void twoDipolesSuccessful() throws EolRuntimeException {
		Map<String, ServiceActivity> mapN2A
			= inferTimeLimits(100, true, "two-dipoles.model");
		for (String a : new String[]{"A", "C", "D", "E", "F", "I"}) {
			assertActivityHasTimeLimit(mapN2A, a, 11.666);
		}
		assertActivityHasTimeLimit(mapN2A, "B", 20);
		assertActivityHasTimeLimit(mapN2A, "G", 30);
		assertActivityHasTimeLimit(mapN2A, "H", 41.666);
	}

	@Test
	public void twoDipolesA40Successful() throws EolRuntimeException {
		Map<String, ServiceActivity> mapN2A
			= inferTimeLimits(100, true, "two-dipoles-Aneeds40.model");
		assertActivityHasTimeLimit(mapN2A, "A", 40);
		assertActivityHasTimeLimit(mapN2A, "B", 20);
		assertActivityHasTimeLimit(mapN2A, "C", 10);
		assertActivityHasTimeLimit(mapN2A, "D", 10);
		assertActivityHasTimeLimit(mapN2A, "E", 3.333);
		assertActivityHasTimeLimit(mapN2A, "F", 3.333);
		assertActivityHasTimeLimit(mapN2A, "G", 30);
		assertActivityHasTimeLimit(mapN2A, "H", 33.333);
		assertActivityHasTimeLimit(mapN2A, "I", 3.333);
	}

	private void assertActivityHasTimeLimit(
			Map<String, ServiceActivity> mapNameToActivity, String name,
			double expected) {
		assertEquals("Activity " + name + " should have expected time limit", expected,
			mapNameToActivity.get(name).getAnnotation().getSecsTimeLimit(), 0.001);
	}

	private Map<String, ServiceActivity> inferTimeLimits(double globalLimit,
			boolean shouldSucceed, String modelPath)
			throws EolModelLoadingException,
			EolModelElementTypeNotFoundException, EolRuntimeException {
		EmfModel model = loadModel(modelPath);
		Collection<EObject> endNodes = model.getAllOfKind("ProcessFinish");
		boolean success = (Boolean) callOperation("distributeTime", globalLimit, endNodes);
		assertEquals(shouldSucceed, success);

		Collection<EObject> activities
			= model.getAllOfKind("ServiceActivity");
		Map<String, ServiceActivity> mapNameToActivity
			= new HashMap<String, ServiceActivity>();
		for (EObject o : activities) {
			ServiceActivity a = (ServiceActivity) o;
			mapNameToActivity.put(a.getName(), a);
		}

		return mapNameToActivity;
	}
}
