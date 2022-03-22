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
package es.uca.webservices.wsdl.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.uca.webservices.wsdl.ast.ASTNode;
import es.uca.webservices.wsdl.ast.AttrNode;
import es.uca.webservices.wsdl.ast.ChoiceNode;
import es.uca.webservices.wsdl.ast.ElemNode;
import es.uca.webservices.wsdl.ast.ForeachNode;
import es.uca.webservices.wsdl.ast.ListNode;
import es.uca.webservices.wsdl.ast.RootNode;
import es.uca.webservices.wsdl.ast.VariableNode;
import es.uca.webservices.wsdl.ast.Visitor;

/**
 * Implements Visitor
 * Generates the template corresponding to a AST concrete node
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es), Antonio García Domínguez (antonio.garciadominguez@uca.es)
 */
public class TemplateGenerator implements Visitor {

    private static final String VARIABLE = "V";

    private enum AttributeHandlingMode {
    	NO_ATTRIBUTES,   // Ignore attributes
    	ONLY_ATTRIBUTES, // Only process attributes
    	ALL              // Process all nodes, disregarding the type
    }
    private AttributeHandlingMode attributeHandlingMode = AttributeHandlingMode.ALL;

    private int numVars = 0;
    private List<String> counters = new ArrayList<String>();
    private Map<String, String> mapNSPrefix;

    private String getNewVariableName() { //velocity name $
        return VARIABLE + ++numVars;
    }

    private String getCountersInitialization() {
        StringBuilder sets = new StringBuilder();
        for (String i : counters) {
            sets.append("#set(");
            sets.append(i);
            sets.append(" = 0)\n");
        }
        return sets.toString();
    }

    private boolean hasElements(ASTNode contents) {
    	if (contents == null) {
    		return false;
    	}
    	else if (contents instanceof AttrNode) {
    		return false;
    	}
    	else if (!(contents instanceof ListNode)) {
    		return true;
    	}
    	else {
    		for (ASTNode element : ((ListNode)contents).getNodes()) {
    			if (!(element instanceof AttrNode)) {
    				return true;
    			}
    		}
    		return false;
    	}
	}

    /**
     * Wrapper around the usual 'accept' method which allows for passing
     * optional data by using nonstatic fields and the call stack.
     */
	private String accept(final ASTNode node, final String varName, final AttributeHandlingMode attribMode) {
		final AttributeHandlingMode oldMode = this.attributeHandlingMode;
		this.attributeHandlingMode = attribMode;
		final String result = (String)node.accept(this, varName);
		this.attributeHandlingMode = oldMode;
		return result;
	}

	@Override
	public String visit(RootNode node, Object data) {
	    numVars = 0;
		counters.clear();
	
		final NamespaceMapVisitor nmVisitor = new NamespaceMapVisitor();
		node.accept(nmVisitor, null);
		mapNSPrefix = nmVisitor.getMapNSPrefix();
	
		final String elementName = node.getQName().getLocalPart();
		final String template = visit((ElemNode) node, elementName);
	
	    return getCountersInitialization() + template;
	}

	@Override
	public String visit(ListNode node, Object data) {
	    String variableName = (String) data;
	    StringBuilder template = new StringBuilder();
	
	    int ind = 0;
	    for (ASTNode nodeItem : node.getNodes()) {
	        String itemVariableName = variableName;
        	if (node.isAMixedList()) {
	            itemVariableName += ".get(" + ind + ")";
	        }
        	final String itemTemplate = accept(nodeItem, itemVariableName, attributeHandlingMode);
        	if (itemTemplate != null) {
        		template.append(itemTemplate);
        		++ind;
        	}
	    }

	    return template.toString();
	}

