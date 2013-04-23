package uk.co.tpplc.training.java.language.controlflow;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
	
	@Test
	public void goOverForEachOfAnArray(){
		String[] numberStrings = {"one","two","three"};
		StringBuffer allStrings = new StringBuffer();
		
		for(String item : numberStrings){
			allStrings.append(item);
		}
		assertEquals("onetwothree", allStrings.toString());
	}
	
	@Test
	public void goOverForEachOfIterables(){
		StringBuffer allStrings = new StringBuffer();
		Collection<String> goons = Arrays.asList(new String[]{"spike", "harry", "peter"});
		
		for(String item : goons){
			allStrings.append(item);
			allStrings.append("-");
		}
		assertEquals("spike-harry-peter-", allStrings.toString());
	}
}
