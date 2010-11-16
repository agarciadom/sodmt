package es.uca.modeling.eol.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URISyntaxException;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.types.EolSequence;
import org.junit.Before;
import org.junit.Test;

import serviceProcess.ServiceProcessPackage;

/**
 * Tests for the graph path compression algorithm.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class TimeLimitConstraintAggregationTest {

	private EolModule mEolModule;

	@Test
	public void minimalGraphHasZeroConstraints() throws URISyntaxException,
			Exception {
		assertConstraintEquals("minimal.model");
	}

	@Before
	public void setUp() throws URISyntaxException, Exception {
		java.net.URI uri = getClass().getResource("/wizards/time_limits_v4.eol").toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.execute();
	}

	private void assertConstraintEquals(EolSequence res, int time, int weight) {
		assertNotNull(res);
		assertEquals(2, res.size());
		assertEquals(time, res.get(0));
		assertEquals(weight, res.get(1));
	}

	private void assertConstraintEquals(String name)
			throws EolModelLoadingException, EolRuntimeException,
			EolModelElementTypeNotFoundException {
		EmfModel model  = loadModel(name);
		EolSequence res = (EolSequence) callOperation("aggregateConstraints",
				1, model.getAllOfKind("ProcessFinish"));
		assertConstraintEquals(res, 0, 0);
	}

	private Object callOperation(String name, Object... args)
			throws EolRuntimeException {
		EolOperation op = mEolModule.getOperations().getOperation(name);
		return op.execute(null, Arrays.asList(args), mEolModule.getContext());
	}

	private EmfModel loadModel(String modelName)
			throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setName("");
		model.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		model.setModelFileUri(URI.createURI(getClass().getResource(modelName).toExternalForm()));
		model.load();
		mEolModule.getContext().getModelRepository().addModel(model);
		return model;
	}
}