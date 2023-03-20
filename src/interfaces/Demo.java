package interfaces;

import java.util.LinkedList;
import java.util.List;

import inheritance.FlyingBird;
import interfaces.vehicle.Flyable;
import interfaces.vehicle.Plane;

public class Demo {

	public static void main(String[] args) {
		List<Flyable> flying = new LinkedList<>();

		flying.add(new FlyingBird());
		flying.add(new Plane(3, "White with polka dots"));

		for (Flyable f : flying) {
			f.fly();
		}

//		flying.trimToSize();
	}
}
