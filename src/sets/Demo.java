package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import objects.sub.Trainer;

public class Demo {

	public static void main(String[] args) {
		Set<String> strings = new HashSet<>();

		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("C");
		strings.add("D");

		for (String s : strings) {
			System.out.println(s);
		}

		Set<Trainer> trainers = new HashSet<>();

		Trainer trainer = new Trainer("A", "JH", 28, "Software");
		trainers.add(trainer);
		trainers.add(trainer);
		trainers.add(new Trainer("A", "JH", 28, "Software"));
		trainers.add(new Trainer("A", "JH", 28, "Software"));

		for (Trainer t : trainers)
			System.out.println(t);

		Map<String, Trainer> map = new HashMap<>();

		map.put("A", new Trainer(null, "JH", 28, "Software"));
		map.put("A", new Trainer(null, "TC", 22, "DevOps"));
		map.put("B", new Trainer(null, "AM", 21, "Software"));

		System.out.println("MAP: " + map);
		System.out.println("A: " + map.get("A"));
		System.out.println("KEYSET:");
		for (String k : map.keySet()) {
			System.out.println(k + ": " + map.get(k));
		}

		System.out.println("ENTRIES:");
		for (Entry<String, Trainer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println(map.values().getClass());
		for (Trainer val : map.values())
			System.out.println(val);

		map.values().clear();
		System.out.println(map);
	}

}
