package es.uca.sodmt.ws.faults;

public class OrderAlreadyClosed extends Exception {
	private static final long serialVersionUID = 1L;
	private long orderId;

	public OrderAlreadyClosed(long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
}
