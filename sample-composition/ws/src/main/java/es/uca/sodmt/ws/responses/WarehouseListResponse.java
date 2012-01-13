package es.uca.sodmt.ws.responses;

import java.util.ArrayList;
import java.util.List;

import es.uca.sodmt.orders.model.Address;
import es.uca.sodmt.orders.model.Warehouse;

public class WarehouseListResponse {

	public static class WarehouseListResponseItem {
		Long warehouseID;
		Address address;

		public WarehouseListResponseItem() {
			// Used by JAX-WS
		}

		public WarehouseListResponseItem(Warehouse w) {
			setWarehouseID(w.getId());
			setAddress(w.getAddress());
		}

		public Long getWarehouseID() {
			return warehouseID;
		}

		public void setWarehouseID(Long warehouseID) {
			this.warehouseID = warehouseID;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
	}

	private List<WarehouseListResponseItem> items;

	public WarehouseListResponse() {
		// used by JAX-WS
	}

	public WarehouseListResponse(List<Warehouse> warehouses) {
		items = new ArrayList<WarehouseListResponseItem>(warehouses.size());
		for (Warehouse w : warehouses) {
			items.add(new WarehouseListResponseItem(w));
		}
	}

	public List<WarehouseListResponseItem> getItems() {
		return items;
	}

	public void setItems(List<WarehouseListResponseItem> items) {
		this.items = items;
	}

}
