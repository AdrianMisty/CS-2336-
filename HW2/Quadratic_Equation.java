/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class Quadratic_Equation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Create QuadEq. obj.
		QuadraticEq equation = new QuadraticEq(a, b, c);
		double discri = equation.getDiscriminant();

		// check discri. cases for roots
		if (discri > 0) { 
			//discriminant is positive: return value
			System.out.println("Discriminant = " + discri);
			System.out.printf("The equation has two roots %.6f and %.6f", equation.getRoot1(), equation.getRoot2());
		} else if (discri == 0) {
			//if discimiant is zero, return zero
			System.out.println("Discriminant = 0");
			System.out.println("The equation has one root  " + equation.getRoot1());
		} else { 
			// if discriminant is negative, return -1
			System.out.println("Discriminant = -1");
			System.out.println("This equation has no real roots");

		}
	}
}
//Don't forget to also make the UML diagram for this class
class QuadraticEq{
    //private data fields for a,b,c 
    private double a;
    private double b;
    private double c;
    // constr. arg. for a,b,c
    public QuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //setter and getter for a
    public double getA() { 
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
   //setter and getter for b
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    // setter and getter for c
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //returns the discriminant using equation provided
    public double getDiscriminant() {
        return b * b - 4.0 * a * c;
   }
   // methods to return two roots in the equations
   public double getRoot1() {
           return  (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
   }

   public double getRoot2() {
           return  (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
   }
}

