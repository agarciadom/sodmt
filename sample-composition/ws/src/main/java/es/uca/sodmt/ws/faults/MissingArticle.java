package es.uca.sodmt.ws.faults;

import javax.xml.ws.WebFault;

import es.uca.sodmt.ws.faults.beans.MissingArticleBean;

@WebFault
public class MissingArticle extends Exception {

	private static final long serialVersionUID = 1L;

	private MissingArticleBean info;

	public MissingArticle(String message, MissingArticleBean bean, Throwable cause) {
		super(message, cause);
		this.info = bean;
	}

	public MissingArticle(String message, MissingArticleBean bean) {
		super(message);
		this.info = bean;
	}

	public MissingArticleBean getFaultInfo() {
		return info;
	}
}
