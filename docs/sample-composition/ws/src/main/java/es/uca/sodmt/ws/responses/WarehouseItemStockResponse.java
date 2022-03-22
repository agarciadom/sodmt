package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;

import es.uca.sodmt.orders.model.StockItem;

public class WarehouseItemStockResponse {

	Long articleID, warehouseID;
	BigDecimal quantity;

	public WarehouseItemStockResponse() {
		// used by JAX-WS
	}

	public WarehouseItemStockResponse(StockItem s) {
		setArticleID(s.getArticle().getId());
		setWarehouseID(s.getWarehouse().getId());
		setQuantity(s.getQuantity());
	}

	public Long getArticleID() {
		return articleID;
	}

	public void setArticleID(Long articleID) {
		this.articleID = articleID;
	}

	public Long getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(Long warehouseID) {
		this.warehouseID = warehouseID;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

}
