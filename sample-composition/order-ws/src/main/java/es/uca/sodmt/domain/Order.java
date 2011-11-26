package es.uca.sodmt.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Order {

	private String _id;
	private Map<Article, BigDecimal> orderItems = new HashMap<Article, BigDecimal>();

	public String getID() {
		return _id;
	}

	public void setID(String id) {
		_id = id;
	}

	public Map<Article, BigDecimal> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Map<Article, BigDecimal> orderItems) {
		this.orderItems = orderItems;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result
				+ ((orderItems == null) ? 0 : orderItems.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		return true;
	}
}
