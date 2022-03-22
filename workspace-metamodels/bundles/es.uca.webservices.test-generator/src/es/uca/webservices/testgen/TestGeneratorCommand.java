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
package es.uca.webservices.testgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.parsers.ParserException;

/**
 * Implements the 'testgenerator' command.
 * 
 */
public class TestGeneratorCommand {

	private static final int DEFAULT_NUM_TESTS = 5;
	private static final int MAX_ARGS_SPEC = 2;
	private static final int MIN_ARGS_SPEC = 1;
	private static final int MAX_ARGS_WSDL = 5;
	private static final int MIN_ARGS_WSDL = 4;

	private static final String HELP_OPTION = "help";
    private static final String CSV_OPTION = "csv";
    private static final String VELOCITY_OPTION = "velocity";
    private static final String OUTPUT_OPTION = "output";
    private static final String SEED_OPTION = "seed";

    private static final String NAME = "testgenerator";
    private static final String USAGE = "{file.xml service operation (in|out|err) [Number of tests] [formatter]} "
            + "|| {file.spec [Number of tests] [formatter]}";
    private static final String DESCRIPTION =
            "Generates test cases from ServiceAnalyzer message catalogs or Spec specifications.\n"
            + "When using SA message catalogs, it is necessary to specify the message type,\n"
            + "operation name and service name.";

    private static final Logger LOGGER = LoggerFactory.getLogger(TestGeneratorCommand.class);
    private static Properties properties;

    private List<String> fNonOptionArgs = new ArrayList<String>();
    private String formatter;
    private String extension;
    private boolean fRequestedHelp = false;
    private int numRandTest = DEFAULT_NUM_TESTS;
	private int minArguments = MIN_ARGS_WSDL;
    private int maxArguments = MAX_ARGS_WSDL;
	private OutputStream outputStream;
	private long seed = System.currentTimeMillis();

    /**
     * Main entry point from the command line.
     * @param args Arguments received from the console.
     */
    public static void main(String[] args) throws IOException, ParserException, GenerationException {
    	final TestGeneratorCommand cmd = new TestGeneratorCommand();
		try {
			cmd.parseArgs(args);
			cmd.run();
		} catch (IllegalArgumentException ex) {
			LOGGER.error("Illegal argument", ex);
			cmd.printHelp(cmd.createOptionParser());
		} catch (Exception ex) {
			LOGGER.error("There was an error while generating test cases", ex);
		}
    }

    public static synchronized String getVersion() throws IOException {
	    if (properties == null) {
	        properties = new Properties();
	        InputStream propStream = TestGeneratorCommand.class.getResourceAsStream("/test-generator.properties");
	        try {
	            properties.load(propStream);
	        } finally {
	            propStream.close();
	        }
	    }
	    return properties.getProperty("testgen.version");
	}

	/**
     * Returns the name of the subcommand.
     */
    public String getName() {
        return NAME;
    }

    /**
     * Returns a quick summary of the basic usage of this command.
     */
    public final String getUsage() {
        return USAGE;
    }

    /**
     * Returns a long description of this command.
     */
    public final String getDescription() {
        return DESCRIPTION;
    }

    /**
     * Returns the list of all non-option arguments.
     */
    protected final List<String> getNonOptionArgs() {
        return fNonOptionArgs;
    }

    /**
     * Returns the option parser. Please do not forget to reuse the OptionParser
     * created by the superclass in your subclasses!
     */
    protected OptionParser createOptionParser() {
        OptionParser parser = new OptionParser();
        parser.accepts(HELP_OPTION, "Provides help on the subcommand");
        parser.accepts(CSV_OPTION, "CSV formatted output");
        parser.accepts(VELOCITY_OPTION, "Velocity formatted output");
        parser.accepts(OUTPUT_OPTION, "Sends the output to the specified file (by default, output is written to stdout)").withRequiredArg().ofType(File.class);
        parser.accepts(SEED_OPTION, "Sets a particular integer value as the seed for the PRNG").withRequiredArg().ofType(Long.class);
        return parser;
    }

