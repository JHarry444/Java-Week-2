package objects.sub;

public class Trainer {

	// instance variables
	private String name; // null

	private int age; // 0

	private String specialism; // null

	public Trainer(String name, int age, String specialism) {
		// this -> references the current object
		// this.name -> name from line 6
		this.name = name;
		this.age = age;
		this.specialism = specialism;
	}

	// overloaded constructor -> has different parameters
	public Trainer() {
	}

	public String introduce() {
		String intro = "Hello, my name is ";
		intro += this.name;
		intro += ". I am ";
		intro += this.age;
		intro += " years old and I specialise in ";
		intro += this.specialism;

		return intro;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 110)
			this.age = age;
		else
			System.out.println("Invalid age: " + age);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialism() {
		return this.specialism;
	}

	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

}
