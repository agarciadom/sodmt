package es.uca.sodmt.ws.faults;

public class UnknownArticle extends Exception {
	private static final long serialVersionUID = 1L;
	private long articleId;

	public UnknownArticle(long articleId) {
		super("Could not find article #" + articleId);
		this.articleId = articleId;
	}

	public long getArticleId() {
		return articleId;
	}
}
