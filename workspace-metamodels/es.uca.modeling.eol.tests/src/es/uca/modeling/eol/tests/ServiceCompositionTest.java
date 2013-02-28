package es.uca.modeling.eol.tests;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;
import org.junit.runner.RunWith;

import serviceComposition.ServiceCompositionPackage;

@RunWith(EUnitTestRunner.class)
public class ServiceCompositionTest implements IEUnitSuite {

	@Override
	public URI getModuleURI() throws Exception {
		return new File("serviceComposition.eunit").toURI();
	}

	@Override
	public List<IModel> prepareModels() throws Exception {
		final List<IModel> models = new ArrayList<IModel>();
		
		final EmfModel model = new EmfModel();
		model.setModelFile("models/scomp-CompraTabacoSinTratar.model");
		model.setMetamodelUri(ServiceCompositionPackage.eNS_URI);
		model.setName("Model");
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(false);
		model.load();
		models.add(model);

		return models;
	}

	@Override
	public OperationContributor getOperationContributor() {
		return null;
	}
}
