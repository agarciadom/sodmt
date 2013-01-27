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

public class OrderStatus implements Concept {
	private static final long serialVersionUID = 1L;

	private String orderID, articleID;
	private int requestedQuantity;
	private boolean done = false;

	public OrderStatus() {}

	public OrderStatus(String oID, String aID, int requested) {
		this.orderID = oID;
		this.articleID = aID;
		this.requestedQuantity = requested;
	}

	@Slot(mandatory=true)
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	@Slot(mandatory=true)
	public String getArticleID() {
		return articleID;
	}

	public void setArticleID(String articleID) {
		this.articleID = articleID;
	}

	@Slot(mandatory=true)
	public int getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(int requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
