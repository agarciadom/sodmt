package es.uca.sodmt.ws.responses;

import java.util.ArrayList;
import java.util.List;

public class OrderListResponse {

	private List<Long> orderIds = new ArrayList<Long>();

	/**
	 * @return the orderIds
	 */
	public List<Long> getOrderIds() {
		return orderIds;
	}

	/**
	 * @param orderIds
	 *            the orderIds to set
	 */
	public void setOrderIds(List<Long> orderIds) {
		this.orderIds = orderIds;
	}

}
