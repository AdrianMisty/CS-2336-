//Adriana Alva
// HW#4
//use this for rectangle and circle
public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "red";
    private boolean filled;
    private java.util.Date dateCreated;

    // no -arg Constructur for a default 
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    //Constructor with arg color and filled value 
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //return color
    public String getColor() {
        return color;
    }
    //set color with inputted value
    public void setColor(String color) {
        this.color = color;
    }
    //return filled
    public boolean isFilled() {
        return filled;
    }
    //set filled with input
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
     //date created
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

   // Override use for rectangle and circle
    public String toString() {
        return "created on : " + dateCreated + "\ncolor : " + color +" and filled : " + filled;
    }

    //Override use for rectangle and circle
    public int compareTo(GeometricObject obj) {
        if (getArea() > obj.getArea())
            return 1;
        else if (getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }
  
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }

    public static double sumArea(GeometricObject[] a) {
        double result = 0;
        for (GeometricObject x : a) {
            result += x.getArea();
        }
        return result;
    }
    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
}