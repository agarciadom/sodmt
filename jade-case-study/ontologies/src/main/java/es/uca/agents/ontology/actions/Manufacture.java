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
package es.uca.agents.ontology.actions;

import es.uca.agents.ontology.concepts.OrderConfirmation;
import es.uca.agents.ontology.concepts.OrderRequest;
import jade.content.AgentAction;
import jade.content.onto.annotations.Result;
import jade.content.onto.annotations.Slot;

@Result(type=OrderConfirmation.class)
public class Manufacture implements AgentAction {
	private static final long serialVersionUID = 1L;

	private OrderRequest order;

	@Slot(mandatory = true)
	public OrderRequest getOrder() {
		return order;
	}

	public void setOrder(OrderRequest order) {
		this.order = order;
	}
}
