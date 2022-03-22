package es.uca.sodmt.ws.responses;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.OrderLine;

/**
 * Wraps an Order into a format suitable for sending over the wire.
 */
public class OrderQueryResponse {

	private long orderId;
	private Set<SimpleOrderLine> lines = new HashSet<SimpleOrderLine>();
	private boolean open;
	private Calendar timestamp;
	private boolean accepted;

	OrderQueryResponse() {
		// used by JAX-WS
	}

	public OrderQueryResponse(Order order) {
		this.orderId = order.getId();
		this.open = order.isOpen();
		this.timestamp = order.getTimestamp();
		this.accepted = order.getWarehouse() != null;
		for (OrderLine l : order.getLines()) {
			lines.add(new SimpleOrderLine(l.getArticle().getId(), l
					.getQuantity(), l.getPrice()));
		}
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public boolean getOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public Set<SimpleOrderLine> getLines() {
		return lines;
	}

	public void setLines(Set<SimpleOrderLine> lines) {
		this.lines = lines;
	}
}
