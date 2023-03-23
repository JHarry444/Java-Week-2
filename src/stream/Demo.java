package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 34, 2, -6, 34, -56, 34, -53, 453, -34);

		nums.stream().forEach(num -> System.out.println(num));
		nums.stream().forEach(System.out::println); // method reference, shortcut for line above
		System.out.println("3x:");
		nums.stream().filter(num -> num % 3 == 0).forEach(System.out::println);

		System.out.println("MAP:");
		nums.stream().map(num -> Math.abs(num)).forEach(System.out::println);
		nums.stream().map(num -> String.valueOf(num)).forEach(System.out::println);
		nums.stream().map(Math::abs).forEach(System.out::println);
		nums.stream().map(num -> {
			return Math.abs(num);
		}).forEach(System.out::println);

		nums.stream().map(String::valueOf).forEach(System.out::println);
		System.out.println("MAX:");
//		Optional<Integer> max = nums.stream().reduce((biggestSoFar, nextNum) -> {
//			if (nextNum > biggestSoFar)
//				return nextNum;
//			else
//				return biggestSoFar;
//		});
//		Optional<Integer> max = nums.stream().reduce((biggestSoFar, nextNum) -> {
//			return Math.max(biggestSoFar, nextNum);
//		});
//		Optional<Integer> max = nums.stream().reduce((biggestSoFar, nextNum) -> Math.max(biggestSoFar, nextNum));
		Optional<Integer> max = nums.stream().reduce(Math::max);

		max.ifPresent(System.out::println);

		List<Integer> filtered = nums.stream().filter(num -> num % 4 == 0).collect(Collectors.toList());
		System.out.println(nums);
		System.out.println(filtered);

		List<Integer> oneToHundred = IntStream.range(1, 101).boxed().collect(Collectors.toList());
		System.out.println(oneToHundred);

		Optional<Integer> biggestMultipleOfFour = nums.stream().filter(num -> num % 4 == 0).reduce(Math::max);

	}

}
