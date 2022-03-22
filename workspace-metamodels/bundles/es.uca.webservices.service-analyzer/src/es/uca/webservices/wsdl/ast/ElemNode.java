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

import java.util.ArrayList;

import javax.xml.namespace.QName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Subclass of ASTNode that represents a xsd:element
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class ElemNode extends ASTNode {

    private QName qname;
    private ASTNode contents;
    private static final Logger LOGGER = LoggerFactory.getLogger(ElemNode.class);

    /**
	 * Constructor
	 *
	 * @param qname
	 *            The QName of the xsd:element
	 * @param contents
	 *            The ASTNode that represents the contents of the xsd:element -
	 *            AttrNode objects are the attributes, everything else is a
	 *            nested element
	 */
    public ElemNode(QName qname, ASTNode contents) {
        this.qname = qname;
        this.contents = contents;

        LOGGER.debug("Created ELEMENT with qname '{}'", this.qname);
    }

    /**
     * Convenience 3-arg version of {@link #ElemNode(QName, ASTNode)} in case
     * we need to join the ASTs for the tag (attributes) and the body (elements
     * and text content).
     */
    public ElemNode(QName qname, ASTNode contentsTag, ASTNode contentsBody) {
    	this(qname, joinTagAndBody(contentsTag, contentsBody));
    }

    /**
     * Sets the QName of this ElemNode
     * @param qname The QName
     */
    public void setQName(QName qname) {
        this.qname = qname;
    }

    /**
     * Gets the QName of this ElemNode
     * @return The QName of this ElemNode
     */
    public QName getQName() {
        return this.qname;
    }

    /**
     * Sets the ASTNode that represents the contents of this ElemNode. It could be an AttrNode o a ListNode containing AttrNode objects
     * @param ctag The ASTNode that represents the contents of this ElemNode
     */
    public void setContents(ASTNode contents) {
        this.contents = contents;
    }

    /**
     * Gets the ASTNode that represents the contents of this ElemNode. It could be an AttrNode o a ListNode containing AttrNode objects
     * @return The ASTNode that represents the contents of this ElemNode
     */
    public ASTNode getContents() {
        return this.contents;
    }

    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = genericHash(this.qname.hashCode(), this.contents.hashCode);
        }
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ElemNode)) {
            return false;
        }
        ElemNode other = (ElemNode) o;
        return (this.qname == null ? other.qname == null : this.qname.equals(other.qname))
                && (this.contents == null ? other.contents == null : this.contents.equals(other.contents));
    }

	@Override
	public String toString() {
		return "ElemNode [qname=" + qname + ", contents=" + contents + "]";
	}

	private static ASTNode joinTagAndBody(ASTNode ctag, ASTNode cbody) {
		if (ctag == null) {
			return cbody;
		}
		else if (cbody == null) {
			return ctag;
		}

		// ctag and cbody are not null beyond this point
		ListNode joined = new ListNode(new ArrayList<ASTNode>(), true);
		if (ctag instanceof ListNode) {
			joined.getNodes().addAll(((ListNode)ctag).getNodes());
		}
		else {
			joined.getNodes().add(ctag);
		}
		if (cbody instanceof ListNode) {
			joined.getNodes().addAll(((ListNode)cbody).getNodes());
		}
		else {
			joined.getNodes().add(cbody);
		}

		return joined;
	}

}
