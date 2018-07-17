
/*
Name:  Adriana Alva
Class: CE 2336
Date:  5/29/2018
*/
import java.util.Scanner;

public class two_rectangles {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter R1's center x-, y-coordinates, width, and height:");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double w1 = in.nextDouble();
		double h1 = in.nextDouble();
		//calculate height and width of 1/2 of the R1
		w1 = w1 / 2;
		h1 = h1 / 2;

		System.out.print("Enter R2's center x-, y-coordinates, width, and height:");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double w2 = in.nextDouble();
		double h2 = in.nextDouble();
		//calculate height and width of 1/2 of the R2
		w2 = w2 / 2;
		h2 = h2 / 2;
        
		//calculate R1 & R2 points
		double x1max = x1 + w1;	
		double x1min = x1 - w1;
		double x2max = x2 + w2;
		double x2min = x2 - w2;
		
		double y1max = y1 + h1;
		double y1min = y1 - h1;
		double y2max = y2 + h2;
		double y2min = y2 - h2;
		
		//check for different case scenarios of R1 &R2 inside one another, identical or not/overlap
		if (x1max <= x2max && x1min >= x2min && y1max <= y2max && y1min >= y2min){
			System.out.print("R1 is inside R2");
		} 
		else if (x2max <= x1max && x2min >= x1min && y2max <= y1max && y2min >= y1min) {
			System.out.print("R2 is inside R1");
		} 
		else if (x1max == x2max && x1min == x2min && y1max == y2max && y1min == y2min)  {
			System.out.print("R1 and R2 are indentical");
		}
		else if (x1max < x2min || x1min > x2max || y1max < y2min || y2min > y1max) {
			System.out.print("R2 doesn't overlaps R1");
		} 
		else {
			System.out.print("R2 overlaps R1");
		}
	}
}
