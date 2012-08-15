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
package es.uca.webservices.wsdl.analyzer;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to simplify the handling of XML Schema documents with XMLBeans.
 *
 * @author Cristina Jiménez-Gavilán (cristina.jimenezgavilan@alum.uca.es), Antonio García-Domínguez (antonio.garciadominguez@uca.es)
 */
public class SchemasAnalyzer {

    private SchemaTypeSystem sts;
    private SchemaTypeLoader sLoader;
    private static final Logger LOGGER = LoggerFactory.getLogger(SchemasAnalyzer.class);

    /**
	 * Initializes the analyzer from a set of files.
	 * 
	 * @param schemaFiles
	 *            The XML Schema files to be analyzed.
	 * @throws SchemaReadingException
	 *             There was a problem while reading the files or compiling
	 *             their contents.
	 */
    public SchemasAnalyzer(File... schemaFiles) throws SchemaReadingException {
        List<XmlObject> sdocs  = new ArrayList<XmlObject>();
        List<XmlError>  errors = new ArrayList<XmlError>();
        for (File schemaFile : schemaFiles) {
            try {
                sdocs.add(XmlObject.Factory.parse(schemaFile, getLoadOptions(errors)));
            } catch (Exception e) {
                throw new SchemaReadingException(
                	concatenate("Can not load schema file \"" + schemaFile + "\": ", errors), e);
            }
        }

        initialize(sdocs);
    }

    /**
	 * Initializes the analyzer from a set of input streams.
	 * 
	 * @param inputStreams
	 *            The input streams from which the schemata should be read.
	 * @throws SchemaReadingException
	 *             There was a problem while reading the files or compiling
	 *             their contents.
	 */
    public SchemasAnalyzer(InputStream... inputStreams) throws SchemaReadingException {
        List<XmlObject> sdocs  = new ArrayList<XmlObject>();
        List<XmlError>  errors = new ArrayList<XmlError>();
        for (InputStream is : inputStreams) {
        	try {
        		sdocs.add(XmlObject.Factory.parse(is, getLoadOptions(errors)));
        	} catch (Exception e) {
        		throw new SchemaReadingException(
                    	concatenate("Can not load schema file from stream: ", errors), e);
        	}
        }

        initialize(sdocs);
    }

	/**
     * Finds a global XML Schema element at the schemas
     * @param element   The element to be found
     * @return          The corresponding SchemaType
     * @throws MissingSchemaComponentException
     */
    public SchemaType findGlobalElement(QName element) throws MissingSchemaComponentException {

        SchemaType elem = sts.findDocumentType(element);

        if (elem == null) {
            throw new MissingSchemaComponentException("Could not find a global element with name \"" + element + "\"");
        }

        return elem;
    }

    /**
     * Finds a global XML Schema type at the schemas
     * @param type  The XML Schema type to be found
     * @return      The corresponding SchemaType
     * @throws MissingSchemaComponentException
     */
    public SchemaType findGlobalType(QName type) throws MissingSchemaComponentException {

        SchemaType elem = sts.findType(type);

        if (elem == null) {
            throw new MissingSchemaComponentException("Could not find a global type with name \"" + type + "\"");
        }

        return elem;
    }

    /**
     * Returns true if the instance is valid against the XSD analyzed
     * @param instance The string that represents the instance
     * @return true if the instance is valid against the XSD analyzed
     * @throws SchemaValidatingException An error has occur during validation
     */
    public boolean isValid(String instance) throws SchemaValidatingException {
        Boolean valid;

        XmlObject xobj = null;

        try {
            xobj = sLoader.parse(instance, null, (new XmlOptions()).setLoadLineNumbers(XmlOptions.LOAD_LINE_NUMBERS_END_ELEMENT));
        } catch (Exception e) {
            throw new SchemaValidatingException("Can not load instance \"" + instance + "\"", e);
        }

        Collection<XmlObject> errors = new ArrayList<XmlObject>();

        if (xobj.schemaType() == XmlObject.type) {
            throw new SchemaValidatingException("NOT valid. Document type not found");

        } else {
            valid = xobj.validate(new XmlOptions().setErrorListener(errors));
        }
        if (!valid) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instace is NOT valid:\n");
            for (Iterator<XmlObject> it = errors.iterator(); it.hasNext();) {
                sb.append(it.next());
            }
            LOGGER.warn(sb.toString());
        }

        return valid;
    }

	private XmlOptions getLoadOptions(List<XmlError> errors) {
		return (new XmlOptions()).setLoadLineNumbers().setLoadMessageDigest().setErrorListener(errors);
	}

	private void initialize(List<XmlObject> sdocs) throws SchemaReadingException {
		XmlObject[] schemas = (XmlObject[]) sdocs.toArray(new XmlObject[sdocs.size()]);
	
	    if (schemas.length > 0) {
	        List<XmlError> errors = new ArrayList<XmlError>();
	        XmlOptions compileOptions = new XmlOptions().setErrorListener(errors).setCompileDownloadUrls();
	
	        try {
	            sts = XmlBeans.compileXsd(schemas, XmlBeans.getBuiltinTypeSystem(), compileOptions);
	
	            sLoader = XmlBeans.compileXsd(schemas, null, compileOptions);
	            if (sLoader == null) {
	                sLoader = XmlBeans.getContextTypeLoader();
	            }
	        } catch (XmlException e) {
	            throw new SchemaReadingException(
	            		concatenate("There are schema compilation errors:\n", errors), e);
	        }
	    }
	}

	private String concatenate(String prefix, List<?> elements) {
		StringBuilder sb = new StringBuilder(prefix);
		for (Object o : elements) {
			sb.append(o);
		}
		return sb.toString();
	}
}
