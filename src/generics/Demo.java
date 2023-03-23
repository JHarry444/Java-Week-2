package generics;

import java.util.ArrayList;
import java.util.List;

import inheritance.Bird;
import inheritance.Dog;

public class Demo {

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();

		Object d = dogs.get(0);

		List<Integer> nums = new ArrayList<>();

		Integer i = nums.get(0);

		Cage c = new Cage();

		c.setPet(new Dog());
		Dog d2 = (Dog) c.getPet();

		GenericCage<Dog> kennel = new GenericCage<>();

		kennel.setPet(new Dog());
//		kennel.setPet(new Bird());
		Dog d3 = kennel.getPet();

		GenericCage<Bird> birdCage = new GenericCage<>();

//		birdCage.setPet(new Dog());
		birdCage.setPet(new Bird());
		Bird b = birdCage.getPet();

	}

}
