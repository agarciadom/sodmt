package es.uca.modeling.eol.comparison.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AbstractModel {

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public AbstractModel() {
		super();
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void firePropertyChange(String name, Object oldValue, Object newValue) {
		propertyChangeSupport.firePropertyChange(name, oldValue, newValue);
	}
}