package strings;

public class Demo {

	public static void main(String[] args) {
		String me = "JH"; // string literal
		String notMe = new String("Tom");

		System.out.println("Literals:");
		System.out.println("JH" == "JH");
		System.out.println("new vs literal:");
		System.out.println(new String("JH") == "JH");
		System.out.println("generated vs literal:");
		System.out.println("jh".toUpperCase() == "JH");
		System.out.println(".equals()");
		System.out.println("jh".toUpperCase().equals("JH"));

		String s = "Hello, my name is Jordan!";

		s += " And I am 28 years old.";

		System.out.println(s);

		String formatted = String.format("Hello, my name is %s and I am %d years old", "Jordan", 28);
		System.out.println(formatted);

		System.out.println(s.substring(0, 5));
		System.out.println(s.substring(s.indexOf(",")));

		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("old."));
		System.out.println(s.contains("Jordan"));

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));

		System.out.println("   yo   ".trim());

		String[] split = s.split(" ");
		for (String splitted : split)
			System.out.println(splitted);

		System.out.println(s);
		System.out.println(s.replaceAll(" ", " - "));
		System.out.println(s);

		System.out.println("How do i write a \"quote\"");

		System.out.println("C:\\users\\jharry");

		System.out.print("How do i write \r\n on multiple lines");

	}
}
