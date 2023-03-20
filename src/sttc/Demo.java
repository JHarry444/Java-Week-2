package sttc;

import sttc.Person.PersonBuilder;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Math.PI);

		Person p1 = new Person("JH", 28);
		Person p2 = new Person("TC", 22);
		Person p3 = new Person("AM", 23);

//		System.out.println(p1.latinName);
//		System.out.println(p2.latinName);
//		System.out.println(p3.latinName);
//
//		Person.latinName = "Homo Sapiens"; // correct
//
//		System.out.println(p1.latinName);
//		System.out.println(p2.latinName);
//		System.out.println(p3.latinName);

		PersonBuilder builder = new PersonBuilder();

		Person p = builder.name("JH").age(28).build();
	}

}
