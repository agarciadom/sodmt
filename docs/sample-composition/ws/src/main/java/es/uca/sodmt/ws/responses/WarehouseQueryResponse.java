package es.uca.sodmt.ws.responses;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.orders.model.Warehouse;

public class WarehouseQueryResponse {

	private Address address;

	public WarehouseQueryResponse() {
		// for JAX-WS
	}

	public WarehouseQueryResponse(Warehouse w) {
		setAddress(w.getAddress());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
