package nl.oramon.reflection.cars;

/**
 * A broken Toyota model for testing exceptions
 */
public class Broken {
	public Broken() {
		throw new RuntimeException("broken");
	}
}
