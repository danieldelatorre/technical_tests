package nl.oramon.reflection;

import junit.framework.TestCase;
import nl.oramon.reflection.cars.Broken;
import nl.oramon.reflection.cars.IQ;
import nl.oramon.reflection.cars.Prius;
import nl.oramon.reflection.cars.Verso;

/**
 * Test class for ToyotaFactory
 */
public class ToyotaFactoryTest extends TestCase {
	private ToyotaFactory toyotaFactory;

	protected void setUp() throws Exception {
		super.setUp();
		
		toyotaFactory = new ToyotaFactory();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Tests that built cars have the right type
	 */
	public void testCarType() {
		Object o = toyotaFactory.build(Prius.class);
		assertEquals(Prius.class, o.getClass());
	}
	
	/**
	 * Tests that built cars have all the parts on
	 */
	public void testParts() {
		Prius prius = (Prius) toyotaFactory.build(Prius.class);
		assertNotNull(prius.getWheel1());
		assertNotNull(prius.getEngine1());
		assertNotNull(prius.getEngine2());
		assertNotNull(prius.getSteeringWheel());
	}
	
	/**
	 * Tests building a new car
	 */
	public void testNewModel() {
		IQ iQ = (IQ) toyotaFactory.build(IQ.class);
		assertNotNull(iQ.getWheel0());
		assertNotNull(iQ.getWheel1());
		assertNotNull(iQ.getEngine());
		assertNotNull(iQ.getSteeringWheel());
	}
	
	/**
	 * Tests that only setXXX methods are called
	 */
	public void testOnlySettersAreCalled() {
		IQ iQ = (IQ) toyotaFactory.build(IQ.class);
		assertNull(iQ.getExtraWheel());
	}
	
	/**
	 * Tests that non-default constructor is called
	 */
	public void testConstructor() {
		Verso verso = (Verso) toyotaFactory.build(Verso.class);
		assertNotNull(verso.getWheel0());
		assertNotNull(verso.getWheel1());
		assertNotNull(verso.getEngine());
		assertNotNull(verso.getSteeringWheel());
	}
	
	/**
	 * Tests that checked exceptions are wrapped
	 */
	public void testException() {
		try {
			toyotaFactory.build(Broken.class);

			fail("Expected " + CarFactoryException.class.getSimpleName());
		} catch(CarFactoryException e) {
			// expected
		}
	}
}
