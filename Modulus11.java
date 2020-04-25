package DefaultPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
	
public class Modulus11{
	public static String addCheckDigit(String j){
		// initializes variables
		int ndigitfinished;
		int[] numbers = new int[j.length()];
		int newnumber = 0;
		int remainder = 0;
		int checkdigit = 0;
		int midnumber = 0;
		int finalnumber = 0;
		String checkdigitx;
	    int weight = j.length()+1;
	    
	    // Converts User Input Number to list
	    for(int i = 0; i < j.length(); i++) {
	    	numbers[i] = j.charAt(i) - '0';
	    }
		
	    // Handles math calculation for modulus 11
		for (int i = 0; i < j.length(); i++) {
			
			midnumber = numbers[i] * weight;
			
			weight = weight - 1;
			finalnumber = finalnumber + midnumber;
		}
		
		// Handles math calculations for modulus 11
		remainder = finalnumber % 11;
		finalnumber = finalnumber / 11;
		checkdigit = 11 - remainder;
	
		
		// Handles returning the correct check digit
		if (checkdigit == 10){
			return "10";
		}
		else {
			
			if(checkdigit == 11) {
				return "0";
			}
			else {
				return String.valueOf(checkdigit);
			}
		}
	}
	
	public static String isIDValid(String ndigit, String userinput) {
		// Initializes Variables
		int valid = 0;
		int[] numbers = new int[userinput.length()];
		int newnumber = 0;
		int remainder = 0;
		int checkdigit = 0;
		int midnumber = 0;
		int finalnumber = 0;
		String checkdigitx;
	    int weight = userinput.length()+1;
	    
	    // Converts User Input Number to list
	    for(int i = 0; i < userinput.length(); i++) {
	    	numbers[i] = userinput.charAt(i) - '0';
	    }
	    // Handles mathematical calculations
		for (int i = 0; i < userinput.length(); i++) {
			midnumber = numbers[i] * weight;
			weight = weight - 1;
			finalnumber = finalnumber + midnumber;
		}
		
		// Math Calculation of Validation
		int combined = finalnumber + Integer.parseInt(ndigit);
		valid = combined % 11;
		
		// Handles validation of checksum
		if (valid == 0) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
	
	
	public static void main(String[] args) {
		// Variables Initiated
		String ndigit;
		String ndigitplusone;
		String userinput;
		
		while (true) {
			// Creates New Scanner
			Scanner myObj = new Scanner(System.in);  
			// Prompts user for input
		    System.out.println("Enter a number: ");
		    // Read user input
		    userinput = myObj.nextLine();  
		    if (userinput.length() <=9){
				 ndigit = addCheckDigit(userinput.toString());
				 ndigitplusone = isIDValid(ndigit, userinput);
				 
				 // Prints Results
				 System.out.println("UserInput: " + userinput);
				 System.out.println("CheckDigit: " + ndigit);
				 System.out.println("Valid: " + ndigitplusone);
		    }
		    else {
		    	// Notifies User of incorrect number length
		    	System.out.println("Please enter a number with a maximum length of 9 numbers.");
		    }
		}
	}
}