package inheritance;

// Cat IS A Pet
public class Cat extends Pet {

	public Cat(String name, String breed, String colour, int age) {
		super(name, breed, colour, age);
	}

	public Cat() {
		super();
	}

	public void sleep() {

	}

	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}

}
