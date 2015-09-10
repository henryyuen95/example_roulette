package roulette;

import util.ConsoleReader;

public class EvenOdd extends Bet {

	private Wheel myWheel;

	public EvenOdd(int odds, Wheel wheel) {
		super("Odd or Even", odds);
		myWheel = wheel;
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMade(String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even"))
				|| (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
