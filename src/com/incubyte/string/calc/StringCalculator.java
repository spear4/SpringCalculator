package com.incubyte.string.calc;

import java.util.*;

public class StringCalculator {
	
	public static int add(String inpChar) {
		
		//To Store the end totaled result
		int sum = 0;
		
		if(inpChar.isEmpty()) {//Check if the user given an empty string
			
			sum += 0;
			
		}else if(inpChar.length() == 3 && inpChar.substring(1, 2).equals(",")){//Check if the user given an comma separated three digit value
			
			String[] nums = inpChar.split(",");
			sum += Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			
		}else {////Check if the user given an string of multiple delimiters and negative numbers as well numbers that exceeds 1000.
			
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello Lawrence, \nWelcome to my Play House !\n");
		
		//Taking user input with scanner class as in String format
		Scanner inp = new Scanner(System.in);
		System.out.println("Provide Input of Numbers \nCan be separated by any delimiter []");
		String userInp = inp.nextLine();
		
		System.out.println("\nKudutha Input Char: " + userInp);
		System.out.println("\nVantha Output : " + add(userInp));
	}

}
