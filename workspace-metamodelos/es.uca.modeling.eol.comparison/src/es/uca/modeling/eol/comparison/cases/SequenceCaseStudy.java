package es.uca.modeling.eol.comparison.cases;

import java.util.Arrays;
import java.util.Collection;

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
		if (PARAM_MAXSIZE.equals(name)) {
			fMaxSize = Integer.valueOf(value);
		}
		else if (PARAM_MINSIZE.equals(name)) {
			fMinSize = Integer.valueOf(value);
		}
	}

	@Override
	public Dataset run() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

}
