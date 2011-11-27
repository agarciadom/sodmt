package es.uca.sodmt.ws.requests;

import java.math.BigDecimal;
import java.util.Map;

public class OrderEvaluateRequest {

	private Map <Long, BigDecimal> articleQuantities;

	/**
	 * @return the articleQuantities
	 */
	public Map<Long, BigDecimal> getArticleQuantities() {
		return articleQuantities;
	}

	/**
	 * @param articleQuantities the articleQuantities to set
	 */
	public void setArticleQuantities(Map<Long, BigDecimal> articleQuantities) {
		this.articleQuantities = articleQuantities;
	}

}
