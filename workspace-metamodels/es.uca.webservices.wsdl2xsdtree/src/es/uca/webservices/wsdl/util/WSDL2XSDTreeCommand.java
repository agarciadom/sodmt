/*
 *  Copyright 2011 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
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
import java.io.IOException;
import java.net.URI;
import java.util.List;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * <p>
 * Implements the 'wsdl2xsdtree' command.
 * </p>
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public class WSDL2XSDTreeCommand {

    private static final String HELP_OPTION = "help";
    private static final String NAME = "wsdl2xsdtree";
    private static final String USAGE = "wsdl2xsdtree (path to .wsdl | URL)";
    private static final String DESCRIPTION =
            "Outputs a tree of XML Schema descriptions from a starting WSDL.\n"
            + "WSDL2XSDTree analyzes the specified Web Service interface to produce\n"
            + "a XSD tree which includes all the schemas encrusted or imported at\n"
            + "<types> section and all the schemas which are included from WSDL\n"
            + "files that are imported by the starting WSDL.\n"
            + "If the WSDL file imports another files (others WSDL or XSD files),\n"
            + "there is no need to specify the first at the command line.\n"
            + "The root of the tree, whose name is 'filename.wsdl.xsd', is created\n"
            + "at the same directory.";
    private List<String> fNonOptionArgs;
    private boolean fRequestedHelp = false;

    /**
     * Returns the name of the command.
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
     * Runs the command. If the user has requested help, it will be printed
     * to stderr. This method cannot be overridden.
     *
     * @return Returns the root of the XML Schema document tree.
     * @throws Exception
     *             There was a problem running the command.
     */
    public final File run() throws Exception {
        if (fRequestedHelp) {
            printHelp(createOptionParser());
        } else {
            // Calls WSDL2XSDTree for generating the corresponding XML-Schema tree
            if (getNonOptionArgs().size() == 1) {
                final String firstArg = getNonOptionArgs().get(0);

                WSDLGraphTransformer t = new WSDLGraphTransformer(URI.create(firstArg));
                File xsdRoot = t.generateXSDTree();
                System.err.println("The XSD tree has been generated with root: " + xsdRoot);

                return xsdRoot;
            }
        }

        return null;
    }

    /**
     * Parses the arguments given in the command line. If the wrong options are
     * used, not enough arguments are given, or the user requests it, it will
     * print help about the command and its usage. Otherwise, it will run the
     * command.
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
        parser.accepts(HELP_OPTION, "Provides help on the command");
        return parser;
    }

    private void printHelp(OptionParser parser) throws IOException {
        System.err.println("Usage: " + getUsage());
        System.err.println("Description:\n");
        System.err.println(getDescription() + "\n");
        parser.printHelpOn(System.err);
    }
}
