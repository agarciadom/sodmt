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
package es.uca.webservices.testgen.parsers.spec;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

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
import es.uca.webservices.testgen.spec.TestSpecLexer;
import es.uca.webservices.testgen.spec.TestSpecParser;

/**
 * Class to read files TestSpec.
 * 
 * Class that processes the TestSpec file to work with them.
 * 
 */
public class SpecParser implements IParser {
    private static final String TOTALDIGITS = "totalDigits";
    private static final String FRACTIONDIGITS = "fractionDigits";
    private static final String MAX = "max";
    private static final String MIN = "min";
    private static final String ELEMENT = "element";
    private static final String VALUES = "values";
    private static final String PATTERN = "pattern";

    private static DatatypeFactory dataTypeFactory;

    private final List<IType> types = new ArrayList<IType>();
    private final Map<String, SpecRestriction> typedef = new HashMap<String, SpecRestriction>();
    private CharStream input;
	private String specPath;

    /**
     * Default constructor, to be used from gamerahom-generator.
     */
    public SpecParser() {
    	// By default, use an empty stream, to avoid NPEs
    	input = new ANTLRStringStream("");
    }

    /**
     * Parses a certain <code>.spec</code> file.
     */
    public SpecParser(String path) throws ParserException {
        setSpec(path);
    }

	/**
     * Parsers tokens from an abstract input stream.
     */
    public SpecParser(InputStream is) throws ParserException {
    	try {
    		input = new ANTLRInputStream(is);
    	}
    	catch (Exception e) {
    		throw new ParserException(e);
    	}
    }

    /**
     * Method that processes the SPEC file
     * @param args
     * @throws ParserException 
     */
    @Override
    public void parse(String... args) throws ParserException {
		CommonTree tree = initializeTree();
		assert tree.getToken().getType() == TestSpecParser.SPEC;

        if (tree.getChildren() == null) {
            return;
        }
		for (Object oChild : tree.getChildren()) {
			final CommonTree child = (CommonTree) oChild;
			if (child.getToken().getType() == TestSpecParser.TYPEDEF) {
				putTypedef(child);

			} else if (child.getToken().getType() == TestSpecParser.DECLARATION) {
				final CommonTree variable = (CommonTree) child.getChild(0);
				final CommonTree name = (CommonTree) child.getChild(1);
				IType at = createAbstractType(variable.getToken());
				at.setNameVariable(name.getText());
				types.add(at);
			}
		}
    }

    /**
	 * @return the types
	 */
	@Override
	public List<IType> getTypes() {
	    return types;
	}

	public final String getSpec() {
		return specPath;
	}

	public final void setSpec(String path) throws ParserException {
		this.specPath = path;

		try {
	        input = new ANTLRFileStream(specPath);
	    } catch (Exception e) {
	        throw new ParserException(e);
	    }
	}

	private IType createAbstractType(Token type) throws ParserException {
        if (typedef.containsKey(type.getText())) {
            return createUserType(type);
        } else {
        	try {
                    return createBasicType(type); 
        	} catch (ParserException ex) {
        		throw new ParserException("'" + type.getText() + "' is not the name of a built-in or user-defined type (without quotes)", ex);
        	} catch (DatatypeConfigurationException ex) {
                    throw new ParserException(ex);
            }
        }
    }

    /**
     * Create basic type (TypeInt, TypeFloat and TypeString)
     * @param type
     * @return
     * @throws ParserException 
     */
    private IType createBasicType(Token type) throws ParserException, DatatypeConfigurationException {
        switch (type.getType()) {
            case TestSpecParser.TYPE_INT:
                return new TypeInt();
            case TestSpecParser.TYPE_FLOAT:
                return new TypeFloat();
            case TestSpecParser.TYPE_STRING:
                return new TypeString();
            case TestSpecParser.TYPE_DATE:
                return new TypeDate();
            case TestSpecParser.TYPE_DATETIME:
                return new TypeDateTime();
            case TestSpecParser.TYPE_TIME:
                return new TypeTime();
            case TestSpecParser.TYPE_DURATION:
                return new TypeDuration();
            default:
                throw new ParserException("'" + type.getText() + "' is not the name of a basic type (without any quotes)");
        }
    }

