package enums;

import java.time.LocalDate;
import java.time.Month;

public class Demo {

	public static void main(String[] args) {
		LocalDate.of(1994, Month.APRIL, 4);
		Simulator sim = new Simulator();
		for (int i = 0; i < 1_000_000; i++)
			System.out.println(sim.coinflip(CoinFlip.HEADS));
	}

}
