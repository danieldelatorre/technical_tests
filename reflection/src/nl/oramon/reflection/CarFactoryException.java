package nl.oramon.reflection;

/**
 * Wraps exceptions that occur in a car factory.
 */
public class CarFactoryException extends RuntimeException {

	private static final long serialVersionUID = -2963380391875625877L;

	/**
	 * Can only be instantiated supplying the cause
	 * @param message detail message 
	 * @param cause the cause
	 */
	public CarFactoryException(String message, Throwable cause) {
		super(message, cause);
	}
}
