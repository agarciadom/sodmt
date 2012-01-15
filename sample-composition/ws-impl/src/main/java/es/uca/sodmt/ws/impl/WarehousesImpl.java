package es.uca.sodmt.ws.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
public class WarehousesImpl extends AbstractServiceImpl implements Warehouses {

	@Override
	public WarehouseAddResponse add(WarehouseAddRequest r) {
		final Warehouse w = new Warehouse();
		w.setAddress(w.getAddress());

		final Session session = getSession();
		final Transaction t = session.beginTransaction();
		session.persist(w);
		t.commit();

		return new WarehouseAddResponse(w);
	}

	@SuppressWarnings("unchecked")
	@Override
	public WarehouseListResponse list() {
		final Session session = getSession();

		final Transaction t = session.beginTransaction();
		final List<Warehouse> warehouses = session.createCriteria(Warehouse.class).list();
		WarehouseListResponse response = new WarehouseListResponse(warehouses);
		t.commit();

		return response;
	}

	@Override
	public WarehouseQueryResponse query(long warehouseID) throws MissingWarehouse {
		final Session session = getSession();

		final Transaction t = session.beginTransaction();
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		WarehouseQueryResponse response = new WarehouseQueryResponse(warehouse);
		t.commit();

		return response;
	}

	@Override
	public WarehouseItemStockResponse changeStock(long warehouseID,
			long articleID, BigDecimal amount) throws MissingWarehouse,
			MissingArticle, InvalidAmount, NotEnoughStock
	{
		final Session session = getSession();
		final Transaction t = session.beginTransaction();

		// Check that the warehouse and the article exist
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		final Article article = getArticle(articleID, session);
		final StockItem sItem = getStockItem(warehouse, article, session);

		// If removing stock, check that we have enough
		if (amount.compareTo(BigDecimal.ZERO) < 0 && sItem.getQuantity().compareTo(amount.negate()) < 0) {
			throw new NotEnoughStock(warehouse, article, sItem.getQuantity(), amount.negate());
		}

		// Perform the update
		sItem.setQuantity(sItem.getQuantity().add(amount));
		if (sItem.getQuantity().compareTo(BigDecimal.ZERO) > 0) {
			warehouse.addStockItem(sItem);
			session.saveOrUpdate(sItem);
		}
		else {
			warehouse.getStockItems().remove(sItem);
		}
		WarehouseItemStockResponse response = new WarehouseItemStockResponse(sItem);

		t.commit();
		return response;
	}

	@Override
	public WarehouseItemStockResponse queryStock(long warehouseID,
			long articleID) throws MissingWarehouse, MissingArticle
	{
		final Session session = getSession();
		final Transaction t = session.beginTransaction();

		final Warehouse warehouse = getWarehouse(warehouseID, session);
		final Article article = getArticle(articleID, session);
		final StockItem sItem = getStockItem(warehouse, article, session);
		WarehouseItemStockResponse response = new WarehouseItemStockResponse(sItem);

		t.commit();
		return response;
	}

	@Override
	public WarehouseItemsResponse listStock(long warehouseID) throws MissingWarehouse {
		final Session session = getSession();
		final Transaction t = session.beginTransaction();
		final Warehouse warehouse = getWarehouse(warehouseID, session);
		WarehouseItemsResponse response = new WarehouseItemsResponse(warehouse);
		t.commit();

		return response;
	}

}
