/*
 *  Copyright 2011 Antonio García-Domínguez (antonio.garciadominguez@uca.es).
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

import java.util.HashMap;
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
 * Visitor which starts from a {@link RootNode} and produces a {@link java.util.Map}
 * with namespace URI->prefix mappings. This visitor implements a best-effort approach
 * for assigning more intuitive prefixes to URIs, using the first characteres of their
 * last URI component (divided by '/'). 
 * 
 *  @author Antonio García-Domínguez
 */
class NamespaceMapVisitor implements Visitor {

	private final Map<String, String> mapPrefixNS = new HashMap<String, String>();
	private final Map<String, String> mapNSPrefix = new HashMap<String, String>();

	/**
	 * Returns the prefix->namespace URI map computed by this visitor, after visiting
	 * the root node.
	 */
	public Map<String, String> getMapPrefixNS() {
		return mapPrefixNS;
	}

	/**
	 * Returns the reverse map of {@link #getMapPrefixNS()}. This is a namespace
	 * URI->prefix map.
	 */
	public Map<String, String> getMapNSPrefix() {
		return mapNSPrefix;
	}

	@Override
	public Object visit(AttrNode node, Object data) {
		registerNS(node.getQName().getNamespaceURI());
		return mapNSPrefix;
	}

	@Override
	public Object visit(RootNode node, Object data) {
		registerNS(node.getQName().getNamespaceURI());
		descend(node, data);
		return mapNSPrefix;
	}

	@Override
	public Object visit(ElemNode node, Object data) {
		registerNS(node.getQName().getNamespaceURI());
		descend(node, data);
		return mapNSPrefix;
	}

	@Override
	public Object visit(ForeachNode node, Object data) {
		final ASTNode cbody = node.getCBody();
		if (cbody != null) {
			cbody.accept(this, data);
		}
		return mapNSPrefix;
	}

	@Override
	public Object visit(ListNode node, Object data) {
		for (ASTNode child : node.getNodes()) {
			child.accept(this, data);
		}
		return mapNSPrefix;
	}

	@Override
	public Object visit(ChoiceNode node, Object data) {
		for (ASTNode child : node.getNodes()) {
			child.accept(this, data);
		}
		return mapNSPrefix;
	}

	@Override
	public Object visit(VariableNode node, Object data) {
		// do nothing
		return mapNSPrefix;
	}

    @Override
    public Object visit(ASTNode node, Object data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	private void descend(ElemNode node, Object data) {
		final ASTNode contents = node.getContents();
		if (contents != null) {
			contents.accept(this, data);
		}
	}

	private void registerNS(String namespaceURI) {
		if (mapNSPrefix.containsKey(namespaceURI)) {
			// We already registered this namespace URI: do nothing
			return;
		}
		else if (namespaceURI == null || namespaceURI.length() == 0) {
			// No namespace URI: do nothing
			return;
		}

		/* REGULAR APPROACH: USE A SUBSTRING OF THE LAST URI COMPONENT */
		final String[] parts = namespaceURI.split("/");
		final String last    = findLastNonEmptyPart(parts);
		String substringPrefix = findShortestSubstringNotAKeyOf(last, mapPrefixNS);
		if (substringPrefix != null) {
			if (!substringPrefix.matches("^[:a-zA-Z_]")) {
				// If the unique prefix does not start with a valid character,
				// add "ns" at the beginning to make it valid.
				// See: http://www.w3.org/TR/REC-xml/#NT-NameStartChar
				substringPrefix = "ns" + substringPrefix;
			}
			setMapping(substringPrefix, namespaceURI);
		}
		else {
			/* FALLBACK: USE GENERIC PREFIX + COUNTER */
			setMapping("ns" + mapPrefixNS.size(), namespaceURI);
		}
	}

	private void setMapping(String prefix, String namespaceURI) {
		this.mapNSPrefix.put(namespaceURI, prefix);
		this.mapPrefixNS.put(prefix, namespaceURI);
	}

	private String findShortestSubstringNotAKeyOf(String needle, Map<String, String> map) {
		if (needle == null) {
			return null;
		}

		// Try every possible substring, from 1 to needle.length() characters
		for (int i = 1; i <= needle.length(); ++i) {
			final String substring = needle.substring(0, i).toLowerCase();
			if (!map.containsKey(substring)) {
				return substring;
			}
		}

		// Could not find any substring that wasn't a key of the provided map
		return null;
	}

	private String findLastNonEmptyPart(String[] parts) {
		for (int i = parts.length - 1; i >= 0; i--) {
			final String part = parts[i].trim();
			if (part.length() > 0) {
				return part;
			}
		}
		return null;
	}
}
