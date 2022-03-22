package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;
import java.util.Calendar;

import es.uca.sodmt.orders.model.Invoice;

public class InvoiceGenerateResponse {

	private Long orderId;
	private BigDecimal total;
	private Calendar timestamp;

	InvoiceGenerateResponse() {
		// used by JAX-WS - do not delete!
	}

	public InvoiceGenerateResponse(long orderID, Invoice newInvoice) {
		setOrderId(orderID);
		setTotal(newInvoice.getTotal());
		setTimestamp(newInvoice.getTimestamp());
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

}
