package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.OrderRejectedBean;

@WebFault
public class OrderRejected extends Exception {

	private static final long serialVersionUID = 1L;

	private OrderRejectedBean info;

	public OrderRejected(String message, OrderRejectedBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public OrderRejected(String message, OrderRejectedBean info) {
		super(message);
		this.info = info;
	}

	public OrderRejected(long orderID) {
		this("Order #" + orderID + " was rejected", new OrderRejectedBean(orderID));
	}

	public OrderRejectedBean getFaultInfo() {
		return info;
	}

}
