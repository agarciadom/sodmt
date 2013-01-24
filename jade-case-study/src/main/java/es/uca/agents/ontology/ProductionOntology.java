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

import jade.content.onto.BeanOntology;
import jade.content.onto.OntologyException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ontology for all concepts used in the case study.
 */
public class ProductionOntology extends BeanOntology {
	public static final String NAME = "uca_production";

	public static ProductionOntology getInstance() {
		return INSTANCE;
	}

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductionOntology.class);
	private static final ProductionOntology INSTANCE = new ProductionOntology();

	private ProductionOntology() {
		super(NAME);
		
		try {
			// Concepts
			add(Order.class);
			add(OrderResult.class);

			// Agent actions
			add(Manufacture.class);
		} catch (OntologyException e) {
			LOGGER.error("Could not set up the ontology", e);
		}
	}
}
