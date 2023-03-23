package generics;

import inheritance.Pet;

public class GenericCage<T extends Pet> {

	private T pet;

	public T getPet() {
		return this.pet;
	}

	public void setPet(T pet) {
		this.pet = pet;
	}

}
