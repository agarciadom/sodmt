package es.uca.webservices.specgen;

/**
 * Exception produce while generating a .spec from a ServiceAnalyzer catalog entry.
 */
public class SpecGenerationException extends Exception {

	private static final long serialVersionUID = 1L;

	public SpecGenerationException(String message) {
		super(message);
	}

	public SpecGenerationException(Throwable cause) {
		super(cause);
	}

	public SpecGenerationException(String message, Throwable cause) {
		super(message, cause);
	}

}
