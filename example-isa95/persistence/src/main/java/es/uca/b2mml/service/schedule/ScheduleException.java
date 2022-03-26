package es.uca.b2mml.service.schedule;

/**
 * Business-related exception while handling an operation in a {@link ScheduleService}.
 *
 * @author antonio
 */
public class ScheduleException extends Exception {
	private static final long serialVersionUID = 1L;

	public ScheduleException(String message) {
		super(message);
	}

	public ScheduleException(Throwable cause) {
		super(cause);
	}

	public ScheduleException(String message, Throwable cause) {
		super(message, cause);
	}

}
