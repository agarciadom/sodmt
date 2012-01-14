package es.uca.sodmt.ws;

import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.After;
import org.junit.Before;

import es.uca.sodmt.SampleContents;

public class WebServiceTest {

	protected Orders orders;
	protected Warehouses warehouses;
	protected Invoices invoices;

	private static int port = 9000;

	private Server server;
	private SampleContents contents;

	@Before
	public void setup() throws Exception {
		server = new Server(port);
		WebAppContext context = new WebAppContext();
		context.setServer(server);
		context.setContextPath("/");
		context.setResourceBase("src/main/webapp");
		server.setHandler(context);
		server.start();

		// Populate the BD
		contents = new SampleContents();
		contents.createContents();

		// Create the service clients
		orders = createProxy(Orders.class, "/orders");
		warehouses = createProxy(Warehouses.class, "/warehouses");
		invoices = createProxy(Invoices.class, "/invoices");
	}

	@After
	public void teardown() throws Exception {
		server.stop();
		server.join();

		// Start the next time on a different port, to avoid having overlapping ports between tests
		port++;
	}

	protected SampleContents getDBContents() {
		return contents;
	}

	private <T> T createProxy(final Class<T> serviceClass, final String serverPath) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(serviceClass);
		factory.setAddress("http://localhost:" + port + serverPath);
		return serviceClass.cast(factory.create());
	}

	protected void assertEqualBigDecimals(BigDecimal expected, BigDecimal obtained) {
		if (expected.compareTo(obtained) != 0) {
			fail("Expected " + expected + ", got " + obtained);
		}
	}
}