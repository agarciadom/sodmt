package es.uca.modeling.eol.marte.tests.eunit;

import java.io.File;
import java.net.URI;

import org.eclipse.epsilon.eunit.junit.dt.EclipseEUnitTestRunner;
import org.junit.runner.RunWith;

@RunWith(EclipseEUnitTestRunner.class)
public class ThroughputIT extends AbstractMARTEInferenceTest {

	@Override
	public URI getModuleURI() throws Exception {
		return new File("throughput.eol").toURI();
	}

}
