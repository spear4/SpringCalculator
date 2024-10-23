package com.incubyte.string.calc;

import java.util.*;


public class StringCalculator {
	
	public static int add(String inputStr) {
		
		//To Store the end sum result
		int sum = 0;
		
		if(inputStr.isEmpty()) {//Check if the user given an empty string
			
			sum += 0;
			
		}else if(inputStr.length() == 3 && inputStr.substring(1, 2).equals(",")){//Check if the user given an comma separated three character input
			
			String[] nums = inputStr.split(",");
			sum += Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			
		}else {////Check if the user given an string of multiple delimiters and negative numbers as well numbers that exceeds 1000.
			
			//Store the extracted num in the string builder
			StringBuilder extractedCharacters = new StringBuilder();
			
			//Stores the negative numbers to return them along with the error message
			List<String> negativeNumbers = new ArrayList<String>();
			
			//Iterating over each character in the string
			
			//<!---Iteration Start---->
			for(char inputCharacters : inputStr.toCharArray()) {
				
				// System.out.println(inputCharacters);
				
				//Check if the character is an single digit and negative integer and adds to the StringBuilder(extractedNumbers) if yes
				if(Character.isDigit(inputCharacters) || (inputCharacters == '-' && extractedCharacters.length() == 0)) {
					
					extractedCharacters.append(inputCharacters);
					
				}else {
					
					//check if the character is not a single digit but an integer of two or more characters
					if(extractedCharacters.length() > 0) {
						
						//then convert the character into an integer
						int numIntegers = Integer.parseInt(extractedCharacters.toString());
						
						//Check if the numbers is not negative and not exceeding 1000
						if(numIntegers > 0 && numIntegers < 1000) {
							
							//Add the positive numbers together
							sum += numIntegers;
							
						}else if(numIntegers > 1000) {// Check if the integer exceeds 1000
							
							//Generate error for so
							throw new IllegalArgumentException("Given input number exceeds 1000 : " + numIntegers);
							
						}else if(numIntegers < 0) {//Check if the integer is negative
							
							//Add the negative to the List
							negativeNumbers.add(Integer.toString(numIntegers));
							
						}
						
						//Reset the extractedCharacters to allow the next number
						extractedCharacters.setLength(0);
						
					}
					
					
				}
				
			}
			//<!---Iteration Ends---->
			
			//Checking the last part of the String for integers
			//<!--Start--->
			if(extractedCharacters.length() > 0) {
				
				//Follows same if else like above
				int numLastInteger = Integer.parseInt(extractedCharacters.toString());
				
				//Check whether it is positive and not exceeds 1000
				if(numLastInteger > 0 && numLastInteger < 1000) {
					
					//Then add it to the sum
					sum += numLastInteger;
					
				}else if(numLastInteger > 1000) {
					
					//Generate error for so
					throw new IllegalArgumentException("Given input number exceeds 1000 : " + numLastInteger);
					
				}else if(numLastInteger < 0) {
				
					//Add the negative to the List
					negativeNumbers.add(Integer.toString(numLastInteger));
					
				}
				
			}
			//<!--End--->
			
			
			//Error Throw if any negative integers were found
			if(!negativeNumbers.isEmpty()) {
				
				//Please ignore this use of substring to remove the last comma, looking for a way to add comma only in-between
				String dum = negativeNumbers + ", ";
				String negativeIntegerErrMsg = dum.substring(0, dum.length()-2);
				
				throw new IllegalArgumentException("Negative Numbers Found in the Input : " +  negativeIntegerErrMsg);
				
			}
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Happy Day, \nWelcome to my Play House !\n");
		
		//Taking user input with scanner class as in String format
		@SuppressWarnings("resource")
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Provide Input of Numbers \nCan be separated by any delimiter [/n,.$#%^&]");
		String userInput = inputScanner.nextLine();
		
		System.out.println("\nGiven Input : " + userInput);
		
		//Sample Input with comma(,), almost all keyboard symbols and multiple delimiters as well and (",\n")
		//  input = 1,2<3.4>5/6?7;8:9'10"11[12{13]14}15\16|17!18@19#20$21%22^23*&24*25(26)27!!!!28###29********30\n31,\n32
		//Sample Output
		//  output = 528 (sum from 0, 1, 2, to 32)
		//Note : decimal(.) is also considered as delimiter
		
		try {
			
			//calls the add() method and returns the value after validation and sum
			System.out.println("\nSum Output : " + add(userInput));
			
		}catch(Exception e){//Catch the exceptions
			
			System.out.println(e.getMessage());
			
		}
	}

}

//Sample Input with comma(,), almost all keyboard symbols and multiple delimiters as well and (",\n")
//  input = q
//Sample Output
//Sumdqdd  output = 528 (sum from 0, 1, 2, to 32)
//Note : decimal(.) is also considered as delimiter


//Contact
//Manigandan M
//manindia1007@gmail.com