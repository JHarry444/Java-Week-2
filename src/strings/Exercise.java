package strings;

public class Exercise {

	public static void main(String[] args) {
		System.out.println(contains("hydrocarbon", "car"));

		System.out.println(contains("jordan", "j"));

		System.out.println(contains("tom", "c"));
	}

	public static boolean contains(String message, String find) {
		if (message == null || find == null || message.isBlank() || find.isBlank() || find.length() > message.length())
			return false;

		for (int i = 0; i < message.length() - (find.length() - 1); i++) {
			String sub = message.substring(i, i + find.length());
			if (sub.equals(find))
				return true;
		}
		return false;
	}
}
