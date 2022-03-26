package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.OrderAlreadyClosedBean;

@WebFault
public class OrderAlreadyClosed extends Exception {
	private static final long serialVersionUID = 1L;
	private OrderAlreadyClosedBean info;

	public OrderAlreadyClosed(String message, OrderAlreadyClosedBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public OrderAlreadyClosed(String message, OrderAlreadyClosedBean info) {
		super(message);
		this.info = info;
	}

	public OrderAlreadyClosed(long orderID) {
		this("Order #" + orderID + " is already closed", new OrderAlreadyClosedBean(orderID));
	}

	public OrderAlreadyClosedBean getFaultInfo() {
		return info;
	}
}