    /**
     * Create user typewith restriction
     * @param type
     * @return
     * @throws ParserException 
     */
    private IType createUserType(Token type) throws ParserException {
        try {
            SpecRestriction restrictionSpec = typedef.get(type.getText());
            Map<String, Token[]> restriction = restrictionSpec.getRestriction();
            switch (restrictionSpec.getType()) {
                case TestSpecParser.TYPE_INT:
                    return createTypeInt(restriction);
                case TestSpecParser.TYPE_FLOAT:
                    return createTypeFloat(restriction);
                case TestSpecParser.TYPE_STRING:
                    return createTypeString(restriction);
                case TestSpecParser.TYPE_DATE:
                    return createTypeDate(restriction);
                case TestSpecParser.TYPE_DATETIME:
                    return createTypeDateTime(restriction);
                case TestSpecParser.TYPE_TIME:
                    return createTypeTime(restriction);
                case TestSpecParser.TYPE_DURATION:
                    return createTypeDuration(restriction);
                case TestSpecParser.TYPE_LIST:
                    return createTypeList(restriction);
                case TestSpecParser.TYPE_TUPLE:
                    return createTypeTuple(restriction);
                default:
                    throw new ParserException("'" + type.getText() + "' does not have a known base type");
            }
        } catch (DatatypeConfigurationException ex) {
            throw new ParserException(ex);
        }
    }

    /**
     * Create TypeDate with restriction
     * @param restriction
     * @return
     * @throws ParserException
     * @throws DatatypeConfigurationException 
     */
    private TypeDate createTypeDate(Map<String, Token[]> restriction) throws ParserException, DatatypeConfigurationException {
        return (TypeDate) initializeFromXMLGregorianCalendar(new TypeDate(), restriction);
    }

    /**
     * Create TypeDateTime with restriction
     * @param restriction
     * @return
     * @throws ParserException
     * @throws DatatypeConfigurationException 
     */
    private TypeDateTime createTypeDateTime(Map<String, Token[]> restriction) throws ParserException, DatatypeConfigurationException {
        return (TypeDateTime) initializeFromXMLGregorianCalendar(new TypeDateTime(), restriction);
    }

    /**
     * Create TypeTime with restriction
     * @param restriction
     * @return
     * @throws ParserException
     * @throws DatatypeConfigurationException 
     */
    private TypeTime createTypeTime(Map<String, Token[]> restriction) throws ParserException, DatatypeConfigurationException {
        return (TypeTime) initializeFromXMLGregorianCalendar(new TypeTime(), restriction);
    }

    /**
     * Create TypeDuration with restriction
     * @param restriction
     * @return
     * @throws ParserException
     * @throws DatatypeConfigurationException 
     */
    private TypeDuration createTypeDuration(Map<String, Token[]> restriction) throws ParserException, DatatypeConfigurationException {
        TypeDuration typeDuration = new TypeDuration();
        final DatatypeFactory factory = getDatatypeFactory();
        Duration duration = null;
        if (restriction.containsKey(MAX)) {
            Token[] max = (Token[]) restriction.get(MAX);
            duration = factory.newDuration(max[0].getText().replace("\"", ""));
            typeDuration.setMaxValue(duration);
        }
        if (restriction.containsKey(MIN)) {
            Token[] min = (Token[]) restriction.get(MIN);
            duration = factory.newDuration(min[0].getText().replace("\"", ""));
            typeDuration.setMinValue(duration);
        }
        return typeDuration;
    }

