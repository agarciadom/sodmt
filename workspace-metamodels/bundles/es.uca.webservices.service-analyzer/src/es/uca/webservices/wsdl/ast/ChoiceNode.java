/*
 *  Copyright 2011 Antonio García Domínguez (antonio.garciadominguez@uca.es)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package es.uca.webservices.wsdl.ast;

import java.util.List;

/**
 * Subclass of ASTNode that represents a choice between different possibilities. This
 * usually reflects an <xsd:choice> element or an <xsd:union> element.
 *
 * @author Antonio García-Domínguez (antonio.garciadominguez@uca.es)
 */
public class ChoiceNode extends ASTNode {

	private List<ASTNode> nodes;

	/**
	 * Constructor.
	 * @param nodes AST nodes for the available choices.
	 */
	public ChoiceNode(List<ASTNode> nodes) {
		this.nodes = nodes;
	}

	/**
	 * Returns the available choices.
	 */
	public List<ASTNode> getNodes() {
		return nodes;
	}

	/**
	 * Changes the available choices.
	 */
	public void setNodes(List<ASTNode> nodes) {
		this.nodes = nodes;
	}

	@Override
	public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	@Override
	public String toString() {
		return "ChoiceNode [nodes=" + nodes + "]";
	}

}
