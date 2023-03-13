package iteration;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("2x table:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
		}
		System.out.println("Count down from 10:");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("3x table:");
		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}
		// creates a Scanner
		// scanner is basically input() from python
		Scanner scan = new Scanner(System.in);

		int input = -1;
		// looking for a number from 1 -> 10
		do {
			System.out.println("Enter a number from 1 to 10:");
			input = scan.nextInt();
		} while (!(input >= 1 && input <= 10));

		System.out.println("You entered: " + input);

		scan.close();
	}

}
