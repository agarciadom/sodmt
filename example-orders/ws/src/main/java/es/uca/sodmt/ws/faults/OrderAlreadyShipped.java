package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.OrderAlreadyShippedBean;

@WebFault
public class OrderAlreadyShipped extends Exception {

	private static final long serialVersionUID = 1L;
	private OrderAlreadyShippedBean info;

	public OrderAlreadyShipped(String message, OrderAlreadyShippedBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public OrderAlreadyShipped(String message, OrderAlreadyShippedBean info) {
		super(message);
		this.info = info;
	}

	public OrderAlreadyShipped(long orderID) {
		this("Order #" + orderID + " has already been shipped", new OrderAlreadyShippedBean(orderID));
	}

	public OrderAlreadyShippedBean getFaultInfo() {
		return info;
	}

}
