package es.uca.webservices.specgen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.uca.webservices.testgen.api.parsers.ParserException;
import org.apache.xmlbeans.XmlException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import serviceAnalyzer.messageCatalog.ServicesDocument;
import serviceAnalyzer.messageCatalog.TypeDecls;
import serviceAnalyzer.messageCatalog.TypeFault;
import serviceAnalyzer.messageCatalog.TypeGA;
import serviceAnalyzer.messageCatalog.TypeOperation;
import serviceAnalyzer.messageCatalog.TypeService;
import serviceAnalyzer.messageCatalog.TypeTypedef;
import serviceAnalyzer.messageCatalog.TypeVariable;
import es.uca.webservices.testgen.TestGeneratorCommand;
import es.uca.webservices.testgen.parsers.MessageDirection;
import es.uca.webservices.testgen.parsers.sanalyzer.SACatalogUtils;
import es.uca.webservices.wsdl.analyzer.ServiceAnalyzer;

/**
 * Java class which converts a &lt;decls&gt; element in a ServiceAnalyzer
 * catalog to its <code>.spec</code> declarations.
 *
 * @author Antonio García-Domínguez
 */
public class SpecGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpecGenerator.class);

	private File fSource;
	private String serviceName;
	private String operationName;
	private MessageDirection direction;
	private String faultName;

	public File getSource() {
		return fSource;
	}

	public void setSource(File fWSDL) {
		this.fSource = fWSDL;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String service) {
		this.serviceName = service;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operation) {
		this.operationName = operation;
	}

	public MessageDirection getDirection() {
		return direction;
	}

	public void setDirection(MessageDirection direction) {
		this.direction = direction;
	}

	public String getFaultName() {
		return faultName;
	}

	public void setFaultName(String faultName) {
		this.faultName = faultName;
	}

	public String generate() throws SpecGenerationException {
		try {
			ServicesDocument document;
			try {
				document = ServicesDocument.Factory.parse(fSource);
			} catch (XmlException e) {
				// That's not a ServiceAnalyzer catalog - assume it's a WSDL file
				ServiceAnalyzer sa = new ServiceAnalyzer(fSource.getPath());
				document = sa.generateMessageCatalog();
			}

            return generate(document);
		} catch (Exception ex) {
			throw new SpecGenerationException(ex);
		}
	}

    public String generate(ServicesDocument document) throws ParserException {
        TypeService service = SACatalogUtils.findServiceByName(document.getServices(), serviceName);
        return generate(service);
    }

    public String generate(TypeService service) throws ParserException {
        TypeOperation operation = SACatalogUtils.findOperationByName(service, operationName);
        return generate(operation);
    }

    public String generate(TypeOperation operation) throws ParserException {
        switch (direction) {
        case IN:
            return generate(operation.getInput().getDecls());
        case OUT:
            return generate(operation.getOutput().getDecls());
        case ERR:
            final TypeFault fault = SACatalogUtils.findFaultByName(operation, faultName);
            return generate(fault.getDecls());
        default:
            throw new IllegalArgumentException("Unknown direction: " + direction);
        }
    }

    public String generate(TypeDecls decls) {
		StringBuffer sbuf = new StringBuffer();
		generateSpecTypedefs(decls, sbuf);
		generateSpecVariables(decls, sbuf);
		return sbuf.toString();
	}

    public static void main(String[] args) throws IOException {
        if (args.length < 4) {
            printUsage();
        }
        try {
            final String sourcePath = args[0];
            final String service = args[1];
            final String operation = args[2];
            final MessageDirection direction = MessageDirection.fromString(args[3]);
            if (direction == MessageDirection.ERR && args.length < 5) {
                printUsage();
            }
            final String faultName = direction == MessageDirection.ERR ? args[4] : null;

            SpecGenerator generator = new SpecGenerator();
            generator.setSource(new File(sourcePath));
            generator.setServiceName(service);
            generator.setOperationName(operation);
            generator.setDirection(direction);
            generator.setFaultName(faultName);
            System.out.println(generator.generate());
        } catch (IllegalArgumentException ex) {
            printUsage();
        } catch (SpecGenerationException e) {
            LOGGER.error("There was a problem while generating the Spec document", e);
            System.exit(2);
        }
    }

	private void generateSpecVariables(TypeDecls decls, StringBuffer sbuf) {
		for (TypeVariable v : decls.getVariableArray()) {
			sbuf.append(v.getType());
			sbuf.append(' ');
			sbuf.append(v.getName());
			sbuf.append(";\n");
		}
	}

	private void generateSpecTypedefs(TypeDecls decls, StringBuffer sbuf) {
		for (TypeTypedef d : decls.getTypedefArray()) {
			sbuf.append("typedef ");
			sbuf.append(d.getType().toString());
			sbuf.append(' ');
			generateSpecTypedefRestrictions(d, sbuf);
			sbuf.append(d.getName());
			sbuf.append(";\n");
		}
	}

	private void generateSpecTypedefRestrictions(TypeTypedef d,	StringBuffer sbuf) {
		List<String> restrictions = new ArrayList<String>();
        generateElementRestrictions(d, restrictions);
        generateDigitRestrictions(d, restrictions);
        generateMinMaxRestrictions(d, restrictions);
        generatePatternRestrictions(d, restrictions);
        generateValuesRestrictions(d, restrictions);

        if (!restrictions.isEmpty()) {
			boolean bFirst = true;
			sbuf.append('(');
			for (String restriction : restrictions) {
				if (bFirst) {
					bFirst = false;
				} else {
					sbuf.append(", ");
				}
				sbuf.append(restriction);
			}
			sbuf.append(") ");
		}
	}

    private void generateValuesRestrictions(TypeTypedef d, List<String> restrictions) {
        if (d.isSetValues()) {
			final String[] values = d.getValues().split("\\s*,\\s*");

			StringBuffer sbufValues = new StringBuffer();
			sbufValues.append("values={");
			if (TypeGA.STRING.equals(d.getType())) {
				// Surround string values with quotes
				boolean bFirst = true;
				for (String v : values) {
					if (bFirst) {
						bFirst = false;
					} else {
						sbufValues.append(", ");
					}

					sbufValues.append('"');
					sbufValues.append(v);
					sbufValues.append('"');
				}
			}
			else {
				sbufValues.append(d.getValues());
			}
			sbufValues.append("}");

			restrictions.add(sbufValues.toString());
		}
    }

    private void generatePatternRestrictions(TypeTypedef d, List<String> restrictions) {
        if (d.isSetPattern()) {
            // Backslashes need to be escaped for Spec
            restrictions.add("pattern=\"" + d.getPattern().replaceAll("\\\\", "\\\\\\\\") + "\"");
        }
    }

    private void generateMinMaxRestrictions(TypeTypedef d, List<String> restrictions) {
        if (d.isSetMin() && notEmpty(d.getMin())) {
            restrictions.add("min=" + d.getMin());
        }
        if (d.isSetMax() && notEmpty(d.getMax())) {
            restrictions.add("max=" + d.getMax());
        }
    }

    private void generateElementRestrictions(TypeTypedef d, List<String> restrictions) {
        if (d.isSetElement()) {
            if (TypeGA.TUPLE.equals(d.getType())) {
                restrictions.add("element={" + d.getElement() + "}");
            }
            else if (notEmpty(d.getElement())) {
                restrictions.add("element=" + d.getElement());
            }
        }
    }

    private void generateDigitRestrictions(TypeTypedef d, List<String> restrictions) {
        if (d.isSetFractionDigits()) {
            restrictions.add("fractionDigits=" + d.getFractionDigits());
        }
        if (d.isSetTotalDigits()) {
            restrictions.add("totalDigits=" + d.getTotalDigits());
        }
    }

	private static void printUsage() throws IOException {
		System.err.println("spec-generator v" + TestGeneratorCommand.getVersion());
		System.err.println("Usage: spec-generator (.wsdl or catalog.xml) (service) (operation) (IN || OUT || ERR faultName)");
		System.exit(1);
	}

    private boolean notEmpty(String s) {
        return !"".equals(s.trim());
    }
}
