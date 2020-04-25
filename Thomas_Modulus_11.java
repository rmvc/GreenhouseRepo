package modulus_11;

public class Modulus_11 {

	public static void main(String[] args) {
		// test cases
		
		assert false;
		System.out.print("Testing addCheckDigit(0) == \"00\".");
		testBoolean(addCheckDigit(0).equals("00"));
		
		System.out.print("Testing addCheckDigit(36532).equals(\"365327\").");
		testBoolean(addCheckDigit(36532).equals("365327"));
		
		System.out.print("Testing addCheckDigit(184244767).equals(\"184244767X\").");
		testBoolean(addCheckDigit(184244767).equals("184244767X"));
		
		System.out.print("Testing isIDValid(\"365327\").");
		testBoolean(isIDValid("365327"));
		
		System.out.print("Testing !isIDValid(\"365328\").");
		testBoolean(!isIDValid("365328"));
		
		System.out.print("Testing isIDValid(\"00\").");
		testBoolean(isIDValid("00"));
		
		System.out.print("Testing !isIDValid(\"01\").");
		testBoolean(!isIDValid("01"));
		
		System.out.print("Testing isIDValid(\"184244767X\").");
		testBoolean(isIDValid("184244767X"));
		
		System.out.print("Testing !isIDValid(\"1842447670\").");
		testBoolean(!isIDValid("1842447670"));
	}
	public static void testBoolean(boolean b) {
		if (b) {
			System.out.print(" Success.\n");
		} else {
			System.out.print(" Failure.\n");
		}
	}
	public static String checkDigit(int n) {
		int sum = 0;
		int digit;
		for (int i=0; i<9; i++) {
			// get ith digit of n, counting from the right
			digit = n / ((int) Math.pow(10, i)) % 10;
			sum += digit * (2 + i);
		}
		// calculate check digit
		int antiremainder = (11 - (sum % 11)) % 11;
		if (antiremainder == 10) {
			return "X";
		} else {
			return String.valueOf(antiremainder);
		}
	}
	public static String addCheckDigit(int n) {
		return String.valueOf(n) + checkDigit(n);
	}
	public static boolean isIDValid(String id) {
		// check if the last character is the same as the check digit for the number before it
		return checkDigit(Integer.parseInt(id.substring(0, id.length() - 1))).equals(id.substring(id.length() - 1));
	}

}
