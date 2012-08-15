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
    private static final int EXITCODE_EXECERROR = 3;
    private static final int EXITCODE_PARSEERROR = 2;
    private static final int EXITCODE_NOSUBCMD = 1;

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    /**
     * Constructor is never used.
     */
    private Application() {
    }

    ;

    /**
     * Main method of the application.
     *
     * @param args Arguments received through the command line.
     */
    public static void main(String[] args) {

        try {
            System.out.println("WSDL2XSDTree version v" + getVersion());

            WSDL2XSDTreeCommand gc = new WSDL2XSDTreeCommand();
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
    private static void printUsage(WSDL2XSDTreeCommand wt) throws IOException {
        //System.err.println("WSDL2XSDTree v" + getVersion() + "\n");

        System.err.println(" * " + wt.getUsage());

        System.err.println("\nFor more help, use 'wsdl2xsdtree -h'");
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
                in = Application.class.getResourceAsStream("/wsdl2xsdtree.properties");
                PROPERTIES.load(in);
            }
            return PROPERTIES.getProperty("wsdl2xsdtree.version");
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
