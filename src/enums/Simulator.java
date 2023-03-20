package enums;

import java.util.Random;

public class Simulator {
	private Random rand = new Random();

	public boolean coinflip(CoinFlip call) {
		int randNum = this.rand.nextInt(101);
		CoinFlip result;
		if (randNum < 50)
			result = CoinFlip.HEADS;
		else if (randNum < 100)
			result = CoinFlip.TAILS;
		else
			result = CoinFlip.EDGE;

		System.out.println("You called: " + call + " And the result was: " + result);
		return call == result;
	}
}