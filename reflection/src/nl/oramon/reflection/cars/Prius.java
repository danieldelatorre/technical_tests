package nl.oramon.reflection.cars;

import nl.oramon.reflection.parts.Engine;
import nl.oramon.reflection.parts.SteeringWheel;
import nl.oramon.reflection.parts.Wheel;

/**
 * A Toyota Prius car
 */
public class Prius {
	private Wheel wheel1;
	private Engine engine1;
	private Engine engine2;
	private SteeringWheel steeringWheel;
	public Wheel getWheel1() {
		return wheel1;
	}
	public void setWheel1(Wheel wheel1) {
		this.wheel1 = wheel1;
	}
	public Engine getEngine1() {
		return engine1;
	}
	public void setEngine1(Engine engine1) {
		this.engine1 = engine1;
	}
	public Engine getEngine2() {
		return engine2;
	}
	public void setEngine2(Engine engine2) {
		this.engine2 = engine2;
	}
	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}
	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
}
