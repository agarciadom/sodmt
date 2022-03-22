/*
 *  Copyright 2010 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
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

import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Subclass of ASTNode that represents a list of ASTNodes.
 * Usually represents a list of xsd:attribute elements or the elements that a xsd:sequence contains
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class ListNode extends ASTNode {

    private List<ASTNode> nodes;
    private Boolean isMixed;
    private static final Logger LOGGER = LoggerFactory.getLogger(ListNode.class);

    /**
     * Constructor
     * @param nodes ASTNode elements that the list contains
     * @param isMixed True if the list could contain various types of ASTNodes (like in a xsd:sequence)
     */
    public ListNode(List<ASTNode> nodes, Boolean isMixed) {
        this.nodes = nodes;
        this.isMixed = isMixed;
        LOGGER.debug("Creado LIST isMisex=" + this.isMixed);
    }

    /**
     * Sets the list of ASTNodes of the ListNode
     * @param nodes The list of ASTNodes of the ListNode
     */
    public void setNodes(List<ASTNode> nodes) {
        this.nodes = nodes;
    }

    /**
     * Gets the list of ASTNodes of the ListNode
     * @return The list of ASTNodes of the ListNode
     */
    public List<ASTNode> getNodes() {
        return this.nodes;
    }

    /**
     * Returns true if the list is a mixed list (tuple)
     * @return True if the list is a mixed list (tuple)
     */
    public Boolean isAMixedList() {
        return this.isMixed;
    }

    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = genericHash(this.nodes.hashCode(), this.isMixed.hashCode());
        }
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode other = (ListNode) o;
        Boolean isEqual = this.isMixed.equals(other.isMixed);
        Iterator<ASTNode> i1 = this.nodes.iterator(),
                i2 = other.nodes.iterator();

        while (i1.hasNext() && i2.hasNext() && isEqual) {
            ASTNode thisNodeItem = (ASTNode) i1.next();
            ASTNode otherNodeItem = (ASTNode) i2.next();
            isEqual = thisNodeItem.equals(otherNodeItem);
        }
        if (i1.hasNext() || i2.hasNext()) {
            isEqual = false;
        }
        return isEqual;
    }

	@Override
	public String toString() {
		return "ListNode [nodes=" + nodes + ", isMixed=" + isMixed + "]";
	}

}
