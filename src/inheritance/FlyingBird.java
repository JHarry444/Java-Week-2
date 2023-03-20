package inheritance;

import interfaces.vehicle.Flyable;

public class FlyingBird extends Bird implements Flyable {

	public FlyingBird(String name, String breed, String colour, int age) {
		super(name, breed, colour, age);
	}

	public FlyingBird() {
	}

	@Override
	public void fly() {
		System.out.println("flap flap");
	}

}
