package es.uca.modeling.eol.comparison.cases;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.execute.context.IEolContext;

import serviceProcess.ServiceActivity;

public class InferenceAlgorithm {

	public static final String OPERATION_NEW = "distributeTime";
	public static final String OPERATION_OLD = "annotateTimeLimits";

	private static final String MAIN_EOL_BUNDLE = "es.uca.modeling.eol";
	private static final String MAIN_EOL_PATH = "/wizards/time_limits_sp.eol";	

	private static EolModule _module;

	private static EolModule getModule() throws Exception {
		if (_module == null) {
			URI uri = Platform.getBundle(MAIN_EOL_BUNDLE).getEntry(MAIN_EOL_PATH).toURI();
			_module = new EolModule();
			_module.parse(uri);
			_module.execute();
		}
		return _module;
	}

	private String fOperation;
	private double fAverageTime;

	public InferenceAlgorithm(String operationName) {
		fOperation = operationName;
	}

	public Map<String, Double> run(EmfModel model, Object... args) throws Exception {
		final EolModule module = getModule();
		final IEolContext context = module.getContext();
		context.getModelRepository().addModel(model);

		final EolOperation operation = module.getOperations().getOperation(fOperation);
		operation.execute(null, Arrays.asList(args), context);
		context.getExtendedProperties().clear();

		final Map<String, Double> mapResults = new HashMap<String, Double>();
		for (EObject o : model.getAllOfKind("ServiceActivity")) {
			ServiceActivity node = (ServiceActivity) o;
			mapResults.put(node.getName(), node.getAnnotation()
					.getSecsTimeLimit());
		}

		context.getModelRepository().removeModel(model);
		context.getExtendedProperties().clear();
		return mapResults;		
	}

	public Map<String, Double> timeAndRun(int iterations, EmfModel model, Object... args)
		throws Exception
	{
		final long startMillis = System.currentTimeMillis();

		Map<String, Double> result = null;
		for (int i = 0; i < iterations; ++i) {
			result = run(model, args);
		}

		fAverageTime = (System.currentTimeMillis() - startMillis)/(iterations * 1000.0);
		return result;		
	}

	public double getAverageTime() {
		return fAverageTime;
	}
}
