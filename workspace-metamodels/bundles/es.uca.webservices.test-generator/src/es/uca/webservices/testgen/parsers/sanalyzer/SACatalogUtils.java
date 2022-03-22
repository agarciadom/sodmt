package es.uca.webservices.testgen.parsers.sanalyzer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import serviceAnalyzer.messageCatalog.ServicesDocument.Services;
import serviceAnalyzer.messageCatalog.TypeFault;
import serviceAnalyzer.messageCatalog.TypeOperation;
import serviceAnalyzer.messageCatalog.TypePort;
import serviceAnalyzer.messageCatalog.TypeService;
import es.uca.webservices.testgen.api.parsers.ParserException;

/**
 * Utility methods for working with ServiceAnalyzer message catalogs.
 * @author Antonio García-Domínguez
 */
public final class SACatalogUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(SACatalogUtils.class);
	private SACatalogUtils() {}

	/**
	 * Returns the first TypeOperation element named <code>operation</code> in the <code>service</code>.
	 *
	 * @param service &lt;service&gt; element containing the TypeOperation to be searched.
	 * @param operationName Name of the operation to be searched.
	 * @return The first TypeOperation named <code>operation</code> inside <code>service</code>.
	 * @throws ParserException Could not find any matching TypeOperation inside <code>service</code>.
	 */
	public static TypeOperation findOperationByName(TypeService service, String operationName) throws ParserException {
	    LOGGER.debug("Looking for operation " + operationName);
	    if (operationName == null) {
	    	throw new IllegalArgumentException("Operation name must not be null");
	    }
	    for (TypePort tp : service.getPortArray()) {
			for (TypeOperation to : tp.getOperationArray()) {
				if (operationName.equals(to.getName())) {
					return to;
				}
			}
	    }
	    throw new ParserException("Could not find operation '" + operationName + "'");
	}

	/**
	 * Returns the first TypeService in <code>services</code> named <code>service</code>.
	 *
	 * @param services &lt;services&gt; element containing the TypeService to be searched.
	 * @param serviceName Name of the service to be searched.
	 * @return The first TypeService named <code>service</code> inside <code>services</code>.
	 * @throws ParserException Could not find any matching TypeService inside <code>services</code>.
	 */
	public static TypeService findServiceByName(Services services, String serviceName) throws ParserException {
	    LOGGER.debug("Looking for service " + serviceName);
	    if (serviceName == null) {
	    	throw new IllegalArgumentException("Service name must not be null");
	    }
	    for (TypeService ts : services.getServiceArray()) {
	    	if (serviceName.equals(ts.getName())) {
	    		return ts;
	    	}
	    }
	    throw new ParserException("Could not find service '" + serviceName + "'");
	}

	/**
	 * Returns the first TypeFault in <code>operation</code> named <code>faultName</code>.
	 *
	 * @param operation &lt;operation&gt; element containing the TypeFault to be searched.
	 * @param faultName Name of the fault to be searched.
	 * @return The first TypeFault named <code>faultName</code> inside <code>operation</code>.
	 * @throws ParserException Could not find any matching TypeFault inside <code>operation</code>.
	 */
	public static TypeFault findFaultByName(TypeOperation operation, String faultName) throws ParserException {
		LOGGER.debug("Looking for fault " + faultName);
		if (faultName == null) {
			throw new IllegalArgumentException("faultName must not be null");
		}
		for (TypeFault tf : operation.getFaultArray()) {
			if (faultName.equals(tf.getName())) {
				return tf;
			}
		}
		throw new ParserException("Could not find fault '" + faultName + "'");
	}
}
