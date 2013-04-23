package uk.co.tpplc.training.java.language.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForExampleTests {
	public static final int LOOP_LIMIT = 8;

	@Test
	public void exploreForLoops() {
		int numberOfTimesRoundTheLoop = 0;

		for( int i = 0 ; i < LOOP_LIMIT; i++){
			numberOfTimesRoundTheLoop = numberOfTimesRoundTheLoop + 1;
		}
		
		assertEquals("should have gone round 8 times", 8,
				numberOfTimesRoundTheLoop);
	}
}
