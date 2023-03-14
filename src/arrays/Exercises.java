package arrays;

public class Exercises {

	private static String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
	private static String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public static void main(String[] args) {
		numbers1(74);
//		for (int i = 1; i < 100; i++)
//			System.out.println(numbers2(i));
		for (int i = 1; i < 1000; i++)
			System.out.println(numbers3(i));
	}

	public static void numbers1(int num) {
		int tens = num / 10;
		int units = num % 10;

		System.out.println("Tens: " + tens);
		System.out.println("Units: " + units);
	}

	public static String numbers2(int num) {
		if (num < 20)
			return units[num];
		String output = "";
		output += tens[num / 10];
		int unit = num % 10;
		if (unit > 0)
			output += "-" + units[unit];
		return output;
	}

	public static String numbers3(int num) {
		String output = "";
		int hundreds = num / 100;
		if (hundreds > 0)
			output += units[hundreds] + "-hundred";
		int tensUnits = num % 100;
		if (hundreds > 0 && tensUnits > 0)
			output += " and ";
		if (tensUnits > 0) {
			output += numbers2(tensUnits);
		}

		return output;
	}

}
