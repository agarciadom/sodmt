package es.uca.modeling.eol.tests;

import java.net.URI;
import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;

/**
 * Interface that must be implemented by all test suites
 * using the {@link EUnitTestRunner}.
 */
public interface IEUnitSuite {
	URI getModuleURI() throws Exception;

	List<IModel> prepareModels() throws Exception;
}
