package es.uca.sodmt.domain.faults;

import es.uca.sodmt.domain.Article;

public class UnknownArticle extends Exception {
	private static final long serialVersionUID = 1L;
	private Article article;

	public UnknownArticle(Article article) {
		super(String.format(
				"Article '%s' with ID '%s' could not be found",
				article.getId(), article.getName()));
		this.article = article;
	}

	public Article getArticle() {
		return article;
	}
}