    /**
	 * Parses the arguments given in the command line. If the wrong options are
	 * used, not enough arguments are given, or the user requests it, it will
	 * print help about the subcommand and its usage. Otherwise, it will run the
	 * subcommand.
	 * 
	 * @throws FileNotFoundException
	 *             Could not find the file to which the results should be
	 *             written.
	 * 
	 * @throws IllegalArgumentException
	 *             Wrong number of non-option arguments, unknown option, or
	 *             wrong value used as argument to some option.
	 */
    public final void parseArgs(String... args) throws FileNotFoundException {
        try {
            final OptionSet options = createOptionParser().parse(args);
            parseOptions(options);
            fNonOptionArgs = options.nonOptionArguments();
            if (!this.fRequestedHelp) {
                if (fNonOptionArgs.size() < 1) {
                    throw new IllegalArgumentException("Wrong number of arguments");
                }

            	// TODO: accept an existing catalog.xml as well
                final String file = fNonOptionArgs.get(0);
                final String[] extensions = file.split("\\.");
                configureByExtension(extensions[extensions.length - 1]);
                fNonOptionArgs = options.nonOptionArguments();
                validateNonOptionsArgs();
            }
        } catch (OptionException ex) {
            throw new IllegalArgumentException(ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Runs the subcommand. If the user has requested help, it will be printed
     * to stderr. This method cannot be overridden.
     *
     * @throws Exception
     *             There was a problem running the subcommand.
     */
    public final void run() throws IOException, ParserException, GenerationException {
        if (fRequestedHelp) {
            printHelp(createOptionParser());
        } else {
            TestGeneratorRun tgr;
            if (extension.equals("wsdl")) {
                tgr = generateFromWSDL();
            } else {
                tgr = generateFromSPEC();
            }
            tgr.setSeed(seed);
            tgr.run(outputStream);
        }
    }

    /**
     * Show the system help
     * @param parser
     * @throws IOException 
     */
    private void printHelp(OptionParser parser) throws IOException {
    	System.err.println("TestGenerator v" + getVersion() + "\n");
        System.err.println("Usage: TestGenerator " + getUsage());
        System.err.println("Description:\n");
        System.err.println(getDescription() + "\n");
        parser.printHelpOn(System.err);
    }

    /**
     * Configure parameter of TesGeneratorCommand according file extension
     * @param extesion 
     */
    private void configureByExtension(String extension) {
        this.extension = extension.toLowerCase().trim();
        if (this.extension.equals("wsdl")) {
            minArguments = MIN_ARGS_WSDL;
            maxArguments = MAX_ARGS_WSDL;
        } else if (this.extension.equals("spec")) {
            minArguments = MIN_ARGS_SPEC;
            maxArguments = MAX_ARGS_SPEC;
        } else {
            throw new IllegalArgumentException("Invalid file extension: should be .wsdl or .spec");
        }
    }

    private void parseOptions(OptionSet options) throws FileNotFoundException {
        if (options.has(HELP_OPTION)) {
            this.fRequestedHelp = true;
        }
        if (options.has(CSV_OPTION)) {
            this.formatter = CSV_OPTION;
        } else {
            this.formatter = VELOCITY_OPTION;
        }
        if (options.has(OUTPUT_OPTION)) {
        	this.outputStream = new FileOutputStream((File)options.valueOf(OUTPUT_OPTION));
        } else {
        	this.outputStream = System.out;
        }
        if (options.has(SEED_OPTION)) {
        	this.seed  = (Long)options.valueOf(SEED_OPTION);
        }
    }

    /**
     * Checks are valid NonOptionsArgs
     */
    private void validateNonOptionsArgs() {
        if (getNonOptionArgs().size() < minArguments || getNonOptionArgs().size() > maxArguments) {
            throw new IllegalArgumentException("Wrong number of arguments");
        } else if (getNonOptionArgs().size() == maxArguments) {
            this.numRandTest = Integer.parseInt(fNonOptionArgs.get(maxArguments - 1));
            if (this.numRandTest < 1) {
                throw new IllegalArgumentException("At least 1 test case must be generated");
            }
        }
    }

    private TestGeneratorRun generateFromWSDL() {
        String path = fNonOptionArgs.get(0);
        String service = fNonOptionArgs.get(1);
        String operation = fNonOptionArgs.get(2);
        String type = fNonOptionArgs.get(3).toUpperCase(Locale.ENGLISH);

        if (!(type.equals("IN") || type.equals("OUT") || type.equals("ERR"))) {
            throw new IllegalArgumentException("Wrong type '" + type + "': expected IN, OUT or ERR");
        }
        // TODO: TestGeneratorRun shouldn't have to use different constructors for WSDL and SPEC - instead, it should accept an IParser/IGenerator/IFormatter triplet and take arguments for each of these
        // TODO: Let the user pick the fault to be generated, instead of generating inputs for all of them
        return new TestGeneratorRun(path, service, operation, type, this.formatter, this.numRandTest);
    }

    private TestGeneratorRun generateFromSPEC() {
        String path = fNonOptionArgs.get(0);
        // TODO: TestGeneratorRun shouldn't have to use different constructors for WSDL and SPEC - instead, it should accept an IParser/IGenerator/IFormatter triplet
        return new TestGeneratorRun(path, this.formatter, this.numRandTest);
    }

}
