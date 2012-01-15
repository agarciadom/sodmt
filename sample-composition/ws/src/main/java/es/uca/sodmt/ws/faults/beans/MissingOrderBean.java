package es.uca.sodmt.ws.faults.beans;

public class MissingOrderBean {

	private long orderId;

	public MissingOrderBean() {
		// JAXB
	}

	public MissingOrderBean(long orderId) {
		setOrderId(orderId);
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

}
