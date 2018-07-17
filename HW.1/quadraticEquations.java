
/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
*/
import java.util.Scanner;

public class quadraticEquations {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a, b, c :");
		// 3 input values can be int/double
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		// calculate the discriminant based on values of a,b,c
		double discri = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

		// if discriminant is +, display 2 roots
		if (discri > 0) {

			double root1 = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
			double root2 = ((b * (-1)) - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);

			System.out.printf("The equation has two roots %.6f and %.6f", root1, root2);

		}
		// if discriminant is 0, display 1 root
		else if (discri == 0) {

			double ans = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
			System.out.println("The equation has one root " + ans);

		}
		// if discriminant is not 0/+, display 0 roots
		else {

			System.out.println("The equation has no real roots");
		}
	}
}
