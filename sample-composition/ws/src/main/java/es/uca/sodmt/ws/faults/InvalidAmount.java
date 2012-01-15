package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

@WebFault
public class InvalidAmount extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAmount() {
		super();
	}

	public InvalidAmount(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAmount(String message) {
		super(message);
	}

	public InvalidAmount(Throwable cause) {
		super(cause);
	}

}
