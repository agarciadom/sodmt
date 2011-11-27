package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;

public class SimpleOrderLine {

	private long articleId;
	private BigDecimal qty;
	private BigDecimal price;

	SimpleOrderLine() {
		// used by JAX-WS
	}

	public SimpleOrderLine(long articleId, BigDecimal qty, BigDecimal price) {
		this.articleId = articleId;
		this.qty = qty;
		this.price = price;
	}

	/**
	 * @return the articleId
	 */
	public long getArticleId() {
		return articleId;
	}

	/**
	 * @param articleId
	 *            the articleId to set
	 */
	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return the quantity
	 */
	public BigDecimal getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *            the quantity to set
	 */
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
