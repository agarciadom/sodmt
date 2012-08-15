package es.uca.modeling.eol.marte.tests.eunit;

import java.io.File;
import java.net.URI;

import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.junit.runner.RunWith;

@RunWith(EUnitTestRunner.class)
public class TimeLimitsTest extends AbstractMARTEInferenceTest {

	@Override
	public URI getModuleURI() throws Exception {
		return new File("tlimits.eol").toURI();
	}

}
