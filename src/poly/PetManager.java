package poly;

import java.util.ArrayList;
import java.util.List;

import exceptions.PetNotFoundException;
import inheritance.Pet;

public class PetManager {

	private List<Pet> pets = new ArrayList<>();

	public boolean addPet(Pet p) {
		return this.pets.add(p);
	}

	public Pet findName(String name) throws PetNotFoundException {
		for (Pet p : this.pets) {
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		throw new PetNotFoundException("No pet found with name: " + name);
	}

	public void remove(String type) {
		List<Pet> toRemove = new ArrayList<>();
		for (Pet p : new ArrayList<>(this.pets)) {
			if (p.getClass().getSimpleName().equalsIgnoreCase(type))
				toRemove.add(p);
		}

		this.pets.removeAll(toRemove);
	}

	public void remove(Class<?> clazz) {
		for (Pet p : new ArrayList<>(this.pets)) {
			if (p.getClass() == clazz)
				this.pets.remove(p);
		}
	}

	public List<Pet> getPets() {
		return this.pets;
	}

}
