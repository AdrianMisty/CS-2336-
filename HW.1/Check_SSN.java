/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/30/2018
*/ 
import java.util.Scanner;
public class Check_SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner inp= new Scanner(System.in);
		  //prompt user ssn input
		  System.out.print("Enter a SSN:");
		  String string = inp.nextLine();
		  //check format of inputed ssn
		  for (int i = 0; i < string.length(); i++) {
			  if ((i == 3 || i == 6) && string.charAt(i) == '-') {
		    continue;
		   }
		   //check if number of digits is right for an ssn
		   if (!Character.isDigit(string.charAt(i))) {
			   System.out.println(string + " is an invalid social security number.");
		    	System.exit(0);
		     }
		  } 
		  System.out.println(s + " is a valid social security number.");
	}

}
