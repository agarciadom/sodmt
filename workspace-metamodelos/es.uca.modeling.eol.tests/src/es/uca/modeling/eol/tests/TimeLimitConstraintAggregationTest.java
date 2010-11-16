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
	public void minimal() throws EolRuntimeException {
		assertConstraintEquals("minimal.model", 1, 0, 0);
	}

	@Test
	public void sequence() throws EolRuntimeException {
		assertConstraintEquals("sequence.model", 1, 0.3, 1);
	}

	// There are two test cases with the two dipole graph, as the
	// most restrictive path depends on the selected global limit.
	@Test
	public void twoDipolesWithLimit100() throws EolRuntimeException {
		assertConstraintEquals("two-dipoles.model", 100, 30, 6);
	}

	@Test
	public void twoDipolesWithLimit60() throws EolRuntimeException {
		assertConstraintEquals("two-dipoles.model", 60, 50, 4);
	}

	@Before
	public void setUp() throws URISyntaxException, Exception {
		java.net.URI uri = getClass().getResource("/wizards/time_limits_v4.eol").toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.execute();
	}

	private void assertConstraintEquals(EolSequence res, double time, double weight) {
		assertNotNull(res);
		assertEquals(2, res.size());
		assertEquals(time, (Double)res.get(0), 0.001);
		assertEquals(weight, (Double)res.get(1), 0.001);
	}

	private void assertConstraintEquals(String name, double globalLimit, double time, double weight)
		throws EolRuntimeException {
		EmfModel model  = loadModel(name);
		EolSequence res = (EolSequence) callOperation("aggregateConstraints",
				globalLimit, model.getAllOfKind("ProcessFinish"));
		assertConstraintEquals(res, time, weight);
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