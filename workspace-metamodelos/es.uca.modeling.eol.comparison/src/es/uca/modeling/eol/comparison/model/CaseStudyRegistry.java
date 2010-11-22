package es.uca.modeling.eol.comparison.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Registry for the existing case studies.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class CaseStudyRegistry {

	Map<String, ICaseStudy> registry = new HashMap<String, ICaseStudy>();

	/**
	 * Adds a new case study to the registry.
	 */
	public void register(ICaseStudy caseStudy) {
		registry.put(caseStudy.getName(), caseStudy);
	}

	/**
	 * Removes a case study from the registry, by name.
	 */
	public void unregister(String name) {
		registry.remove(name);
	}

	/**
	 * Returns the case study with name <code>name</code>, or <code>null</code>
	 * if it does not exist.
	 */
	public ICaseStudy get(String name) {
		return registry.get(name);
	}

	/**
	 * Lists the available case studies, by name.
	 */
	public Collection<String> list() {
		return registry.keySet();
	}
}
