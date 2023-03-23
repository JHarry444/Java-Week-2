package lambda;

import java.util.Scanner;

public class UserInput {

	private Scanner scan = new Scanner(System.in);

	public String getString(Validator v) {
		String s = "";
		do {
			s = this.scan.nextLine();
		} while (!v.isValid(s));

		return s;
	}
}
