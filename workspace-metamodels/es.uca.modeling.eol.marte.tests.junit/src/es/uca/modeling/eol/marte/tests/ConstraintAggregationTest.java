package es.uca.modeling.eol.marte.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.types.EolSequence;
import org.junit.Test;

/**
 * Tests that time constraints are correctly aggregated on MDT UML2 models
 * annotated with the MARTE profile implemented by the Papyrus project.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class ConstraintAggregationTest extends AbstractInferenceTest {

	public ConstraintAggregationTest() {
		super(TIME_LIMITS_EOL_PATH);
	}

	@Test
	public void aggregateHandleOrderConstraints() throws Exception {
		assertConstraintsEquals(MODEL_PATH, ACTIVITY_HANDLE_ORDER, 1, pair(0.4, 3.0));
	}

	@Test
	public void aggregateSeqWithRepetitionsConstraints() throws Exception {
		assertConstraintsEquals(MODEL_PATH, ACTIVITY_SEQ_WITH_REPS, 1, pair(0.0, 8.0));
	}

	@SuppressWarnings("rawtypes")
	private void assertConstraintsEquals(String modelPath,
			String activityName, double globalLimit, double[]... expected) throws EolRuntimeException {
		EmfModel model = loadMarteModel(modelPath);
		EolSequence res = (EolSequence)callOperation(
			"aggregateConstraints", globalLimit, getEndNodes(model, activityName));
		assertConstraintsEquals(
			"Activity " + activityName	+ " has the expected constraints", res, expected);
	}

	private double[] pair(double... args) {
		return args;
	}

	@SuppressWarnings("rawtypes")
	private static void assertConstraintsEquals(String msg, EolSequence res, double[]... expectedConstraints) {
		assertNotNull(res);
		assertNotNull((EObject)res.get(0));
		EolSequence constraints = (EolSequence)res.get(1);
		for (int i = 0; i < expectedConstraints.length; ++i) {
			final double[] expected = expectedConstraints[i];
			final EolSequence constraint = (EolSequence)constraints.get(i);
			assertEquals(msg + ": the " + (i + 1)
					+ "-th constraint has the correct length", expected.length,
					constraint.size());
			for (int j = 0; j < expected.length; j++) {
				assertEquals(msg + ": the " + (j + 1)
						+ "-th component has value " + expected[j],
						expected[j], (Double) constraint.get(j), 0.001);
			}
		}
	}

}
