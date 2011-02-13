package es.uca.modeling.eol.marte.tools;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.types.CollectionAnnotator;

/**
 * Simple tool for invoking the garbage collector. Useful for getting
 * more predictable timings.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class GCTool {

	public void gc(EmfModel model) throws EolModelLoadingException {
		model.dispose();
		CollectionAnnotator.getInstance().clear();
		model.loadModelFromUri();
		System.gc();
	}
}
