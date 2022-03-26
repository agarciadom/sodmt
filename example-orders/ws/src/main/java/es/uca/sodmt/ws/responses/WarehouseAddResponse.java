package es.uca.sodmt.ws.responses;

import es.uca.sodmt.orders.model.Warehouse;

public class WarehouseAddResponse {

	private Long warehouseID;

	public WarehouseAddResponse() {
		// used by JAX-WS
	}

	public WarehouseAddResponse(Warehouse w) {
		setWarehouseID(w.getId());
	}

	public Long getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(Long warehouseID) {
		this.warehouseID = warehouseID;
	}

}
