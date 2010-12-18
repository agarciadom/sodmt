package es.uca.modeling.eol.comparison.cases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;

import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;

public class DipoleSequenceCaseStudy extends AbstractCaseStudy {

	private static final int DEFAULT_NUM_DIPOLES = 3;
	private static final int DEFAULT_BRANCH_FACTOR = 3;
	private static final String CASE_STUDY_NAME = "DipoleSequence";
	private static final String PARAM_BRANCH_FACTOR = "branchFactor";
	private static final String PARAM_NUM_DIPOLES = "numDipoles";

	private int fBranchFactor = DEFAULT_BRANCH_FACTOR;
	private int fNumDipoles = DEFAULT_NUM_DIPOLES;

	@Override
	public Collection<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.addAll(super.getParameterNames());
		names.add(PARAM_BRANCH_FACTOR);
		names.add(PARAM_NUM_DIPOLES);
		return names;
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_BRANCH_FACTOR.equals(name)) {
			return Integer.toString(fBranchFactor);
		} else if (PARAM_NUM_DIPOLES.equals(name)) {
			return Integer.toString(fNumDipoles);
		} else return super.getParameter(name);
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_BRANCH_FACTOR.equals(name)) {
				fBranchFactor = Integer.valueOf(value);
			} else if (PARAM_NUM_DIPOLES.equals(name)) {
				fNumDipoles = Integer.valueOf(value);
			} else super.setParameter(name, value);
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	@Override
	public String getName() {
		return CASE_STUDY_NAME;
	}

	@Override
	protected List<EmfModel> buildModels() throws EolModelLoadingException,
			EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException {
		List<EmfModel> models = new ArrayList<EmfModel>();
		for (int i = 0; i <= fNumDipoles; ++i) {
			models.add(buildModel(i, fBranchFactor));
		}
		return models;
	}

	@SuppressWarnings("rawtypes")
	private static EmfModel buildModel(final int numDipoles, final int branchFactor) throws EolModelLoadingException, EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {
		EmfModel model = createModel("dipoles" + numDipoles + "bf" + branchFactor);

		final ServiceProcess process = (ServiceProcess)model.createInstance("ServiceProcess");
		final EList nodes = process.getNodes();
		final EList edges = process.getEdges();

		ServiceActivity previous = (ServiceActivity)addNode(model, nodes, "ServiceActivity");
		previous.setName("S");
		for (int i = 0; i < numDipoles; ++i) {
			final ServiceActivity forkNode = (ServiceActivity)addNode(model, nodes, "ServiceActivity");
			final ServiceActivity joinNode = (ServiceActivity)addNode(model, nodes, "ServiceActivity");
			forkNode.setName("F" + i);
			joinNode.setName("J" + i);
			addEdge(model, edges, previous, forkNode);

			for (int j = 0; j < branchFactor; ++j) {
				final ServiceActivity branchNode = (ServiceActivity)addNode(model, nodes, "ServiceActivity");
				branchNode.setName("B" + i + j);
				addEdge(model, edges, forkNode, branchNode);
				addEdge(model, edges, branchNode, joinNode);
			}

			previous = joinNode;
		}
		/*
		ProcessFinish finish = (ProcessFinish)addNode(model, nodes, "ProcessFinish");
		addEdge(model, edges, previous, finish);
		*/

		return model;
	}

}
