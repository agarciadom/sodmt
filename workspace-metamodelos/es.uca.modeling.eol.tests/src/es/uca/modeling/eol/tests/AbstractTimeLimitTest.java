package es.uca.modeling.eol.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URISyntaxException;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.types.EolSequence;
import org.junit.Before;

import serviceProcess.ServiceProcessPackage;

/**
 * Base class for the test suites used with the new time limit inference algorithm.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class AbstractTimeLimitTest {

	public static void assertConstraintEquals(EolSequence res, double time, double weight) {
		assertNotNull(res);
		assertNotNull((EObject)res.get(0));
		EolSequence constraint = (EolSequence)res.get(1);
		assertEquals(2, constraint.size());
		assertEquals(time, (Double)constraint.get(0), 0.001);
		assertEquals(weight, (Double)constraint.get(1), 0.001);
	}

	private EolModule mEolModule;

	public void assertConstraintEquals(String name, double globalLimit,
			double time, double weight) throws EolRuntimeException {
		EmfModel model = loadModel(name);
		EolSequence res = (EolSequence) callOperation(
				"aggregateConstraints", globalLimit, model.getAllOfKind("ProcessFinish"));
		assertConstraintEquals(res, time, weight);
	}

	public Object callOperation(String name, Object... args)
			throws EolRuntimeException {
		EolOperation op = mEolModule.getOperations().getOperation(name);
		return op.execute(null, Arrays.asList(args), mEolModule.getContext());
	}

	public EmfModel loadModel(String modelPath)
			throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setName("");
		model.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		model.setModelFileUri(URI
				.createURI(getClass().getResource(modelPath).toExternalForm()));
		model.load();
		mEolModule.getContext().getModelRepository().addModel(model);
		return model;
	}

	@Before
	public void setUp() throws URISyntaxException, Exception {
		String name = "/wizards/time_limits_v4_sp.eol";
		loadModule(name);
	}

	private void loadModule(String name) throws URISyntaxException, Exception,
			EolRuntimeException {
		java.net.URI uri = TimeLimitConstraintAggregationTest.class.getResource(name).toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.execute();
	}

}