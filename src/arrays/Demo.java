package arrays;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		String[] strings = { "JH", "TC", "CG", "MS" };
		int[] nums = new int[10];
		// new -> creates a new object of that type

		System.out.println("0: " + nums[0]);
		nums[0] = 12;
		System.out.println("0: " + nums[0]);
		System.out.println("0: " + strings[0]);

		int last = strings.length - 1;
		System.out.println(last + ": " + strings[last]);

		System.out.println("Print an array:");
		for (int i = 0; i <= strings.length - 1; i++) {
			System.out.println(i + ": " + strings[i]);
		}

		System.out.println("Print an array backwards:");
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(i + ": " + strings[i]);
		}

		System.out.println("Populate the nums array:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (1 + i) * 12;
		}

		for (int num : nums)
			System.out.println("Num: " + num);

		List<Integer> numList = new ArrayList<>();
		Integer integer = null;
		numList.add(14);
		numList.add(28);
		numList.add(42);
		System.out.println(numList);

		List<String> stringList = new ArrayList<>();

		stringList.add("Jordan");
		stringList.add("Joseph");
		stringList.add("Harrison");
		System.out.println(stringList);

		System.out.println("Array: " + nums);
	}

}
