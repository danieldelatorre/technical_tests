package nl.oramon.reflection;

import junit.framework.TestCase;
import nl.oramon.reflection.cars.Fiesta;
import nl.oramon.reflection.cars.Focus;

/**
 * Test class for FordFactory
 */
public class FordFactoryTest extends TestCase {
	private FordFactory fordFactory;

	protected void setUp() throws Exception {
		super.setUp();
		
		fordFactory = new FordFactory();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Tests that a Focus is built with all parts on
	 */
	public void testBuildFocus() {
		Focus focus = fordFactory.buildFocus();
		assertNotNull(focus.getWheel0());
		assertNotNull(focus.getWheel1());
		assertNotNull(focus.getEngine());
		assertNotNull(focus.getSteeringWheel());
	}
	
	/**
	 * Tests that a Fiesta is built with all parts on
	 */
	public void testBuildFiesta() {
		Fiesta fiesta = fordFactory.buildFiesta();
		assertNotNull(fiesta.getWheel0());
		assertNotNull(fiesta.getWheel1());
		assertNotNull(fiesta.getWheel2());
		assertNotNull(fiesta.getEngine());
	}
}
