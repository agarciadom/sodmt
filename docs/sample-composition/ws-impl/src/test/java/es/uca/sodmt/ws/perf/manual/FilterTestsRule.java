package es.uca.sodmt.ws.perf.manual;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assume;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class FilterTestsRule implements MethodRule {
	private HashSet<String> acceptedTests;

	public FilterTestsRule(String... tests) {
		acceptedTests = new HashSet<String>(Arrays.asList(tests));
	}

	@Override
	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		// TODO: do not exclude tests manually added into the generated test suite
		if (!acceptedTests.contains(method.getName())) {
			Assume.assumeTrue(false);
		}
		return base;
	}
}
