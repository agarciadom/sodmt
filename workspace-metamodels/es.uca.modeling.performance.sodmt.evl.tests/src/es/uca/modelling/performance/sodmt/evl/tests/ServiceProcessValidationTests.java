package es.uca.modelling.performance.sodmt.evl.tests;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.java.JavaModel;
import org.eclipse.epsilon.eunit.junit.EUnitTestRunner;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.EvlUnsatisfiedConstraint;
import org.junit.runner.RunWith;

import serviceProcess.ServiceProcessPackage;

@RunWith(EUnitTestRunner.class)
public class ServiceProcessValidationTests implements IEUnitSuite {

	public final static class ValidationOperatorContributor extends OperationContributor {
		private IModel evlModel;

		@Override
		public boolean contributesTo(Object target) {
			return true;
		}

		@SuppressWarnings("unchecked")
		public void validate() throws Exception {
			if (evlModel != null) {
				context.getModelRepository().removeModel(evlModel);
			}

			EvlModule evl = new EvlModule();
			evl.parse(
				ServiceProcessValidationTests.class
				.getResource("/evl/service_process.evl")
				.toURI());
			evl.getContext().setModelRepository(context.getModelRepository());
			evl.execute();

			final IModel traceModel = new JavaModel(
				new ArrayList<Object>(evl.getContext().getUnsatisfiedConstraints()),
				Arrays.asList(EvlUnsatisfiedConstraint.class));
			traceModel.setName("EVL");

			context.getModelRepository().addModel(traceModel);
		}
	}

	@Override
	public OperationContributor getOperationContributor() {
		return new ValidationOperatorContributor();
	}

	@Override
	public URI getModuleURI() throws Exception {
		return new File("eunit/sp_validation.eunit").toURI();
	}

	@Override
	public List<IModel> prepareModels() throws Exception {
		final List<IModel> models = new ArrayList<IModel>();

		EmfModel dummySPModel = new EmfModel();
		dummySPModel.setName("SP");
		dummySPModel.setMetamodelUri(ServiceProcessPackage.eNS_URI);
		dummySPModel.setModelFile("dummy-model.uml");
		dummySPModel.setReadOnLoad(false);
		dummySPModel.setStoredOnDisposal(false);
		dummySPModel.load();
		models.add(dummySPModel);

		return models;
	}
}
