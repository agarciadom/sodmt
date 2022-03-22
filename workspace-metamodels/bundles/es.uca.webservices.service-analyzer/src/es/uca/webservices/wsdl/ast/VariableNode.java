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

import es.uca.webservices.bpel.util.Pair;
import es.uca.webservices.wsdl.ast.utils.TypedefUtils;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import serviceAnalyzer.messageCatalog.TypeGA;
import serviceAnalyzer.messageCatalog.TypeTypedef;

/**
 * Subclass of ASTNode that represents an element variable for a foreach loop.
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class VariableNode extends ASTNode {

    private Pair<TypeGA.Enum, TypeTypedef> type;
    private static final Logger LOGGER = LoggerFactory.getLogger(VariableNode.class);

    /**
     * Constructor
     * @param stype SchemaType that represents the type of the variable
     */
    public VariableNode(SchemaType stype) {

        this.type = VariableTypes.primitiveType2CatalogType(stype);
        LOGGER.debug("Created VARIABLE with type =" + (type.getLeft() != null ? type.getLeft() : type.getRight()));
    }

    /**
     * Constructor
     * @param qtype QName of the XML Schema built-in system type that represents the type of the variable
     */
    public VariableNode(QName qtype) {

        this.type = VariableTypes.primitiveType2CatalogType(qtype);
        LOGGER.debug("Created VARIABLE with type =" + (type.getLeft() != null ? type.getLeft() : type.getRight()));
    }

    /**
     * Constructor
     * @param type Pair that represents the type of the variable. One of the pair's elements must be null 
     */
    public VariableNode(Pair<TypeGA.Enum, TypeTypedef> type) {
        this.type = type;
    }

    /**
     * Sets the type of the variable. One of the pair's elements must be null
     * @param type The pair that represents the type of the variable
     */
    public void setType(Pair<TypeGA.Enum, TypeTypedef> type) {
        this.type = type;
    }

    /**
     * Gets the pair that represents the type of the variable. One of the pair's elements must be null
     * @return The pair that represents the type of the variable
     */
    public Pair<TypeGA.Enum, TypeTypedef> getType() {
        return this.type;
    }

    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = genericHash(this.type.hashCode());
        }
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VariableNode)) {
            return false;
        }
        VariableNode other = (VariableNode) o;
        return ((this.type.getLeft() == null ? other.type.getLeft() == null : this.type.getLeft() == other.type.getLeft())
                && (this.type.getRight() == null ? other.type.getRight() == null : TypedefUtils.equals(this.type.getRight(), other.type.getRight())));
    }

	@Override
	public String toString() {
		return "VariableNode [type=" + type + "]";
	}

}
