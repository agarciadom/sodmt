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
import serviceProcess.DecisionNode;
import serviceProcess.FinalNode;
import serviceProcess.InitialNode;
import serviceProcess.JoinNode;
import serviceProcess.ServiceProcess;

/**
 * Case study for a dense DAG.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class DenseCaseStudy extends AbstractCaseStudy {

	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private int fMinSize = 0, fMaxSize = 10;

	@Override
	public String getName() {
		return "Dense";
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
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		} else if (PARAM_MINSIZE.equals(name)) {
			return Integer.toString(fMinSize);
		} else return super.getParameter(name);
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
	protected List<EmfModel> buildModels() throws EolModelLoadingException,
			EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		List<EmfModel> models = new ArrayList<EmfModel>();
		for (int i = fMinSize; i <= fMaxSize; ++i) {
			models.add(buildModel(i));
		}
		return models;
	}

	@SuppressWarnings("rawtypes")
	private EmfModel buildModel(int size)
		throws EolModelLoadingException,
			EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException
	{
		EmfModel model = createModel("dense" + size);

		final ServiceProcess process = (ServiceProcess)model.createInstance("ServiceProcess");
		final EList nodes = process.getNodes();
		final EList edges = process.getEdges();

		final InitialNode start = (InitialNode)addNode(model, nodes, "InitialNode");
		final List<DecisionNode> decisions = new ArrayList<DecisionNode>();
		ActivityNode prevLevel = start;

		for (int i = 0; i < size; ++i) {
			final DecisionNode decision = (DecisionNode)addNode(model, nodes, "DecisionNode");
			final Action activity = (Action)addNode(model, nodes, "Action");
			final JoinNode join = (JoinNode)addNode(model, nodes, "JoinNode");
			decisions.add(decision);

			// Add edge from the join of the previous level to this level's decision node
			addEdge(model, edges, prevLevel, decision);
			prevLevel = join;

			// Add edges in the decision-activity-join chain
			addEdge(model, edges, decision, activity);
			addEdge(model, edges, activity, join);

			// Add edges from previous decisions to the current join node
			for (DecisionNode d : decisions) {
				addEdge(model, edges, d, join);
			}
		}

		final FinalNode finish = (FinalNode)addNode(model, nodes, "FinalNode");
		addEdge(model, edges, prevLevel, finish);
		return model;
	}

	@Override
	protected void validateConfiguration() {
		super.validateConfiguration();
		if (fMinSize > fMaxSize) {
			throw new IllegalArgumentException(PARAM_MINSIZE + " must be smaller than " + PARAM_MAXSIZE);
		}
	}
}
