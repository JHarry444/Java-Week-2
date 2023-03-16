package poly;

import inheritance.Bird;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.Pet;

public class Demo {

	public static void main(String[] args) {
		Pet p = new Dog("Bernie", "St Bernard", "brown", 12);
		Pet p2 = new Cat("Tiddles", "Siamese", "Pink", 6);

		System.out.println("T/F? " + p.equals(new Dog("Bernie", "St Bernard", "brown", 12)));

		PetManager manager = new PetManager();

		manager.addPet(p);
		manager.addPet(p2);
		manager.addPet(new Bird());

		for (Pet pet : manager.getPets()) {
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				d.fetch();
				((Dog) pet).fetch();
			}
			System.out.println("CLASS: " + pet.getClass().getSimpleName());
			pet.makeNoise();
		}

		String petString = p.toString();
		System.out.println(petString);

		manager.remove(Dog.class);
		manager.remove("cat");
	}

}
