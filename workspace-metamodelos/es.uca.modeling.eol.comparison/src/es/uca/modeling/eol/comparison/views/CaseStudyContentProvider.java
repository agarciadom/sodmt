package es.uca.modeling.eol.comparison.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import es.uca.modeling.eol.comparison.model.CaseStudyConfigurationModel;

class CaseStudyContentProvider implements IStructuredContentProvider {
	public Object[] getElements(Object inputElement) {
		final CaseStudyConfigurationModel model = (CaseStudyConfigurationModel)inputElement;
		return model.getCaseStudies().toArray();
	}
	public void dispose() {}
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
}