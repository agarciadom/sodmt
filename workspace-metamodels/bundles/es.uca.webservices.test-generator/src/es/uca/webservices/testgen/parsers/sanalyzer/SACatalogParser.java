/*
 *  Copyright 2011 Miguel Ángel Pérez Montero (miguelangel.perezmontero@alum.uca.es).
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
package es.uca.webservices.testgen.parsers.sanalyzer;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import serviceAnalyzer.messageCatalog.ServicesDocument;
import serviceAnalyzer.messageCatalog.ServicesDocument.Services;
import serviceAnalyzer.messageCatalog.TypeFault;
import serviceAnalyzer.messageCatalog.TypeInput;
import serviceAnalyzer.messageCatalog.TypeOperation;
import serviceAnalyzer.messageCatalog.TypeOutput;
import serviceAnalyzer.messageCatalog.TypeService;
import serviceAnalyzer.messageCatalog.TypeTypedef;
import serviceAnalyzer.messageCatalog.TypeVariable;
import es.uca.webservices.testgen.api.parsers.IParser;
import es.uca.webservices.testgen.api.parsers.ParserException;
import es.uca.webservices.testgen.api.types.AbstractDates;
import es.uca.webservices.testgen.api.types.IType;
import es.uca.webservices.testgen.api.types.TypeDate;
import es.uca.webservices.testgen.api.types.TypeDateTime;
import es.uca.webservices.testgen.api.types.TypeDuration;
import es.uca.webservices.testgen.api.types.TypeFloat;
import es.uca.webservices.testgen.api.types.TypeInt;
import es.uca.webservices.testgen.api.types.TypeList;
import es.uca.webservices.testgen.api.types.TypeString;
import es.uca.webservices.testgen.api.types.TypeTime;
import es.uca.webservices.testgen.api.types.TypeTuple;
import es.uca.webservices.testgen.parsers.MessageDirection;
import es.uca.webservices.wsdl.analyzer.ServiceAnalyzer;

/**
 * Parser that generates and processes a ServiceAnalyzer message catalog from an WSDL file.
 */
public class SACatalogParser implements IParser {

    private ServicesDocument servicesDoc;
    private List<IType> types;
	private String wsdlPath;
    private static DatatypeFactory dataTypeFactory;

    /** Default constructor, to be used from gamerahom-generator. */
    public SACatalogParser() {
    	// Create a default empty document, to avoid NPEs
    	servicesDoc = ServicesDocument.Factory.newInstance();
    }

    public SACatalogParser(String filePath) throws ParserException {
        setWSDL(filePath);
    }

    public SACatalogParser(ServicesDocument services) {
        servicesDoc = services;
    }

    @Override
    public void parse(String... args) throws ParserException {
        try {
            parse(args[0], args[1], MessageDirection.fromString(args[2]));
        } catch (DatatypeConfigurationException ex) {
            throw new ParserException(ex);
        }
    }

    /**
     * Convenience version of {@link #parse(String...)}.
     */
    public void parse(String service, String operation, MessageDirection type)
            throws ParserException, DatatypeConfigurationException {
        this.types = new ArrayList<IType>();
        Services services = servicesDoc.getServices();
        TypeService   typeService   = SACatalogUtils.findServiceByName(services, service);
        TypeOperation typeOperation = SACatalogUtils.findOperationByName(typeService, operation);

		// according to the type I prefer one or the other
		TypeVariable[] variables;
		TypeTypedef[] typeDefs;
		switch (type) {
		case IN:
			TypeInput input = typeOperation.getInput();
			variables = input.getDecls().getVariableArray();
			typeDefs = input.getDecls().getTypedefArray();
			insertIType(typeDefs, variables);
			break;
		case OUT:
			TypeOutput output = typeOperation.getOutput();
			variables = output.getDecls().getVariableArray();
			typeDefs = output.getDecls().getTypedefArray();
			insertIType(typeDefs, variables);
			break;
		case ERR:
			TypeFault[] faultsArray = typeOperation.getFaultArray();
			for (int iter = 0; iter < faultsArray.length; ++iter) {
				variables = faultsArray[iter].getDecls().getVariableArray();
				typeDefs = faultsArray[iter].getDecls().getTypedefArray();
				insertIType(typeDefs, variables);
			}
			break;
		default:
			throw new ParserException("Unknown message direction: " + type);
		}
    }

    public final String getWSDL() {
    	return wsdlPath;
    }

    public final void setWSDL(final String filePath) throws ParserException {
    	this.wsdlPath = filePath;

    	File inputXMLFile = new File(wsdlPath);
	    if (!inputXMLFile.exists()) {
	        throw new ParserException("File does not exist");
	    }
	    try {
	        ServiceAnalyzer services = new ServiceAnalyzer(filePath);
	        servicesDoc = services.generateMessageCatalog();
	    } catch (Exception e) {
	        throw new ParserException(e);
	    }
	}

