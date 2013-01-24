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
package es.uca.agents.ontology;

import jade.content.Concept;
import jade.content.onto.annotations.Slot;

/**
 * Java bean that contains all the information of a customer order.
 */
public class Order implements Concept {
	private static final long serialVersionUID = 1L;

	private String productID;
	private int quantity;

	@Slot(mandatory = true)
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	@Slot(mandatory = true)
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
