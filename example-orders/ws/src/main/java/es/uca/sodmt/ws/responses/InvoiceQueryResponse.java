package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;
import java.util.Calendar;

import es.uca.sodmt.orders.model.Invoice;

public class InvoiceQueryResponse {

	private Long orderId;
	private BigDecimal total;
	private Calendar timestamp;
	private boolean paid;

	public InvoiceQueryResponse() {
		// used by JAX-WS - do not remove
	}

	public InvoiceQueryResponse(long orderID, Invoice invoice) {
		setOrderId(orderID);
		setTotal(invoice.getTotal());
		setTimestamp(invoice.getTimestamp());
		setPaid(invoice.isPaid());
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

}
