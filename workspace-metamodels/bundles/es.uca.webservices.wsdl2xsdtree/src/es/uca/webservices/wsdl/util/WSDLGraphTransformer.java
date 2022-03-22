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
package es.uca.webservices.wsdl.util;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.*;

import javax.wsdl.Definition;
import javax.wsdl.Import;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;

import com.ibm.wsdl.Constants;
import org.apache.commons.io.FileUtils;

/**
 * Transforms a graph of WSDL 1.1 documents into a graph of XML Schema documents, for its use with
 * XML Schema. Processing starts from the root of the graph, i.e. the document that imports all the
 * other ones (either directly or indirectly). All generated files are stored in temporary locations.
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es), Antonio Garcia-Dominguez
 */
public class WSDLGraphTransformer {

    private File rootWSDLFile;
    private Definition rootDefinition;

    private Map<URI, File> url2WSDLFileMap = new HashMap<URI, File>();
    private Map<File, File> wsdl2XSDFileMap = new HashMap<File, File>();

    /**
	 * Uses a raw WSDL4J document definition.
	 * 
	 * @param wsdlDef
	 *            The root WSDL4J definition of the graph.
	 * @throws WSDL2XSDTreeException
	 *             There was a problem parsing the document base URI from the
	 *             WSDL definition.
	 */
    public WSDLGraphTransformer(Definition wsdlDef) throws WSDL2XSDTreeException {
        addWSDLFromURL(wsdlDef, null, URI.create(wsdlDef.getDocumentBaseURI()));
    }

    /**
     * Loads an existing .wsdl file in the local file system.
     */
    public WSDLGraphTransformer(File wsdlFile) throws WSDL2XSDTreeException {
        addWSDLFromURL(null, null, wsdlFile.toURI());
    }

    /**
     * Loads a WSDL document from an URI.
     *
     * @param uri The URI of the root WSDL document.
     */
    public WSDLGraphTransformer(URI uri) throws WSDL2XSDTreeException {
        addWSDLFromURL(null, null, uri);
    }

    /**
     * Generates the corresponding XSD graph
     * @throws WSDL2XSDTreeException
     */
    public File generateXSDTree() throws WSDL2XSDTreeException {
        try {
            collectAllImports(rootDefinition);

            // Transform all WSDL files
            final SingleWSDLTransformer s = new SingleWSDLTransformer();
            s.setUrl2WSDLMap(url2WSDLFileMap);
            s.setWsdl2XSDMap(wsdl2XSDFileMap);
            for (Map.Entry<File, File> entry : wsdl2XSDFileMap.entrySet()) {
                final File wsdlFile = entry.getKey();
                final File xsdFile = entry.getValue();
                s.setWSDLFile(wsdlFile);
                s.transform(wsdlFile, xsdFile);
            }

            // Return the XML Schema file produced from transforming the root of the graph
            return wsdl2XSDFileMap.get(rootWSDLFile);
        } catch (WSDL2XSDTreeException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new WSDL2XSDTreeException(ex);
        }
    }

    @SuppressWarnings("unchecked")
    private void collectAllImports(Definition parentDefinition) throws MalformedURLException, WSDL2XSDTreeException {
        for (List<Import> imports : (Collection<List<Import>>) parentDefinition.getImports().values()) {
            for (Import imp : imports) {
                final URI importURI = URI.create(imp.getLocationURI());
                final Definition importDef = addWSDLFromURL(null, parentDefinition, importURI);
                if (importDef != null) {
                    collectAllImports(importDef);
                }
            }
        }
    }

    private Definition addWSDLFromURL(Definition definition, Definition parentDefinition, URI uri) throws WSDL2XSDTreeException {
        try {
            if (!uri.isAbsolute() && parentDefinition != null) {
                final URI defURI = URI.create(parentDefinition.getDocumentBaseURI());
                uri = URI.create(defURI.resolve(".").toString() + uri.getPath());
            }
            if (uri.getScheme() == null || "file".equals(uri.getScheme())) {
                // Normalize file:// URLs and paths
                uri = new File(uri.getPath()).getCanonicalFile().toURI();
            }
            if (url2WSDLFileMap.containsKey(uri)) {
                // The .wsdl file was already loaded from elsewhere - do nothing
                return null;
            }

            // Ensures we can count on having a .wsdl file in the local file system
            File wsdlFile;
            if (uri.getScheme() == null || "file".equals(uri.getScheme())) {
                wsdlFile = new File(uri.getPath());
            } else {
                final InputStream is = uri.toURL().openStream();
                try {
                    wsdlFile = File.createTempFile("wsdl2xsd", ".wsdl");
                    FileUtils.copyInputStreamToFile(is, wsdlFile);
                } finally {
                    is.close();
                }
            }

            /*
             * Ensures that the .wsdl file has been parsed, but do not automatically import documents,
             * to avoid repeated parsing.
             */
            if (definition == null) {
                final WSDLReader wReader = WSDLFactory.newInstance().newWSDLReader();
                wReader.setFeature(Constants.FEATURE_VERBOSE, false);
                wReader.setFeature(Constants.FEATURE_IMPORT_DOCUMENTS, false);
                definition = wReader.readWSDL(null, uri.toString());
            }

            // Is this the first WSDL document we load?
            // If so, it will be the root of the graph.
            if (rootWSDLFile == null) {
                rootWSDLFile = wsdlFile;
                this.rootDefinition = definition;
            }

            // Link the WSDL file to the XML Schema file we will produce from it
            final File temporaryXSDFile = File.createTempFile("wsdl2xsd", ".xsd");
            url2WSDLFileMap.put(uri, wsdlFile);
            wsdl2XSDFileMap.put(wsdlFile, temporaryXSDFile);

            return definition;
        } catch (Exception e) {
            throw new WSDL2XSDTreeException(e);
        }
    }

}
