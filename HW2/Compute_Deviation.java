
/*
Name: Adriana Alva 
Class: CS 2336.0U1
Date : 6/2/2018
*/
import java.util.Scanner;

public class Compute_Deviation {
	public static void main(String[] args) {
		System.out.print("Enter ten numbers : ");
		Scanner inpu = new Scanner(System.in);

		// for loop can be used(?)
		/*
		 * //From question 7.11 : use an array... double num1 = inpu.nextDouble();
		 * double num2 = inpu.nextDouble();
		 */
		double[] num = new double[10];

		for (int a = 0; a < num.length; a++) {
			num[a] = inpu.nextDouble();
		}
		// out put for mean: 3.11 standard deviation : 1.55738
		System.out.printf("The mean is %.2f", mean(num));
		System.out.println("");
		System.out.printf("The standard deviation is %.5f", deviation(num));
	}

	// Methods necessary and they must return a value
	public static double deviation(double[] x) {
		double m = mean(x);
		double sumSq = 0;

		for (int a = 0; a < x.length; a++) {

			sumSq += Math.pow((x[a] - m), 2);

		}

		double result = Math.sqrt(sumSq / (x.length - 1));
		return result;
	}

	// return mean
	public static double mean(double[] x) {
		double sum = 0;

		for (int b = 0; b < x.length; b++) {

			sum += x[b];

		}

		double result = sum / x.length;
		return result;
	}

}
