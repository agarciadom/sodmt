package es.uca.modelling.performance.sodmt.evl.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.junit.runner.RunWith;

import serviceComposition.ServiceCompositionPackage;

@RunWith(EUnitTestRunner.class)
public class ServiceCompositionValidationTests extends AbstractValidationTests {
	@Override
	public List<IModel> prepareModels() throws Exception {
		final List<IModel> models = new ArrayList<IModel>();

		EmfModel dummySCModel = new EmfModel();
		dummySCModel.setName("SC");
		dummySCModel.setMetamodelUri(ServiceCompositionPackage.eNS_URI);
		dummySCModel.setModelFile("dummy-model.uml");
		dummySCModel.setReadOnLoad(false);
		dummySCModel.setStoredOnDisposal(false);
		dummySCModel.load();
		models.add(dummySCModel);

		return models;
	}

	@Override
	protected String getPathToEUnit() {
		return "eunit/sc_validation.eunit";
	}

	@Override
	protected String getPathToEVL() {
		return "/evl/service_composition.evl";
	}
}
