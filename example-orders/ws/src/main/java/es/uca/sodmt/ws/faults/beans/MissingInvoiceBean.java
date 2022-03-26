package es.uca.sodmt.ws.faults.beans;

public class MissingInvoiceBean {
	private long orderID;

	public MissingInvoiceBean() {
		// JAXB
	}

	public MissingInvoiceBean(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
}
