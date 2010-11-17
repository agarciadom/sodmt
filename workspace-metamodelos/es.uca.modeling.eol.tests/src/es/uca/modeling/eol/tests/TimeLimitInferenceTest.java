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

	private void assertActivityHasTimeLimit(
			Map<String, ServiceActivity> mapNameToActivity, String name,
			double expected) {
		assertEquals(expected,
			mapNameToActivity.get(name).getAnnotation().getSecsTimeLimit(), 0.001);
	}

	private Map<String, ServiceActivity> inferTimeLimits(int globalLimit,
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
