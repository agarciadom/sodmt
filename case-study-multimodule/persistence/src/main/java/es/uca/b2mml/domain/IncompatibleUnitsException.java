package es.uca.b2mml.domain;

/**
 * Exception class thrown when trying to operate with quantities of incompatible
 * types (different root units).
 *
 * @author antonio
 */
public class IncompatibleUnitsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IncompatibleUnitsException(String message) {
		super(message);
	}
}
