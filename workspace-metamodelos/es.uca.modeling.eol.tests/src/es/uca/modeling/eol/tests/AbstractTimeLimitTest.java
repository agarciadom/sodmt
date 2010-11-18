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
import org.junit.After;
import org.junit.Before;

import serviceProcess.ServiceProcessPackage;

/**
 * Base class for the test suites used with the new time limit inference algorithm.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class AbstractTimeLimitTest {

	public static void assertConstraintsEquals(String msg, EolSequence res, double[]... expectedConstraints) {
		assertNotNull(res);
		assertNotNull((EObject)res.get(0));
		EolSequence constraints = (EolSequence)res.get(1);
		for (int i = 0; i < expectedConstraints.length; ++i) {
			final double[] expected = expectedConstraints[i];
			final EolSequence constraint = (EolSequence)constraints.get(i);
			assertEquals(msg + ": the " + (i+1) + "-th constraint has the correct length", expected.length, constraint.size());
			for (int j = 0; j < expected.length; j++) {
				assertEquals(msg + ": the " + (j+1) + "-th component has value " + expected[j], expected[j], (Double)constraint.get(j), 0.001);
			}
		}
	}

	private EolModule mEolModule;

	public void assertConstraintsEquals(String name, double globalLimit,
			double[]... expected) throws EolRuntimeException {
		EmfModel model = loadModel(name);
		EolSequence res = (EolSequence) callOperation(
				"aggregateConstraints", globalLimit, model.getAllOfKind("ProcessFinish"));
		assertConstraintsEquals("Activity " + name + " has the expected constraints", res, expected);
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
		loadModule("/wizards/time_limits_sp.eol");
	}

	@After
	public void clearModels() {
		mEolModule.getContext().getModelRepository().dispose();
	}

	private void loadModule(String name) throws URISyntaxException, Exception,
			EolRuntimeException {
		java.net.URI uri = TimeLimitConstraintAggregationTest.class.getResource(name).toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.execute();
	}

}