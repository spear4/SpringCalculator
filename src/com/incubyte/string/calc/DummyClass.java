package com.incubyte.string.calc;


//Please ignore this class as it is for test some doubts along the way, but i have uploaded coz,
// it may be useful for some one

public class DummyClass {
	

    public static void main(String[] args) {
        // The input string with multiple symbols and numbers
//        String input = "{{}'\"1?3/6.8,77*9)566*45&78$45#889@441";
        String input = "{{}'\"assdscdsc";
        
        // Call the method to extract and sum integers
        int sum = extractAndSumIntegers(input);
        
        // Print the sum of the extracted integers
        System.out.println("Sum of extracted integers: " + sum);
        

//		
//		char[] chArr = userInp.toCharArray();
////		
//		int[] intArr = new int[len]; 
//		
//		for(int i =0; i < len; i++) {
//			
//			if(Character.isDigit(chArr[i])) {
//				
//				System.out.println(chArr[i]);
//				intArr[i] = chArr[i];
//				
//			}
//			
//		}
////		
//		int kootal = 0;
//		for(int j = 0; j < len; j++) {
//			
//			System.out.println("\n" + intArr[j]);
////			kootal = kootal + dsa[j];
//			
//		}
////		System.out.println(kootal - kootal*20/100);
//		userInp = userInp.replaceAll("[^0-9]", "-");
//		System.out.println("User Inp :" + userInp);
//		
//		
//		System.out.println("Result : " + Integer.parseInt(userInp));
		
//		int kootal;
//		String[] arrChar = new String[userInp.length()];
//		for(int i = 0; i <= userInp.length()-1; i++) {
////			kootal += Integer.parseInt(userInp.charAt(i));
//		}
//		
    }

    // Method to extract integers from a string and calculate their sum
    public static int extractAndSumIntegers(String input) {
    	
        int sum = 0;
        
        StringBuilder currentNumber = new StringBuilder();


        for (char ch : input.toCharArray()) {
        	
            if (Character.isDigit(ch)) {

                currentNumber.append(ch);
                
            } else {
            	
                if (currentNumber.length() > 0) {

                    sum += Integer.parseInt(currentNumber.toString());
                    
                    currentNumber.setLength(0);
                }
            }
        }
        
        // In case the last part of the string is a number, add it to the sum
        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }
        
        return sum;
    }


}
