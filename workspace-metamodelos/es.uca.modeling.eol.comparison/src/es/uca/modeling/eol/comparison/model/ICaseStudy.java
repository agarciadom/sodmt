package es.uca.modeling.eol.comparison.model;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.jfree.data.general.Dataset;

/**
 * Interface for all valid case studies.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public interface ICaseStudy {

	/**
	 * Returns the human name for the case study.
	 */
	String getName();

	/**
	 * Returns the list of the available parameters.
	 */
	Collection<String> getParameterNames();

	/**
	 * Returns the value of a specific parameter.
	 */
	String getParameter(String name);

	/**
	 * Changes the value of a specific parameter.
	 * @throws IllegalArgumentException Invalid parameter, or invalid value for the parameter.
	 */
	void setParameter(String name, String value) throws IllegalArgumentException;

	/**
	 * Runs the case study and returns a set of results to be displayed in the chart.
	 * @param dataset Dataset to which results should be added.
	 * @param monitor Progress monitor for the Eclipse job.
	 * @return {@link Status#OK_STATUS} if everything went well, {@link Status#CANCEL_STATUS} if it was cancelled.
	 * @throws IllegalArgumentException The case study was not correctly configured.
	 */
	IStatus run(Dataset dataset, IProgressMonitor monitor) throws IllegalArgumentException;

}
