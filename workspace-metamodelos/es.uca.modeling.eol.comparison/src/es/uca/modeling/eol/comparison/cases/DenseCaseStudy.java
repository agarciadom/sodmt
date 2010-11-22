package es.uca.modeling.eol.comparison.cases;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.jfree.data.general.Dataset;

import es.uca.modeling.eol.comparison.model.ICaseStudy;

/**
 * Case study for a dense DAG.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class DenseCaseStudy implements ICaseStudy {

	private static final String PARAM_MAXSIZE = "maxSize";
	private int fMaxSize;

	@Override
	public String getName() {
		return "Dense";
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_MAXSIZE);
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		}
		else return null;
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_MAXSIZE.equals(name)) {
				fMaxSize = Integer.valueOf(value);
			}
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	@Override
	public IStatus run(Dataset dataset, IProgressMonitor monitor)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return Status.OK_STATUS;
	}

}
