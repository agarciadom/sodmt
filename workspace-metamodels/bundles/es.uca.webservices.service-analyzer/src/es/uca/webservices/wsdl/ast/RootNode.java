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
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class RootNode extends ElemNode {

    /**
     * Constructor
     * @param qname The QName of the xsd:element
     * @param ctag The ASTNode that represents the xsd:atribute elements of the xsd:element
     * @param cbody The child ASTNode of the ElemNode
     */
    public RootNode(QName qname, ASTNode contents) {
        super(qname, contents);
    }

    /**
     * Convenience 3-arg version of {@link #RootNode(QName, ASTNode)} in case
     * we need to join the ASTs for the tag and the contents of the element.
     */
    public RootNode(QName qname, ASTNode ctag, ASTNode cbody) {
    	super(qname, ctag, cbody);
    }

    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

	@Override
	public String toString() {
		return "RootNode [qname=" + getQName() + ", contents=" + getContents() + "]";
	}

}
