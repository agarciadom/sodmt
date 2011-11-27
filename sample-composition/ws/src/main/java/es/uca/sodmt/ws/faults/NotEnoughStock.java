package es.uca.sodmt.ws.faults;


public class NotEnoughStock extends Exception {

	private static final long serialVersionUID = 1L;
	private long articleId;

	public NotEnoughStock(long articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return the article
	 */
	public long getArticle() {
		return articleId;
	}

}
