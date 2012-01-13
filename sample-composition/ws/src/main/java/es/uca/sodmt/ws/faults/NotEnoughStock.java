package es.uca.sodmt.ws.faults;

import java.math.BigDecimal;

import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.Warehouse;

public class NotEnoughStock extends Exception {

	private static final long serialVersionUID = 1L;

	private long warehouseId;
	private long articleId;
	private BigDecimal existingAmount, requestedAmount;

	public NotEnoughStock(Warehouse warehouse, Article article, BigDecimal existingAmount, BigDecimal amountRequested) {
		this.warehouseId = warehouse.getId();
		this.articleId = article.getId();
		this.existingAmount = new BigDecimal(existingAmount.toString());
		this.requestedAmount = new BigDecimal(amountRequested.toString());
	}

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public BigDecimal getExistingAmount() {
		return existingAmount;
	}

	public void setExistingAmount(BigDecimal existingAmount) {
		this.existingAmount = existingAmount;
	}

	public BigDecimal getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(BigDecimal requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

}
