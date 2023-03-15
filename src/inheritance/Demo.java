package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	static List<Pet> pets = new ArrayList<>();

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Rex");
		d.setColour("Brown");
		d.setBreed("G Shepherd");
		d.setAge(14);

		Cat c = new Cat();
		d.setName("Jess");
		d.setColour("Black and white");
		d.setBreed("Minx");
		d.setAge(4);

		pets.add(d);
		pets.add(c);

		Pet d2 = d;
		d2.setName("Fido");
		d2.setBreed("Dalmation");
		d2.setColour("Black and white");
		d2.setAge(2);

		System.out.println(d2);

		System.out.println(d2.equals(d));

		Object[] objs = { 12, "twelve" };

		// autoboxed -> converts from primitive to wrapper
		Integer i = 12;

	}

	private static Pet find(String name) {
		for (Pet p : pets) {
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		return null;

	}

}
