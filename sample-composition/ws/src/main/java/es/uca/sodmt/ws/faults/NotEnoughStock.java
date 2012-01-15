package es.uca.sodmt.ws.faults;

import java.math.BigDecimal;

import javax.xml.ws.WebFault;

import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.Warehouse;
import es.uca.sodmt.ws.faults.beans.NotEnoughStockBean;

@WebFault
public class NotEnoughStock extends Exception {

	private static final long serialVersionUID = 1L;
	private NotEnoughStockBean info;

	public NotEnoughStock(String message, NotEnoughStockBean info, Throwable cause) {
		super(message, cause);
		this.info = info;
	}

	public NotEnoughStock(String message, NotEnoughStockBean info) {
		super(message);
		this.info = info;
	}

	public NotEnoughStock(Warehouse warehouse, Article article,
			BigDecimal stock, BigDecimal requested)
	{
		this("There is not enough stock in warehouse #"
				+ warehouse.getId() + " of article #" + article.getId()
				+ ": asked for " + requested + ", had " + stock,
				new NotEnoughStockBean(warehouse, article, stock, requested));
	}

	public NotEnoughStockBean getFaultInfo() {
		return info;
	}

}
