package uk.co.tpplc.training.java.language.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchExampleTests {

	public static final int ONE = 1;
	public static final int TWELVE = 12;
	public static final int THIRTEEN = 13;
	public static final int FIVE = 5;

	@Test
	public void trySimpleSwitching() {
		String doorNumber;
		doorNumber = switchRooms(FIVE);
		assertEquals("got to door number 5", "five", doorNumber);
	}

	@Test
	public void tryFallThrough() {
		String doorNumber;
		doorNumber = switchRooms(ONE);
		assertEquals("fall through to door number 4", "four", doorNumber);
	}

	@Test
	public void tryMultipleCaseSameResult() {
		String doorNumber;

		doorNumber = switchRooms(TWELVE);
		assertEquals("either 12 should be door number 12", "twelve", doorNumber);

		doorNumber = switchRooms(THIRTEEN);
		assertEquals("either 13 should be door number 12", "twelve", doorNumber);
	}

	private String switchRooms(int roomIdentifier) {
		String room;
		switch (roomIdentifier) {
		case 1:
			room = "one";
		case 4:
			room = "four";
			break;
		case 5:
			room = "five";
			break;
		case 8:
			room = "eight";
			break;
		case 12:
		case 13:
			room = "twelve";
			break;
		default:
			room = "bad room choice sir";
		}
		return room;

	}

}
