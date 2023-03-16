package inheritance;

public abstract class Pet extends Object {

	private String name;
	private String breed;
	private String colour;
	private int age;

	public Pet(String name, String breed, String colour, int age) {
		super();
		this.setName(name);
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}

	public Pet() {
		super();
	}

	public abstract void makeNoise();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [name=" + this.name + ", breed=" + this.breed + ", colour=" + this.colour + ", age=" + this.age
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.breed == null) ? 0 : this.breed.hashCode());
		result = prime * result + ((this.colour == null) ? 0 : this.colour.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // are they the same object?
		if (obj == null)
			return false; // is one null?
		if (getClass() != obj.getClass())
			return false; // is it a different class?
		Pet other = (Pet) obj;
		if (this.age != other.age) // compares the fields
			return false;
		if (this.breed == null) {
			if (other.breed != null)
				return false;
		} else if (!this.breed.equals(other.breed))
			return false;
		if (this.colour == null) {
			if (other.colour != null)
				return false;
		} else if (!this.colour.equals(other.colour))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;
	}

}
