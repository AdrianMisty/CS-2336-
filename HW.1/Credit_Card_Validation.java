
/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
*/
import java.util.Scanner;

public class Credit_Card_Validation {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long ccNum;
		// do while loop that prompts user input
		do {
			System.out.print("Enter a credit card number as a long integer:");

			ccNum = input.nextLong();
			// check for validitity of user's inputed ccnum
			if (ccNum != 0) {
				if (isValid(ccNum)) {
					System.out.println("Credit card number " + ccNum + " is valid.");
				} else {
					System.out.println("Credit card number " + ccNum + " is not valid.");
				}
			}

		} while (ccNum != 0);
	}

	/*
	 * methods needed public static boolean isValid(long number) public static
	 * boolean prefixMatched(long number, int d) public static int
	 * sumOfOddPlace(long number) public static int sumOfDoubleEvenPlace(long
	 * number) public static int getDigitFromIndex(long number, int index) public
	 * static int getDigit(int num) public static int getSize(long d) public static
	 * long getPrefix(long number, int k)
	 */
	public static boolean isValid(long ccnum) {
		int UnoPrefix = (int) getPrefix(ccnum, 1);
		int DosPrefix = (int) getPrefix(ccnum, 2);
		/*
		 * 4 : visa 
		 * 5 : mastercard 
		 * 37: American Express 
		 * 6 : Discovery
		 */
		if (UnoPrefix != 4 && UnoPrefix != 5 && UnoPrefix != 3 && UnoPrefix != 6) {
			return false;
		}
		if (UnoPrefix == 3) {
			if (DosPrefix != 37) {
				return false;
			}
		}

		if ((sumOfDoubleEvenPlace(ccnum) + sumOfOddPlace(ccnum)) % 10 != 0) {
			return false;
		}
		return true;
	}
	//Step 4
	public static int sumOfDoubleEvenPlace(long num) {
		//add up all digits that are in even places
		int size = getSize(num);
		int result = 0;

		for (int i = 2; i <= size; i += 2) {
			result += getDigit(2 * getDigitIndex(num, i));
		}
		//return sum of digits in even places
		return result;
	}
	// Get digit from specific place
	public static int getDigitIndex(long num, int indx) {
		int Dig;
			  // Almost worked: Dig =(((num / Math.pow(10, indx - 1))) % 10);
		      Dig = (int) (((num / Math.pow(10, indx - 1))) % 10);
		return Dig;
	}
	public static int getDigit(int number) {
        int num = number;
		int UnoDigit = num / 10;
		int DosDigit = num % 10;

		if (UnoDigit == 0) {
			return num;
		} 
		else {
			return UnoDigit + DosDigit;
		}

	}
	//Step 4
	public static int sumOfOddPlace(long num) {
		//add all digits in odd places in the ccnum
		int size = getSize(num);
		int result = 0;

		for (int i = 1; i <= size; i += 2) {
			result += getDigitIndex(num, i);
		}
        //return sum of digits in odd places
		return result;

	}
	// Return true if  d is a prefix  #
	public static boolean prefixMatched(long num, int d) {
        //check d  if it is a prefix 
		if (getPrefix(num, getSize(d)) == d) {
			return true;
		}
		
		return false;
	}
	// return the # of digits in d
	public static int getSize(long d) {
		int numDigit = 1;
		
		while ((d = d / 10) != 0) {
			numDigit++;
		}
		return numDigit;
	}
	// Return the first k number of digits from number. If the number of digits
	// in number is less than k, return number.
	public static long getPrefix(long num, int k) {
		  //return the 1st  of digit from num
		  int numDigit = getSize(num);
		  return num / (long) (Math.pow(10.0, (double) (numDigit - k)));
		 
		 }
	
}