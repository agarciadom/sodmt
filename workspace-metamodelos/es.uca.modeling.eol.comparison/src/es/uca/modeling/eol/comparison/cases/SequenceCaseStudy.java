package es.uca.modeling.eol.comparison.cases;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;

import serviceProcess.FlowNode;
import serviceProcess.ProcessControlFlow;
import serviceProcess.ProcessFinish;
import serviceProcess.ProcessStart;
import serviceProcess.ServiceActivity;
import serviceProcess.ServiceProcess;
import serviceProcess.ServiceProcessPackage;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private EmfModel buildModel(int size)
		throws EolModelElementTypeNotFoundException,
			EolNotInstantiableModelElementTypeException,
			EolModelLoadingException
	{
		EmfModel model
			= EmfModelFactory.getInstance().createEmfModel("",
					new File("size" + size + ".model"), ServiceProcessPackage.eINSTANCE);
		model.setReadOnLoad(false);
		model.setStoredOnDisposal(false);
		model.load();

		final ServiceProcess process = (ServiceProcess)model.createInstance("ServiceProcess");
		final EList nodes = process.getNodes();
		final EList edges = process.getEdges();

		final ProcessStart start = (ProcessStart)model.createInstance("ProcessStart");
		final ProcessFinish finish = (ProcessFinish)model.createInstance("ProcessFinish");
		nodes.add(start);
		nodes.add(finish);

		FlowNode previousNode = start;
		for (int i = 0; i < size; ++i) {
			final ServiceActivity activity
				= (ServiceActivity)model.createInstance("ServiceActivity");
			activity.setName("A" + i);
			nodes.add(activity);

			final ProcessControlFlow edge
				= (ProcessControlFlow)model.createInstance("ProcessControlFlow");
			edges.add(edge);

			edge.setSource(previousNode);
			edge.setTarget(activity);
			previousNode = activity;
		}

		final ProcessControlFlow lastEdge
			= (ProcessControlFlow)model.createInstance("ProcessControlFlow");
		edges.add(lastEdge);
		lastEdge.setSource(previousNode);
		lastEdge.setTarget(finish);

		return model;
	}

}
