package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.MissingOrderBean;

@WebFault
public class MissingOrder extends Exception {

	private static final long serialVersionUID = 1L;
	private MissingOrderBean info;

	public MissingOrder(String message, MissingOrderBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public MissingOrder(String message, MissingOrderBean info) {
		super(message);
		this.info = info;
	}

	public MissingOrder(long orderID) {
		this("Order with ID " + orderID + " does not exist", new MissingOrderBean(orderID));
	}

	public MissingOrderBean getFaultInfo() {
		return info;
	}

}
