package uk.co.tpplc.training.java.language.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfElseExampleTests {

	public static final boolean TRUE_CONDITION = true;
	public static final boolean FALSE_CONDITION = false;
	public static final int FIVE = 5;

	@Test
	public void seeHowIfThenWorks() {
		int i = 0;
		if(TRUE_CONDITION){
			i = 1;
		}
		assertEquals("if we go through then i==1", 1, i);
	}
	
	@Test
	public void seeHowIfThenElseWorks(){
		int i = 0;
		if(FALSE_CONDITION){
			i = 1;
		} else {
			i = 3;
		}
		assertEquals("if we go through else i==3", 3, i);		
	}

	@Test
	public void seeHowCompoundIfThenElseWorks(){
		int i = 0;
		int aFineInteger = FIVE;
		if(3 == aFineInteger){
			i = 3;
		} else if( 5 == aFineInteger ){
			i = 5;
		} else if( 8 == aFineInteger){
			i = 8;
		}
		assertEquals("if we go through correct else i==5", FIVE, i);		
	}

}
