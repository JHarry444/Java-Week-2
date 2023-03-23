package lambda;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Function print = new Function() {

			@Override
			public void exec(Object o) {
				System.out.println(o);
			}
		};

		print.exec("Hello");

		Function lambdaPrint = o -> System.out.println(o);
		lambdaPrint.exec(", World!");

		List.of(1, 2, 3, 4, 5, 6).forEach(num -> System.out.println(num));

		UserInput ui = new UserInput();
		System.out.println("What's ya name:");
//		String name = ui.getString(new LengthValidator());
//		String name = ui.getString(new Validator() {
//			@Override
//			public boolean isValid(String s) {
//				return s.length() >= 6;
//			}
//		});

		String name = ui.getString(s -> s.contains("@"));
		System.out.println("NAME: " + name);

	}

}
