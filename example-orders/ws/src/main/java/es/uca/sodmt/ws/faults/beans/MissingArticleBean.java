package es.uca.sodmt.ws.faults.beans;

public class MissingArticleBean {
	private long articleID;

	public MissingArticleBean() {
		// for JAXB
	}

	public MissingArticleBean(long articleID) {
		setArticleID(articleID);
	}

	public long getArticleID() {
		return articleID;
	}

	public void setArticleID(long articleID) {
		this.articleID = articleID;
	}
}
