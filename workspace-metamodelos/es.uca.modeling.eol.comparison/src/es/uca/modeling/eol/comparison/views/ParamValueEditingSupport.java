package es.uca.modeling.eol.comparison.views;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import es.uca.modeling.eol.comparison.model.ParameterProxy;

public class ParamValueEditingSupport extends EditingSupport {

	private TableViewer fViewer;

	public ParamValueEditingSupport(TableViewer viewer) {
		super(viewer);
		this.fViewer = viewer;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return new TextCellEditor(fViewer.getTable());
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		if (element instanceof ParameterProxy) {
			ParameterProxy e = (ParameterProxy)element;
			return e.getParameterValue();
		} else return element.toString();
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof ParameterProxy) {
			ParameterProxy e = (ParameterProxy)element;
			try {
				e.setParameterValue((String)value);
				fViewer.update(element, null);
			} catch (IllegalArgumentException ex) {
				// do not change the displayed value
			}
		}
	}

}
