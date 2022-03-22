package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.uca.sodmt.orders.model.StockItem;
import es.uca.sodmt.orders.model.Warehouse;

public class WarehouseItemsResponse {

	public static class WarehouseItemsResponseItem {
		Long id;
		BigDecimal quantity;

		public WarehouseItemsResponseItem() {
			// For JAX-WS
		}

		public WarehouseItemsResponseItem(StockItem sItem) {
			setId(sItem.getArticle().getId());
			setQuantity(sItem.getQuantity());
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public BigDecimal getQuantity() {
			return quantity;
		}

		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}
	}

	Long warehouseID;
	List<WarehouseItemsResponseItem> items;

	public WarehouseItemsResponse() {
		// used by JAX-WS
	}

	public WarehouseItemsResponse(Warehouse w) {
		setWarehouseID(w.getId());
		items = new ArrayList<WarehouseItemsResponseItem>(w.getStockItems().size());
		for (StockItem sItem : w.getStockItems()) {
			items.add(new WarehouseItemsResponseItem(sItem));
		}
	}

	public Long getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(Long warehouseID) {
		this.warehouseID = warehouseID;
	}

	public List<WarehouseItemsResponseItem> getItems() {
		return items;
	}

	public void setItems(List<WarehouseItemsResponseItem> items) {
		this.items = items;
	}

}
