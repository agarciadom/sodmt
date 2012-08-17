package es.uca.modeling.eol.marte.tests.eunit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;
import org.eclipse.papyrus.MARTE.MARTEPackage;

public abstract class AbstractMARTEInferenceTest implements IEUnitSuite {

	@Override
	public List<IModel> prepareModels() throws Exception {
		final List<IModel> models = new ArrayList<IModel>();

		final EPackage martePkg = MARTEPackage.eINSTANCE;
		assertTrue(EPackage.Registry.INSTANCE.containsKey(martePkg.getNsURI()));

		EmfModel umlModel = new EmfModel();
		umlModel.setName("UML");
		umlModel.setMetamodelUri(MARTEPackage.eNS_URI);
		umlModel.setModelFile("models/model.uml");
		umlModel.load();
		models.add(umlModel);

		EmfModel mdModel = new EmfModel();
		mdModel.setName("MultiDiagram");
		mdModel.setMetamodelUri(MARTEPackage.eNS_URI);
		mdModel.setModelFile("models/multimodel.uml");
		mdModel.load();
		models.add(mdModel);

		return models;
	}

}