package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.MissingShipmentBean;

@WebFault
public class MissingShipment extends Exception {

	private static final long serialVersionUID = 1L;
	private MissingShipmentBean info;

	public MissingShipment(String message, MissingShipmentBean info) {
		super(message);
		this.info = info;
	}

	public MissingShipment(String message, MissingShipmentBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public MissingShipmentBean getFaultInfo() {
		return info;
	}
}