    /**
     * Create TypeInt with restriction
     * @param restriction
     * @return
     * @throws ParserException 
     */
    private TypeInt createTypeInt(Map<String, Token[]> restriction) throws ParserException {
        TypeInt typeInt = null;
        if (restriction.containsKey(VALUES)) {
            Token[] elements = (Token[]) restriction.get(VALUES);
            List<BigInteger> values = new ArrayList<BigInteger>();
            for (int i = 0; i < elements.length; ++i) {
                values.add(i, new BigInteger(elements[i].getText().replace("\"", "")));
            }
            typeInt = new TypeInt(values);
        } else {
            typeInt = new TypeInt();
            if (restriction.containsKey(MAX)) {
                Token[] val = (Token[]) restriction.get(MAX);
                final BigInteger max = new BigInteger(val[0].getText());
                typeInt.setMaxValue(max);
            }
            if (restriction.containsKey(MIN)) {
                Token[] val = (Token[]) restriction.get(MIN);
                final BigInteger min = new BigInteger(val[0].getText());
                typeInt.setMinValue(min);
            }
            if (restriction.containsKey(TOTALDIGITS)) {
                Token[] val = (Token[]) restriction.get(TOTALDIGITS);
                typeInt.setTotalDigits(Integer.parseInt(val[0].getText()));
            }
        }
        return typeInt;

    }

    /**
     * Create TypeDFloat with restriction
     * @param restriction
     * @return 
     */
    private TypeFloat createTypeFloat(Map<String, Token[]> restriction) {
        TypeFloat typeFloat = null;
        if (restriction.containsKey(VALUES)) {
            Token[] elements = (Token[]) restriction.get(VALUES);
            List<BigDecimal> values = new ArrayList<BigDecimal>();
            for (int i = 0; i < elements.length; ++i) {
                values.add(i, new BigDecimal(elements[i].getText().replace("\"", "")));
            }
            typeFloat = new TypeFloat(values);
        } else {
            typeFloat = new TypeFloat();
            if (restriction.containsKey(MAX)) {
                Token[] val = (Token[]) restriction.get(MAX);
                final BigDecimal max = new BigDecimal(val[0].getText());
                typeFloat.setMaxValue(max);
            }
            if (restriction.containsKey(MIN)) {
                Token[] val = (Token[]) restriction.get(MIN);
                final BigDecimal min = new BigDecimal(val[0].getText());
                typeFloat.setMinValue(min);
            }
            if (restriction.containsKey(FRACTIONDIGITS)) {
                Token[] val = (Token[]) restriction.get(FRACTIONDIGITS);
                final int fractionDigits = Integer.parseInt(val[0].getText());
                typeFloat.setFractionDigits(fractionDigits);
            }
            if (restriction.containsKey(TOTALDIGITS)) {
                Token[] val = (Token[]) restriction.get(TOTALDIGITS);
                typeFloat.setTotalDigits(Integer.parseInt(val[0].getText()));
            }
        }
        return typeFloat;
    }

    /**
     * Create TypeString with restriction
     * @param restriction
     * @return 
     */
    private TypeString createTypeString(Map<String, Token[]> restriction) {
        TypeString tString = null;
        if (restriction.containsKey(VALUES)) {
            Token[] elements = (Token[]) restriction.get(VALUES);
            List<String> values = new ArrayList<String>();
            for (int i = 0; i < elements.length; ++i) {
                values.add(i, elements[i].getText().replace("\"", ""));
            }
            tString = new TypeString(values);
        } else if (restriction.containsKey(PATTERN)) {
            Token[] val = (Token[]) restriction.get(PATTERN);
			tString = new TypeString(val[0].getText());
        } else {
            tString = new TypeString();
        }
        return tString;
    }

    /**
     * Create TypeList with restriction
     * @param restriction
     * @return
     * @throws ParserException 
     */
    private TypeList createTypeList(Map<String, Token[]> restriction) throws ParserException {
        TypeList tList = null;
        if (!restriction.containsKey(ELEMENT)) {
            throw new ParserException("list typedef does not contain the 'element' property");
        }
        final Token[] element = (Token[]) restriction.get(ELEMENT);
        if (element.length != 1) {
			throw new ParserException(
					"'element' property in list typedefs must have exactly 1 element, but it has "
							+ element.length);
        }
        if (restriction.containsKey(MIN)) {
            Token[] val = (Token[]) restriction.get(MIN);
            final int min = Integer.parseInt(val[0].getText());
            if (restriction.containsKey(MAX)) {
                val = (Token[]) restriction.get(MAX);
                final int max = Integer.parseInt(val[0].getText());
                tList = new TypeList(createAbstractType(element[0]), min, max);
            } else {
                tList = new TypeList(createAbstractType(element[0]), min);
            }
        } else {
            tList = new TypeList(createAbstractType(element[0]));
        }
        return tList;
    }

