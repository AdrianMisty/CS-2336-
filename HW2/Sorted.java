/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
        //prompt user input
		System.out.print("Enter list : ");
		Scanner inpu = new Scanner(System.in);
		
		int newb = inpu.nextInt();
		int[] lista = new int[newb];
        // process inputted list into an array
		for (int c = 0; c < lista.length; c++) {
			lista[c] = inpu.nextInt();
		}
        //invoke method sort
		String sort = " not ";
		if (isSorted(lista))
			sort = " already ";

		System.out.print("The list is" + sort + "sorted");

	}
    //method neccesary
	public static boolean isSorted(int[] list) {
	//if not sorted, return false
		for (int a = 0; a < list.length - 1; a++) {
			if (list[a] > list[a + 1])
				return false;
		}
		return true;//if sorted
	}
}
