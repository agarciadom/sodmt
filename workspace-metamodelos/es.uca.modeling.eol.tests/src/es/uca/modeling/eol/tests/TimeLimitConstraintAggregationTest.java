package es.uca.modeling.eol.tests;


import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.Test;


/**
 * Tests for constraint aggregation in the new time limit inference algorithm.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class TimeLimitConstraintAggregationTest extends AbstractTimeLimitTest {

	private double[] pair(double... args) {
		return args;
	}

	@Test
	public void minimal() throws EolRuntimeException {
		assertConstraintsEquals("minimal.model", 1, pair(0, 0));
	}

	@Test
	public void sequence() throws EolRuntimeException {
		assertConstraintsEquals("sequence.model", 1, pair(0.3, 1));
	}

	@Test
	public void singleDipole() throws EolRuntimeException {
		assertConstraintsEquals("single-dipole.model", 1, pair(0, 4));
	}

	// There are two test cases with the two dipole graph, as the
	// strictest paths depend on the selected global limit.
	@Test
	public void twoDipolesWithLimit100() throws EolRuntimeException {
		assertConstraintsEquals("two-dipoles.model", 100, pair(50, 4), pair(30, 6));
	}

	@Test
	public void twoDipolesWithLimit60() throws EolRuntimeException {
		assertConstraintsEquals("two-dipoles.model", 60, pair(50, 4));
	}

	@Test
	public void maximumDensityDAG() throws EolRuntimeException {
		// The model is not a valid workflow, but it is useful as a test case
		// for the algorithm. It is a 4-node graph in which nodes are sorted, and each
		// node is connected to the following ones: activity A with B, C and D, activity
		// B with C and D, and activity C with D. This is the most dense graph we can
		// create that is still a DAG: if we added an edge in the reverse direction, we
		// would be creating a cycle.
		assertConstraintsEquals("dense.model", 100, pair(0, 4));
	}
}