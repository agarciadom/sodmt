package es.uca.sodmt.ws.faults;

public class MissingArticle extends Exception {

	private static final long serialVersionUID = 1L;

	private long articleID;

	public MissingArticle(long articleID) {
		this.articleID = articleID;
	}

	public long getArticleID() {
		return articleID;
	}

	public void setArticleID(long articleID) {
		this.articleID = articleID;
	}

}
