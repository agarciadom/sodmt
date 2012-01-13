package es.uca.sodmt.ws.requests;

import es.uca.sodmt.orders.model.Address;

public class WarehouseAddRequest {

	private Address address;

	public WarehouseAddRequest() {
		// used by JAX-WS - do not edit
	}

	public WarehouseAddRequest(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
