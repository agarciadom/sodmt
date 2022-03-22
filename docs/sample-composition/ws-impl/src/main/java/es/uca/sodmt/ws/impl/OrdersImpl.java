package es.uca.sodmt.ws.impl;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.Order;
import es.uca.sodmt.orders.model.OrderLine;
import es.uca.sodmt.orders.model.StockItem;
import es.uca.sodmt.orders.model.Warehouse;
import es.uca.sodmt.ws.Orders;
import es.uca.sodmt.ws.faults.MissingArticle;
import es.uca.sodmt.ws.faults.MissingOrder;
import es.uca.sodmt.ws.faults.OrderAlreadyClosed;
import es.uca.sodmt.ws.faults.beans.MissingArticleBean;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest;
import es.uca.sodmt.ws.requests.OrderEvaluateRequest.OrderEvaluateRequestItem;
import es.uca.sodmt.ws.responses.OrderCloseResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse;
import es.uca.sodmt.ws.responses.OrderEvaluateResponse.OrderEvaluateResult;
import es.uca.sodmt.ws.responses.OrderListResponse;
import es.uca.sodmt.ws.responses.OrderQueryResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Orders")
public class OrdersImpl extends AbstractServiceImpl implements Orders {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrdersImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public OrderEvaluateResponse evaluate(OrderEvaluateRequest o) throws MissingArticle {
		final Session session = getSession();

		try {
			// Accepted: acquire stock from the first available warehouse
			session.beginTransaction();

			// We need to look for a warehouse that has everything the client
			// asked for:
			// we start looking at all warehouses, and then we keep on
			// restricting the
			// available options
			final Set<Long> validWarehouses = new HashSet<Long>(
					(List<Long>) session.createCriteria(Warehouse.class)
							.setProjection(Projections.property("id")).list());
			LOGGER.debug("Available warehouses: " + validWarehouses);

			for (OrderEvaluateRequestItem item : o.getArticleQuantities()) {
				final long articleID = item.getArticleID();
				final BigDecimal qty = item.getQuantity();
				final Article article = (Article) session.get(Article.class,
						articleID);
				if (article == null) {
					throw new MissingArticle("Article " + articleID + " does not exist", new MissingArticleBean(articleID));
				}

				// Find all the warehouse IDs that have the required quantity of
				// the requested article,
				// and that haven't been discarded yet.
				final List<Long> warehouseIDs = (List<Long>) session
						.createQuery("select s.warehouse.id from StockItem s where s.article.id = ? and s.quantity >= ?")
						.setLong(0, articleID)
						.setBigDecimal(1, qty)
						.list();

				validWarehouses.retainAll(warehouseIDs);
				if (validWarehouses.isEmpty()) {
					LOGGER.warn("No remaining warehouses: rejecting order");
					break;
				}
				LOGGER.debug("Remaining warehouses: " + validWarehouses);
			}

			final Order order = new Order();
			Warehouse warehouse = null;
			if (!validWarehouses.isEmpty()) {
				warehouse = (Warehouse)session.load(Warehouse.class, validWarehouses.iterator().next());
			}
			order.setWarehouse(warehouse);

			for (OrderEvaluateRequestItem item : o.getArticleQuantities()) {
				final long articleID = item.getArticleID();
				final BigDecimal qty = item.getQuantity();
				final Article article = (Article)session.load(Article.class, articleID);

				if (warehouse != null) {
					final StockItem stockItem = (StockItem)session.load(StockItem.class, stockItemKey(warehouse, article));
					stockItem.setQuantity(stockItem.getQuantity().subtract(qty));
					LOGGER.debug("New quantity of #" + article.getId() + " is: " + stockItem.getQuantity());
				}

				order.addLine(new OrderLine(article, qty));
			}

			session.persist(order);
			session.getTransaction().commit();
			return new OrderEvaluateResponse(
				warehouse != null ? OrderEvaluateResult.ACCEPTED : OrderEvaluateResult.REJECTED,
				order.getId());
		}
		catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public OrderCloseResponse close(long orderID) throws MissingOrder, OrderAlreadyClosed {
		final Session session = getSession();
		session.beginTransaction();
		try {
			final Order order = (Order) session.get(Order.class, orderID);
			if (order == null) {
				throw new MissingOrder(orderID);
			} else if (!order.isOpen()) {
				throw new OrderAlreadyClosed(orderID);
			} else {
				order.setOpen(false);
				session.update(order);
				return new OrderCloseResponse(orderID);
			}
		} finally {
			session.getTransaction().commit();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public OrderListResponse list() {
		final Session session = getSession();

		session.beginTransaction();
		final List<Long> ids
			= (List<Long>)session
				.createCriteria(Order.class)
				.setProjection(Projections.property("id")).list();
		session.getTransaction().commit();

		final OrderListResponse response = new OrderListResponse();
		response.setOrderIds(ids);
		return response;	
	}

	@Override
	public OrderQueryResponse query(long orderID) throws MissingOrder {
		final Session session = getSession();
		session.beginTransaction();
		try {
			final Order order = (Order) session.get(Order.class, Long.valueOf(orderID));
			if (order == null) {
				throw new MissingOrder(orderID);
			}
			return new OrderQueryResponse(order);
		} finally {
			session.getTransaction().commit();
		}
	}

	private StockItem stockItemKey(final Warehouse warehouse,
			final Article article) {
		final StockItem queryStockItem = new StockItem();
		queryStockItem.setArticle(article);
		queryStockItem.setWarehouse(warehouse);
		return queryStockItem;
	}

}
