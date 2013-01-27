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
package es.uca.agents.ontology.concepts;

import jade.content.Concept;

public class Product implements Concept {
	private static final long serialVersionUID = 1L;

	private String productID;
	private boolean requiresWetCutting;

	public Product() {}

	public Product(String id, boolean bRequiresWetCutting) {
		this.productID = id;
		this.requiresWetCutting = bRequiresWetCutting;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public boolean isRequiresWetCutting() {
		return requiresWetCutting;
	}

	public void setRequiresWetCutting(boolean requiresWetCutting) {
		this.requiresWetCutting = requiresWetCutting;
	}
}