	@Override
    public String visit(AttrNode node, Object data) {
		if (attributeHandlingMode == AttributeHandlingMode.NO_ATTRIBUTES) {
			return "";
		}
		else if (node.isFixed()) {
			return null;
		}

		final String varName = (String) data;
		final String attributeName = node.getQName().getLocalPart();

		StringBuilder template = new StringBuilder();
		if (node.isOptional()) {
			final String iterVar = getNewVariableName();
			template.append(" #foreach($");
			template.append(iterVar);
			template.append(" in $");
			template.append(varName);
			template.append(") ");
			template.append(attributeName);
			template.append(" = \"");
			template.append(accept(node.getVariable(), iterVar, AttributeHandlingMode.ALL));
			template.append("\" #end");
		}
		else {
			template.append(" ");
			template.append(attributeName);
			template.append(" = \"");
			template.append(accept(node.getVariable(), varName, AttributeHandlingMode.ALL));
			template.append("\"");
		}
		return template.toString();
    }

    @Override
    public String visit(ElemNode node, Object data) {
    	if (attributeHandlingMode == AttributeHandlingMode.ONLY_ATTRIBUTES) {
    		return "";
    	}

        final String elementName = node.getQName().getLocalPart();
        final String elementVariableName = (String) data;
        final String namespaceURI = node.getQName().getNamespaceURI();
        final String namespacePrefix = mapNSPrefix.containsKey(namespaceURI) ? mapNSPrefix.get(namespaceURI) + ":" : "";

        final StringBuilder builder = new StringBuilder("<");
        builder.append(namespacePrefix);
        builder.append(elementName);
        if (node instanceof RootNode) {
        	// Print xmlns:xxx assignments here
        	for (Map.Entry<String, String> entry : mapNSPrefix.entrySet()) {
        		final String nsURI = entry.getKey();
        		final String nsPrefix = entry.getValue();
        		builder.append(" xmlns:");
        		builder.append(nsPrefix);
        		builder.append("=\"");
        		builder.append(nsURI);
        		builder.append("\"");
        	}
        }

        final ASTNode contents = node.getContents();
        if (contents != null) {
        	builder.append(accept(contents, elementVariableName, AttributeHandlingMode.ONLY_ATTRIBUTES));
        }

       	if (hasElements(contents)) {
        	builder.append(">");
        	builder.append(accept(contents, elementVariableName, AttributeHandlingMode.NO_ATTRIBUTES));
            builder.append("</");
            builder.append(namespacePrefix);
            builder.append(elementName);
            builder.append('>');
        }
        else {
        	builder.append(" />");
        }

        return builder.toString();
    }

	@Override
    public String visit(ForeachNode node, Object data) {
		if (attributeHandlingMode == AttributeHandlingMode.ONLY_ATTRIBUTES) {
			return "";
		}

		final String elementVariableName = getNewVariableName();
		final String listVariableName = (String) data;
		final String template = "#foreach(" + "$" + elementVariableName
				+ " in " + "$" + listVariableName + ") "
				+ accept(node.getCBody(), elementVariableName, AttributeHandlingMode.ALL) + " #end";

		return template;
    }

    @Override
	public Object visit(ChoiceNode node, Object data) {
    	if (attributeHandlingMode == AttributeHandlingMode.ONLY_ATTRIBUTES) {
    		return "";
    	}
    	final String variableName = (String) data;
    	final StringBuilder template = new StringBuilder();

    	int ind = 0;
    	final int lastIndex = node.getNodes().size() - 1;
    	for (ASTNode nodeItem : node.getNodes()) {
    		if (ind == 0) {
    			template.append(" #if( ");
    		}
    		else if (ind != lastIndex) {
    			template.append(" #elseif( ");
    		}
    		else {
    			template.append(" #else ");
    		}

    		if (ind != lastIndex) {
    			template.append("$");
    			template.append(variableName);
    			template.append(".get(0) == ");
    			template.append(ind + 1);
    			template.append(" ) ");
    		}

    		final String itemName = variableName + ".get(" + (ind + 1) + ")";
			template.append(accept(nodeItem, itemName, AttributeHandlingMode.ALL));
			ind++;
    	}
    	template.append(" #end ");

		return template.toString();
	}

	@Override
    public String visit(VariableNode node, Object data) {
		if (attributeHandlingMode == AttributeHandlingMode.ONLY_ATTRIBUTES) {
			return "";
		}
        return "$" + data;
    }

    @Override
    public Object visit(ASTNode node, Object data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
