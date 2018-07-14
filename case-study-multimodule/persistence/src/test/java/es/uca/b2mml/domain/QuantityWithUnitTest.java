package es.uca.b2mml.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.MathContext;

import javax.validation.constraints.AssertFalse;

import org.junit.Before;
import org.junit.Test;

public class QuantityWithUnitTest {

	private Unit uMeter;
	private Unit uDecimeter;
	private Unit uCentimeter;
	private Unit uKilometer;

	private Unit uLiter;

	private Unit uSecond;
	private Unit uMinute;
	private Unit uHour;

	private Unit uMeterPerSecond;
	private Unit uKilometerPerHour;
	private Unit uLiterPerSecond;

	private Unit uHertz;
	private Unit uTimesPerMinute;

	@Before
	public void initialize() {
		uMeter     = new Unit("m");
		uDecimeter = new Unit("dm", uMeter, new BigDecimal("0.1"));
		uCentimeter = new Unit("cm", uDecimeter, new BigDecimal("0.1"));
		uKilometer = new Unit("km", uMeter, new BigDecimal("1000"));

		uSecond = new Unit("s");
		uMinute = new Unit("min", uSecond, new BigDecimal("60"));
		uHour   = new Unit("h", uMinute, new BigDecimal("60"));
		uHertz = new Unit(null, uSecond);
		uTimesPerMinute = new Unit(null, uMinute);

		uLiter = new Unit("l");

		uMeterPerSecond = new Unit(uMeter, uSecond);
		uKilometerPerHour = new Unit(uKilometer, uHour);
		uLiterPerSecond = new Unit(uLiter, uSecond);
	}

	@Test
	public void compatibilityTests() {
		assertTrue(uMeter.isCompatibleWith(uDecimeter));
		assertTrue(uMeter.isCompatibleWith(uCentimeter));
		assertTrue(uMeter.isCompatibleWith(uKilometer));
		assertTrue(uCentimeter.isCompatibleWith(uKilometer));
		assertFalse(uMeter.isCompatibleWith(uLiter));

		assertTrue(uMeterPerSecond.isCompatibleWith(uKilometerPerHour));
		assertFalse(uMeterPerSecond.isCompatibleWith(uLiterPerSecond));

		assertTrue(uHertz.isCompatibleWith(uTimesPerMinute));
		assertFalse(uTimesPerMinute.isCompatibleWith(uLiterPerSecond));
	}

