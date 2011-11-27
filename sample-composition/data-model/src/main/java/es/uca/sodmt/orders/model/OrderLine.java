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
@Table(name = "order_lines")
public class OrderLine implements Serializable {

	private static final long serialVersionUID = 1L;

	private Order order;
	private Article article;
	private BigDecimal quantity, price;

	public OrderLine() {
		// used by Hibernate
	}

	public OrderLine(Article article, BigDecimal qty) {
		this.article = article;
		this.quantity = qty;
		this.price = article.getPrice();
	}

	@Id
	@ManyToOne
	@ForeignKey(name="order_lines_order_fk")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Id
	@ManyToOne
	@ForeignKey(name="order_lines_article_fk")
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Column(nullable=false, updatable = false, precision = 19, scale=6)
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Column(nullable = false, updatable = false, precision = 19, scale = 6)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("OrderLine [article=%s, qty=%s, price=%s]", article, quantity, price);
	}

	@Override
	public int hashCode() {
		// We assume that (article name, order timestamp) is a valid business key (candidate key)
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.getName().hashCode());
		result = prime * result + ((order == null) ? 0 : order.getTimestamp().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// We assume that (article name, order timestamp) is a valid business key (candidate key)
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof OrderLine)) {
			return false;
		}
		OrderLine other = (OrderLine) obj;
		if (article == null) {
			if (other.article != null) {
				return false;
			}
		} else if (!article.getName().equals(other.article.getName())) {
			return false;
		}
		if (order == null) {
			if (other.order != null) {
				return false;
			}
		} else if (!order.getTimestamp().equals(other.order.getTimestamp())) {
			return false;
		}
		return true;
	}

}
