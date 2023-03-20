package sttc;

public class Person {

	private static String latinName = "Homo Sapien";

	private String name;

	private int age;

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
