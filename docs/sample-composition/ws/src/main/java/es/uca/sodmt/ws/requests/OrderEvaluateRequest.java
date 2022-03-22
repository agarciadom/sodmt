package es.uca.sodmt.ws.requests;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderEvaluateRequest {

	public static class OrderEvaluateRequestItem {
		private long articleID;
		private BigDecimal quantity;

		public OrderEvaluateRequestItem() {
			// JAXB
		}

		public OrderEvaluateRequestItem(long articleID, BigDecimal qty) {
			setArticleID(articleID);
			setQuantity(qty);
		}

		public long getArticleID() {
			return articleID;
		}

		public void setArticleID(long articleID) {
			this.articleID = articleID;
		}

		public BigDecimal getQuantity() {
			return quantity;
		}

		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}

	}

	private List<OrderEvaluateRequestItem> articleQuantities = new ArrayList<OrderEvaluateRequestItem>();

	/**
	 * @return the articleQuantities
	 */
	public List<OrderEvaluateRequestItem> getArticleQuantities() {
		return articleQuantities;
	}

	/**
	 * @param articleQuantities the articleQuantities to set
	 */
	public void setArticleQuantities(List<OrderEvaluateRequestItem> articleQuantities) {
		this.articleQuantities = articleQuantities;
	}

	@Override
	public String toString() {
		return "OrderEvaluateRequest [articleQuantities=" + articleQuantities + "]";
	}

}
