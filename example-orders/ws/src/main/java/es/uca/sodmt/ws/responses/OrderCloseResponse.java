package es.uca.sodmt.ws.responses;

import java.util.Calendar;

public class OrderCloseResponse {

	private Calendar closedTimestamp = Calendar.getInstance();
	private long orderID;

	OrderCloseResponse() {
		// used by JAX-WS
	}

	public OrderCloseResponse(long orderID) {
		this.orderID = orderID;
	}

	public Calendar getClosedTimestamp() {
		return closedTimestamp;
	}

	public void setClosedTimestamp(Calendar timestamp) {
		this.closedTimestamp = timestamp;
	}

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

}
