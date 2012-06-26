package es.uca.sodmt.ws.perf.manual;

import org.junit.Assume;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

final class FilterByClassRule implements MethodRule {
	private final Class<?> klazz;

	public FilterByClassRule(Class<?> klazz) {
		this.klazz = klazz;
	}

	@Override
	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		if (method.getMethod().getDeclaringClass() == klazz) {
			return base;
		}
		else {
			Assume.assumeTrue(false);
			return null;
		}
	}
}