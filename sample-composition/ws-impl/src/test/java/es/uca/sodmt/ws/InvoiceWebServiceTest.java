package es.uca.sodmt.ws;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import es.uca.sodmt.ws.faults.OrderRejected;
import es.uca.sodmt.ws.responses.InvoiceGenerateResponse;

public class InvoiceWebServiceTest extends WebServiceTest {

	@Test
	public void doPayment() throws Exception {
		final long orderID = getDBContents().getAcceptedOpenOrder().getId();

		InvoiceGenerateResponse response = invoices.generate(orderID);
		assertEqualBigDecimals(BigDecimal.valueOf(15L), response.getTotal());
		assertFalse(invoices.query(orderID).isPaid());

		invoices.pay(orderID);
		assertTrue(invoices.query(orderID).isPaid());
	}

	@Test(expected=OrderRejected.class)
	public void doPaymentRejected() throws Exception {
		final long orderID = getDBContents().getRejectedOpenOrder().getId();
		invoices.generate(orderID);
	}
}
