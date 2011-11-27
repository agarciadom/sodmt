package es.uca.sodmt.ws.responses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.OrderLine;

/**
 * Wraps an Order into a format suitable for sending over the wire.
 */
public class OrderQueryResponse {

	private long orderId;
	private List<SimpleOrderLine> lines = new ArrayList<SimpleOrderLine>();
	private boolean open;
	private Calendar timestamp;

	OrderQueryResponse() {
		// used by JAX-WS
	}

	public OrderQueryResponse(Order order) {
		this.orderId = order.getId();
		this.open = order.isOpen();
		this.timestamp = order.getTimestamp();
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

	public List<SimpleOrderLine> orderLines() {
		return lines;
	}

	public boolean getOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public List<SimpleOrderLine> getLines() {
		return lines;
	}

	public void setLines(List<SimpleOrderLine> lines) {
		this.lines = lines;
	}
}
