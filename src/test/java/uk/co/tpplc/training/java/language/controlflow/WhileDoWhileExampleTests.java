package uk.co.tpplc.training.java.language.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhileDoWhileExampleTests {

	@Test
	public void showHowWhileWorks() {
		int numberOfLoops = 0;

		// test boolean condition
		while (numberOfLoops < 5) {
			numberOfLoops++;
		}

		assertEquals("gone round loop 5 times", 5, numberOfLoops);
	}

	@Test
	public void showHowDoWhileWorks() {
		int numberOfLoops = 0;
		do {
			numberOfLoops++;
		} while (false);

		assertEquals("gone round loop 1 times", 1, numberOfLoops);
	}

}
