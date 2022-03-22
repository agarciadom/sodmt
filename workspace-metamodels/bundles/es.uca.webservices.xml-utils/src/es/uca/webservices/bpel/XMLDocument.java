package es.uca.webservices.bpel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import es.uca.webservices.bpel.util.XMLUtils;

/**
 * This is the base class for all XML-based file handlers. Do not forget to set
 * the right namespace context with
 * {@link #setNamespaceContext(NamespaceContext)} after creating the object if
 * you want to use specific prefixes.
 *
 * @author Antonio García Domínguez
 * @version 1.0
 */
public class XMLDocument {

	private static final Logger LOGGER = LoggerFactory.getLogger(XMLDocument.class);

	private static DocumentBuilder documentBuilder;
	private Document docXML;
	private File file;
	private final javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();

	/**
	 * Changes the namespace context used to relate namespace URIs with their
	 * prefixes.
	 *
	 * @param ctx
	 *            Namespace context to be used from now on.
	 */
	public void setNamespaceContext(NamespaceContext ctx) {
		xpath.setNamespaceContext(ctx);
	}

	/**
	 * Returns the namespace URI of the root element. Do not confuse with the
	 * target namespace.
	 * @return A String with the namespace URI of the root element
	 * @throws XPathExpressionException
	 */
	public String getNamespaceURI() {
		try {
			return evaluateExpression("namespace-uri(*[1])");
		} catch (XPathExpressionException e) {
			return "";
		}
	}

	/**
	 * Returns the target namespace URI, or the empty string when undefined.
         * @return A String with the namespace URI
	 */
	public String getTargetNamespaceURI() {
		try {
			return evaluateExpression("*[1]/@targetNamespace");
		} catch (XPathExpressionException e) {
			return "";
		}
	}

	/**
	 * Returns the FIle that the instance is handling
	 * 
	 * @return The File object associated with the file parsed
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Gets the Document object associated with this parsed XML
	 * 
	 * @return A Document object
	 */
	public Document getDocument() {
		return docXML;
	}

	/**
	 * Dumps the contents of the DOM document in serialized XML form to a
	 * stream.
	 * 
	 * @param os
	 *            Destination stream.
	 * @throws TransformerException
	 *             There was a problem with the default XSLT identity
	 *             transformtion.
	 * */
	public void dumpToStream(OutputStream os) throws TransformerException {
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new DOMSource(getDocument()), new StreamResult(os));
	}

	/**
	 * Convenience version for {@link #dumpToStream(OutputStream)} which uses
	 * a FileOutputStream to the specified file.
	 */
	public void dumpToFile(File f) throws TransformerException, IOException {
		FileOutputStream fOS = new FileOutputStream(f);
		try {
			dumpToStream(fOS);
		} finally {
			fOS.flush();
			fOS.close();
		}
	}

	/**
	 * Constructor from a File
	 * 
	 * @param f
	 *            The File to be parsed
	 * @throws ParserConfigurationException
	 *             The XML parser was incorrectly configured.
	 * @throws SAXException
	 *             The SAX parser could not parse the contents of the file as XML.
	 * @throws IOException
	 *             The file could not be loaded
	 */
	public XMLDocument(File f) throws ParserConfigurationException,
			SAXException, IOException {
		this.file = f.getCanonicalFile();
		this.docXML = analyzeFile(f);
	}

	/**
	 * Constructor from a Document
	 * 
	 * @param d
	 *            The Document object
	 */
	public XMLDocument(Document d) {
		this.docXML = d;
	}

	/**
	 * Constructor from a raw String
	 * @throws ParserConfigurationException
	 *             The XML parser was incorrectly configured.
	 * @throws SAXException
	 *             The SAX parser could not parse the contents of the file as XML.
	 * @throws IOException
	 *             I/O error while reading the string.
	 */
	public XMLDocument(String s) throws SAXException, IOException, ParserConfigurationException {
		this.docXML = analyzeString(s);
	}

	public XMLDocument(InputStream is) throws SAXException, IOException, ParserConfigurationException {
		final DocumentBuilder db = getDocumentBuilder();
		synchronized(db) {
			this.docXML = db.parse(is);
		}
	}

	/**
	 * Evaluates a XPath expression, starting at the document node.
	 * 
	 * @param expr
	 *            The XPath expression
	 * @param returnType
	 *            The expected type of the result
	 * @return An object with the value got applying the XPath expression
	 * @throws XPathExpressionException
	 *             The XPath expression is not valid
	 */
	public Object evaluateExpression(final String expr, QName returnType)
			throws XPathExpressionException {
		return evaluateExpression(docXML, expr, returnType);
	}

	/**
	 * Evaluates a XPath expression, starting at the document node.
	 * 
	 * @param expr
	 *            The XPath expression
	 * @return A String with the value got applying the XPath expression
	 * @throws XPathExpressionException
	 *             The XPath expression is not valid
	 */
	public String evaluateExpression(final String expr)
			throws XPathExpressionException {
		return (String) evaluateExpression(docXML, expr, XPathConstants.STRING);
	}

	/**
	 * Evaluates a XPath expression, starting at a specific node.
	 * 
	 * @param context
	 *            The context of the XPath expression
	 * @param expr
	 *            The XPath expression
	 * @return A String with the value got applying the XPath expression
	 * @throws XPathExpressionException
	 *             The XPath expression is not valid
	 */
	public String evaluateExpression(Node context, String expr)
			throws XPathExpressionException {
		return (String) evaluateExpression(context, expr, XPathConstants.STRING);
	}

	/**
	 * Evaluates a XPath expression, starting at a specific node.
	 * 
	 * @param expr
	 *            The XPath expression
	 * @param returnType
	 *            The expected type of the result
	 * @return An object with the value got applying the XPath expression
	 * @throws XPathExpressionException
	 *             The XPath expression is not valid
	 */
	public Object evaluateExpression(Node context, final String expr,
			QName returnType) throws XPathExpressionException {
		return xpath.evaluate(expr, context, returnType);
	}

	/**
	 * Converts a String into a QName with the specified context
	 * 
	 * @param sName
	 *            The String to be converted
	 * @param context
	 *            The context
	 * @return A QName
	 */
	public QName stringToQName(String sName, Node context) {
		String targetNS = "";
		try {
			targetNS = evaluateExpression("*[1]/@targetNamespace");
		} catch (XPathExpressionException e) {
			LOGGER.warn("Could not find the target namespace for this node. Using the empty namespace instead.", e);
		}
		return XMLUtils.stringToQName(sName, context, targetNS);
	}

	private static Document analyzeFile(File f)
			throws ParserConfigurationException, SAXException, IOException {
		final DocumentBuilder db = getDocumentBuilder();
		synchronized(db) {
			return db.parse(f);
		}
	}

	private static Document analyzeString(String s)
			throws SAXException, IOException, ParserConfigurationException {
		final DocumentBuilder db = getDocumentBuilder();
		synchronized(db) {
			return db.parse(new InputSource(new StringReader(s)));
		}
	}

	private synchronized static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
		if (documentBuilder == null) {
			DocumentBuilderFactory bldF = DocumentBuilderFactory.newInstance();
			bldF.setNamespaceAware(true);
			documentBuilder = bldF.newDocumentBuilder();
		}
		return documentBuilder;
	}

}