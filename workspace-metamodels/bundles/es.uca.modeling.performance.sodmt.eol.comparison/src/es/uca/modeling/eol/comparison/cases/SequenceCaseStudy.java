package es.uca.modeling.eol.comparison.cases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;

import serviceProcess.Action;
import serviceProcess.ActivityNode;
import serviceProcess.FinalNode;
import serviceProcess.InitialNode;
import serviceProcess.ServiceProcess;

/**
 * Case study for a sequential graph.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class SequenceCaseStudy extends AbstractCaseStudy {

	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private int fMinSize = 0, fMaxSize = 10;

	@Override
	public String getName() {
		return "Sequence";
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		} else if (PARAM_MINSIZE.equals(name)) {
			return Integer.toString(fMinSize);
		} else return super.getParameter(name);
	}

	@Override
	public Collection<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.addAll(super.getParameterNames());
		names.add(PARAM_MINSIZE);
		names.add(PARAM_MAXSIZE);
		return names;
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_MAXSIZE.equals(name)) {
				fMaxSize = Integer.valueOf(value);
			} else if (PARAM_MINSIZE.equals(name)) {
				fMinSize = Integer.valueOf(value);
			} else super.setParameter(name, value);
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	@Override
	protected List<EmfModel> buildModels()
		throws EolModelLoadingException,
			EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException
	{
		List<EmfModel> models = new ArrayList<EmfModel>();
		for (int i = fMinSize; i <= fMaxSize; ++i) {
			models.add(buildModel(i));
		}
		return models;
	}

	@Override
	protected void validateConfiguration() {
		super.validateConfiguration();
		if (fMinSize > fMaxSize) {
			throw new IllegalArgumentException(PARAM_MINSIZE + " must be smaller than " + PARAM_MAXSIZE);
		}
	}

	@SuppressWarnings("rawtypes")
	private EmfModel buildModel(int size)
		throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException,
			EolModelLoadingException
	{
		final EmfModel model = createModel("sequence" + size);

		final ServiceProcess process = (ServiceProcess)model.createInstance("ServiceProcess");
		final EList nodes = process.getNodes();
		final EList edges = process.getEdges();

		final InitialNode start = (InitialNode)addNode(model, nodes, "InitialNode");
		final FinalNode finish = (FinalNode)addNode(model, nodes, "FinalNode");

		ActivityNode previousNode = start;
		for (int i = 0; i < size; ++i) {
			final Action activity = (Action)addNode(model, nodes, "Action");
			activity.setName("A" + i);

			addEdge(model, edges, previousNode, activity);
			previousNode = activity;
		}

		addEdge(model, edges, previousNode, finish);
		return model;
	}

}
