package modulus_11;

public class Modulus_11 {

	public static void main(String[] args) {
		//These are the test cases.
		//The three addCheckDigit test cases.
		System.out.print("First addCheckDigit test. Does 0 equal 00?");
		if (addCheckDigit(0).equals("00")){
		    System.out.print(" First test successful! :) \n");
		}
		else{
		    System.out.print(" First test failed. :( \n");
		}
		
		System.out.print("Second addCheckDigit test. 35732 equals 357324?");
		if (addCheckDigit(35732).equals("357324")){
		    System.out.print(" Second test successful! :> \n");
		}
		else{
		    System.out.print(" Second test failed. :< \n");
		}
		
		System.out.print("Third addCheckDigit test. Does 184244767 equal 184244767X?");
		if (addCheckDigit(184244767).equals("184244767X")){
		    System.out.print(" Third test successful! :} \n");
		}
		else{
		    System.out.print(" Third test failed. :{ \n");
		}
		
		//The three isIDValid test cases.
		System.out.print("First isIDValid test. Is 365327 valid?");
		if (isIDValid("365327")){
		    System.out.print(" Valid! :] \n");
		}
		else{
		    System.out.print(" Invalid... :[ \n");
		}
		
		System.out.print("Second isIDValid test. Is 00 valid?");
		if (isIDValid("00")){
		    System.out.print(" Valid! :D \n");
		}
		else{
		    System.out.print(" Invalid... :S \n");
		}
		
		System.out.print("Third isIDValid test. Is 1421233X valid?");
		if (isIDValid("1421233X")){
		    System.out.print(" Valid! B) \n");
		}
		else{
		    System.out.print(" Invalid... B( \n");
		}
		
	}
	
	//This is the method that calculates the check digit number.
	public static String calcCheckDigit(int n) {
		int sum = 0;
		int digit;
		for (int i=0; i<=8; i++) {
			//These lines/formulas count the number of digits in the input.
			digit = n / ((int) Math.pow(10, i)) % 10;
			sum += digit * (2 + i);
		}
		//Uses mod stuff to actually calculate the check digit based on the number of digits determined before.
		int remainder = (11 - (sum % 11)) % 11;
		if (remainder == 10) {
		    //Returns X if the check digit remainder is 10 for formatting purposes.
			return "X";
		} else {
		    //Else returns the normal int value of the remainder.
			return String.valueOf(remainder);
		}
	}
	
	//This class adds the check digit number returned from the checkDigit class to the original value of n.
	public static String addCheckDigit(int n) {
		return String.valueOf(n) + calcCheckDigit(n);
	}
	
	//This method checks to see if the last digit in the input is the same as the check digit.
	public static boolean isIDValid(String id) {
		return calcCheckDigit(Integer.parseInt(id.substring(0, id.length() - 1))).equals(id.substring(id.length() -1));
	}

}