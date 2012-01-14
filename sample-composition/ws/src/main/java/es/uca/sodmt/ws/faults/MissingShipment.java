package es.uca.sodmt.ws.faults;

public class MissingShipment {

	private long orderID;

	public MissingShipment() {
		// used by JAX-WS
	}

	public MissingShipment(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
