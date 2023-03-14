package iteration;

public class Exercises {

	public static void main(String[] args) {
		flowchart1();
		flowchart2();

		coins(4494, 6_000);
	}

	private static void flowchart1() {
		for (int A = 100; A <= 200; A++)
			System.out.println(" A ");
	}

	private static void flowchart2() {
		for (int A = 100; A <= 200; A++)
			if (A % 2 == 0) {
				System.out.println(" - ");
			} else {
				System.out.println(" * ");
			}
	}

	private static void coins(int price, int paid) {
		double change = paid - price;
		int fiftyPound = 0;
		int twentyPound = 0;
		int tenPound = 0;
		int fivePound = 0;
		int twoPound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;

		while (change >= 5_000) {
			fiftyPound++;
			change -= 5_000;
		}
		while (change >= 2_000) {
			twentyPound++;
			change -= 2_000;
		}
		while (change >= 1_000) {
			tenPound++;
			change -= 1_000;
		}
		while (change >= 500) {
			fivePound++;
			change -= 500;
		}
		while (change >= 200) {
			twoPound++;
			change -= 200;
		}
		while (change >= 100) {
			onePound++;
			change -= 100;
		}
		while (change >= 50) {
			fiftyPence++;
			change -= 50;
		}
		while (change >= 20) {
			twentyPence++;
			change -= 20;
		}
		while (change >= 10) {
			tenPence++;
			change -= 10;
		}
		while (change >= 5) {
			fivePence++;
			change -= 5;
		}
		while (change >= 2) {
			twoPence++;
			change -= 2;
		}
		while (change >= 1) {
			onePence++;
			change -= 1;
		}

		System.out.println("Change: ");
		System.out.println("£50: " + fiftyPound);
		System.out.println("£20: " + twentyPound);
		System.out.println("£10: " + tenPound);
		System.out.println("£5: " + fivePound);
		System.out.println("£2: " + twoPound);
		System.out.println("£1: " + onePound);
		System.out.println("50p: " + fiftyPence);
		System.out.println("20p: " + twentyPence);
		System.out.println("10p: " + tenPence);
		System.out.println("5p: " + fivePence);
		System.out.println("2p: " + twoPence);
		System.out.println("1p: " + onePence);

	}

}
