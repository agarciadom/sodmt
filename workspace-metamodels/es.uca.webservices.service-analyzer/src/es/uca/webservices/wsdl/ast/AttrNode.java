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

import javax.xml.namespace.QName;

/**
 * Subclass of ASTNode that represents a xsd:attribute
 * 
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class AttrNode extends ASTNode {

    private QName qname;
    private ASTNode variable;
    private String defaultValue;
    private boolean optional;

    public enum AVT {
        NONE, DEFAULT, FIXED
    };
    private AVT valueType;

    /**
     * Constructor
     * @param qname The QName of the xsd:attribute
     * @param variable  The ASTNode that represents the attribute's variable
     * @param valueType If the valuesType is DEFAULT, the xsd:attribute has a default value.
     * If it's FIXED. NONE otherwise.
     * @param defaultValue  The default value for the xsd:attribute
     * @param optional Whether it can be omitted (<code>true</code>) or not (<code>false</code>)
     */
    public AttrNode(QName qname, ASTNode variable, AVT valueType, String defaultValue, boolean optional) {
        this.qname = qname;
        this.variable = variable;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
        this.optional = optional;
    }

    /**
     * Sets the QName of this AttrNode
     * @param qname The QName
     */
    public void setQName(QName qname) {
        this.qname = qname;
    }

    /**
     * Gets the QName of this AttrNode
     * @return The QName of this AttrNode
     */
    public QName getQName() {
        return this.qname;
    }

    /**
     * Sets the ASTNode that represents the variable of this AttrNode
     * @param variable ASTNode that represents the variable of this AttrNode
     */
    public void setVariable(ASTNode variable) {
        this.variable = variable;
    }

    /**
     * Gets the variable of this AttrNode
     * @return The variable of this AttrNode
     */
    public ASTNode getVariable() {
        return this.variable;
    }

    /**
     * Sets the default value of this AttrNode
     * @param defaultValue The default value of this AttrNode
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Gets the default value of this AttrNode
     * @return The default value of this AttrNode
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Sets the type of value of this AttrNode
     * @param valueType DEFAULT, FIXED or NONE
     */
    public void setTypeValue(AVT valueType) {
        this.valueType = valueType;
    }

    /**
     * Gets the type (DEFAULT, FIXED or NONE) of value of this AttrNode
     * @return DEFAULT, FIXED or NONE
     */
    public AVT getTypeValue() {
        return this.valueType;
    }

    /**
     * Returns true if the AttrNode has a fixed value
     * @return True if the AttrNode has a fixed value, false otherwise
     */
    public Boolean isFixed() {
        return valueType == AVT.FIXED;
    }

    /**
     * Returns <code>true</code> if the attribute can be omitted.
     */
    public boolean isOptional() {
		return optional;
	}

    /**
     * Sets whether the attribute can be omitted (<code>true</code>) or not (<code>false</code>).
     */
	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	@Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = genericHash(this.qname.hashCode(), this.variable.hashCode,
                    this.valueType.hashCode(),
                    this.defaultValue == null ? 0 : this.defaultValue.hashCode(),
                    this.optional ? 1 : 0);
        }
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttrNode)) {
            return false;
        }
        AttrNode other = (AttrNode) o;
        return (this.qname == null ? other.qname == null : this.qname.equals(other.qname))
                && (this.variable == null ? other.variable == null : this.variable.equals(other.variable))
                && (this.valueType == other.valueType)
                && (this.defaultValue == null ? other.defaultValue == null : this.defaultValue.equals(other.defaultValue)
                && (this.optional == other.optional));

    }

	@Override
	public String toString() {
		return "AttrNode [qname=" + qname + ", variable=" + variable
				+ ", defaultValue=" + defaultValue + ", valueType=" + valueType
				+ ", optional=" + optional + "]";
	}

}
