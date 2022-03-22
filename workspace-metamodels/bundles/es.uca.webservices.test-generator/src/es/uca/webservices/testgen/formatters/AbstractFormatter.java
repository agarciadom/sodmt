package es.uca.webservices.testgen.formatters;

import es.uca.webservices.testgen.api.formatters.IFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public abstract class AbstractFormatter implements IFormatter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFormatter.class);

    @SuppressWarnings("rawtypes")
	private final Map<String, List> values = new HashMap<String, List>();

    @Override
    public void suiteStart() {
        LOGGER.debug("Suite started");
        getValues().clear();
    }

    @Override
    public void suiteEnd() {
        LOGGER.debug("Suite ended");
    }

    @Override
    public void testStart() {
        LOGGER.debug("Test started");
    }

    @Override
    public void testEnd() {
        LOGGER.debug("Test ended");
    }

    /**
     * Add a value for the variable
     * @param variable
     * @param val 
     */
    @SuppressWarnings("unchecked")
	@Override
    public void valueFor(String variable, Object val) {
        if (!values.containsKey(variable)) {
            getValues().put(variable, new ArrayList<Object>());
        }
        getValues().get(variable).add(val);
    }

    /**
     * @return the values
     */
    @SuppressWarnings("rawtypes")
	public Map<String, List> getValues() {
        return values;
    }
}
