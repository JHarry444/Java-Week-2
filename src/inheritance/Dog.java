package inheritance;

// Dog IS A Pet
public class Dog extends Pet {

	public Dog(String name, String breed, String colour, int age) {
		super(name, breed, colour, age);

		System.out.println(this.getName());
	}

	public Dog() {
		super();
	}

	public void fetch() {
		System.out.println("Good boi!");
	}

	@Override
	public void makeNoise() {
		System.out.println("borf");
	}

	@Override
	public String toString() {
		return "Dob, btw: " + super.toString();
	}

}
