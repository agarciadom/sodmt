package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

@WebFault
public class ShipmentFault extends Exception {

	private static final long serialVersionUID = 1L;
	private MissingShipment info;

	public ShipmentFault(String message, MissingShipment info) {
		super(message);
		this.info = info;
	}

	public ShipmentFault(String message, MissingShipment info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public MissingShipment getFaultInfo() {
		return info;
	}
}
