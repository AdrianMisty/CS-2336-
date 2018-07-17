
/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
*/
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// You can use Math.random() or Random class for lottery #
		int lottery = (int) (Math.random() * 999);

		Scanner in = new Scanner(System.in);

		System.out.print("Enter your lottery number (3-digits): ");
		int UserGuess = in.nextInt();

		// Retrieve 3 numbers from userguess and lottery
		int gNum1 = UserGuess / 100;
		int gNum2 = (UserGuess % 100) / 10;
		int gNum3 = UserGuess % 10;

		int lNum1 = lottery / 100;
		int lNum2 = (lottery % 100) / 10;
		int lNum3 = lottery % 10;

		System.out.println("The lottery number is " + lNum1 + lNum2 + lNum3);
		// Check the lottery number with the user's guess
		// match awards according to # of digits match
		if (UserGuess == lottery)
			System.out.println("You have an exact match. You win $10,000 ! ");
		else if ((gNum1 == lNum2 && gNum2 == lNum1 && gNum3 == lNum3)
				|| (gNum1 == lNum2 && gNum1 == lNum3 && gNum3 == lNum1)
				|| (gNum1 == lNum3 && gNum2 == lNum1 && gNum3 == lNum2)
				|| (gNum1 == lNum3 && gNum2 == lNum2 && gNum3 == lNum1)
				|| (gNum1 == lNum1 && gNum2 == lNum3 && gNum3 == lNum2))
			System.out.println("You matched all digits. You win $3,000!");
		else if (gNum1 == lNum1 || gNum1 == lNum2 || gNum1 == lNum3 || gNum2 == lNum1 || gNum2 == lNum2
				|| gNum2 == lNum3 || gNum3 == lNum1 || gNum3 == lNum2 || gNum3 == lNum3)
			System.out.println("You matched one digit. You win $1,000!");
		else
			System.out.println("You have no match.Sorry, you win nothing.");

	}

}
