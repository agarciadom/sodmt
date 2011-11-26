package es.uca.sodmt.domain.faults;

import es.uca.sodmt.domain.Article;

public class NotEnoughStock extends Exception {

	private static final long serialVersionUID = 1L;
	private Article article;

	public NotEnoughStock(Article article) {
		this.article = article;
	}

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

}
