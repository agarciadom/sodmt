package es.uca.sodmt.ws.faults;

public class MissingOrder extends Exception {

	private static final long serialVersionUID = 1L;
	private long orderId;

	public MissingOrder(long orderId) {
		super("Unknown order ID: " + orderId);
		this.orderId = orderId;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}

}
