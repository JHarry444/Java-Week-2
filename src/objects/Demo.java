package objects;

import objects.sub.Trainer;

//import objects.sub.Trainer;

public class Demo {

	public static void main(String[] args) {
//		objects.sub.Trainer t1 = new objects.sub.Trainer("JH", 28, "Software");

		Trainer t1 = new Trainer("JH", 28, "Software");
//		t1.name = "JH";
//		t1.age = 28;
//		t1.specialism = "Software";

		System.out.println("Hello, my name is " + t1.name + ". I am " + t1.age + " years old and I specialise in "
				+ t1.specialism);

		Trainer t2 = new Trainer("TC", 28, "DevOps");
//		t2.name = "TC";
//		t2.age = 23;
//		t2.specialism = "DevOps";

		System.out.println("Hello, my name is " + t2.name + ". I am " + t2.age + " years old and I specialise in "
				+ t2.specialism);
	}

}
