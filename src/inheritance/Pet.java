package inheritance;

public class Pet extends Object {

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
		// TODO Auto-generated constructor stub
	}

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

}
