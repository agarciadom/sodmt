package es.uca.sodmt.ws.faults.beans;

public class MissingShipmentBean {

	private long orderID;

	public MissingShipmentBean() {
		// used by JAX-WS
	}

	public MissingShipmentBean(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
