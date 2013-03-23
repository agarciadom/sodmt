package es.uca.modeling.eol.comparison.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import es.uca.modeling.eol.comparison.model.CaseStudyConfigurationModel;

/**
 * Content provider for the case study selector combo box.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
class CaseStudyContentProvider implements IStructuredContentProvider {
	public Object[] getElements(Object inputElement) {
		final CaseStudyConfigurationModel model = (CaseStudyConfigurationModel) inputElement;
		return model.getCaseStudies().toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}