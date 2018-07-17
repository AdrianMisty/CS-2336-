/*Adriana Alva
  CS 2336.0U1
  HW # 4
*/
public class Circle_Comparable {

	public static void main(String[] args) {
		Circle circ1 = new Circle(2);
		Circle circ2 = new Circle(2);
		Circle circ3 = new Circle(6);
		Circle circ4 = new Circle(9);
		//test equals method
		System.out.println("Does circle 1 equals circle 2? " + circ1.equals(circ2));
		System.out.println("Does circle 3 equals circle 4? " + circ3.equals(circ4));

	}


   private static class Circle extends GeometricObject {
   private double radius;
   //arg-constructor 
    public Circle(double radius) {
        this.radius = radius;
    }
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
    //getter : Return radius
    public double getRadius() {
        return radius;
    }
    //setter : set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //calculate diameter and return
    public double getDiameter() {
        return 2 * radius;
    }
    //Override method
    public boolean equals(Object obj) {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }
}
}