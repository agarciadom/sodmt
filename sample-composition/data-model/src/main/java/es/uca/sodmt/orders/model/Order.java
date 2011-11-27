package es.uca.sodmt.orders.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "orders")
public class Order {

	private Long id;
	private Calendar timestamp;
	private boolean open;
	private Shipment shipment;
	private Invoice invoice;
	private Set<OrderLine> lines = new HashSet<OrderLine>();

	public Order() {
		timestamp = Calendar.getInstance();
		open = true;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// This column should be set automatically by the DBMS
	@Temporal(TemporalType.TIMESTAMP)
	@Type(type = "calendar")
	@Column(nullable = false, updatable = false)
	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	@Column(nullable = false)
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	public Set<OrderLine> getLines() {
		return lines;
	}

	public void setLines(Set<OrderLine> lines) {
		this.lines = lines;
	}

	public void addLine(OrderLine line) {
		line.setOrder(this);
		lines.add(line);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(String.format("Order [id=%s, tstamp=%2$tc]", id, timestamp));
		if (lines.isEmpty()) {
			sb.append(": empty");
		}
		else {
			sb.append(":"); 
			for (OrderLine line : lines) {
				sb.append("\n - ");
				sb.append(line);
			}
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		// business key: order lines + timestamp
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lines == null) ? 0 : lines.hashCode());
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// business key: order lines + timestamp
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		if (lines == null) {
			if (other.lines != null) {
				return false;
			}
		} else if (!lines.equals(other.lines)) {
			return false;
		}
		if (timestamp == null) {
			if (other.timestamp != null) {
				return false;
			}
		} else if (!timestamp.equals(other.timestamp)) {
			return false;
		}
		return true;
	}
}
