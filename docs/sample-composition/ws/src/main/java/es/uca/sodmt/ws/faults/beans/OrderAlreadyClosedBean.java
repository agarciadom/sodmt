package es.uca.sodmt.ws.faults.beans;

public class OrderAlreadyClosedBean {
	private long orderId;

	public OrderAlreadyClosedBean() {
		// JAXB
	}

	public OrderAlreadyClosedBean(long orderId) {
		this.orderId = orderId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
}
