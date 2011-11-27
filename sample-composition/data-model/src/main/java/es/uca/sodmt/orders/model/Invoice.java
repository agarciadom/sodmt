package es.uca.sodmt.orders.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "invoices")
@GenericGenerator(
		name = "foreign",
		strategy = "foreign",
		parameters = @Parameter(name="property", value="order")
)
public class Invoice {

	private Long orderId;
	private Order order;
	private BigDecimal total;
	private Calendar timestamp;
	private boolean paid;

	Invoice() {
		timestamp = Calendar.getInstance();
		paid = false;
	}

	public Invoice(Order order) {
		this();
		this.order = order;
		this.total = computeTotal(order); 
	}

	@Id
	@GeneratedValue(generator = "foreign")
	@Column(name = "order_id")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@OneToOne(cascade = CascadeType.PERSIST, optional = false)
	@PrimaryKeyJoinColumn
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Column(nullable = false, scale = 6)
	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(nullable = false, updatable = false)
	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	@Column(nullable = false)
	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return String.format("Invoice [orderId=%s, total=%s, paid=%s]", orderId, total, paid);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Invoice)) {
			return false;
		}
		Invoice other = (Invoice) obj;
		if (order == null) {
			if (other.order != null) {
				return false;
			}
		} else if (!order.equals(other.order)) {
			return false;
		}
		return true;
	}

	private BigDecimal computeTotal(Order order) {
		BigDecimal total = BigDecimal.ZERO;
		for (OrderLine line : order.getLines()) {
			total = total.add(line.getPrice().multiply(line.getQuantity()));
		}
		return total;
	}

}
