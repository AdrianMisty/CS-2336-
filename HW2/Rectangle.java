
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// create two objects
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		//print out in desired format
		System.out.println("Rectangle 1 characteristics");
		System.out.println("Rectangle 1 has a width of " + rect1.getWidth());
		System.out.println("Rectangle 1 has a height of " + rect1.getHeight());
		System.out.println("Rectangle 1 has an area of " + rect1.getArea());
		System.out.println("Rectangle 1 has a perimeter of " + rect1.getPerimeter());
		System.out.println("Rectangle 2 characteristics");
		System.out.println("Rectangle 2 has a width of " + rect1.getWidth());
		System.out.println("Rectangle 2 has a height of " + rect1.getHeight());
		System.out.println("Rectangle 2 has an area of " + rect1.getArea());
		System.out.println("Rectangle 2 has a perimeter of " + rect1.getPerimeter());

	}

	// default value for width and height is 1
	double width = 1;
	double height = 1;

	// no-arg constructor that creates a default rectangle
	public Rectangle() {

	}

	public Rectangle(double wid, double heig) {
		width = wid;
		height = heig;
	}
   //return width
	public double getWidth() {
		return width;
	}
    //return height
	public double getHeight() {
		return height;
	}
   //return area
	public double getArea() {
		return height * width;
	}
   //return perimeter
	public double getPerimeter() {
		return 2 * width + 2 * height;
	}

}