    /**
     * Create TypeTuple with restriction
     * @param restriction
     * @return
     * @throws ParserException 
     */
    private TypeTuple createTypeTuple(Map<String, Token[]> restriction) throws ParserException {

        if (!restriction.containsKey(ELEMENT)) {
            throw new ParserException("tuple typedef does not contain the 'element' property");
        }
        Token[] elements = (Token[]) restriction.get(ELEMENT);
        IType[] ntuple = new IType[elements.length];
        for (int i = 0; i < elements.length; ++i) {
            ntuple[i] = createAbstractType(elements[i]);
        }
        return new TypeTuple(ntuple);
    }

    /**
     * Instance a DatatypeFactory
     * @return
     * @throws DatatypeConfigurationException 
     */
    private synchronized DatatypeFactory getDatatypeFactory()
            throws DatatypeConfigurationException {
        if (dataTypeFactory == null) {
            dataTypeFactory = DatatypeFactory.newInstance();
        }
        return dataTypeFactory;
    }

    /**
     * Create AbstractDate the typeDate with restriction
     * @param typeDate
     * @param restriction
     * @return
     * @throws DatatypeConfigurationException 
     */
    private AbstractDates initializeFromXMLGregorianCalendar(AbstractDates typeDate, Map<String, Token[]> restriction) throws DatatypeConfigurationException {
        final DatatypeFactory factory = getDatatypeFactory();
        XMLGregorianCalendar calendar = null;
        if (restriction.containsKey(MAX)) {
            Token[] max = (Token[]) restriction.get(MAX);
            calendar = factory.newXMLGregorianCalendar(max[0].getText().replace("\"", ""));
            typeDate.setMaxValue(calendar);
        }
        if (restriction.containsKey(MIN)) {
            Token[] min = (Token[]) restriction.get(MIN);
            calendar = factory.newXMLGregorianCalendar(min[0].getText().replace("\"", ""));
            typeDate.setMinValue(calendar);
        }
        return typeDate;
    }

    /**
	 * Initialize CommonTree for the parser
	 * @return
	 * @throws RecognitionException 
	 */
	private CommonTree initializeTree() throws ParserException {
		try { 
			TestSpecLexer lex = new TestSpecLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			TestSpecParser parse = new TestSpecParser(tokens);
			TestSpecParser.spec_return spec = parse.spec();
			if (parse.getNumberOfSyntaxErrors() > 0) {
				throw new ParserException("There were " + parse.getNumberOfSyntaxErrors() + " syntax errors in the specification");
			}
			return (CommonTree) spec.getTree();
		} catch (RecognitionException ex) {
			throw new ParserException(ex);
		}
	}

	/**
	 * Add typedef analyzed in the grammar
	 * @param child 
	 */
	private void putTypedef(CommonTree child) {
	    SpecRestriction restrictions = null;
	    String nameRestriction = child.getChild(0).getText();
	    if (typedef.containsKey(nameRestriction)) {
	    	// TODO: translate *everything* to English
	    	//Si el typedef esta contenido en otro typedef le añado las restricciones del anterior y el tipo es el del anterior
	        SpecRestriction rest = typedef.get(nameRestriction);
	        Map<String, Token[]> addRest = rest.getRestriction();
	        restrictions = new SpecRestriction(rest.getType());
	        restrictions.getRestriction().putAll(addRest);
	    } else {
	        restrictions = new SpecRestriction(child.getChild(0).getType());
	    }
	    for (int i = 1; i < child.getChildCount() - 1; ++i) {
	        final CommonTree keyval = (CommonTree) child.getChild(i);
	        ArrayList<Token> val = new ArrayList<Token>();
	        for (int j = 1; j < keyval.getChildCount(); ++j) {
	            final CommonTree value = (CommonTree) keyval.getChild(j);
	            val.add(value.getToken());
	        }
	        Token[] vals = new Token[val.size()];
	        restrictions.addRestriction(keyval.getChild(0).getText(), val.toArray(vals));
	    }
	    typedef.put(child.getChild(child.getChildCount() - 1).getText(), restrictions);
	}
}
