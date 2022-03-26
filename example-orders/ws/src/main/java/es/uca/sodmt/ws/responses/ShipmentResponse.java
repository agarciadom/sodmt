package es.uca.sodmt.ws.responses;

import java.util.Calendar;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.orders.model.Shipment;

public class ShipmentResponse {

	private Long orderID;
	private Calendar timestamp;
	private Address destination;

	public ShipmentResponse() {
		// used by JAX-WS
	}

	public ShipmentResponse(Shipment s) {
		setOrderID(s.getOrderId());
		setTimestamp(s.getTimestamp());
		setDestination(s.getDestination());
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	public Address getDestination() {
		return destination;
	}

	public void setDestination(Address destination) {
		this.destination = destination;
	}

}
