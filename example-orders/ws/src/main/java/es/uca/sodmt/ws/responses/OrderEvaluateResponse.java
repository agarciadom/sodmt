package es.uca.sodmt.ws.responses;

public class OrderEvaluateResponse {

	public enum OrderEvaluateResult {
		REJECTED, ACCEPTED;
	}

	private OrderEvaluateResult result = OrderEvaluateResult.REJECTED;
	private long orderId = -1;

	public OrderEvaluateResponse() {
		// used by JAX-WS
	}

	public OrderEvaluateResponse(OrderEvaluateResult result, long orderId) {
		this.result = result;
		this.orderId = orderId;
	}

	/**
	 * @return the result
	 */
	public OrderEvaluateResult getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(OrderEvaluateResult result) {
		this.result = result;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

}
