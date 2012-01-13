package es.uca.sodmt.ws;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.After;
import org.junit.Before;

import es.uca.sodmt.SampleContents;

public class WebServiceTest {

	private Server server;
	protected Orders client;
	private final Class<?> serviceClass;
	private final String serverPath;

	private static int port = 9000;

	public WebServiceTest(Class<?> serviceClass, String serverPath) {
		this.serviceClass = serviceClass;
		this.serverPath = serverPath;
	}

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
		new SampleContents().createContents();

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(serviceClass);
		factory.setAddress("http://localhost:" + port + serverPath);
		client = (Orders)factory.create();
	}

	@After
	public void teardown() throws Exception {
		server.stop();
		server.join();

		// Start the next time on a different port, to avoid having overlapping ports between tests
		port++;
	}

}