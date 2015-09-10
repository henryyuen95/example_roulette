package roulette;

import util.ConsoleReader;

public class Consecutive extends Bet {

	private Wheel myWheel;

	public Consecutive(int odds, Wheel wheel) {
		super("Three in a Row", odds);
		myWheel = wheel;
	}

	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(String betChoice) {
		int start = Integer.parseInt(betChoice);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}
