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
import jade.content.onto.annotations.Slot;

public class OrderConfirmation implements Concept {
	private static final long serialVersionUID = 1L;

	private String newOrderID;

	@Slot(mandatory=true)
	public String getNewOrderID() {
		return newOrderID;
	}

	public void setNewOrderID(String newOrderID) {
		this.newOrderID = newOrderID;
	}
}
