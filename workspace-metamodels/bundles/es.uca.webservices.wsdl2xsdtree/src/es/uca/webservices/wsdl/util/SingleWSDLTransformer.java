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
package es.uca.webservices.wsdl.util;

import es.uca.webservices.bpel.util.XSLTStylesheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.transform.Transformer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * This class transforms a single WSDL file into a XSD file
 * applying the corresponding XSLT stylesheet
 *
 * @author Cristina Jiménez-Gavilán (cristina.jimenezgavilan@alum.uca.es), Antonio García-Domínguez (antonio.garciadominguez@uca.es)
 */
public class SingleWSDLTransformer extends XSLTStylesheet {

	private static final Logger LOGGER = LoggerFactory.getLogger(SingleWSDLTransformer.class);
    private static final String STYLESHEET_URL = "multipleDocuments.xsl";

    private File wsdlFile;
    private Map<URI, File> url2WSDLMap = new HashMap<URI, File>();
    private Map<File, File> wsdl2XSDMap = new HashMap<File, File>();

    public SingleWSDLTransformer() {
        super(STYLESHEET_URL);
    }

    public File getWSDLFile() {
        return wsdlFile;
    }

    public void setWSDLFile(File wsdlFile) {
        this.wsdlFile = wsdlFile;
    }

    public Map<URI, File> getUrl2WSDLMap() {
        return url2WSDLMap;
    }

    public void setUrl2WSDLMap(Map<URI, File> url2WSDLMap) {
        this.url2WSDLMap = url2WSDLMap;
    }

    public Map<File, File> getWsdl2XSDMap() {
        return wsdl2XSDMap;
    }

    public void setWsdl2XSDMap(Map<File, File> wsdl2XSDMap) {
        this.wsdl2XSDMap = wsdl2XSDMap;
    }

    /**
     * Extension function that maps an import path to the corresponding XML Schema document.
     */
    public String getPathToXSDFromImportLocation(String importLocation) throws IOException {
        // Make sure this is an absolute URI
        URI uri = URI.create(importLocation);
        if (!uri.isAbsolute()) {
            // It's a relative path from the current WSDL file's directory
            uri = new File(wsdlFile.getParentFile(), uri.getPath()).getCanonicalFile().toURI();
        }

        final File mappedWSDL = url2WSDLMap.get(uri);
        if (mappedWSDL != null) {
            return getPathToXSDFromWSDLFile(mappedWSDL);
        }

        return null;
    }

    /**
     * Extension function that maps a WSDL file to the canonical path of its related XML Schema document.
     */
    public String getPathToXSDFromWSDLFile(File pathToWSDL) throws IOException {
        return wsdl2XSDMap.get(pathToWSDL).getCanonicalPath();
    }

    /**
     * Extension function that converts relative URIs to absolute URIs based on the path of the WSDL
     * file, and leaves any other URI untouched.
     *
     * @param wsdlFile Canonical representation of the WSDL file to be used as base for any relative URI.
     * @param sLocationURI URI which will be resolved in case it is relative.
     * @return The original URI if <code>sLocationURI</code>was absolute, or the resolved absolute URI
     * if <code>sLocationURI</code> was relative.
     */
    public String resolveRelativeURI(File wsdlFile, String sLocationURI) throws IOException {
        final URI uri = URI.create(sLocationURI);
        if (uri.isAbsolute()) {
            return sLocationURI;
        } else {
            return wsdlFile.toURI().resolve(".") + uri.getPath();
        }
    }

    /**
     * Prepares the transformation
     * @param t The transformer 
     */
    @Override
    protected void prepareTransformer(Transformer t) {
        // Sets the path to the WSDL file before transforming
        try {
            t.setParameter("transformer", this);
            t.setParameter("wsdlFile", wsdlFile.getCanonicalFile());
		} catch (IOException e) {
			LOGGER.error("Could not initialize the wsdlFile parameter", e);
		}
    }
}
