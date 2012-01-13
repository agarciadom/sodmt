package es.uca.sodmt.ws;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import es.uca.sodmt.ws.responses.OrderListResponse;

public class OrderWebServiceTest extends WebServiceTest {

	public OrderWebServiceTest() {
		super(Orders.class, "/orders");
	}

	@Test
	public void listOrders() {
		OrderListResponse results = client.list();
		assertThat(results.getOrderIds().size(), is(equalTo(1)));
	}

	@Test
	public void listOrders2() {
		OrderListResponse results = client.list();
		assertThat(results.getOrderIds().size(), is(equalTo(1)));
	}
}
