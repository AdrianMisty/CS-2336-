
/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
 */
import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012):");
		int y = in.nextInt();
		System.out.print("Enter month: 1-12 :");
		int m = in.nextInt();
		System.out.print("Enter the day of the month: 1-31 :");
		int q = in.nextInt();
        //Jan & Feb counted as month 13/14 of previous yr; 
		//change month # and yr to previous yr
		if (m == 1 || m == 2) {

			m = m + 12;
			y = y - 1;
		}

		int j = y / 100;
		int k = y % 100;
		//h is day of the week and the formula used to calculate it
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String day = "";
        
		//find what day it is and print out
		switch (h) {

		case 0:
			day = "Saturday";
			break;
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;

		}

		System.out.print("Day of the week is " + day);
	}

}
