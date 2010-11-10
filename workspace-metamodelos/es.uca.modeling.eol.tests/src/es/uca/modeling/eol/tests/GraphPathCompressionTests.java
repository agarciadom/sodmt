package es.uca.modeling.eol.tests;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.EolOperation;
import org.eclipse.epsilon.eol.execute.context.EolContext;
import org.eclipse.epsilon.eol.types.EolSequence;
import org.junit.Test;

/**
 * Tests for the graph path compression algorithm.
 *
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class GraphPathCompressionTests {

	@Test
	public void emptyGraphIsCompressedToSingleNodeSequence() throws URISyntaxException, Exception {
		// Load the script (because we're in a fragment of the main plugin, YES, WE CAN)
		URI uri = getClass().getResource("/wizards/time_limits.eol").toURI();
		EolModule module = new EolModule();
		module.parse(uri);

		// Run an operation
		EolOperation op = module.getOperations().getOperation("getRestrictedNodes");
		EolContext ctx = new EolContext();
		ctx.setModule(module);
		ArrayList<Object> args = new ArrayList<Object>(Arrays.asList(new Object[]{new EolSequence(), Integer.valueOf(0)} ));
		EolSequence result = (EolSequence)op.execute(null, args, ctx);

		// Print the result
		assertEquals("Sequence is empty", 0, result.size());
	}
}
