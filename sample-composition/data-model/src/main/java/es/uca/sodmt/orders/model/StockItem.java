package es.uca.sodmt.orders.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "stock")
public class StockItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Warehouse warehouse;
	private Article article;
	private BigDecimal quantity;

	public StockItem() {
		// used by Hibernate and load() calls
	}

	public StockItem(Article article, BigDecimal qty) {
		this.article = article;
		this.quantity = qty;
	}

	@Id
	@ManyToOne
	@ForeignKey(name="stock_warehouse_fk")
	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Id
	@ManyToOne
	@ForeignKey(name="stock_article_fk")
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Column(nullable = false)
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return String.format("StockItem [article=%s, quantity=%s]", article, quantity);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result
				+ ((warehouse == null) ? 0 : warehouse.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof StockItem)) {
			return false;
		}
		StockItem other = (StockItem) obj;
		if (article == null) {
			if (other.article != null) {
				return false;
			}
		} else if (!article.equals(other.article)) {
			return false;
		}
		if (warehouse == null) {
			if (other.warehouse != null) {
				return false;
			}
		} else if (!warehouse.equals(other.warehouse)) {
			return false;
		}
		return true;
	}

}
