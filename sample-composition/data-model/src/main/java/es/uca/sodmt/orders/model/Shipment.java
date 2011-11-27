package es.uca.sodmt.orders.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "shipments")
@GenericGenerator(
		name = "foreign",
		strategy = "foreign",
		parameters = @Parameter(name="property", value="order")
)
public class Shipment {

	private Long id;
	private Order order;
	private Calendar timestamp;

	// Shares the PK with Order
	@Id
	@GeneratedValue(generator = "foreign")
	@Column(name = "order_id")
	public Long getOrderId() {
		return id;
	}

	public void setOrderId(Long id) {
		this.id = id;
	}

	@OneToOne(cascade = CascadeType.PERSIST, optional = false)
	@PrimaryKeyJoinColumn
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Type(type = "calendar")
	@Column(nullable = false, updatable = false)
	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return String.format("Shipment [order=%s, tstamp=%s]", order, timestamp);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
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
		if (!(obj instanceof Shipment)) {
			return false;
		}
		Shipment other = (Shipment) obj;
		if (order == null) {
			if (other.order != null) {
				return false;
			}
		} else if (!order.equals(other.order)) {
			return false;
		}
		return true;
	}

}
