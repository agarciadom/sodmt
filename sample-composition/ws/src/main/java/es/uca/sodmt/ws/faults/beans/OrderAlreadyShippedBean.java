package es.uca.sodmt.ws.faults.beans;

public class OrderAlreadyShippedBean {

	private long orderID;

	public OrderAlreadyShippedBean() {
		// JAXB
	}

	public OrderAlreadyShippedBean(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
