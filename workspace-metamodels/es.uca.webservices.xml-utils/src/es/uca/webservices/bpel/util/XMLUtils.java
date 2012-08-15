package es.uca.webservices.bpel.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathVariableResolver;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Collection of assorted XML utilities.
 * 
 * @author Antonio García-Domínguez
 */
public class XMLUtils {

    private static XPath           xpath;
    private static XmlOptions      xmlOptions;
    private static DocumentBuilder docBuilder;
    private static final Logger LOGGER = LoggerFactory.getLogger(XMLUtils.class);

    /**
     * Compares two XML nodes for equivalence, using the XPath deep-equals
     * function. See <a href=
     * "http://www.w3.org/TR/2005/CR-xpath-functions-20051103/#func-deep-equal"
     * >here</a> for more details.
     * 
     * @param nsContext
     *            Namespace context to be used.
     * @param a
     *            First node to be compared.
     * @param b
     *            Second node to be compared.
     * @return <code>true</code> if they are equal according to deep-equal(),
     *         <code>false</code> otherwise.
     * @throws XPathExpressionException
     *             There was a problem while evaluating the deep-equal()
     *             function.
     */
    public static boolean compare(final NamespaceContext nsContext,
            final Node a, final Node b) throws XPathExpressionException {
        HashMap<QName, Object> vars = new HashMap<QName, Object>();
        vars.put(new QName("x"), a);
        vars.put(new QName("y"), b);
        return (Boolean) evaluate(nsContext, "deep-equal($x, $y)", a, vars,
                XPathConstants.BOOLEAN);
    }

    /**
     * Beautifies a XML source fragment. The XML source is parsed, reindented
     * and serialized back to a String.
     * 
     * @param xmlSource
     *            XML source fragment.
     * @throws XmlException
     *             There was a problem while parsing the XML fragment.
     */
    public static String prettyPrint(String xmlSource) throws XmlException {
        if (xmlOptions == null) {
            xmlOptions = new XmlOptions();
            xmlOptions.setSavePrettyPrint();
            xmlOptions.setSavePrettyPrintIndent(4);
        }
        XmlObject xmlObject = XmlObject.Factory.parse(xmlSource);
        String prettyXmlSource = xmlObject.xmlText(xmlOptions);
        return prettyXmlSource;
    }

    /**
     * Parses a XML source fragment into a DOM Document.
     * 
     * @param xmlSource
     *            Source of the full XML document.
     * @return DOM Document resulting from parsing <code>xmlSource</code> using
     *         a namespace-aware JAXP parser.
     * @throws SAXException
     *             There was a problem while parsing.
     * @throws IOException
     *             There was a problem while reading the input.
     * @throws ParserConfigurationException
     *             There was a problem while configuring the parser.
     */
    public static Document parse(final String xmlSource) throws SAXException,
            IOException, ParserConfigurationException {
        if (docBuilder == null) {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
                    .newInstance();
            docBuilderFactory.setNamespaceAware(true);
            docBuilder = docBuilderFactory.newDocumentBuilder();
        }
        return XMLUtils.docBuilder.parse(new InputSource(new StringReader(
                xmlSource)));
    }

    /**
     * Strips XML declaration and processing instructions from an XML source
     * fragment.
     * 
     * @param xmlSource
     *            Source of the full XML document.
     * @return Source of the XML document, without the processing instructions.
     *         If the source is not a valid XML fragment, return it as-is.
     */
    public static String stripDeclarations(String xmlSource) {
        try {
            XmlObject xmlObject = XmlObject.Factory.parse(xmlSource);
            return xmlObject.xmlText();
        } catch (XmlException e) {
        	LOGGER.error("Not valid XML: returning as text - " + xmlSource);
            // Source is not valid XML: it's just text
            return xmlSource;
        }
    }

    /**
     * Evaluates an XPath expression on the specified node. The prefixes
     * declared by the received namespace context can be used in the expression.
     * 
     * @param nsContext
     *            Namespace context to be used. If <code>null</code>, no
     *            namespace prefixes will be available.
     * @param expr
     *            XPath expression to be evaluated.
     * @param node
     *            Node which should be used as context.
     * @param vars
     *            If not <code>null</code>, variables which should be available
     *            in the expression.
     * @param type
     *            Expected return type (see {@link XPathConstants}).
     * @return Result from evaluating the XPath expression with
     *         <code>node</code> as context, with the variables
     *         <code>vars</code> (if not <code>null</code>). The result conforms
     *         to the type specified in <code>type</code>.
     * @throws XPathExpressionException
     *             There was a problem while evaluating the XPath expression.
     */
    public static Object evaluate(final NamespaceContext ctx,
            final String expr, final Node node, final Map<QName, Object> vars,
            final QName type) throws XPathExpressionException {
        if (xpath == null) {
            xpath = XPathFactory.newInstance().newXPath();
            xpath.setNamespaceContext(ctx);
        }

        xpath.setXPathVariableResolver(new XPathVariableResolver() {
            @Override
            public Object resolveVariable(QName arg0) {
                if (vars != null && vars.containsKey(arg0)) {
                    return vars.get(arg0);
                }
                else {
                    return null;
                }
            }
        });
        return xpath.evaluate(expr, node, type);
    }

    /**
	 * Converts a "[prefix:]localPart" string into a proper QName. Looks up the
	 * prefix using the specified node as context. If it doesn't have a prefix,
	 * it will use the specified target namespace. If that doesn't work either,
	 * it will use the default empty namespace (the one mapped to
	 * {@link XMLConstants#DEFAULT_NS_PREFIX}).
	 * 
	 * @param sName
	 *            String-based name to be converted.
	 * @param context
	 *            Node to be used as context to look up namespace prefixes.
	 * @param targetNS
	 *            Target namespace of the whole document (like in WSDL or in XML
	 *            Schema). Can be <code>null</code> is no such concept exists.
	 * @return QName formed by the namespace URI of the prefix (if any) and the
	 *         local part of the original name.
	 */
	public static QName stringToQName(String sName, Node context, String targetNS) {
		if (sName == null || sName.isEmpty()) {
			return null;
		}
	
		String sPrefijo = XMLConstants.DEFAULT_NS_PREFIX, sLocal = sName, ns;
		if (sName.contains(":")) {
			sPrefijo = sName.substring(0, sName.indexOf(':'));
			sLocal = sName.substring(sName.indexOf(':') + 1);
			ns = context.lookupNamespaceURI(sPrefijo);
		} else if (targetNS != null && targetNS.length() > 0) {
			ns = targetNS;
		} else {
			ns = context.lookupNamespaceURI(null);
		}
		return new QName(ns, sLocal, sPrefijo);
	}
}
