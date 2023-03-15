package inheritance;

// Dog IS A Pet
public class Dog extends Pet {

	public Dog(String name, String breed, String colour, int age) {
		super(name, breed, colour, age);
	}

	public Dog() {
		super();
	}

	public void fetch() {
	}

	public void bark() {
		System.out.println("woof");
	}

}
