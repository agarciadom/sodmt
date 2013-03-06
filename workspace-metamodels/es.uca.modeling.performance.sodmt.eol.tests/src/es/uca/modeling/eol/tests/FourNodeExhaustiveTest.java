package es.uca.modeling.eol.tests;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;
import org.junit.runner.RunWith;

import serviceProcess.ServiceProcessPackage;

@RunWith(EUnitTestRunner.class)
public class FourNodeExhaustiveTest implements IEUnitSuite {
	@Override
	public URI getModuleURI() throws Exception {
		return new File("exhaustive-4nodes.eunit").toURI();
	}

	@Override
	public List<IModel> prepareModels() throws Exception {
		final EmfModel model = new EmfModel();
		model.setName("Model");
		model.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		model.setModelFile("dummy.model");
		model.setReadOnLoad(false);
		model.setStoredOnDisposal(false);
		model.load();

		return Arrays.asList((IModel)model);
	}

	@Override
	public OperationContributor getOperationContributor() {
		return null;
	}
}
