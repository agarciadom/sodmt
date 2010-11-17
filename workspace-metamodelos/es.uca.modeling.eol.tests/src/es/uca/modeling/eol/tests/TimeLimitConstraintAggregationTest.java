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

	@Test
	public void maximumDensityDAG() throws EolRuntimeException {
		// The model is not a valid SODM+T composition, but it is useful as a test case
		// for the algorithm. It is a 4-node graph in which nodes are sorted, and each
		// node is connected to the following ones: activity A with B, C and D, activity
		// B with C and D, and activity C with D. This is the most dense graph we can
		// create that is still a DAG: if we added an edge in the reverse direction, we
		// would be creating a cycle.
		assertConstraintEquals("dense.model", 100, 0, 4);
	}
}