	/**
     * @return the types
     */
    @Override
    public List<IType> getTypes() {
        return types;
    }

    private IType createBasicType(String type) throws ParserException {
        IType at;
        if (type.equals("int")) {
            at = new TypeInt();
        } else if (type.equals("float")) {
            at = new TypeFloat();
        } else if (type.equals("string")) {
            at = new TypeString();
        } else {
            throw new ParserException("'" + type + "' is not a valid built-in scalar type");
        }
        return at;
    }

    private IType createUserType(String typeTypeDef, TypeVariable variable, final int index, TypeTypedef[] typeDefs, List<String> typeDefNames) throws ParserException, DatatypeConfigurationException {
        IType at;
        if (typeTypeDef.equals("tuple")) {
            at = createTypeTuple(variable, index, typeDefs, typeDefNames);
        } else if (typeTypeDef.equals("list")) {
            at = createTypeList(variable, index, typeDefs, typeDefNames);
        } else if (typeTypeDef.equals("int")) {
            at = createTypeInt(typeDefs[index]);
        } else if (typeTypeDef.equals("string")) {
            at = createTypeString(typeDefs[index]);
        } else if (typeTypeDef.equals("float")) {
            at = createTypeFloat(typeDefs[index]);
        } else if (typeTypeDef.equals("date")) {
            at = createTypeDate(typeDefs[index]);
        } else if (typeTypeDef.equals("dateTime")) {
            at = createTypeDateTime(typeDefs[index]);
        } else if (typeTypeDef.equals("time")) {
            at = createTypeTime(typeDefs[index]);
        } else if (typeTypeDef.equals("duration")) {
            at = createTypeDuration(typeDefs[index]);
        } else {
            throw new ParserException("'" + typeTypeDef + "' is not a valid built-in base type");
        }
        return at;
    }

    /**
     * IType inserts in the private attribute types
     * @param typeDefs
     * @param variables
     */
    private void insertIType(TypeTypedef[] typeDefs, TypeVariable[] variables) throws ParserException, DatatypeConfigurationException {
        for (int i = 0; i < variables.length; ++i) {
            IType at = createIType(typeDefs, variables[i]);
            getTypes().add(at);
        }
    }

    /**
     * Creates appropriate IType for the TypeTypedef that corresponding TypeVariable
     *
     * @param typeDefs
     * @param variable
     * @return
     */
    private IType createIType(TypeTypedef[] typeDefs,
            TypeVariable variable) throws ParserException, DatatypeConfigurationException {
        // Save typeDef´s name the XML
        List<String> templates = new ArrayList<String>();
        for (int i = 0; i < typeDefs.length; ++i) {
            templates.add(typeDefs[i].getName());
        }
        return searchTypeTypedef(variable, variable.getType(), typeDefs, templates);
    }

    /**
     * Returns the IType about the TypeDef of the XML and the String type
     * Devuelve el IType correspondiente según el TypeDef del XML y el String type
     *
     * @param type
     * @param typeDefs
     * @param typeDefNames
     * @return
     */
    private IType searchTypeTypedef(TypeVariable variable, String type, TypeTypedef[] typeDefs,
            List<String> typeDefNames) throws ParserException, DatatypeConfigurationException {
        final int index = typeDefNames.indexOf(type);
        IType at = null;
        if (index > -1) {// if the variable type is a typedef of XML
            String typeTypeDef = typeDefs[index].getType().toString();
            at = createUserType(typeTypeDef, variable, index, typeDefs, typeDefNames);

        } else {
            at = createBasicType(type);
        }
        at.setNameVariable(variable.getName());//set the variable name that contain int the XML
        return at;
    }

    private TypeInt createTypeInt(TypeTypedef typedef) {
        TypeInt typeInt = null;
        if (typedef.isSetValues()) {
            List<BigInteger> listValues = new ArrayList<BigInteger>();
            String[] valuesString = typedef.getValues().trim().split(",");
            for (int i = 0; i < valuesString.length; ++i) {
                listValues.add(i, new BigInteger(valuesString[i].trim()));
            }
            typeInt = new TypeInt(listValues);
        } else {
            typeInt = new TypeInt();
            if (typedef.isSetMin()) {
                long minValue = Long.parseLong(typedef.getMin());
                typeInt.setMinValue(minValue);
            }
            if (typedef.isSetMax()) {
                long maxValue = Long.parseLong(typedef.getMax());
                typeInt.setMaxValue(maxValue);
            }
        }
        return typeInt;
    }

