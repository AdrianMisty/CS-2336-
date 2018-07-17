/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
*/ 
import java.util.Scanner;
public class Days_Of_A_Month {
	public static void main(String[] args) {
		  
		  Scanner inp = new Scanner(System.in);
		  //User input for year and month 
		  int days = 0;
		  
		  System.out.print("Enter a year:");
		  int year = inp.nextInt();		  
		  System.out.print("Enter a month:");
		  String month = inp.next();
		  // ordered months from least to most # of days
		  switch (month) {
		  // Feb. case due to leap years and it having the least amount of days
		  case "Feb":
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    days = 29;
		    break;
		   }
		   days = 28;
		   break;
		  // months with 30 days
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		  // months with 31 days
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
		  //in case of error in user input
		  default:
		   System.out.println("Invalid month.");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " has " + days + " days");

	}

}
