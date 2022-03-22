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

import java.math.BigInteger;
import org.apache.xmlbeans.SchemaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import serviceAnalyzer.messageCatalog.TypeTypedef;

/**
 * Subclass of ASTNode that represents a xsd:list or the repetitions of a xsd:element/xsd:sequence
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class ForeachNode extends ASTNode {

    private ASTNode cbody;
    private BigInteger min, max;
    private String values;
    private String pattern;
    private static final Logger LOGGER = LoggerFactory.getLogger(ForeachNode.class);

    public enum TYPE {

        /**
         * Represents a simple list 
         */
        LIST, /**
         * Represents a repeated node
         */
        OCCURS
    };
    private TYPE type;

    /**
     * Constructor
     * @param cbody The child ASTNode of the ForeachNode, in other words, the ASTNode repeated
     * @param stype The SchemaType that represents the simple list
     */
    public ForeachNode(ASTNode cbody, SchemaType stype) {
        this.cbody = cbody;
        this.type = TYPE.LIST;

        TypeTypedef aux = TypeTypedef.Factory.newInstance();
        VariableTypes.setFacetRestrictions(stype, aux);
        this.min = aux.getMin() != null ? new BigInteger(aux.getMin()) : null;
        this.max = aux.getMax() != null ? new BigInteger(aux.getMax()) : null;
        this.pattern = aux.getPattern();
        VariableTypes.setEnumRestrictions(stype, aux);
        this.values = aux.getValues();
        LOGGER.debug("Creado FOREACH_list con min=" + this.min + ", max=" + this.max + ", values=" + this.values + ", pattern=" + this.pattern);
    }

    /**
     * Constructor
     * @param cbody The child ASTNode of the ForeachNode, in other words, the ASTNode repeated
     * @param type The type of ForeachNode: LIST or OCCURS
     * @param min The minimum number of repetitions of the cbody
     * @param max The maximum number of repetitions of the cbody
     * @param values The string that represents a list of acceptable values for the cbody (separated by comma)
     * @param pattern The regular expression that defines the exact sequence of characters that are acceptable for the cbody
     */
    public ForeachNode(ASTNode cbody, TYPE type, BigInteger min, BigInteger max, String values, String pattern) {
        this.cbody = cbody;
        this.type = type;
        this.min = min;
        this.max = max;
        this.values = values;
        this.pattern = pattern;
    }

    /**
     * Constructor
     * @param cbody The child ASTNode of the ForeachNode, in other words, the ASTNode repeated
     * @param min The minimum number of repetitions of the cbody
     * @param max The maximum number of repetitions of the cbody
     */
    public ForeachNode(ASTNode cbody, BigInteger min, BigInteger max) {
        this.cbody = cbody;
        this.type = TYPE.OCCURS;
        this.min = min;
        this.max = max;
        this.values = null;
        this.pattern = null;
        LOGGER.debug("Creado FOREACH_occurs con min=" + this.min + " y max=" + this.max);
    }

    /**
     * Sets the cbody of the ForeachNode, in other words, the ASTNode repeated
     * @param cbody The ASTNode that represents the cbody of the ForeachNode
     */
    public void setCbody(ASTNode cbody) {
        this.cbody = cbody;
    }

    /**
     * Gets the cbody of the ForeachNode, in other words, the ASTNode repeated
     * @return The ASTNode that represents the cbody of the ForeachNode
     */
    public ASTNode getCBody() {
        return this.cbody;
    }

    /**
     * Sets the minimum number of repetitions
     * @param min The minimum number of repetitions
     */
    public void setMin(BigInteger min) {
        this.min = min;
    }

    /**
     * Gets the minimum number of repetitions
     * @return The minimum number of repetitions
     */
    public BigInteger getMin() {
        return this.min;
    }

    /**
     * Sets the maximum number of repetitions
     * @param max The maximum number of repetitions
     */
    public void setMax(BigInteger max) {
        this.max = min;
    }

    /**
     * Gets the maximum number of repetitions
     * @return The maximum number of repetitions
     */
    public BigInteger getMax() {
        return this.max;
    }

    /**
     * Sets the comma separated list of acceptable values for the element repeated
     * @param values The list of acceptable values for the element repeated
     */
    public void setValues(String values) {
        this.values = values;
    }

    /**
     * Gets the comma separated list of acceptable values for the element repeated
     * @return The comma separated list of acceptable values for the element repeated
     */
    public String getValues() {
        return this.values;
    }

    /**
     * Sets the regular expression that defines the exact sequence of characters that are acceptable for the cbody
     * @param pattern The regular expression that defines the exact sequence of characters that are acceptable for the cbody
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Gets the regular expression that defines the exact sequence of characters that are acceptable for the cbody
     * @return The regular expression that defines the exact sequence of characters that are acceptable for the cbody
     */
    public String getPattern() {
        return this.pattern;
    }

    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = genericHash(this.cbody.hashCode(), this.min.hashCode(),
                    this.max.hashCode(), this.values.hashCode());
        }
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ForeachNode)) {
            return false;
        }
        ForeachNode other = (ForeachNode) o;

        return (this.type == other.type)
                && (this.cbody == null ? other.cbody == null : this.cbody.equals(other.cbody))
                && (this.values == null ? other.values == null : this.values.equals(other.values))
                && (this.min == null ? other.min == null : this.min.equals(other.min))
                && (this.max == null ? other.max == null : this.max.equals(other.max));
    }

	@Override
	public String toString() {
		return "ForeachNode [cbody=" + cbody + ", min=" + min + ", max=" + max
				+ ", values=" + values + ", pattern=" + pattern + ", type="
				+ type + "]";
	}

}
