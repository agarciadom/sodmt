package es.uca.webservices.bpel.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.Configuration;
import net.sf.saxon.Controller;
import net.sf.saxon.TransformerFactoryImpl;
import net.sf.saxon.event.MessageWarner;
import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.trans.XPathException;

import org.w3c.dom.Document;

/**
 * Wrapper for a generic XSLT stylesheet, allowing for several executions with
 * different source/result pairs and putting all the logic in one place.
 * Transformer configuration can be specialized by overriding the
 * prepareTransformer method.
 *
 * This wrapper is tightly bound to the Saxon-B 9.1 XSLT 2.0 library. Be careful
 * when upgrading or replacing it with another library. Make sure all tests in
 * MuBPEL still pass. In general, all Saxon-specific logic should be
 * encapsulated in this class.
 *
 * @author Antonio García Domínguez
 * @version 1.0
 */
public class XSLTStylesheet {

	private Templates translet = null;
	private Map<String, Object> parameters = null;
	private String pathToStylesheet;
	private Configuration saxonConfiguration;
	private boolean debug = false;

	static {
		System.setProperty("javax.xml.transform.TransformerFactory",
				"net.sf.saxon.TransformerFactoryImpl");
	}

	/**
	 * Initializes the translation engine
	 *
	 * @return The loaded and initiated template
	 * @throws FileNotFoundException
	 *             The stylesheet could not be loaded
	 * @throws TransformerConfigurationException
	 *             An error occurred while applying the transformation
	 * @throws XPathException
	 *             An error occurred due a wrong XPath expression
	 */
	private Templates initTranslet() throws FileNotFoundException,
			TransformerConfigurationException, XPathException {
		if (translet != null) {
			return translet;
		}

		final InputStream streamStylesheet = new BufferedInputStream(
				getClass().getClassLoader().getResourceAsStream(pathToStylesheet));

		final TransformerFactory factory = TransformerFactory.newInstance();

		factory.setURIResolver(new ClassLoaderURIResolver());
		factory.setAttribute(net.sf.saxon.FeatureKeys.LINE_NUMBERING, true);
		factory.setAttribute(net.sf.saxon.FeatureKeys.RECOVERY_POLICY,
			net.sf.saxon.Configuration.DO_NOT_RECOVER);

		if (debug) {
		    factory.setAttribute(net.sf.saxon.FeatureKeys.COMPILE_WITH_TRACING, true);
		    factory.setAttribute(net.sf.saxon.FeatureKeys.TRACE_LISTENER, new net.sf.saxon.trace.XSLTTraceListener());
		}

		saxonConfiguration = ((TransformerFactoryImpl) factory)
				.getConfiguration();
		NodeInfo xsltDoc = saxonConfiguration.buildDocument(new StreamSource(
				streamStylesheet));
		translet = factory.newTemplates(xsltDoc);

		return translet;
	}

	/**
	 * Applies the transormation from a Source object, and saves the result into
	 * a Result object
	 *
	 * @param source
	 *            The source to be transformed
	 * @param result
	 *            Where the result must be stored
	 * @throws TransformerException
	 *             An error occurred while applying the transformation
	 * @throws ParserConfigurationException
	 *             Wrong parser configuration
	 * @throws IOException
	 *             The input or the output could not be opened
	 */
	public void transform(Source source, Result result)
			throws TransformerException, ParserConfigurationException,
			IOException
    {

		final Transformer transformer = initTranslet().newTransformer();

		if (parameters != null) {
			for (String key : parameters.keySet()) {
				transformer.setParameter(key, parameters.get(key));
			}
		}

		prepareTransformer(transformer);

		// We want to use JAXP's regular error listeners from the outside. The only
		// way to do that is to call the setMessageEmitter method of Saxon's Controller
		// subclass of the standard Transformer class, and use Saxon's MessageWarner
		// as the receiver (see [1]). We'll need to do this ugly downcast, as
		// Saxon's TransformerFactoryImpl.newTemplates returns a standard JAXP
		// Templates object, which in turn returns a standard JAXP Transform object.
		//
		// If no ErrorListeners are registered in the prepareTransformer method, the
		// default one will be used, which sends all messages to System.err [2].
		//
		// Setting the message emitter must be done right here. Otherwise, Saxon would
		// pick up the old ErrorListener and produce the wrong results.
		//
		// [1]: http://saxonica.com/documentation/xsl-elements/message.html
		// [2]: https://jaxp-sources.dev.java.net/nonav/docs/api/javax/xml/transform/ErrorListener.html

		final MessageWarner jaxpWarner = new MessageWarner();
		jaxpWarner.setWriter(new OutputStreamWriter(System.err));
		((Controller)transformer).setMessageEmitter(jaxpWarner);

		NodeInfo saxonSource = saxonConfiguration.buildDocument(source);
		transformer.transform(saxonSource, result);
	}

	/**
	 * Applies the transormation from a File object, and saves the result into
	 * another File
	 * 
	 * @param sourceFile
	 *            The original file
	 * @param resultFile
	 *            Where to save the result
	 * @throws FileNotFoundException
	 *             The source file could not be opened
	 * @throws TransformerException
	 *             An error occurred during transformation
	 * @throws ParserConfigurationException
	 *             Wrong parser configuration
	 * @throws IOException
	 *             An error occurred when trying to read the source file, or
	 *             write the destination
	 */
	public void transform(File sourceFile, File resultFile)
			throws FileNotFoundException, TransformerException,
			ParserConfigurationException, IOException {
		transform(new StreamSource(new FileInputStream(sourceFile)),
				new StreamResult(new FileOutputStream(resultFile)));
	}

	/**
	 * Convenience method for {@link #transform(Source, Result)}.
	 */
	public void transform(Document sourceDoc, File resultFile)
			throws FileNotFoundException, TransformerException, ParserConfigurationException, IOException
	{
		transform(new DOMSource(sourceDoc), new StreamResult(new FileOutputStream(resultFile)));
	}

	/**
	 * Method called before performing the transform.
	 *
	 * @param t
	 *            Not used
	 */
	protected void prepareTransformer(Transformer t) {
	}

	/**
	 * Sets the path to the stylesheet
	 *
	 * @param pathToStylesheet
	 *            The path to the XSLT stylesheet
	 */
	public XSLTStylesheet(String pathToStylesheet) {
		this.pathToStylesheet = pathToStylesheet;
	}

	/**
	 * Sets a specific parameter to be used for the following transformations.
	 * @param name Name of the parameter.
	 * @param value Value for the parameter, or <code>null</code> if it should be unset.
	 */
	public synchronized void setParameter(String name, Object value) {
		if (parameters == null) {
			parameters = new HashMap<String, Object>();
		}
		if (value != null) {
			parameters.put(name, value);
		} else {
			parameters.remove(name);
		}
	}

	/**
	 * Switches the XSLT stylesheet to debug mode, producing detailed execution
	 * traces.
	 *
	 * @param debug
	 *            <code>true</code> if detailed execution traces should be
	 *            produced, <code>false</code> if not.
	 */
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	/**
	 * Indicates whether detailed execution traces will be produced or not.
	 *
	 * @returns <code>true</code> if detailed execution traces should be
	 *          produced, <code>false</code> if not.
	 */
	public boolean getDebug() {
		return debug;
	}
}
