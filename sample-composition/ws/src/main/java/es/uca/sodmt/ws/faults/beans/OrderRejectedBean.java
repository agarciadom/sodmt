package es.uca.sodmt.ws.faults.beans;

public class OrderRejectedBean {

	private long orderID;

	public OrderRejectedBean() {
		// JAXB
	}

	public OrderRejectedBean(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
