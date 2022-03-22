package es.uca.modelling.performance.sodmt.evl.tests;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.java.JavaModel;
import org.eclipse.epsilon.eunit.junit.IEUnitSuite;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;


public abstract class AbstractValidationTest implements IEUnitSuite {

	public final class ValidationOperatorContributor extends OperationContributor {
		private IModel evlModel;

		private ValidationOperatorContributor() {}

		@Override
		public boolean contributesTo(Object target) {
			return true;
		}

		public void validate() throws Exception {
			if (evlModel != null) {
				getContext().getModelRepository().removeModel(evlModel);
			}

			EvlModule evl = new EvlModule();
			evl.parse(
				ServiceProcessValidationTest.class
				.getResource(AbstractValidationTest.this.getPathToEVL())
				.toURI());
			evl.getContext().setModelRepository(getContext().getModelRepository());
			evl.execute();

			final IModel traceModel = new JavaModel(
				new ArrayList<Object>(evl.getContext().getUnsatisfiedConstraints()),
				Arrays.asList(UnsatisfiedConstraint.class));
			traceModel.setName("EVL");

			getContext().getModelRepository().addModel(traceModel);
		}
	}

	protected abstract String getPathToEUnit();
	protected abstract String getPathToEVL();

	@Override
	public OperationContributor getOperationContributor() {
		return new ValidationOperatorContributor();
	}

	@Override
	public URI getModuleURI() throws Exception {
		return new File(getPathToEUnit()).toURI();
	}
}
