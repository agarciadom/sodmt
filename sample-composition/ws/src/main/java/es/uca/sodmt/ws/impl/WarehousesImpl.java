package es.uca.sodmt.ws.impl;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import es.uca.sodmt.orders.model.Article;
import es.uca.sodmt.orders.model.StockItem;
import es.uca.sodmt.orders.model.Warehouse;
import es.uca.sodmt.ws.Warehouses;
import es.uca.sodmt.ws.faults.InvalidAmount;
import es.uca.sodmt.ws.faults.MissingArticle;
import es.uca.sodmt.ws.faults.MissingWarehouse;
import es.uca.sodmt.ws.faults.NotEnoughStock;
import es.uca.sodmt.ws.requests.WarehouseAddRequest;
import es.uca.sodmt.ws.responses.WarehouseAddResponse;
import es.uca.sodmt.ws.responses.WarehouseItemStockResponse;
import es.uca.sodmt.ws.responses.WarehouseItemsResponse;
import es.uca.sodmt.ws.responses.WarehouseListResponse;
import es.uca.sodmt.ws.responses.WarehouseQueryResponse;

@WebService(endpointInterface="es.uca.sodmt.ws.Warehouses")
public class WarehousesImpl implements Warehouses {

	@Override
	public WarehouseAddResponse add(WarehouseAddRequest r) {
		final Session session = getSession();
		final Warehouse w = new Warehouse();
		w.setAddress(w.getAddress());

		final Transaction t = session.beginTransaction();
		session.persist(w);
		t.commit();

		return new WarehouseAddResponse(w);
	}

	@SuppressWarnings("unchecked")
	@Override
	public WarehouseListResponse list() {
		final Session session = getSession();
		final List<Warehouse> warehouses = session.createCriteria(Warehouse.class).list();
		return new WarehouseListResponse(warehouses);
	}

	@Override
	public WarehouseQueryResponse query(long warehouseID) throws MissingWarehouse {
		final Session session = getSession();
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		return new WarehouseQueryResponse(warehouse);
	}

	@Override
	public WarehouseItemStockResponse changeStock(long warehouseID,
			long articleID, BigDecimal amount) throws MissingWarehouse,
			MissingArticle, InvalidAmount, NotEnoughStock
	{
		final Session session = getSession();

		// Check that the warehouse and the article exist
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		final Article article = getArticle(articleID, session);
		final StockItem sItem = getStockItem(warehouse, article, session);

		// If removing stock, check that we have enough
		if (amount.compareTo(BigDecimal.ZERO) < 0 && sItem.getQuantity().compareTo(amount.negate()) < 0) {
			throw new NotEnoughStock(warehouse, article, sItem.getQuantity(), amount.negate());
		}

		// Perform the update
		final Transaction t = session.beginTransaction();
		sItem.setQuantity(sItem.getQuantity().add(amount));
		if (sItem.getQuantity().compareTo(BigDecimal.ZERO) > 0) {
			warehouse.addStockItem(sItem);
			session.saveOrUpdate(sItem);
		}
		else {
			warehouse.getStockItems().remove(sItem);
		}
		t.commit();

		return new WarehouseItemStockResponse(sItem);
	}

	@Override
	public WarehouseItemStockResponse queryStock(long warehouseID,
			long articleID) throws MissingWarehouse, MissingArticle
	{
		final Session session = getSession();
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		final Article article = getArticle(articleID, session);
		final StockItem sItem = getStockItem(warehouse, article, session);

		return new WarehouseItemStockResponse(sItem);
	}

	@Override
	public WarehouseItemsResponse listStock(long warehouseID) throws MissingWarehouse {
		final Session session = getSession();
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		return new WarehouseItemsResponse(warehouse);
	}

	private StockItem getStockItem(final Warehouse warehouse,
			final Article article, final Session session) {
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

	private Article getArticle(long articleID, final Session session)
			throws MissingArticle {
		final Article article = (Article)session.get(Article.class, articleID);
		if (article == null) {
			throw new MissingArticle(articleID);
		}
		return article;
	}

	private Warehouse getWarehouse(long warehouseID, final Session session)
			throws MissingWarehouse {
		final Warehouse warehouse = (Warehouse)session.get(Warehouse.class, warehouseID);
		if (warehouse == null) {
			throw new MissingWarehouse(warehouseID);
		}
		return warehouse;
	}

	private synchronized Session getSession() {
		final ApplicationContext appContext = ContextLoader.getCurrentWebApplicationContext();
		final SessionFactory factory = (SessionFactory)appContext.getBean("hibernateSessionFactory");
		return factory.getCurrentSession();
	}

}
