package com.incubyte.string.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalcTest {
	
	//Test Case One - Checking for emptyString
	//Sample input = ""
	//Expected Output = 0
	@Test
	public void emptyStr() {
		
		assertEquals(0, StringCalculator.add(""));
		
	}
	
	//Test Case Two - Checking for three character string with comma separated number
	//Sample input = 1,2
	//Expected Output = 3
	@Test
	public void commaStr() {
		
		assertEquals(3, StringCalculator.add("1,2"));
		
	}
	
	//Test Case Three - Checking with mixed characters and numbers
	//Sample input = a1b2c3d
	//Expected Output = 6
	@Test
	public void mixedChars() {
		
		assertEquals(6, StringCalculator.add("a1b2c3d"));
		
	}

	//Test Case Four - Checking with mixed delimiters and numbers
	//Sample input = 1!2#3$4%
	//Expected Output = 10
	@Test
	public void mixedDelimiters() {
		
		assertEquals(10, StringCalculator.add("1!2#3$4%"));
		
	}
	
	//Test Case Five - Checking with no numbers
	@Test
	public void noNumbers() {
		
		assertEquals(0, StringCalculator.add("!@#$%asdfgh"));
		
	}
	
	//Test Case Six - Checking with valid input with multiple mixed delimiters
	//Sample input = {{}'\"1?3/6.8,77*9)566*45&78$45#889@441
	//Expected Output = 2168
	@Test
	public void validInput() {
		
		assertEquals(2168, StringCalculator.add("{{}'\\\"1?3/6.8,77*9)566*45&78$45#889@441"));
		
	}
	
	//Test Case Seven - Checking for the input exceeds 1000
	//Sample input = 1005asdf
	//Expected Output = Given Input Number exceeds 1000 : 1005
	@Test
	public void exceedThousand() {

		try {
			
			StringCalculator.add("1005asdf");
			fail();
			
		} catch (IllegalArgumentException e) {

			assertTrue(e.getMessage().contains("Given input number exceeds 1000 : 1005"));
			
		}
		
	}
	
	
	//Test Case Eight - Checking for negative integers in the input
	//Sample input = -1,-2,-3,-4,-5
	//Expected Output = Negative Numbers Found in the Input : [-1, -2, -3, -4, -5]
	@Test
	public void negativeInput() {
		
		try {
			
			StringCalculator.add("-1,-2,-3,-4,-5");
			fail();
			
		}catch(IllegalArgumentException e) {
			
			assertTrue(e.getMessage().contains("Negative numbers found in the nput : [-1, -2, -3, -4, -5]"));
			
		}
		
	}
	
	
	//Test Case Nine - Checking with ,\n in the input along with numbers
	//Sample Input = 5,\n5
	//Expected Output = 10
	@Test
	public void commaSlash() {
		
		assertEquals(10, StringCalculator.add("5,\n5"));
		
	}
	
	//Test Case Ten - Checking with Input with comma(,), almost all keyboard symbols 
	//	and multiple delimiters as well and (",\n")
	//Sample Input = 1,2<3.4>5/6?7;8:9'10"11[12{13]14}15\16|17!18@19#20$21%22^23*&24*25(26)27!!!!28###29********30\n31,\n32
	//Expected Output = 528
	@Test
	public void multiDelimiter() {
		
		assertEquals(528, StringCalculator.add("1,2<3.4>5/6?7;8:9'10\"11[12{13]14}15\\16|17!18@19#20$21%22^23*&24*25(26)27!!!!28###29********30\\n31,\\n32"));
		
	}
	
	
	
}
