package com.incubyte.string.calc;

import java.util.*;

public class StringCalculator {
	
	public static int add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 1;
		}else {
			return 1;
		}
		
	}
	
//	public static void validate(String userInp) {
//		
//		if(userInp.isEmpty()) {
//			System.out.println(add("0"));
//		}else if(userInp.contains(",")) {
//			String[] split = userInp.split(",");
//			int added = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
//			System.out.println();
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello Lawrence, \nWelcome to my Play House !\n");
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Provide Input of Numbers \nCan be separated by any delimiter []");
		String userInp = inp.nextLine();
//		System.out.println("Raw Input :" + userInp);
		
//		validate(userInp);
		
		System.out.println("vantha Output : " + add(userInp));
		
		

	}

}
