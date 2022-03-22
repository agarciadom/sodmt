package es.uca.sodmt.ws.impl;

import java.math.BigDecimal;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.Invoice;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.StockItem;
import es.uca.sodmt.orders.model.Warehouse;
import es.uca.sodmt.ws.faults.MissingArticle;
import es.uca.sodmt.ws.faults.MissingInvoice;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.MissingWarehouse;
import es.uca.sodmt.ws.faults.beans.MissingArticleBean;
import es.uca.sodmt.ws.faults.beans.MissingInvoiceBean;

abstract class AbstractServiceImpl {

	protected synchronized Session getSession() {
		final ApplicationContext appContext = ContextLoader.getCurrentWebApplicationContext();
		final SessionFactory factory = (SessionFactory)appContext.getBean("hibernateSessionFactory");
		return factory.getCurrentSession();
	}

	protected Invoice getInvoice(long orderID, final Session session)
			throws MissingOrder, MissingInvoice {
		final Order order = getOrder(orderID, session);
		if (order.getInvoice() == null) {
			throw new MissingInvoice("Order " + orderID + " does not have an invoice yet", new MissingInvoiceBean(orderID));
		}
		return order.getInvoice();
	}

	protected Order getOrder(long orderID, final Session session) throws MissingOrder {
		final Order order = (Order) session.get(Order.class, orderID);
		if (order == null) {
			throw new MissingOrder(orderID);
		}
		return order;
	}

	protected StockItem getStockItem(final Warehouse warehouse, final Article article, final Session session) {
		@SuppressWarnings("unchecked")
		final Iterator<StockItem> items1 = (Iterator<StockItem>) session.createQuery(
				"from StockItem si where si.warehouse = ? and si.article = ?")
			.setParameter(0, warehouse)
			.setParameter(1, article)
			.iterate();
		final Iterator<StockItem> items = items1;
	
		// Grab the existing stock item or create a new one
		StockItem sItem;
		if (items.hasNext()) {
			sItem = items.next();
		}
		else {
			sItem = new StockItem(article, BigDecimal.ZERO);
		}
		return sItem;
	}

	protected Article getArticle(long articleID, final Session session)
			throws MissingArticle {
		final Article article = (Article) session.get(Article.class, articleID);
		if (article == null) {
			throw new MissingArticle("Article does not exist",
					new MissingArticleBean(articleID));
		}
		return article;
	}

	protected Warehouse getWarehouse(long warehouseID, final Session session)
			throws MissingWarehouse {
		final Warehouse warehouse = (Warehouse) session.get(Warehouse.class, warehouseID);
		if (warehouse == null) {
			throw new MissingWarehouse(warehouseID);
		}
		return warehouse;
	}

}