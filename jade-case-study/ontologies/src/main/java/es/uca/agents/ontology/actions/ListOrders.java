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

import jade.content.AgentAction;
import jade.content.onto.annotations.AggregateResult;

@AggregateResult(type=String.class)
public class ListOrders implements AgentAction {
	private static final long serialVersionUID = 1L;
}
