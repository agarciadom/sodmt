package es.uca.modelling.performance.sodmt.evl.tests;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
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
			URI evlURI = ServiceProcessValidationTest.class
				.getResource(AbstractValidationTest.this.getPathToEVL())
				.toURI();
			evl.parse(evlURI);

			if (!evl.getParseProblems().isEmpty()) {
				StringBuilder sb = new StringBuilder("EVL at " + evlURI + " reported parsing problems:");
				sb.append(System.lineSeparator());
				for (ParseProblem problem : evl.getParseProblems()) {
					sb.append(problem.toString());
					sb.append(System.lineSeparator());
				}
				fail(sb.toString());
			}

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
