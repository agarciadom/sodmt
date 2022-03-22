package es.uca.sodmt.ws.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class JUL2SLF4JBridgeBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(JUL2SLF4JBridgeBean.class);

	public void install() {
		LOGGER.info("Installing JUL to SLFJ4 bridge");

		java.util.logging.Logger rootLogger = java.util.logging.Logger.getLogger("");
		rootLogger.setLevel(java.util.logging.Level.ALL);
		java.util.logging.Handler[] handlers = rootLogger.getHandlers();
		for (int i = 0; i < handlers.length; i++) {
			rootLogger.removeHandler(handlers[i]);
		}
		SLF4JBridgeHandler.install();
	}
}
