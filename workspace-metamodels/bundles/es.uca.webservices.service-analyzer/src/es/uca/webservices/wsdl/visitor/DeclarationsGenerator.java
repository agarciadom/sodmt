/*
 *  Copyright 2010 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
 *  Copyright 2011 Antonio García Domínguez (antonio.garciadominguez@uca.es).
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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import serviceAnalyzer.messageCatalog.TypeDecls;
import serviceAnalyzer.messageCatalog.TypeGA;
import serviceAnalyzer.messageCatalog.TypeTypedef;
import serviceAnalyzer.messageCatalog.TypeVariable;
import es.uca.webservices.wsdl.ast.ASTNode;
import es.uca.webservices.wsdl.ast.AttrNode;
import es.uca.webservices.wsdl.ast.ChoiceNode;
import es.uca.webservices.wsdl.ast.ElemNode;
import es.uca.webservices.wsdl.ast.ForeachNode;
import es.uca.webservices.wsdl.ast.ListNode;
import es.uca.webservices.wsdl.ast.RootNode;
import es.uca.webservices.wsdl.ast.VariableNode;
import es.uca.webservices.wsdl.ast.Visitor;
import es.uca.webservices.wsdl.ast.utils.TypedefUtils;

/** 
 * Generates the declarations corresponding to a AST concrete node.
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es),
 * Antonio García Domínguez (antonio.garciadominguez@uca.es)
 */
public class DeclarationsGenerator implements Visitor {

    private static final String TYPEDEF = "T";
    private static final Logger LOGGER = LoggerFactory.getLogger(DeclarationsGenerator.class);

    private List<TypeVariable> variables = new ArrayList<TypeVariable>();
    private Map<String, TypeTypedef> typedefs = new LinkedHashMap<String, TypeTypedef>();

    // Types with these names cannot be renamed, as they've been
    // already used elsewhere. Instead, a new copy with the desired
    // name should be produced.
    private Set<String> lockedNames = new HashSet<String>();

    /**
     * Returns the TypeDecls
     * @return
     */
    public TypeDecls getDecls() {
        TypeDecls decls = TypeDecls.Factory.newInstance();
        decls.setTypedefArray(getTypedefArray());
        decls.setVariableArray(getVariableArray());
        return decls;
    }

    /**
     * Gets the TypeTypedef array of the declarations generated
     * @return The TypeTypedef array of the declarations generated
     */
    public TypeTypedef[] getTypedefArray() {
        return typedefs.values().toArray(new TypeTypedef[typedefs.size()]);
    }

    /**
     * Gets the TypeVariable array of the declarations generated
     * @return The TypeVariable array of the declarations generated
     */
    public TypeVariable[] getVariableArray() {
        return variables.toArray(new TypeVariable[variables.size()]);
    }

    ////////////////////////////////////////////////////////////////////////////////
    @Override
    public String visit(AttrNode node, Object data) {
        LOGGER.debug("atributo");
        if (node.isFixed()) {
        	return null;
        }

		String baseType = (String) node.getVariable().accept(this, null);
		baseType = renameTypedef(baseType, "Attr_" + node.getQName().getLocalPart());
		if (!node.isOptional()) {
			return baseType;
		}

		// Optional attributes are represented using a list with 0 or 1 element
		final TypeTypedef typedef = TypeTypedef.Factory.newInstance();
		typedef.setName(TYPEDEF + "AttrOpt_" + node.getQName().getLocalPart());
		typedef.setType(TypeGA.LIST);
		setTypedefElement(baseType, typedef);
		typedef.setMin("0");
		typedef.setMax("1");
		addTypedef(typedef);

		return typedef.getName();
    }

	@Override
    public String visit(RootNode node, Object data) {
        LOGGER.debug("raiz");
        variables.clear();
        typedefs.clear();

        String elementName = node.getQName().getLocalPart();

        if (node.getContents() != null) {
            final String origType = (String) node.getContents().accept(this, null);
            final String finalType = renameTypedef(origType, elementName);

            TypeVariable variable = TypeVariable.Factory.newInstance();
            variable.setName(elementName);
			variable.setType(finalType);
            addVariable(variable);
        }

        return null; // nadie lo recibe
    }

