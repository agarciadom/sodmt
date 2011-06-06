package es.uca.modeling.eol.marte.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * EOL tool for processing VSL tuples.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class VSLTupleTool {

	private final static Pattern REGEX_TUPLE_SPLIT = Pattern.compile(" *, *");
	private final static Pattern REGEX_KEYVAL_SPLIT = Pattern.compile(" *= *");
	private final static Pattern REGEX_TIMELIMIT_EXPR_SPLIT = Pattern.compile(" *[*+] *");
	private final static Pattern REGEX_PARAMETER_SPLIT = Pattern.compile(" *[$:] *");

	public Map<String, String> getKeyvalMap(String tuple) {
		if (tuple == null) {
			throw new IllegalArgumentException("tuple cannot be null");
		}

		final Map<String, String> map = new HashMap<String, String>();
		if (!tuple.startsWith("(")) return map;

		final String[] keyvals = REGEX_TUPLE_SPLIT.split(tuple.substring(1, tuple.length() - 1));
		for (String keyval : keyvals) {
			final String[] parts = REGEX_KEYVAL_SPLIT.split(keyval);
			map.put(parts[0], parts[1]);
		}
		return map;
	}

	public Double getMinimumTime(String tuple) {
		final String[] parts = getTimeLimitExpressionParts(tuple);
		return Double.valueOf(parts[0]);
	}

	public Double getWeight(String tuple) {
		final String[] parts = getTimeLimitExpressionParts(tuple);
		return Double.valueOf(parts[1]);
	}

	public String getVariable(String tuple) {
		final String[] parts = getTimeLimitExpressionParts(tuple);
		return parts[2];
	}

	public String[] getTimeLimitExpressionParts(String expr) {
		if (expr == null) {
			return null;
		} else {
			return REGEX_TIMELIMIT_EXPR_SPLIT.split(expr);
		}
	}

	public String getParameterName(String ctxParamElement) {
		final String[] parts = REGEX_PARAMETER_SPLIT.split(ctxParamElement);
		return parts[1];
	}
}
