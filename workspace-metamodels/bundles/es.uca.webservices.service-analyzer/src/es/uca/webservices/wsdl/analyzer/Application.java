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
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point for the whole application.
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 * @version 1.0
 */
public final class Application {

    private static Properties PROPERTIES;
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private static final int EXITCODE_EXECERROR = 4;
    private static final int EXITCODE_PARSEERROR = 3;
    //private static final int EXITCODE_UNKNOWNSUBCMD = 2;
    private static final int EXITCODE_NOSUBCMD = 1;

    /**
     * Constructor is never used.
     */
    private Application() {
    }

    ;

    /**
     * Main method of the application.
     *
     * @param args
     *            Arguments received through the command line.
     */
    public static void main(String[] args) {

        try {
            System.err.println("ServiceAnalyzer version v" + getVersion());

            ServiceAnalyzerCommand gc = new ServiceAnalyzerCommand();
            if (args.length < 1) {
                printUsage(gc);
                System.exit(EXITCODE_NOSUBCMD);
            }

            try {
                gc.parseArgs(args);
            } catch (IllegalArgumentException ex) {
                LOGGER.error("Error during argument parsing", ex);
                System.err.println(gc.getUsage());
                System.exit(EXITCODE_PARSEERROR);
            }

            try {
                gc.run();
            } catch (Exception e) {
                LOGGER.error("Error during command execution", e);
                System.exit(EXITCODE_EXECERROR);
            }

        } catch (Exception ex) {
            LOGGER.error(ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Prints the usage of ServiceAnalyzer
     * @param sa ServiceAnalyzer command
     * @throws IOException
     */
    private static void printUsage(ServiceAnalyzerCommand sa) throws IOException {
        System.err.println(" * " + sa.getUsage());
        System.err.println("\nFor more help, use 'serviceanalyzer -h'");
    }

    /**
     * Gets the current version for the application
     * @return
     * @throws IOException
     */
    private static synchronized String getVersion() throws IOException {
        InputStream in = null;
        try {
            if (PROPERTIES == null) {
                PROPERTIES = new Properties();
                in = Application.class.getResourceAsStream("/service-analyzer.properties");
                PROPERTIES.load(in);
            }
            return PROPERTIES.getProperty("serviceanalyzer.version");
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
