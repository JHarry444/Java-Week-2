package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		System.out.println(names.size());
		names.add("Jordan");
		System.out.println(names.size());
		names.add("Tom");
		System.out.println(names.size());
		names.add("Andrew");
		System.out.println(names.size());

		System.out.println("First: " + names.get(0));
		System.out.println("Last: " + names.get(names.size() - 1));

		System.out.println(names);

		names.remove(1);
		System.out.println(names);
		names.remove("Andrew");
		System.out.println(names);

		System.out.println(names.contains("Andrew"));

		System.out.println("Index: " + names.indexOf("Andrew"));
		System.out.println("Index: " + names.indexOf("Jordan"));

		names.add("Morgan");
		names.add("Aswene");
		names.add("Ed");
		names.add("Dale");

		System.out.println(names);

		Collections.sort(names);

		System.out.println(names);

		Collections.reverse(names);

		System.out.println(names);

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println("I: " + i + " Name: " + name);
		}

		for (String name : names) {
			System.out.println(name);
//			names.remove(name); BREAKS
		}

//		List<String> initials = List.of("JH", "TC", "AM"); //pre-populated but immutable
//		initials.add("PB");

		ArrayList<String> initials = new ArrayList<>(List.of("JH", "TC", "AM")); // pre-populated and immutable

		List<Integer> oneToHundred = IntStream.range(1, 101).boxed().collect(Collectors.toList());
	}

}
