package es.uca.sodmt.orders.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "warehouses")
public class Warehouse {

	private Long id;
	private Address address;
	private Set<StockItem> stockItems = new HashSet<StockItem>();

	public Warehouse() {
		// used by Hibernate
	}

	public Warehouse(Address address) {
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToMany(mappedBy="warehouse", cascade=CascadeType.ALL)
	public Set<StockItem> getStockItems() {
		return stockItems;
	}

	public void setStockItems(Set<StockItem> stockItems) {
		this.stockItems = stockItems;
	}

	/**
	 * Adds a stock item to this warehouse. This is better than using
	 * {@link #getStockItems()}, as it ensures that the stock item is linked to
	 * this warehouse.
	 */
	public void addStockItem(StockItem item) {
		item.setWarehouse(this);
		stockItems.add(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(String.format("Warehouse [id=%s, address=%s]", id, address));
		if (stockItems.isEmpty()) {
			sb.append(": empty");
		}
		else {
			sb.append(":");
			for (StockItem si : stockItems) {
				sb.append("\n - ");
				sb.append(si);
			}
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
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
		if (!(obj instanceof Warehouse)) {
			return false;
		}
		Warehouse other = (Warehouse) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		return true;
	}
}
