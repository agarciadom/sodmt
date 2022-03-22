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
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaLocalElement;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaProperty;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.webservices.wsdl.ast.AttrNode.AVT;
import es.uca.webservices.wsdl.ast.ForeachNode.TYPE;

/**
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class Parser {

    private QName name;
    private RootNode root;
    private Boolean isRootNode = true;
    private static final Logger LOGGER = LoggerFactory.getLogger(Parser.class);

    /**
     * Represents the encoding style
     */
    public enum EncodingStyle {
        /**
         * Document/literal
         */
        DOCUMENT,

        /**
         * RPC/literal
         */
        RPC
    };

    /***
     * Constructor
     * @param name The QName of the envelopment
     * @param stype The SchemaType that must be parsed
     * @param style The encoding style
     */
    public Parser(QName name, SchemaType stype, EncodingStyle style) {
        this.name = name;

        if (style == EncodingStyle.DOCUMENT) {
            root = (RootNode) yyparse(stype);
        }
        else { // "rpc"
            root = (RootNode) processElement(stype);
        }
    }

    /***
     * Constructor
     * @param name The QName of the wrapper
     * @param type The QName of the XML Schema built-in type that must be parsed
     * @param style The encoding style
     */
    public Parser(QName name, QName type, EncodingStyle style) {
        this.name = name;

        if (style == EncodingStyle.RPC) {
            LOGGER.debug("****processElementRPC_prueba.");
            ASTNode cbody;
            isRootNode = false;
            if (VariableTypes.isListDerivedType(type)) {
                cbody = new ForeachNode(new VariableNode(VariableTypes.getItemElement(type)), TYPE.LIST, BigInteger.ONE, null, null, null);
            } else {
                cbody = new VariableNode(type);
            }

            root = (RootNode) new RootNode(this.name, cbody);
        }
    }

    /**
     * Gets the tree root
     * @return The RootNode of the resulting AST
     */
    public RootNode getRoot() {
        return this.root;
    }

    private ASTNode yyparse(SchemaType stype) {
        LOGGER.debug("yyparse");

        ASTNode node = null;

        if (stype.isSimpleType() || stype.isURType()) {
            node = processSimpleType(stype);
        } else {
            // complex Type           
            switch (stype.getContentType()) {
                /* No Complex Type */
                case SchemaType.NOT_COMPLEX_TYPE:
                    LOGGER.debug("NOT_COMPLEX_CONTENT");
                    break;

                /* Complex Types */

                // The content model of the type contains only attributes
                case SchemaType.EMPTY_CONTENT:
                    LOGGER.debug("EMPTY_CONTENT");
                    break;
                // The content model of the type contains only text
                case SchemaType.SIMPLE_CONTENT:
                    LOGGER.debug("SIMPLE_CONTENT");
                    node = processSimpleType(stype);
                    break;
                // The content model of the type can contains attributes, elements and text
                case SchemaType.MIXED_CONTENT:
                    LOGGER.debug("MIXED_CONTENT");
                    throw new UnsupportedOperationException("Mixed content is not supported yet");
                // The content model of the type contains other elements and/or attributes
                case SchemaType.ELEMENT_CONTENT:
                    LOGGER.debug("ELEMENT_CONTENT");
                    if (stype.getContentModel() != null) {
                        node = processParticle(stype.getContentModel());
                    }
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown content type");
            }
        }
        return node;
    }

    private ASTNode processSimpleType(SchemaType stype) {

        ASTNode node = null;
        // anyType or anySimpleType
        if (XmlObject.type.equals(stype) || XmlAnySimpleType.type.equals(stype)) {
            throw new UnsupportedOperationException("AnyType and anySimpleType are not supported yet");
        }

        switch (stype.getSimpleVariety()) {
            case SchemaType.ATOMIC:
                node = new VariableNode(stype);
                break;
            case SchemaType.LIST:
                SchemaType itemType = stype.getListItemType();
                node = new ForeachNode(processSimpleType(itemType), stype);
                break;
            case SchemaType.UNION:
            	SchemaType[] constituents = stype.getUnionConstituentTypes();
            	if (constituents.length == 1) {
            		return processSimpleType(constituents[0]);
            	}
            	else {
            		List<ASTNode> nodes = new ArrayList<ASTNode>(constituents.length);
            		for (int i = 0; i < constituents.length; ++i) {
            			nodes.add(processSimpleType(constituents[i]));
            		}
            		return new ChoiceNode(nodes);
            	}
        }

        return node;
    }

    private boolean requiresLoop(SchemaParticle sp) {

        // Only makes sense in front of individual elements that repeat
        int minOccurs = sp.getIntMinOccurs(),
                maxOccurs = sp.getIntMaxOccurs();

		/*
		 * The maxOccurs and minOccurs attributes constrain how many times in
		 * succession the specified entity can appear in the corresponding
		 * position in an XML instance document. These attributes appear only
		 * within complex type definitions. Therefore, for an <element> or
		 * <group> element to have these attributes, the element must be a local
		 * declaration or a reference to a global declaration, not the global
		 * declaration itself.
		 */
		// sp.getMaxOccurs() == null --> unbounded

        // optional, once, N_M
        return !(maxOccurs == 1 && minOccurs == 1);
    }

    /**
     * The content model of a complex type is a tree of particles
     */
    private ASTNode processParticle(SchemaParticle sp) {
        LOGGER.debug("processParticle.");

        ASTNode node = null;

        switch (sp.getParticleType()) {
            case (SchemaParticle.ELEMENT):
                node = processElement(sp);
                break;
            case (SchemaParticle.ALL):
            case (SchemaParticle.SEQUENCE):
                node = processSequence(sp);
                break;
            case (SchemaParticle.CHOICE):
            	node = processChoice(sp);
            	break;
            case (SchemaParticle.WILDCARD):
            	LOGGER.warn("Wildcards are not supported yet: returning a dummy element");
            	return new ElemNode(new QName("http://serviceAnalyzer/messageCatalog", "wildcard"), null);
            default:
                throw new UnsupportedOperationException("Unknown particle type");
        }

        if (requiresLoop(sp)) {
        	node = new ForeachNode(node, sp.getMinOccurs(), sp.getMaxOccurs());
        }
        return node;
    }

    private ASTNode processElement(SchemaParticle sp) {
        // cast as schema local element
        SchemaLocalElement element = (SchemaLocalElement) sp;
        QName elementQName = new QName(element.getName().getNamespaceURI(), element.getName().getLocalPart());
        LOGGER.debug("****processElement." + element.getName().getLocalPart());

        final boolean createRoot = isRootNode;
        isRootNode = false;
		ASTNode ctag = processAttributes(element.getType());
		ASTNode cbody = yyparse(element.getType());
        if (createRoot) {
			return new RootNode(elementQName, ctag, cbody);
        }
        else {
        	return new ElemNode(elementQName, ctag, cbody);
        }
    }

    private ASTNode processElement(SchemaType stype) {
        LOGGER.debug("****processElementRPC.");
        isRootNode = false;
        ASTNode ctag  = processAttributes(stype);
        ASTNode cbody = yyparse(stype);
        return new RootNode(this.name, ctag, cbody);
    }

    private ASTNode processAttributes(SchemaType stype) {
        LOGGER.debug("processAttributes.");

        SchemaProperty[] attrProps = stype.getAttributeProperties();
        switch (attrProps.length) {
            case 0:  // no attributes
                return null;

            case 1:  // 1 attribute
                return processAttribute(attrProps[0]);

            default: // 1+ attributes
                List<ASTNode> nodes = new ArrayList<ASTNode>(attrProps.length);
                for (int i = 0; i < attrProps.length; i++) {
                    SchemaProperty attribute = attrProps[i];
                    ASTNode nodeAttr = processAttribute(attribute);
                    nodes.add(nodeAttr);
                }
                return new ListNode(nodes, true);
        }
    }

    private ASTNode processAttribute(SchemaProperty attribute) {
        LOGGER.debug("processAttribute.");
        AVT valueConstraint;

        if (attribute.hasFixed() == SchemaProperty.CONSISTENTLY) {
            valueConstraint = AVT.FIXED;
        } else if (attribute.hasDefault() == SchemaProperty.CONSISTENTLY) {
            valueConstraint = AVT.DEFAULT;
        } else {
            valueConstraint = AVT.NONE;
        }

        return new AttrNode(attribute.getName(),
                processSimpleType(attribute.getType()),
                valueConstraint, attribute.getDefaultText(),
                BigInteger.ZERO.equals(attribute.getMinOccurs()));
    }

    private ASTNode processSequence(SchemaParticle sp) {
        LOGGER.debug("processSequence." + sp.getType());
		if (sp.getParticleChildren().length > 1) {
			return new ListNode(processChildParticles(sp), true);
		} else {
			return processParticle(sp.getParticleChild(0));
		}
    }

	private ASTNode processChoice(SchemaParticle sp) {
		LOGGER.debug("processChoice.");
		if (sp.getParticleChildren().length > 1) {
			return new ChoiceNode(processChildParticles(sp));
		}
		else {
			return processParticle(sp.getParticleChild(0));
		}
	}

	private List<ASTNode> processChildParticles(SchemaParticle sp) {
	    SchemaParticle[] spc = sp.getParticleChildren();
	    List<ASTNode> nodes = new ArrayList<ASTNode>(spc.length);
	    for (int i = 0; i < spc.length; i++) {
	        nodes.add(processParticle(spc[i]));
	    }
		return nodes;
	}
}
