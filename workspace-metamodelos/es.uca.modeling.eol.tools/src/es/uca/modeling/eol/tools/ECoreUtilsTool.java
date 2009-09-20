package es.uca.modeling.eol.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ECoreUtilsTool {

	public EObject copy(EObject eObject) {
		return EcoreUtil.copy(eObject);
	}

}
