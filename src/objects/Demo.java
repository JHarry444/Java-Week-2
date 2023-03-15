package objects;

import objects.sub.Trainer;
import objects.sub.TrainerManager;

//import objects.sub.Trainer;

public class Demo {

	public static void main(String[] args) {
//		objects.sub.Trainer t1 = new objects.sub.Trainer("JH", 28, "Software");

		Trainer t1 = new Trainer("JH", 28, "Software");
//		t1.name = "JH";
//		t1.age = 28;
//		t1.specialism = "Software";

		System.out.println(t1.introduce());

		Trainer t2 = new Trainer("TC", 28, "DevOps");
//		t2.name = "TC";
//		t2.age = 23;
//		t2.specialism = "DevOps";

		System.out.println(t2.introduce());

		Trainer t3 = new Trainer();
		System.out.println(t3.introduce());

		TrainerManager manager = new TrainerManager();
		manager.trainers.add(t1);
		manager.trainers.add(t2);
		manager.trainers.add(t3);

		System.out.println("Manager:");
		manager.introduceAll();

		Trainer found = manager.find("JH");
		System.out.println("FOUND: " + found.introduce());

		Trainer t4 = new Trainer();
		t4.setAge(Byte.MIN_VALUE);
		System.out.println(t4.getAge());
		System.out.println(t4.introduce());
	}

}