    @Override
    public String visit(ElemNode node, Object data) {
        LOGGER.debug("element");

        String type = null;
        if (node.getContents() != null) {
            String contentType = (String)node.getContents().accept(this, node.getQName().getLocalPart());
            if (contentType != null) {
            	type = contentType;
            }
        }
        if (type == null) {
        	// Element has no content - use a special marker type
        	TypeTypedef typedef = TypeTypedef.Factory.newInstance();
        	typedef.setName(TYPEDEF + "Empty_" + node.getQName().getLocalPart());
        	typedef.setType(TypeGA.STRING);
        	typedef.setValues("empty");
        	addTypedef(typedef);
        	return typedef.getName();
        }
        else {
        	// Element has content - try to rename the typedef to something more sensible 
        	return renameTypedef(type, node.getQName().getLocalPart());
        }
    }

    @Override
    public String visit(ForeachNode node, Object data) {
        LOGGER.debug("for");
        String element = (String) node.getCBody().accept(this, null);

        TypeTypedef typedef = TypeTypedef.Factory.newInstance();
        typedef.setName(TYPEDEF + "List_" + element.replaceFirst("^" + TYPEDEF, ""));
        typedef.setType(TypeGA.LIST);
        setTypedefElement(element, typedef);
        if (node.getMin() != null) { 
            typedef.setMin(node.getMin().toString());
        }
        if (node.getMax() != null) {
            typedef.setMax(node.getMax().toString());
        }
        if (node.getValues() != null) {
            typedef.setValues(node.getValues());
        }
        if (node.getPattern() != null) {
            typedef.setPattern(node.getPattern());
        }
        addTypedef(typedef);

        return typedef.getName();
    }

    @Override
    public String visit(ListNode node, Object data) {
        LOGGER.debug("list");
        if (node.isAMixedList()) {
            return visitTuple(node, data);
        } else {
            return visitListAttr(node, data);
        }
    }

    @Override
	public Object visit(ChoiceNode node, Object data) {
    	LOGGER.debug("choice");
    	TypeTypedef typedefChoiceSelector = TypeTypedef.Factory.newInstance();
    	typedefChoiceSelector.setName(TYPEDEF + "Choice" + node.getNodes().size());
    	typedefChoiceSelector.setType(TypeGA.INT);
    	typedefChoiceSelector.setMin("1");
    	typedefChoiceSelector.setMax(Integer.toString(node.getNodes().size()));
    	addTypedef(typedefChoiceSelector);

	    StringBuilder elements = new StringBuilder(typedefChoiceSelector.getName());
	    for (ASTNode item : node.getNodes()) {
            elements.append(", ");
	        elements.append((String) item.accept(this, data));
	    }

	    TypeTypedef typedef = TypeTypedef.Factory.newInstance();
	    typedef.setName(getNewTypedefName());
	    typedef.setType(TypeGA.TUPLE);
	    setTypedefElement(elements.toString(), typedef);
	    addTypedef(typedef);

	    return typedef.getName();
	}

	@Override
    public String visit(VariableNode node, Object data) {
        LOGGER.debug("var");

        TypeTypedef typedef = node.getType().getRight();
        String type = node.getType().getLeft() != null ? node.getType().getLeft().toString() : null;
        if (typedef != null) {
            typedef.setName(getNameFromTypedef(typedef));
            addTypedef(typedef);
            type = typedef.getName();
        }

        return type;
    }

	@Override
    public Object visit(ASTNode node, Object data) {
        LOGGER.debug("ast");
        throw new UnsupportedOperationException("Not supported yet.");
    }

	private void addVariable(TypeVariable v) {
	    if (v != null) {
	        variables.add(v);
	    }
	}

