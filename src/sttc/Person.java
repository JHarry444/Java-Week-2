package sttc;

public class Person {

	public static class PersonBuilder {
		private Person instance;

		public PersonBuilder() {
			this.instance = new Person();
		}

		public PersonBuilder name(String name) {
			this.instance.setName(name);
			return this;
		}

		public PersonBuilder age(int age) {
			this.instance.setAge(age);
			return this;
		}

		public Person build() {
			return this.instance;
		}

	}

	private static String latinName = "Homo Sapien";

	private String name;

	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static String getLatinName() {
		return latinName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
