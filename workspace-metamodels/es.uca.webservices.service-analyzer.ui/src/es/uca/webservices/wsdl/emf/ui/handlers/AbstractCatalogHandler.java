package es.uca.webservices.wsdl.emf.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.wsdl.Definition;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionException;

import serviceAnalyzer.messageCatalog.ServicesDocument;
import es.uca.webservices.wsdl.analyzer.ServiceAnalyzer;

/**
 * Abstract superclass for all handlers that need to generate ServiceAnalyzer
 * catalogs.
 * 
 * @author Antonio García-Domínguez
 */
public abstract class AbstractCatalogHandler extends AbstractHandler {

	protected void generateCatalog(final List<String> inputPaths, File targetFile) throws ExecutionException {
		try {
			/*final Thread currentThread = Thread.currentThread();
			final ClassLoader thisLoader = getClass().getClassLoader();
			final ClassLoader oldLoader = currentThread.getContextClassLoader();*/

			/*
			 * Saxon (used to generate the XML Schema docs) needs a specific
			 * classloader when used from OSGi - we need to set this up
			 * temporarily only for this step, as doing it for the whole process
			 * breaks XMLBeans.
			 */
			List<Definition> defs;
			List<File> xsdRoots;
			try {
				//currentThread.setContextClassLoader(thisLoader);
				defs = ServiceAnalyzer.readAllDefinitions(inputPaths.toArray(new String[inputPaths.size()]));
				xsdRoots = ServiceAnalyzer.generateRoots(defs);
			} finally {
				//currentThread.setContextClassLoader(oldLoader);
			}

			ServiceAnalyzer sa = new ServiceAnalyzer(defs, xsdRoots);
			
			try {
				//SchemaTypeSystemImpl.class.getClass();
				//currentThread.setContextClassLoader(thisLoader);
				ServicesDocument.Factory.newInstance();

				final ServicesDocument catalog = sa.generateMessageCatalog();
				saveXML(catalog, targetFile);
			} finally {
				//currentThread.setContextClassLoader(oldLoader);
			}
		} catch (Exception e) {
			throw new ExecutionException("Error while generating the ServiceAnalyzer catalog from the WSDL documents", e);
		}
	}

	private void saveXML(final XmlObject xml, File target) throws IOException {
		final XmlOptions options = new XmlOptions();
		options.setSavePrettyPrint();
		options.setSavePrettyPrintIndent(2);
		options.setSaveCDataEntityCountThreshold(0);
		options.setSaveCDataLengthThreshold(0);
		xml.save(target, options);
	}
}