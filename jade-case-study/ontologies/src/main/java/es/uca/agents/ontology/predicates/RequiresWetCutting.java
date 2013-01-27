/**
 * Copyright (C) 2013 Antonio García-Domínguez.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Antonio García-Domínguez - initial API and implementation
 */
package es.uca.agents.ontology.predicates;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;

public class RequiresWetCutting implements Predicate {
	private static final long serialVersionUID = 1L;

	private String productID;

	@Slot(mandatory=true)
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}
}
