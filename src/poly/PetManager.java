package poly;

import java.util.ArrayList;
import java.util.List;

import inheritance.Pet;

public class PetManager {

	private List<Pet> pets = new ArrayList<>();

	public boolean addPet(Pet p) {
		return this.pets.add(p);
	}

	public Pet findName(String name) {
		for (Pet p : this.pets) {
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		return null;
	}

	public List<Pet> getPets() {
		return this.pets;
	}

}
