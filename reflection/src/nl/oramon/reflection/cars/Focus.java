package nl.oramon.reflection.cars;

import nl.oramon.reflection.parts.Engine;
import nl.oramon.reflection.parts.SteeringWheel;
import nl.oramon.reflection.parts.Wheel;

/**
 * A Ford Focus car
 */
public class Focus {
	private Wheel wheel0;
	private Wheel wheel1;
	private Engine engine;
	private SteeringWheel steeringWheel;

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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}
	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
}
