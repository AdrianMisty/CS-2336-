
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class REMOVE_DUPLICATE {

	public static void main(String[] args) {
		//prompt user for 10 #'s
		System.out.print("Enter ten integers : ");
		Scanner in = new Scanner(System.in);
		//input user response into list
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 0; x < 10; x++)
			list.add(in.nextInt());

		// invoke method
		removeDuplicate(list);
		// display the distinct integers seperated by exactly one space
		System.out.print("The distinct integers are ");
		for (int a = 0; a < list.size(); a++) {
			
			System.out.print(list.get(a) + " ");
			
		}
	}

	// neccessary method from word doc.
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> move = new ArrayList<>();
		for (int a = 0; a < list.size(); a++) {
            //fill new list with elements and check if it already exists in the list before adding
			if (!move.contains(list.get(a))) {
				move.add(list.get(a));
			}
		}
		// delete all original contents
		list.clear();
		// add elements to list that has no duplicates
		list.addAll(move);

	}
}
