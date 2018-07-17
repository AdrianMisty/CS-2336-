
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.ArrayList;
import java.util.Scanner;
public class ARRAYLIST_SUM {

	public static void main(String[] args) {
		//prompt user for 5 numbers
		Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 numbers : ");
        ArrayList<Double> list = new ArrayList<>();
        //put inputed values into array list       
        for (int a = 0; a < 5; a++) 
        	list.add(in.nextDouble());
        //display total sum
        System.out.println("Total sum is : " + sum(list));

	}
	//neccessary method from word doc
	public static double sum(ArrayList<Double> list) {
        // calculate sum
        double totalsum = 0;
        //for(){} to add up elements in array list
        for (double a : list) {
            
        	totalsum += a;
        }
        //return total sum
        return totalsum;
    }

}
