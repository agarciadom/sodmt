package es.uca.modeling.eol.comparison.cases;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.jfree.data.general.Dataset;

import es.uca.modeling.eol.comparison.model.ICaseStudy;

/**
 * Case study for a sequential graph.
 * 
 * @author Antonio García-Domínguez
 */
public class SequenceCaseStudy implements ICaseStudy {

	private static final String PARAM_MINSIZE = "minSize";
	private static final String PARAM_MAXSIZE = "maxSize";
	private int fMinSize, fMaxSize;

	@Override
	public String getName() {
		return "Sequence";
	}

	@Override
	public Collection<String> getParameterNames() {
		return Arrays.asList(PARAM_MINSIZE, PARAM_MAXSIZE);
	}

	@Override
	public String getParameter(String name) {
		if (PARAM_MAXSIZE.equals(name)) {
			return Integer.toString(fMaxSize);
		} else if (PARAM_MINSIZE.equals(name)) {
			return Integer.toString(fMinSize);
		} else return null;
	}

	@Override
	public void setParameter(String name, String value) {
		try {
			if (PARAM_MAXSIZE.equals(name)) {
				fMaxSize = Integer.valueOf(value);
			} else if (PARAM_MINSIZE.equals(name)) {
				fMinSize = Integer.valueOf(value);
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
