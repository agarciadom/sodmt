package es.uca.modeling.eol.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;

import serviceProcess.ServiceProcessPackage;

public abstract class AbstractModelTest implements IEUnitSuite {

	@Override
	public List<IModel> prepareModels() throws EolModelLoadingException {
		List<IModel> models = new ArrayList<IModel>();
		for (File fModel : new File("models").listFiles()) {
			EmfModel model = new EmfModel();
			model.setName(fModel.getName().replace(".model", ""));
			model.setReadOnLoad(true);
			model.setStoredOnDisposal(false);
			model.setMetamodelUri(ServiceProcessPackage.eNS_URI);
			model.setModelFile(fModel.getPath());
			model.load();
			models.add(model);
		}

		return models;
	}

}