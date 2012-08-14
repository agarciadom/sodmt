package es.uca.modeling.eol.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eunit.EUnitModule;
import org.eclipse.epsilon.eunit.EUnitTest;
import org.eclipse.epsilon.eunit.EUnitTestListener;
import org.eclipse.epsilon.eunit.EUnitTestResultType;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.InitializationError;

/**
 * <p>
 * Bridge runner between EUnit and JUnit. Can be used to turn an EUnit script
 * into a JUnit Plug-in Test, for continuous integration.
 * </p>
 * 
 * <p>
 * This runner should only be used with test classes that implement the
 * {@link IEUnitSuite} interface for specifying the URI to the .eunit script and
 * reloading the models between tests.
 * </p>
 * 
 * <p>
 * Unlike previous EUnit test runners that only supported a subset of EUnit,
 * this runner supports every feature in EUnit except for those specific to Ant,
 * such as the runTask operation.
 * </p>
 */
public class EUnitTestRunner extends ParentRunner<EUnitTest> {

	private final class JUnitEUnitTestListener implements EUnitTestListener {
		private final RunNotifier notifier;

		private JUnitEUnitTestListener(RunNotifier notifier) {
			this.notifier = notifier;
		}

		@Override
		public void beforeCase(EUnitModule module, EUnitTest test) {
			final Description desc = describeChild(test);
			notifier.fireTestStarted(desc);
			if (test.getResult().equals(EUnitTestResultType.SKIPPED)) {
				notifier.fireTestIgnored(desc);
			}

			if (test.isLeafTest()) {
				final ModelRepository repository = module.getContext().getModelRepository();
				repository.dispose();
				try {
					final List<IModel> models = suiteInstance.prepareModels();
					if (models != null) {
						for (IModel model : models) {
							repository.addModel(model);
						}
					}
				} catch (Exception e) {
					test.setResult(EUnitTestResultType.ERROR);
					test.setException(e);
				}
			}
		}

		@Override
		public void afterCase(EUnitModule module, EUnitTest test) {
			final Description desc = describeChild(test);
			if (test.getResult().equals(EUnitTestResultType.FAILURE)
					|| test.getResult().equals(EUnitTestResultType.ERROR)) {
				notifier.fireTestFailure(new Failure(desc, test.getException()));
			}
			notifier.fireTestFinished(desc);
		}
	}

	private Map<EUnitTest, Description> testDescriptions = new IdentityHashMap<EUnitTest, Description>();
	private EUnitModule module;
	private IEUnitSuite suiteInstance;

	public EUnitTestRunner(Class<? extends IEUnitSuite> testClass) throws InitializationError {
		super(testClass);
		try {
			suiteInstance = testClass.newInstance();
			module = new EUnitModule();
			module.parse(suiteInstance.getModuleURI());
		} catch (Exception e) {
			e.printStackTrace();
			throw new InitializationError(e);
		}
	}

	@Override
	protected List<EUnitTest> getChildren() {
		try {
			return Arrays.asList(module.getSuiteRoot());
		} catch (EolRuntimeException e) {
			e.printStackTrace();
			return new ArrayList<EUnitTest>();
		}
	}

	@Override
	protected Description describeChild(EUnitTest child) {
		if (testDescriptions.containsKey(child)) {
			return testDescriptions.get(child);
		}

		Description desc;
		if (child.isRootTest()) {
			desc = Description.createSuiteDescription(this.getTestClass().getJavaClass());
		} else {
			desc = Description.createTestDescription(this.getTestClass().getJavaClass(), child.getCaseName());
		}
		for (EUnitTest c : child.getChildren()) {
			desc.addChild(describeChild(c));
		}
		testDescriptions.put(child, desc);
		return desc;
	}

	@Override
	protected void runChild(final EUnitTest child, final RunNotifier notifier) {
		final Description thisDesc = describeChild(child);

		// We only need to launch the root EUnitTest from JUnit: EUnit will take care of the rest 
		if (child.isRootTest()) {
			try {
				final JUnitEUnitTestListener listener = new JUnitEUnitTestListener(notifier);
				module.addTestListener(listener);
				module.execute();
				module.removeTestListener(listener);
			} catch (EolRuntimeException e) {
				notifier.fireTestFailure(new Failure(thisDesc, e));
			}
		}
	}
}
