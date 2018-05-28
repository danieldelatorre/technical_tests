package nl.oramon.reflection;

import nl.oramon.reflection.cars.Fiesta;
import nl.oramon.reflection.cars.Focus;
import nl.oramon.reflection.parts.Engine;
import nl.oramon.reflection.parts.SteeringWheel;
import nl.oramon.reflection.parts.Wheel;

/**
 * This class builds Ford cars
 */
public class FordFactory {
	
	/**
	 * Builds a Focus
	 * @return a new Focus
	 */
	public Focus buildFocus() {
		Focus focus = new Focus();
		focus.setWheel0(new Wheel());
		focus.setWheel1(new Wheel());
		focus.setEngine(new Engine());
		focus.setSteeringWheel(new SteeringWheel());
		return focus;
	}
	
	/**
	 * Builds a Fiesta
	 * @return a new Fiesta
	 */
	public Fiesta buildFiesta() {
		Fiesta fiesta = new Fiesta();
		fiesta.setWheel0(new Wheel());
		fiesta.setWheel1(new Wheel());
		fiesta.setWheel2(new Wheel());
		fiesta.setEngine(new Engine());
		return fiesta;
	}
}
