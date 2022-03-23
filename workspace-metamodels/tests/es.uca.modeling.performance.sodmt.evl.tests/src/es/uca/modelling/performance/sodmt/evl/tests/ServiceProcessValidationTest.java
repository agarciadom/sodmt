package es.uca.modelling.performance.sodmt.evl.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.junit.runner.RunWith;

import serviceProcess.ServiceProcessPackage;

@RunWith(EUnitTestRunner.class)
public class ServiceProcessValidationTest extends AbstractValidationTest {
	@Override
	protected String getPathToEVL() {
		return "/evl/service_process.evl";
	}

	@Override
	protected String getPathToEUnit() {
		return "eunit/sp_validation.eunit";
	}

	@Override
	public List<IModel> prepareModels() throws Exception {
		final List<IModel> models = new ArrayList<IModel>();
	
		EmfModel dummySPModel = new EmfModel();
		dummySPModel.setName("SP");
		dummySPModel.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		dummySPModel.setModelFile("dummy-model-sp.uml");
		dummySPModel.setReadOnLoad(false);
		dummySPModel.setStoredOnDisposal(false);
		dummySPModel.load();
		models.add(dummySPModel);
	
		return models;
	}
}
