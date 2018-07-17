//Adriana Alva
//CS 2336.0U1
//HW#4
public class Rectangle_Comparable {

	public static void main(String[] args) {
		//test
		Rectangle rect1 = new Rectangle(20, 10);
		Rectangle rect2 = new Rectangle(20, 10);
		Rectangle rect3 = new Rectangle(2, 1);
		Rectangle rect4 = new Rectangle(5, 6);
		System.out.print("Does Rect 1 equal Rect 2 ? : ");
		System.out.print(rect1.equals(rect2));
		System.out.println(" ");
		System.out.print("Rect 1 compare to Rect 2 : ");
		System.out.print(rect1.compareTo(rect2));
		//test
		System.out.println(" ");
		System.out.print("Does Rect 3 equal Rect 4 ? : ");
		System.out.print(rect3.equals(rect4));
		System.out.println(" ");
		System.out.print("Rect 3 compare to Rect 4 : ");
		System.out.print(rect3.compareTo(rect4));

	}

	private static class Rectangle extends GeometricObject {
		//private data fields we need
		private double width;
		private double length;
        //arg-cosntructor
		public Rectangle(double width, double length) {
			this.width = width;
			this.length = length;
		}

		public Rectangle(double width, double length, String color, boolean filled) {
			this.width = width;
			this.length = length;
			setColor(color);
			setFilled(filled);
		}
		//getter : return width
		public double getWidth() {
			return width;
		}
       // setter for width
		public void setWidth(double width) {
			this.width = width;
		}
       //getter for length
		public double getLength() {
			return length;
		}

		// setter : height with inputted value
		public void setHeight(double length) {
			this.length = length;
		}

		//getter: return area
		public double getArea() {
			return width * length;
		}

		// getter : return perimeter
		public double getPerimeter() {
			return 2 * (width + length);
		}

		// Override method
		public boolean equals(Object obj) {
			return obj instanceof Rectangle && getArea() == ((Rectangle) obj).getArea();
		}
	}
}
