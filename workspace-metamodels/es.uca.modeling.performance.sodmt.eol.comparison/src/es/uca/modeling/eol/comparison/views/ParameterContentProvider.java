package es.uca.modeling.eol.comparison.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import es.uca.modeling.eol.comparison.model.CaseStudyConfigurationModel;

/**
 * Content provider for the parameter table.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
class ParameterContentProvider implements IStructuredContentProvider, PropertyChangeListener {
	private Viewer fViewer;

	public Object[] getElements(Object inputElement) {
		final CaseStudyConfigurationModel model = (CaseStudyConfigurationModel)inputElement;
		return model.getParameters().toArray();
	}

	public void dispose() {}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		fViewer = viewer;
		if (oldInput != null) {
			((CaseStudyConfigurationModel)oldInput).removePropertyChangeListener(this);
		}
		if (newInput != null) {
			((CaseStudyConfigurationModel)newInput).addPropertyChangeListener(
					CaseStudyConfigurationModel.PROPEV_NAME, this);
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		fViewer.refresh();
	}
}