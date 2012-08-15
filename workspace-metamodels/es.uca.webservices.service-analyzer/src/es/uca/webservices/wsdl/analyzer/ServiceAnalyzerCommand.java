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
package es.uca.webservices.wsdl.analyzer;

import java.io.IOException;
import java.util.List;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * <p>
 * Implements the 'serviceanalyzer' command.
 * </p>
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class ServiceAnalyzerCommand {

    private static final String HELP_OPTION = "help";
    private static final String NAME = "serviceanalyzer";
    private static final String USAGE = "serviceanalyzer (1+ paths to .wsdl files or URLs)";
    private static final String DESCRIPTION =
            "Generates test case templates from WSDL documents.\n"
            + "ServiceAnalyzer analyzes the specified Web Service\n"
            + "interface to produce the message catalog document\n"
            + "in XML format, which is dumped through stdout.\n"
            + "If any WSDL file is imported by another one, there\n"
            + "is no need to specify the first at the command line.\n"
            + "When running several WSDL files, the application\n"
            + "will create only one catalog containing all messages\n"
            + "from all services.";
    private List<String> fNonOptionArgs;
    private boolean fRequestedHelp = false;

    /**
     * Returns the name of the subcommand.
     */
    String getName() {
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
        return parser;
    }

    /**
     * Parses the arguments given in the command line. If the wrong options are
     * used, not enough arguments are given, or the user requests it, it will
     * print help about the subcommand and its usage. Otherwise, it will run the
     * subcommand.
     *
     * @throws IllegalArgumentException
     *             Wrong number of non-option arguments, unknown option, or
     *             wrong value used as argument to some option.
     */
    public final void parseArgs(String... args) {
        OptionParser parser = createOptionParser();
        try {
            OptionSet options = parser.parse(args);
            fNonOptionArgs = options.nonOptionArguments();

            if (options.has(HELP_OPTION)) {
                this.fRequestedHelp = true;
            } else if (getNonOptionArgs().size() < 1) {
                throw new IllegalArgumentException("Wrong number of arguments");
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
    public final void run() throws Exception {
        if (fRequestedHelp) {
            printHelp(createOptionParser());
        } else {
            ServiceAnalyzer sa = new ServiceAnalyzer(getNonOptionArgs().toArray(new String[getNonOptionArgs().size()]));
            sa.generateMessageCatalog();
            sa.printMessageCatalog();
        }
    }

    private void printHelp(OptionParser parser) throws IOException {
        System.err.println("Usage: ServiceAnalyzer " + getUsage());
        System.err.println("Description:\n");
        System.err.println(getDescription() + "\n");
        parser.printHelpOn(System.err);
    }
}
