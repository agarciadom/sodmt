/*
 *  Copyright 2010 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
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
package es.uca.webservices.wsdl.analyzer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.Binding;
import javax.wsdl.BindingOperation;
import javax.wsdl.Definition;
import javax.wsdl.Fault;
import javax.wsdl.Input;
import javax.wsdl.Operation;
import javax.wsdl.Output;
import javax.wsdl.Part;
import javax.wsdl.Port;
import javax.wsdl.PortType;
import javax.wsdl.Service;
import javax.wsdl.WSDLException;
import javax.wsdl.extensions.ElementExtensible;
import javax.wsdl.extensions.soap.SOAPAddress;
import javax.wsdl.extensions.soap.SOAPBinding;
import javax.wsdl.extensions.soap.SOAPBody;
import javax.wsdl.extensions.soap12.SOAP12Address;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.namespace.QName;

import es.uca.webservices.wsdl.util.WSDLGraphTransformer;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import serviceAnalyzer.messageCatalog.ServicesDocument;
import serviceAnalyzer.messageCatalog.ServicesDocument.Services;
import serviceAnalyzer.messageCatalog.TypeDecls;
import serviceAnalyzer.messageCatalog.TypeFault;
import serviceAnalyzer.messageCatalog.TypeInput;
import serviceAnalyzer.messageCatalog.TypeOperation;
import serviceAnalyzer.messageCatalog.TypeOutput;
import serviceAnalyzer.messageCatalog.TypePort;
import serviceAnalyzer.messageCatalog.TypeService;
import serviceAnalyzer.messageCatalog.TypeTemplate;

import com.ibm.wsdl.Constants;

import es.uca.webservices.bpel.XMLDocument;
import es.uca.webservices.wsdl.analyzer.utils.VelocityBeautifier;
import es.uca.webservices.wsdl.ast.ASTNode;
import es.uca.webservices.wsdl.ast.ElemNode;
import es.uca.webservices.wsdl.ast.ListNode;
import es.uca.webservices.wsdl.ast.Parser;
import es.uca.webservices.wsdl.ast.Parser.EncodingStyle;
import es.uca.webservices.wsdl.ast.RootNode;
import es.uca.webservices.wsdl.util.WSDL2XSDTreeException;
import es.uca.webservices.wsdl.visitor.DeclarationsGenerator;
import es.uca.webservices.wsdl.visitor.TemplateGenerator;

/**
 * This class is used to handle WSDL documents and generate the message catalog.
 *
 * @author Cristina Jiménez-Gavilán (cristina.jimenezgavilan@alum.uca.es), Antonio García-Domínguez
 */