    private TypeFloat createTypeFloat(TypeTypedef typedef) {
        TypeFloat typeFloat = null;
        if (typedef.isSetValues()) {
            List<BigDecimal> listValues = new ArrayList<BigDecimal>();
            String[] valuesString = typedef.getValues().trim().split(",");
            for (int i = 0; i < valuesString.length; ++i) {
                listValues.add(i, new BigDecimal(valuesString[i].trim()));
            }
            typeFloat = new TypeFloat(listValues);
        } else {
            typeFloat = new TypeFloat();
            if (typedef.isSetMin()) {
                final BigDecimal minValue = new BigDecimal(typedef.getMin());
                typeFloat.setMinValue(minValue);
            }
            if (typedef.isSetMax()) {
                final BigDecimal maxValue = new BigDecimal(typedef.getMax());
                typeFloat.setMaxValue(maxValue);
            }
            if (typedef.isSetFractionDigits()) {
                int fractionDigits = typedef.getFractionDigits().intValue();
                typeFloat.setFractionDigits(fractionDigits);
            }
        }
        return typeFloat;
    }

    private TypeString createTypeString(TypeTypedef typedef) {
        TypeString typeString = null;
        if (typedef.isSetValues()) {
            List<String> listValues = new ArrayList<String>();
            String[] values = typedef.getValues().trim().split(",");
            listValues.addAll(Arrays.asList(values));
            typeString = new TypeString(listValues);
        } else if (typedef.isSetPattern()) {
            String pattern = typedef.getPattern();
            typeString = new TypeString(pattern);
        } else {
            typeString = new TypeString();
        }
        return typeString;
    }

    private TypeList createTypeList(TypeVariable variable, int index, TypeTypedef[] typeDefs,
            List<String> typeDefNames) throws ParserException, DatatypeConfigurationException {
        TypeList typeList = null;
        String element = typeDefs[index].getElement();
        int min = 1;
        if (typeDefs[index].isSetMin()) {
            min = Integer.parseInt(typeDefs[index].getMin());
        }

        if (!typeDefs[index].isSetMax()) {
            typeList = new TypeList(searchTypeTypedef(variable, element, typeDefs, typeDefNames), min);
        } else {
            int max = Integer.parseInt(typeDefs[index].getMax());
            typeList = new TypeList(searchTypeTypedef(variable, element, typeDefs, typeDefNames), min, max);
        }
        return typeList;
    }

    private TypeTuple createTypeTuple(TypeVariable variable, int index, TypeTypedef[] typeDefs,
            List<String> typeDefNames) throws ParserException, DatatypeConfigurationException {
        String element = typeDefs[index].getElement().replace(" ", "");
        String[] elements = element.split(",");
        IType[] ntuple = new IType[elements.length];
        for (int i = 0; i < elements.length; ++i) {
            ntuple[i] = searchTypeTypedef(variable, elements[i], typeDefs, typeDefNames);
        }
        return new TypeTuple(ntuple);
    }

    private TypeDate createTypeDate(TypeTypedef typedef) throws DatatypeConfigurationException {
        return (TypeDate) initializeFromXMLGregorianCalendar(typedef, new TypeDate());
    }

    private TypeDateTime createTypeDateTime(TypeTypedef typedef) throws DatatypeConfigurationException {
        return (TypeDateTime) initializeFromXMLGregorianCalendar(typedef, new TypeDateTime());
    }

    private TypeTime createTypeTime(TypeTypedef typedef) throws DatatypeConfigurationException {
        return (TypeTime) initializeFromXMLGregorianCalendar(typedef, new TypeTime());
    }

    private TypeDuration createTypeDuration(TypeTypedef typedef) throws DatatypeConfigurationException {
        TypeDuration typeDuration = new TypeDuration();
        final DatatypeFactory factory = getDatatypeFactory();
        Duration duration = null;
        if (typedef.isSetMin()) {
            duration = factory.newDuration(typedef.getMin());
            typeDuration.setMinValue(duration);
        }
        if (typedef.isSetMax()) {
            duration = factory.newDuration(typedef.getMax());
            typeDuration.setMaxValue(duration);
        }
        return typeDuration;
    }

    private AbstractDates initializeFromXMLGregorianCalendar(TypeTypedef typedef,
            AbstractDates typeDate) throws DatatypeConfigurationException {
        final DatatypeFactory factory = getDatatypeFactory();
        XMLGregorianCalendar calendar = null;
        if (typedef.isSetMin()) {
            calendar = factory.newXMLGregorianCalendar(typedef.getMin());
            typeDate.setMinValue(calendar);
        }
        if (typedef.isSetMax()) {
            calendar = factory.newXMLGregorianCalendar(typedef.getMax());
            typeDate.setMaxValue(calendar);
        }
        return typeDate;
    }

    private synchronized DatatypeFactory getDatatypeFactory()
            throws DatatypeConfigurationException {
        if (dataTypeFactory == null) {
            dataTypeFactory = DatatypeFactory.newInstance();
        }
        return dataTypeFactory;
    }
}
