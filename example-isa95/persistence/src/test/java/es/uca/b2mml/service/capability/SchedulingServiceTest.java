package es.uca.b2mml.service.capability;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import es.uca.b2mml.domain.capability.ProductionCapability;
import es.uca.b2mml.domain.product.ProductProductionRule;

@ContextConfiguration("/testContext-with-duplicates.xml")
public class SchedulingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Test
	public void checkDuplicatesArePresent() {
		assertEquals(1 + 31, ProductionCapability.countProductionCapabilities());
	}

	@Test
	public void findProductRuleById_exists() {
		final ProductProductionRule rule = ProductProductionRule.findById("PPR-RL2");
		assertEquals(7, rule.getSegments().size());
	}

	@Test
	public void earlySchedule() {
		
	}
}