public class ServiceAnalyzer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAnalyzer.class);
    private static final String RPC_STYLE = "rpc";

    private final VelocityBeautifier vmBeautifier = new VelocityBeautifier();

    private Definition[] definitions;
    private SchemasAnalyzer[] types;
    private ServicesDocument servicesDoc;

    /**
     * Constructor. Reads one or more WSDL files and prepares them for analysis.
     * @param wsdlPath  The path/s to the WSDL file/s
     */
    public ServiceAnalyzer(String... wsdlPath) throws WSDLException, SchemaReadingException, WSDL2XSDTreeException {
        this(ServiceAnalyzer.readAllDefinitions(wsdlPath));
    }

    /**
     * Constructor. Analyzes one or more previously parsed WSDL documents.
     * @param defs Previously parsed WSDL definitions.
     */
    public ServiceAnalyzer(List<Definition> defs) throws WSDL2XSDTreeException, SchemaReadingException {
        this(defs, ServiceAnalyzer.generateRoots(defs));
    }

    /**
     * Constructor. Analyzes one or more previously parsed WSDL documents and the corresponding XML Schema root
     * files generated with {@link WSDLGraphTransformer}.
     * @param defs Previously parsed WSDL definitions.
     * @param xsdRoots Previously generated XML Schema root files (using {@link WSDLGraphTransformer}, for instance).
     */
    public ServiceAnalyzer(List<Definition> defs, List<File> xsdRoots) throws SchemaReadingException {
        init(defs, ServiceAnalyzer.parseAllRoots(xsdRoots));
    }

    /**
	 * Generates the Message Catalog for the currents services
	 */
	public ServicesDocument generateMessageCatalog() throws InvalidWSDLContentsException, MissingSchemaComponentException {
	    // Initializes the XML document for the catalog
	    servicesDoc = ServicesDocument.Factory.newInstance();

	    // Creates the root element of the Message Catalog document
	    Services servicesLab = servicesDoc.addNewServices();

	    // Used to map a definition to its SchemasAnalyzer instance
	    int iDefinition = 0;
	    for (Definition d : definitions) {
	        generateMessageCatalogForDefinition(iDefinition++, d, servicesLab);
	    }

	    return servicesDoc;
	}

	/**
	 * Dumps the Message Catalog (if it has already been generated) to the standard output stream.
	 * @throws IOException
	 */
	public void printMessageCatalog() throws IOException {
	    if (this.servicesDoc != null) {
	        XmlOptions options = new XmlOptions();
	        options.setSavePrettyPrint();
	        options.setSavePrettyPrintIndent(2);
	        options.setSaveCDataEntityCountThreshold(0);
	        options.setSaveCDataLengthThreshold(0);
	        servicesDoc.save(System.out, options);
	    }
	}

    public static List<Definition> readAllDefinitions(String[] wsdlPath) throws WSDLException {
        final List<Definition> defs = new ArrayList<Definition>();
        WSDLReader wreader = WSDLFactory.newInstance().newWSDLReader();
        wreader.setFeature(Constants.FEATURE_VERBOSE, false);
        for (int i = 0; i < wsdlPath.length; ++i) {
            defs.add(wreader.readWSDL(null, wsdlPath[i]));
        }
        return defs;
    }

    public static List<File> generateRoots(List<Definition> defs) throws WSDL2XSDTreeException {
        final List<File> xsdRoots = new ArrayList<File>();
        for (Definition def : defs) {
            final WSDLGraphTransformer graphTransformer = new WSDLGraphTransformer(def);
            xsdRoots.add(graphTransformer.generateXSDTree());
        }
        return xsdRoots;
    }

    private static List<SchemasAnalyzer> parseAllRoots(List<File> xsdRoots) throws SchemaReadingException {
        final List<SchemasAnalyzer> analyzers = new ArrayList<SchemasAnalyzer>();
        for (File xsdRoot : xsdRoots) {
            analyzers.add(new SchemasAnalyzer(xsdRoot));
        }
        return analyzers;
    }

    private void init(List<Definition> defs, List<SchemasAnalyzer> analyzers) {
        this.definitions = defs.toArray(new Definition[defs.size()]);
        this.types = analyzers.toArray(new SchemasAnalyzer[analyzers.size()]);
    }

	/**
	 * Gets the message catalog in a XMLDocument
	 * @return The message catalog in a XMLDocument
	 * @throws Exception
	 */
	public XMLDocument getMessageCatalog() throws Exception {
	    File catalog = new File("messageCatalog.xml");
	
	    if (this.servicesDoc != null) {
	        XmlOptions options = new XmlOptions();
	        options.setSavePrettyPrint();
	        options.setSavePrettyPrintIndent(2);
	        options.setSaveCDataEntityCountThreshold(0);
	        options.setSaveCDataLengthThreshold(0);
	        servicesDoc.save(catalog, options);
	
	        XMLDocument result = new XMLDocument(catalog);
	        boolean deleted = catalog.delete();
	
	        if (!deleted) {
	            LOGGER.debug("An error occurs while deleting messageCatalog.xml ");
	        }
	
	        return result;
	    }
	    return null;
	}

    private void generateInputOutputRPC(int iDefinition, Service service, Port port,
			Operation operation, TypeOperation operationLab)
			throws InvalidWSDLContentsException,
			MissingSchemaComponentException
	{
		final Input in = operation.getInput();
		final Output out = operation.getOutput();
		final String inputName = in != null ? in.getName() : null;
		final String outputName = out != null ? out.getName() : null;
		BindingOperation bindingOp = port.getBinding().getBindingOperation(operation.getName(), inputName, outputName);
	
		if (in != null) {
		    String wrapperRPC = getSOAPBodyNamespace(bindingOp.getBindingInput());
		    if (wrapperRPC == null) {
		        wrapperRPC = service.getQName().getNamespaceURI();
		    }
		    generateInputRPC(operation, operationLab, wrapperRPC, iDefinition);
		}
	
		if (out != null) {
		    String wrapperRPC = getSOAPBodyNamespace(bindingOp.getBindingOutput());
		    if (wrapperRPC == null) {
		        wrapperRPC = service.getQName().getNamespaceURI();
		    }
		    generateOutputRPC(operation, operationLab, wrapperRPC, iDefinition);
		}
	}

	/**
     * Generates the Input
     * @param operation The WSDL Operation
     * @param operationLab  The tag for the operation in the catalog
     * @param i Number of definition
     */
    private void generateInputRPC(Operation operation, TypeOperation operationLab, String nsWrapperRPC, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        List<?> partsInput = operation.getInput().getMessage().getOrderedParts(null);

        TypeInput inputLab = operationLab.addNewInput();
        QName operationQName = new QName(nsWrapperRPC, operation.getName()); // request


        generatePartsRPC(partsInput, inputLab.addNewDecls(), inputLab.addNewTemplate(), i,
                operationQName);
    }

    private void generateOutputRPC(Operation operation, TypeOperation operationLab, String nsWrapperRPC, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
	    List<?> partsOutput = operation.getOutput().getMessage().getOrderedParts(null);
	    TypeOutput outputLab = operationLab.addNewOutput();
	    QName operationQName = new QName(nsWrapperRPC, operation.getName() + "Response");
	
	    generatePartsRPC(partsOutput, outputLab.addNewDecls(), outputLab.addNewTemplate(), i,
	            operationQName);
	}

	private void generateInputOutputDoc(int iDefinition, Operation operation,
			TypeOperation operationLab) throws InvalidWSDLContentsException,
			MissingSchemaComponentException {
		if (operation.getInput() != null) {
		    generateInputDoc(operation, operationLab, iDefinition);
		}
		if (operation.getOutput() != null) {
		    generateOutputDoc(operation, operationLab, iDefinition);
		}
	}

	private void generateInputDoc(Operation operation, TypeOperation operationLab, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        Map<?, ?> partsInput = operation.getInput().getMessage().getParts();
        TypeInput inputLab = operationLab.addNewInput();

        switch (partsInput.size()) {
            case 0:
                inputLab.addNewDecls();
                inputLab.addNewTemplate();
                break;
            case 1:
                Part part = (Part) partsInput.values().iterator().next();
                generatePartDoc(part, inputLab.addNewDecls(), inputLab.addNewTemplate(), i);
                break;
            default:
                /* R2201 A document-literal binding in a DESCRIPTION MUST,
                in each of its wsoap11:body element(s),
                have at most one part listed in the parts attribute,
                if the parts attribute is specified.
                 */
                throw new InvalidWSDLContentsException(
                        "Style is document/literal, but the message has more than one part");
        }
    }

    private void generateOutputDoc(Operation operation, TypeOperation operationLab, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        Map<?, ?> partsOutput = operation.getOutput().getMessage().getParts();
        TypeOutput outputLab = operationLab.addNewOutput();
        switch (partsOutput.size()) {
            case 0:
                outputLab.addNewDecls();
                outputLab.addNewTemplate();
                break;
            case 1:
                Part part = (Part) partsOutput.values().iterator().next();
                generatePartDoc(part, outputLab.addNewDecls(), outputLab.addNewTemplate(), i);
                break;
            default:
                /* R2201 A document-literal binding in a DESCRIPTION MUST,
                in each of its wsoap11:body element(s),
                have at most one part listed in the parts attribute,
                if the parts attribute is specified.
                 */
                throw new InvalidWSDLContentsException(
                        "Style is document/literal, but the message has more than one part");
        }
    }

    private void generateFaults(Operation operation, TypeOperation operationLab, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        Map<?, ?> faults = operation.getFaults();
        // For each fault
        Iterator<?> iter = faults.values().iterator();
        while (iter.hasNext()) {
            Fault fault = (Fault) iter.next();
            List<?> partsFault = fault.getMessage().getOrderedParts(null);

            // Add a new fault to the operation and set his name attribute
            TypeFault faultLab = operationLab.addNewFault();
            faultLab.setName(fault.getName());

            /* R2205 A wsdl:binding in a DESCRIPTION MUST refer, 
            in each of its wsoap11:header, wsoap11:headerfault and wsoap11:fault elements,
            only to wsdl:part element(s) that have been defined using the element attribute. */

            switch (partsFault.size()) {
                case 0:
                    faultLab.addNewDecls();
                    faultLab.addNewTemplate();
                    break;
                case 1:
                    Part part = (Part) partsFault.iterator().next();
                    generatePartDoc(part, faultLab.addNewDecls(), faultLab.addNewTemplate(), i);
                    break;
                default:
                    /* R2201 A document-literal binding in a DESCRIPTION MUST,
                    in each of its wsoap11:body element(s),
                    have at most one part listed in the parts attribute,
                    if the parts attribute is specified.
                     */
                    throw new InvalidWSDLContentsException(
                            "Style is document/literal, but the message has more than one part");
            }

        }
    }

    private ElemNode transform(RootNode rootNode) {
        return new ElemNode(rootNode.getQName(), rootNode.getContents());
    }

    private ASTNode unify(List<ASTNode> trees, QName wrapper) {
        int numParts = trees.size();
        ASTNode cbody = null;

        if (numParts == 1) {
            cbody = transform((RootNode) trees.get(0));
        } else {
            List<ASTNode> nodes = new ArrayList<ASTNode>(numParts);
            Iterator<ASTNode> iter = trees.iterator();
            while (iter.hasNext()) {
                RootNode node = (RootNode) iter.next();
                nodes.add(transform(node));
            }
            cbody = new ListNode(nodes, true);
        }

        return new RootNode(wrapper, null, cbody);
    }

    /**
     * RPC-literal style
     * @param parts
     * @param declsLab
     * @param templateLab
     * @param i
     * @param wrapper
     */
    private void generatePartsRPC(List<?> parts, TypeDecls declsLab, TypeTemplate templateLab, int i,
            QName wrapper) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        if (parts.size() > 0) {
            // For each part
            List<ASTNode> trees = new ArrayList<ASTNode>(parts.size());
            Iterator<?> iter = parts.iterator();
            while (iter.hasNext()) {
                Part part = (Part) iter.next();


                QName type = part.getTypeName();
                if (type != null) {
                    /* R2735 An ENVELOPE described with an rpc-literal binding MUST place the
                    part accessor elements for parameters and return value in no namespace.
                     */
                    QName partName = new QName(part.getName());
                    Parser parser;
                    // el type puede estar en un xml-schema o ser ya un tipo primitivo
                    if (type.getNamespaceURI().compareTo("http://www.w3.org/2001/XMLSchema") == 0) {
                        parser = new Parser(partName, type, EncodingStyle.RPC);
                    } else {
                        SchemaType schemaType = types[i].findGlobalType(type);
                        parser = new Parser(partName, schemaType, EncodingStyle.RPC);
                    }
                    trees.add(parser.getRoot());
                } else {
                    /* R2203 An rpc-literal binding in a DESCRIPTION MUST refer,
                    in its wsoap11:body element(s), only to wsdl:part element(s)
                    that have been defined using the type attribute. */
                    throw new InvalidWSDLContentsException(
                            "Style is rpc/literal, but the part " + part.getName()
                            + " uses the element attribute");
                }
            }
            ASTNode result = unify(trees, wrapper);
            generateDeclarations(result, declsLab);
            generateTemplate(result, templateLab);
        }
    }

    /**
     * Generates the part in Document-literal style
     * @param part
     * @param declsLab
     * @param templateLab
     * @param i
     */
    private void generatePartDoc(Part part, TypeDecls declsLab, TypeTemplate templateLab, int i) throws InvalidWSDLContentsException, MissingSchemaComponentException {
        if (part != null) {
            QName element = part.getElementName();

            if (element != null) {
                /*  R2206   A wsdl:message in a DESCRIPTION containing a wsdl:part
                that uses the element attribute MUST refer, in that attribute,
                to a global element declaration. */
                SchemaType schemaType = types[i].findGlobalElement(element);
                Parser parser = new Parser(element, schemaType, EncodingStyle.DOCUMENT);
                generateDeclarations(parser.getRoot(), declsLab);
                generateTemplate(parser.getRoot(), templateLab);

            } else {
                /* R2204 A document-literal binding in a DESCRIPTION MUST refer,
                in each of its wsoap11:body element(s),
                only to wsdl:part element(s) that have been defined using the element attribute. */
                throw new InvalidWSDLContentsException(
                        "Style is document/literal, but the part " + part.getName()
                        + " uses the type attribute");
            }
        }
    }

    private void generateTemplate(ASTNode node, TypeTemplate templateLab) {
        TemplateGenerator tg = new TemplateGenerator();
        final String rawTemplate = (String) node.accept(tg, null);
		templateLab.setStringValue(vmBeautifier.beautify(rawTemplate));
    }

    private void generateDeclarations(ASTNode node, TypeDecls declsLab) {
        DeclarationsGenerator dg = new DeclarationsGenerator();
        node.accept(dg, null);
        declsLab.setTypedefArray(dg.getTypedefArray());
        declsLab.setVariableArray(dg.getVariableArray());
    }

    private String getSOAPBodyNamespace(ElementExtensible binding) {
    	for (Object o : binding.getExtensibilityElements()) {
    		if (o instanceof SOAPBody) {
    			return ((SOAPBody) o).getNamespaceURI();
    		}
    	}
    	return null;
    }

    private String getSOAPBindingStyle(ElementExtensible binding) {
    	for (Object o : binding.getExtensibilityElements()) {
    		if (o instanceof SOAPBinding) {
    			return ((SOAPBinding) o).getStyle();
    		}
    	}
    	return null;
    }

    @SuppressWarnings("unchecked")
	private void generateMessageCatalogForDefinition(int iDefinition, Definition d, Services servicesLab)
			throws InvalidWSDLContentsException, MissingSchemaComponentException
	{
		for (Service service : (Collection<Service>)d.getAllServices().values()) {
		    TypeService serviceLab = servicesLab.addNewService();
		    serviceLab.setName(service.getQName().getLocalPart());
		    serviceLab.setUri(service.getQName().getNamespaceURI());
		    generateMessageCatalogForService(iDefinition, service, serviceLab);
		}
	}

    @SuppressWarnings("unchecked")
	private void generateMessageCatalogForService(int iDefinition,
			Service service, TypeService serviceLab)
			throws InvalidWSDLContentsException,
			MissingSchemaComponentException {
		for (Port port : (Collection<Port>)service.getPorts().values()) {
		    final TypePort portLab = serviceLab.addNewPort();
		    portLab.setName(port.getName());

		    final Binding binding = port.getBinding();
		    final String style = getSOAPBindingStyle(binding);
		    final PortType portType = binding.getPortType();

		    for (Operation operation : (List<Operation>)portType.getOperations()) {
		        TypeOperation operationLab = portLab.addNewOperation();
		        operationLab.setName(operation.getName());

		        if (RPC_STYLE.equals(style)) {
		            generateInputOutputRPC(iDefinition, service, port, operation, operationLab);
		        } else {
		            generateInputOutputDoc(iDefinition, operation, operationLab);
		        }
		        generateFaults(operation, operationLab, iDefinition);
		    }
            for (Object o : port.getExtensibilityElements()) {
                if (o instanceof SOAPAddress) {
                    final SOAPAddress address = (SOAPAddress)o;
                    portLab.setAddress(address.getLocationURI());
                }
                else if (o instanceof SOAP12Address) {
                    final SOAP12Address address = (SOAP12Address)o;
                    portLab.setAddress(address.getLocationURI());
                }
            }
		}
	}
}