	private void addTypedef(TypeTypedef t) {
		if (t == null) {
			return;
		}
	
		TypeTypedef matchingTypedef = typedefs.get(t.getName());
		if (matchingTypedef != null) {
			// There is a typedef with the same name - is it the same type?
			if (TypedefUtils.equals(matchingTypedef, t)) {
				// Same type - nothing to do here!
				return;
			}
	
			// Different type - try adding a number to avoid a conflict,
			// while checking if a matching type went through the same conflict
			// before.
			for (int i = 0; i < Integer.MAX_VALUE; ++i) {
				final String newName = t.getName() + i;
				final TypeTypedef otherTypedef = typedefs.get(newName);
				if (otherTypedef != null && TypedefUtils.equals(otherTypedef, t)) {
					// Same name, same type - nothing to add
					t.setName(newName);
					return;
				}
				else if (otherTypedef == null) {
					// This name is not taken - use it
					t.setName(newName);
					break;
				}
			}
		}

		// Either the name wasn't taken or the name conflict was resolved - add the typedef
		LOGGER.debug("Adding typedef {}", t);
		typedefs.put(t.getName(), t);
	}

	private String firstUpper(String localPart) {
		if (localPart == null || localPart.length() < 1) {
			return localPart;
		}
		return localPart.substring(0, 1).toUpperCase() + localPart.substring(1);
	}

	private void lockNames(String baseType) {
		String[] names = baseType.split("\\s*,\\s*");
		for (String name : names) {
			if (typedefs.containsKey(name) && lockedNames.add(name)) {
				TypeTypedef typedef = typedefs.get(name);
				if (typedef != null && typedef.isSetElement()) {
					lockNames(typedef.getElement());
				}
			}
		}
	}

	private String getNameFromTypedef(TypeTypedef typedef) {
		// Generate a name that roughly represents the type, instead
		// of a hard to read numeric value
		String name = TYPEDEF + firstUpper(typedef.getType().toString());
		if (typedef.isSetMin()) {
			name += "Min" + typedef.getMin();
		}
		if (typedef.isSetMax()) {
			name += "Max" + typedef.getMax();
		}
		if (typedef.isSetElement()) {
			name += "E";
		}
		if (typedef.isSetFractionDigits()) {
			name += "FD" + typedef.getFractionDigits();
		}
		if (typedef.isSetTotalDigits()) {
			name += "TD" + typedef.getTotalDigits();
		}
		if (typedef.isSetPattern()) {
			name += "P";
		}
		if (typedef.isSetValues()) {
			name += "V";
		}
		return name;
	}

	private String getNewTypedefName() {
	    return TYPEDEF + (typedefs.size() + 1);
	}

	private String renameTypedef(String oldName, String newSuffix) {
		final String newName = TYPEDEF + firstUpper(newSuffix);
		final TypeTypedef typedef = typedefs.get(oldName);
		if (typedef != null) {
			LOGGER.debug(String.format("Renaming typedef '%s' to '%s'", oldName, newName));
			if (!lockedNames.contains(oldName)) {
				// The existing typedef has not been locked yet - rename it
				typedef.setName(newName);
				typedefs.remove(oldName);
				addTypedef(typedef);
				return typedef.getName();
			}
			else {
				// Cannot rename the existing copy - create a new one with the desired name
				TypeTypedef typedefCopy = (TypeTypedef)typedef.copy();
				typedefCopy.setName(newName);
				addTypedef(typedefCopy);
				return typedefCopy.getName();
			}
		}

		return oldName;
	}

	/**
	 * Sets the 'element' attribute of a &lt;typedef&gt;. "Freezes" all
	 * referenced names recursively, so they will not be renamed later by
	 * {@link #renameTypedef(String, String)}.
	 */
	private void setTypedefElement(String baseType, final TypeTypedef typedef) {
		lockNames(baseType);
		typedef.setElement(baseType);
	}

	private String visitTuple(ListNode node, Object data) {
	    StringBuilder elements = new StringBuilder();
	    int ind = 0;
	    for (ASTNode item : node.getNodes()) {
	        final String itemType = (String) item.accept(this, data);
	        if (itemType == null) continue;

	        if (ind != 0) {
	            elements.append(", ");
	        }
			elements.append(itemType);
	        ++ind;
	    }
	
	    TypeTypedef typedef = TypeTypedef.Factory.newInstance();
	    typedef.setName(getNewTypedefName());
	    typedef.setType(TypeGA.TUPLE);
	    setTypedefElement(elements.toString(), typedef);
	    addTypedef(typedef);

	    return typedef.getName();
	}

    private String visitListAttr(ListNode node, Object data) {
		for (ASTNode item : node.getNodes()) {
	        item.accept(this, data);
	    }
	    return null; // como attribute
	}
}
