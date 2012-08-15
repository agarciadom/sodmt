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

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import es.uca.webservices.testgen.api.formatters.IFormatter;
import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.parsers.IParser;
import es.uca.webservices.testgen.api.parsers.ParserException;
import es.uca.webservices.testgen.api.types.IType;
import es.uca.webservices.testgen.formatters.CSVFormatter;
import es.uca.webservices.testgen.formatters.VelocityFormatter;
import es.uca.webservices.testgen.generators.UniformRandomGenerator;
import es.uca.webservices.testgen.parsers.sanalyzer.SACatalogParser;
import es.uca.webservices.testgen.parsers.spec.SpecParser;

/**
 * Class in charge of for program execution
 */
public class TestGeneratorRun {

    private String path;
    private String service ="";
    private String operation = "";
    private String type ="";
    private String formatter;
    private int numTest;
    private long seed;

    /**
     * Construcor for WSDL datas
     * @param path
     * @param operation
     * @param service
     * @param type
     * @param formatter
     * @param numTest 
     */
    public TestGeneratorRun(String path, String operation, String service, String type, String formatter, int numTest) {
        this.path = path;
        this.service = service;
        this.operation = operation;
        this.type = type;
        this.numTest = numTest;
        this.formatter = formatter;
    }
    
    /**
     * Constructo for SPEC datas
     * @param path
     * @param formatter
     * @param numTest 
     */
    public TestGeneratorRun(String path, String formatter, int numTest) {
        this.path = path;
        this.numTest = numTest;
        this.formatter = formatter;
    }

    /**
     * Run the application
     * @throws ParserException
     * @throws IOException
     * @throws GenerationException 
     */
    public void run(OutputStream os) throws ParserException, IOException, GenerationException {
        IParser parser;
		if (operation.length() == 0) {
			parser = new SpecParser(path);
		} else {
			parser = new SACatalogParser(path);
		}
		parser.parse(operation, service, type);
		List<IType> itypes = parser.getTypes();
        
        IFormatter fmt = null;
		if (formatter.equals("velocity")) {
			fmt = new VelocityFormatter();
		} else { // de momento la otra posibilidad esque sea csv
			fmt = new CSVFormatter();
		}

        UniformRandomGenerator tg = new UniformRandomGenerator();
        tg.setSeed(seed);
        fmt.suiteStart();
        for (int i = 0; i < numTest; ++i) {
        	fmt.testStart();
        	for (IType t : itypes) {
        		fmt.valueFor(t.getNameVariable(), tg.generate(t));
        	}
        	fmt.testEnd();
        }
        fmt.suiteEnd();

        fmt.save(os);
    }

	public long getSeed() {
		return seed;
	}

	public void setSeed(long seed) {
		this.seed = seed;
	}

}
