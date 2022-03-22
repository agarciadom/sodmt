package es.uca.webservices.bpel;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * This class is used to handle XML Schema files
 * @author Antonio García Domínguez
 * @version 1.0
 */
public class XMLSchemaFile extends XMLDocument {

    /**
     * Constructor
     * @param f     The file to be parsed
     * @throws ParserConfigurationException  Indicates a serious configuration error.
     * @throws SAXException                               An error ocurred while parsing
     * @throws IOException                                  The file could not be readed
     */
	public XMLSchemaFile(File f) throws ParserConfigurationException,
			SAXException, IOException {
		super(f);
		assert(getNamespaceURI().equals(XSD_NAMESPACE));
	}

        /**
         * Gets the target namespace of the XML Schema document
         * @return  A String with the URI of the target namespace
         */
	public String getTargetNamespace() {
		try {
			return evaluateExpression("*[1]/@targetNamespace");
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return "";
		}
	}

	static final String XSD_NAMESPACE  = "http://www.w3.org/2001/XMLSchema";
	static final String XSD_NS_PREFIX  = "xsd";
}
