package es.uca.sodmt.ws.faults;

public class OrderAlreadyShipped extends Exception {

	private static final long serialVersionUID = 1L;

	private long orderID;

	public OrderAlreadyShipped(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
