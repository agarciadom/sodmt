package es.uca.modeling.eol.marte.tests;

import static org.junit.Assert.assertTrue;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.InitialNode;
import org.junit.After;
import org.junit.Before;

/**
 * Base class for all the test cases used for the inference algorithms.
 * 
 * @author Antonio García-Domínguez
 */
public class AbstractInferenceTest {

	protected static final String TIME_LIMITS_EOL_PATH   = "/eol/time_limits.eol";
	protected static final String THROUGHPUT_EOL_PATH    = "/eol/throughput.eol";
	protected static final String MODEL_PATH = "model.uml";

	private static final Pattern REGEX_COMMA_SPLIT = Pattern.compile(" *, *");
	private static final Pattern REGEX_EQUAL_SPLIT = Pattern.compile(" *= *");
	protected static final String ACTIVITY_HANDLE_ORDER = "Handle Order";
	protected static final String ACTIVITY_SEQ_WITH_REPS = "SequenceWithRepetitions";

	private EolModule mEolModule;
	private final String mEolPath;

	public AbstractInferenceTest(String eolPath) {
		mEolPath = eolPath;
	}

	public Object callOperation(String name, Object... args)
			throws EolRuntimeException {
		EolOperation op = mEolModule.getOperations().getOperation(name);
		return op.execute(null, Arrays.asList(args), mEolModule.getContext());
	}

	@Before
	public void setUp() throws URISyntaxException, Exception {
		loadModule(mEolPath);
	}

	@After
	public void clearModels() {
		mEolModule.getContext().getModelRepository().dispose();
	}

	protected InitialNode getStartNode(final EmfModel model,
			final String activityName)
			throws EolModelElementTypeNotFoundException {
		final Activity activity = getActivity(model, activityName);
		if (activity == null) return null;

		for (EObject node : activity.getOwnedNodes()) {
			if (node instanceof InitialNode) {
				return (InitialNode) node;
			}
		}
		return null;
	}

	protected List<EObject> getEndNodes(final EmfModel model, final String activityName)
			throws EolModelElementTypeNotFoundException {
		final Activity activity = getActivity(model, activityName);
		if (activity == null) return null;

		List<EObject> endNodes = new ArrayList<EObject>();
		for (EObject node : activity.getOwnedNodes()) {
			if (node instanceof FinalNode) {
				endNodes.add(node);
			}
		}
		return endNodes;
	}

	protected Activity getActivity(final EmfModel model, final String activityName)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> activities = model.getAllOfKind("Activity");
		Activity activity = null;
		for (EObject o : activities) {
			if (o instanceof Activity) {
				activity = (Activity) o;
				if (activityName.equals(activity.getName())) {
					break;
				}
			}
		}
		return activity;
	}

	private void loadModule(String name) throws URISyntaxException, Exception,
			EolRuntimeException {
		java.net.URI uri = ConstraintAggregationTest.class.getResource(name).toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		mEolModule.execute();
	}

	/**
	 * Loads a model twice: once with the standard UML2 Ecore package, and again with the
	 * MARTE package, so both type systems are available inside the EOL script.
	 */
	public EmfModel loadMarteModel(String modelPath) throws EolModelLoadingException {
		final EPackage martePkg = MARTEPackage.eINSTANCE;
		assertTrue(EPackage.Registry.INSTANCE.containsKey(martePkg.getNsURI()));

		return loadModel("", modelPath, MARTEPackage.eNS_URI);
	}

	private EmfModel loadModel(String name, String modelPath,
			String namespaceURI) throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setName(name);
		model.setMetamodelUri(namespaceURI);
		model.setModelFileUri(URI.createURI(getClass().getResource(modelPath)
				.toExternalForm()));
		model.load();
		mEolModule.getContext().getModelRepository().addModel(model);
		return model;
	}

	protected Map<String, String> getKeyvalMap(String hostDemand) {
		Map<String, String> map = new HashMap<String, String>();
		if (!hostDemand.startsWith("(")) return map;
		for (String keyval : REGEX_COMMA_SPLIT.split(hostDemand.substring(1, hostDemand.length()-1))) {
			String[] parts = REGEX_EQUAL_SPLIT.split(keyval);
			map.put(parts[0], parts[1]);
		}
		return map;
	}

	protected List<ExecutableNode> getExecutableNodes(EmfModel model, String activityName)
			throws EolModelElementTypeNotFoundException {
				final Activity activity = getActivity(model, activityName);
				final List<ExecutableNode> execNodes = new ArrayList<ExecutableNode>();
				for (EObject o : activity.getOwnedNodes()) {
					if (o instanceof ExecutableNode) {
						execNodes.add((ExecutableNode)o);
					}
				}
				return execNodes;
			}

}