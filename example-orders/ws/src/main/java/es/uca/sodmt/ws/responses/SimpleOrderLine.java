package es.uca.sodmt.ws.responses;

import java.math.BigDecimal;

/**
 * Simplified order line. Note that two order lines are said to be equal (having
 * the same hashcode) if they have the same article ID. This ensures that no
 * single article is listed more than once in a set of order lines.
 */
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

	@Override
	public String toString() {
		return "SimpleOrderLine [articleId=" + articleId + ", qty=" + qty
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (articleId ^ (articleId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleOrderLine other = (SimpleOrderLine) obj;
		if (articleId != other.articleId)
			return false;
		return true;
	}

}
