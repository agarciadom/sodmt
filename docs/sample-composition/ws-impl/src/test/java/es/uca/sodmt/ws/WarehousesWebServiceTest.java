package es.uca.sodmt.ws;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.uca.sodmt.ws.responses.WarehouseListResponse;

/**
 * Tests for the warehouse web service.
 *
 * @author Antonio García-Domínguez
 */
public class WarehousesWebServiceTest extends WebServiceTest {

	@Test
	public void listWarehouses() {
		final WarehouseListResponse response = warehouses.list();
		assertEquals(2, response.getItems().size());

		assertEquals("C/Chile", response.getItems().get(0).getAddress().getStreet());
		assertEquals("Rue del Percebe", response.getItems().get(1).getAddress().getStreet());
	}
}
