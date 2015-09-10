package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet {

	private Wheel myWheel;

	public RedBlack(int odds, Wheel wheel) {
		super("Red or Black",odds);
		myWheel = wheel;
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMade(String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}
}
