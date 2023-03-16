package inheritance;

public class Bird extends Pet {

	public Bird(String name, String breed, String colour, int age) {
		super(name, breed, colour, age);
		// TODO Auto-generated constructor stub
	}

	public Bird() {
		// TODO Auto-generated constructor stub
	}

	@Override // annotation -> flags to java that the method should override one from a super
				// class
	public void makeNoise() {
		System.out.println("Cheep Cheep");
	}

}
