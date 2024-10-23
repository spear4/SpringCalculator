package com.incubyte.string.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalcTest {
	
	@Test
	public void testEmptyStr() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testComma() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

}
