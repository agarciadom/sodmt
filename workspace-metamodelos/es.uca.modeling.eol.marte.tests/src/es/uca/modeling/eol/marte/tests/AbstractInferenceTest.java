package es.uca.modeling.eol.marte.tests;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
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

	private EolModule mEolModule;

	public Object callOperation(String name, Object... args)
			throws EolRuntimeException {
		EolOperation op = mEolModule.getOperations().getOperation(name);
		return op.execute(null, Arrays.asList(args), mEolModule.getContext());
	}

	public EmfModel loadModel(String name, String modelPath, String namespaceURI)
			throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setName(name);
		model.setMetamodelUri(namespaceURI);
		model.setModelFileUri(URI.createURI(getClass().getResource(modelPath)
				.toExternalForm()));
		model.load();
		mEolModule.getContext().getModelRepository().addModel(model);
		return model;
	}

	@Before
	public void setUp() throws URISyntaxException, Exception {
		loadModule("/eol/time_limits.eol");
	}

	@After
	public void clearModels() {
		mEolModule.getContext().getModelRepository().dispose();
	}

	protected InitialNode getStartNode(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> flowNodes = model.getAllOfKind("InitialNode");
		for (EObject o : flowNodes) {
			final InitialNode node = (InitialNode) o;
			return node;
		}
		return null;
	}

	protected List<EObject> getEndNodes(EmfModel model)
			throws EolModelElementTypeNotFoundException {
		Collection<EObject> flowNodes = model.getAllOfKind("FinalNode");
		List<EObject> endNodes = new ArrayList<EObject>();
		for (EObject o : flowNodes) {
			final FinalNode node = (FinalNode) o;
			endNodes.add(node);
		}
		return endNodes;
	}

	private void loadModule(String name) throws URISyntaxException, Exception,
			EolRuntimeException {
		java.net.URI uri = ConstraintAggregationTest.class.getResource(name)
				.toURI();
		mEolModule = new EolModule();
		mEolModule.parse(uri);
		mEolModule.execute();
	}

}