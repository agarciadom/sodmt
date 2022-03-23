package es.uca.modeling.eol.marte.tests.eunit;

import java.io.File;
import java.net.URI;

import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eunit.junit.dt.EclipseEUnitTestRunner;
import org.junit.runner.RunWith;

@RunWith(EclipseEUnitTestRunner.class)
public class ConstraintAggregationTest extends AbstractMARTEInferenceTest {

	@Override
	public URI getModuleURI() throws Exception {
		return new File("caggregation.eol").toURI();
	}

	@Override
	public OperationContributor getOperationContributor() {
		return null;
	}
}