	@Test
	public void convertToSelf() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(2, uMeter);
		assertSame(qtyM, qtyM.convertTo(uMeter));
	}

	@Test
	public void convertAdimensionalToAdimensional() {
		final QuantityWithUnit qty = new QuantityWithUnit(3);
		assertSame(qty, qty.convertTo(null));
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void convertAdimensionalToDimensional() {
		final QuantityWithUnit qty = new QuantityWithUnit(3);
		assertSame(qty, qty.convertTo(uMeter));
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void convertDimensionalToAdimensional() {
		final QuantityWithUnit qty = new QuantityWithUnit(3, uLiter);
		assertSame(qty, qty.convertTo(null));
	}

	@Test
	public void convertMetersToKilometers() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(2000, uMeter);
		assertEquals(new BigDecimal("2"), qtyM.convertTo(uKilometer));
	}

	@Test
	public void convertKilometersToMeters() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(2, uKilometer);
		assertEquals(new BigDecimal("2000"), qtyM.convertTo(uMeter));
	}
	
	@Test
	public void convertMetersToDecimeters() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(2, uMeter);
		assertEquals(new BigDecimal("20"), qtyM.convertTo(uDecimeter));
	}

	@Test
	public void convertDecimetersToMeters() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(2, uDecimeter);
		assertEquals(new BigDecimal("0.2"), qtyM.convertTo(uMeter));
	}

	@Test
	public void convertCentimetersToMeters() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(200, uCentimeter);
		assertEquals(new BigDecimal("2"), qtyM.convertTo(uMeter));
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void convertIncompatibleUnits() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(3, uMeter);
		qtyM.convertTo(uLiter);
	}

	@Test
	public void convertMetersPerSecondToKilometersPerHour() {
		final QuantityWithUnit qtyMS = new QuantityWithUnit(10, uMeterPerSecond);
		assertEquals(new BigDecimal("36"), qtyMS.convertTo(uKilometerPerHour));
	}

	@Test
	public void convertKilometersPerHourToMetersPerSecond() {
		final QuantityWithUnit qtyMS = new QuantityWithUnit(36, uKilometerPerHour);
		assertEquals(new BigDecimal("10"), qtyMS.convertTo(uMeterPerSecond));
	}

	@Test
	public void convertIncompatibleUnitsFractionalToScalar() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(3, uMeterPerSecond);
		try {
			qtyM.convertTo(uLiter);
			fail("Expected an exception");
		} catch (IncompatibleUnitsException ex) {
			assertTrue(ex.getMessage().contains("fractional"));
		}
	}

	@Test
	public void convertIncompatibleUnitsScalarToFractional() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(3, uLiter);
		try {
			qtyM.convertTo(uMeterPerSecond);
			fail("Expected an exception");
		} catch (IncompatibleUnitsException ex) {
			assertTrue(ex.getMessage().contains("fractional"));
		}
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void convertIncompatibleUnitsFractionalToFractional() {
		final QuantityWithUnit qtyM = new QuantityWithUnit(3, uMeterPerSecond);
		qtyM.convertTo(uLiterPerSecond);
	}

	@Test
	public void addMetersToMeters() {
		final QuantityWithUnit l = new QuantityWithUnit(3, uMeter);
		final QuantityWithUnit sum = l.add(new QuantityWithUnit(1, uMeter));
		assertEquals(new BigDecimal("4"), sum);
	}

	@Test
	public void addDecimetersToMeters() {
		final QuantityWithUnit l = new QuantityWithUnit(3, uMeter);
		final QuantityWithUnit sum = l.add(new QuantityWithUnit(1, uDecimeter));
		assertEquals(new BigDecimal("3.1"), sum);
	}

	@Test
	public void addAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(3);
		final QuantityWithUnit sum = l.add(new QuantityWithUnit(1));
		assertEquals(new BigDecimal("4"), sum);
	}

	@Test
	public void subtractMetersPerSecondFromKilometersPerHour() {
		final QuantityWithUnit l = new QuantityWithUnit(80, uKilometerPerHour);
		final QuantityWithUnit result = l.subtract(new QuantityWithUnit(5, uMeterPerSecond));
		assertEquals(new BigDecimal("62"), result);
	}

	@Test
	public void subtractAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(80);
		final QuantityWithUnit result = l.subtract(new QuantityWithUnit(5));
		assertEquals(new BigDecimal("75"), result);
	}
	
	@Test
	public void compareDecimetersWithCentimetersEqual() {
		final QuantityWithUnit l = new QuantityWithUnit(23, uDecimeter);
	    org.junit.Assert.assertEquals(0, l.compareTo(new QuantityWithUnit(230, uCentimeter)));
	}

	@Test
	public void compareCentimetersWithMetersGreaterThan() {
		final QuantityWithUnit l = new QuantityWithUnit(230, uCentimeter);
	    org.junit.Assert.assertEquals(1, l.compareTo(new QuantityWithUnit(2, uMeter)));
	}
	
	@Test
	public void compareCentimetersWithMetersLessThan() {
		final QuantityWithUnit l = new QuantityWithUnit(2, uMeter);
	    org.junit.Assert.assertEquals(-1, l.compareTo(new QuantityWithUnit(230, uCentimeter)));
	}

	@Test
	public void compareHertzWithTimesPerMinute() {
		final QuantityWithUnit l = new QuantityWithUnit(1, uHertz);
	    org.junit.Assert.assertEquals(1, l.compareTo(new QuantityWithUnit(30, uTimesPerMinute)));
	    org.junit.Assert.assertEquals(0, l.compareTo(new QuantityWithUnit(60, uTimesPerMinute)));
	    org.junit.Assert.assertEquals(-1, l.compareTo(new QuantityWithUnit(61, uTimesPerMinute)));
	}
	
	@Test
	public void compareAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(2);
	    org.junit.Assert.assertEquals(1, l.compareTo(new QuantityWithUnit(1)));
	    org.junit.Assert.assertEquals(0, l.compareTo(new QuantityWithUnit(2)));
	    org.junit.Assert.assertEquals(-1, l.compareTo(new QuantityWithUnit(10)));
	}

	@Test
	public void multiplyHoursByKilometersPerHour() {
		final QuantityWithUnit l = new QuantityWithUnit(5, uHour);
		final QuantityWithUnit r = new QuantityWithUnit(10, uKilometerPerHour);
	    final QuantityWithUnit product = l.multiply(r);
		org.junit.Assert.assertEquals(new BigDecimal(50), product.getQuantityValue());
		org.junit.Assert.assertEquals(uKilometer.getRootName(), product.getQuantityUnit().getRootName());
	}

	@Test
	public void multiplyKilometersPerHourByHours() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uKilometerPerHour);
		final QuantityWithUnit r = new QuantityWithUnit(5, uHour);
	    final QuantityWithUnit product = l.multiply(r);
		org.junit.Assert.assertEquals(new BigDecimal(50), product.getQuantityValue());
		org.junit.Assert.assertEquals(uKilometer.getRootName(), product.getQuantityUnit().getRootName());
	}

	@Test
	public void multiplyKilometersPerHourByMinutes() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uKilometerPerHour);
		final QuantityWithUnit r = new QuantityWithUnit(30, uMinute);
	    final QuantityWithUnit product = l.multiply(r);
		org.junit.Assert.assertTrue(
			new BigDecimal("5").compareTo(product.getQuantityValue().round(MathContext.DECIMAL64)) == 0);
		org.junit.Assert.assertEquals(uKilometer.getRootName(), product.getQuantityUnit().getRootName());
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void multiplyKilometersPerHourByLiters() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uKilometerPerHour);
		final QuantityWithUnit r = new QuantityWithUnit(5, uLiter);
	    l.multiply(r);
	}

	@Test(expected=IncompatibleUnitsException.class)
	public void multiplyKilometersPerHourByMetersPerSecond() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uKilometerPerHour);
		final QuantityWithUnit r = new QuantityWithUnit(5, uMeterPerSecond);
	    l.multiply(r);
	}

	@Test
	public void multiplyAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(10);
		final QuantityWithUnit r = new QuantityWithUnit(5);
	    final QuantityWithUnit product = l.multiply(r);
		assertEquals(new BigDecimal(50), product);
		assertNull(product.getQuantityUnit());
	}

	@Test
	public void multiplyMetersByAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(10);
		final QuantityWithUnit r = new QuantityWithUnit(5, uMeter);
	    final QuantityWithUnit product = l.multiply(r);
		assertEquals(new BigDecimal(50), product);
		org.junit.Assert.assertEquals(uMeter.getRootName(), product.getQuantityUnit().getRootName());
	}
	
	@Test
	public void multiplyAdimensionalByMeters() {
		final QuantityWithUnit r = new QuantityWithUnit(10);
		final QuantityWithUnit l = new QuantityWithUnit(5, uMeter);
	    final QuantityWithUnit product = l.multiply(r);
		assertEquals(new BigDecimal(50), product);
		org.junit.Assert.assertEquals(uMeter.getRootName(), product.getQuantityUnit().getRootName());
	}

	@Test
	public void multiplySecondsByHertz() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uSecond);
		final QuantityWithUnit r = new QuantityWithUnit(34, uHertz);
		final QuantityWithUnit product = l.multiply(r);
		assertEquals(new BigDecimal(340), product);
		assertNull(product.getQuantityUnit());
	}

	@Test
	public void multiplyMetersByHertz() {
		final QuantityWithUnit l = new QuantityWithUnit(10, uMeter);
		final QuantityWithUnit r = new QuantityWithUnit(2, uHertz);
		final QuantityWithUnit product = l.multiply(r);
		assertEquals(new BigDecimal(20), product);
		org.junit.Assert.assertEquals("m/s", product.getQuantityUnit().getRootName());
	}

	@Test
	public void divideAdimensionals() {
		final QuantityWithUnit l = new QuantityWithUnit(3);
		final QuantityWithUnit r = new QuantityWithUnit(2);
		final QuantityWithUnit result = l.divide(r);
		assertEquals(new BigDecimal("1.5"), result);
		assertNull(result.getQuantityUnit());
	}

	@Test
	public void divideDimensionalByAdimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(4, uLiter);
		final QuantityWithUnit r = new QuantityWithUnit(2);
		final QuantityWithUnit result = l.divide(r);
		assertEquals(new BigDecimal("2"), result);
		org.junit.Assert.assertEquals(uLiter.getRootName(), result.getQuantityUnit().getRootName());
	}

	@Test
	public void divideAdimensionalByDimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(2);
		final QuantityWithUnit r = new QuantityWithUnit(10, uSecond);
		final QuantityWithUnit result = l.divide(r);
		assertEquals(new BigDecimal("0.2"), result);
		org.junit.Assert.assertEquals("/s", result.getQuantityUnit().getRootName());
		org.junit.Assert.assertEquals("/s", uHertz.getRootName());
	}

	@Test
	public void divideDimensionalByDimensional() {
		final QuantityWithUnit l = new QuantityWithUnit(3, uKilometer);
		final QuantityWithUnit r = new QuantityWithUnit(10, uCentimeter);
		final QuantityWithUnit result = l.divide(r);

		assertEquals(new BigDecimal("30000"), result);
		assertNull(result.getQuantityUnit());
	}

	@Test
	public void divideKilometersByHours() {
		final QuantityWithUnit l = new QuantityWithUnit(50, uKilometer);
		final QuantityWithUnit r = new QuantityWithUnit(10, uHour);
		final QuantityWithUnit result = l.divide(r);
		assertEquals(new BigDecimal(5), result);
		org.junit.Assert.assertEquals(uKilometerPerHour.getRootName(), result.getQuantityUnit().getRootName());
	}

	private void assertEquals(BigDecimal expected, QuantityWithUnit actual) {
		final BigDecimal actualValue = actual.getQuantityValue();
		assertTrue(actualValue + " should be equal to " + expected, expected.compareTo(actualValue) == 0);
	}
}
