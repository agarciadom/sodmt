package es.uca.sodmt.ws;

import java.math.BigDecimal;

import javax.jws.WebParam;
import javax.jws.WebService;

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

@WebService
public interface Warehouses {

	WarehouseAddResponse add(WarehouseAddRequest r);

	WarehouseListResponse list();

	WarehouseQueryResponse query(@WebParam(name="warehouseID") long warehouseID)
			throws MissingWarehouse;

	WarehouseItemStockResponse changeStock(
		@WebParam(name="warehouseID") long warehouseID,
		@WebParam(name="articleID") long articleID,
		@WebParam(name="amount") BigDecimal amount)
			throws MissingWarehouse, MissingArticle, InvalidAmount, NotEnoughStock;

	WarehouseItemStockResponse queryStock(
		@WebParam(name="warehouseID") long warehouseID,
		@WebParam(name="articleID") long articleID)
			throws MissingWarehouse, MissingArticle;

	WarehouseItemsResponse listStock(
		@WebParam(name="warehouseID") long warehouseID)
			throws MissingWarehouse;
}
