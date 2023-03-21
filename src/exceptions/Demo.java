package exceptions;

import java.util.Scanner;

import inheritance.Dog;
import poly.PetManager;

public class Demo {

	public static void main(String[] args) throws PetNotFoundException {
		try (Scanner scan = new Scanner(System.in);) { // try-with-resources
//		Demo.main(null); stackoverflow
			PetManager manager = new PetManager();
			manager.addPet(new Dog("Rex", "G. Shepherd", null, 0));
			System.out.println("Enter name: ");
			String name = scan.nextLine();
//			try {
			manager.findName(null);
//			} catch (PetNotFoundException pnfe) {
//				System.out.println("Try again with a different name, you muppet");
//			} catch (Exception e) {
//				System.out.println("Something else has gone wrong");
//			}
		}
	}

}
