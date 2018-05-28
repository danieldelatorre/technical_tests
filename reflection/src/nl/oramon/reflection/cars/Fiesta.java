package nl.oramon.reflection.cars;

import nl.oramon.reflection.parts.Engine;
import nl.oramon.reflection.parts.Wheel;

/**
 * A Ford Fiesta car
 */
public class Fiesta {
	private Wheel wheel0;
	private Wheel wheel1;
	private Wheel wheel2;
	private Engine engine;
	public Wheel getWheel0() {
		return wheel0;
	}
	public void setWheel0(Wheel wheel) {
		this.wheel0 = wheel;
	}
	public Wheel getWheel1() {
		return wheel1;
	}
	public void setWheel1(Wheel wheel) {
		this.wheel1 = wheel;
	}
	public Wheel getWheel2() {
		return wheel2;
	}
	public void setWheel2(Wheel wheel) {
		this.wheel2 = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
