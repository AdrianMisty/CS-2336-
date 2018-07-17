/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST_SORT {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// prompt user to enter 5 numbers
		System.out.print("Enter 5 numbers : ");
		ArrayList<Integer> list = new ArrayList<>();

		for (int a = 0; a < 5; a++)
			list.add(in.nextInt());
		// invoke method
		sort(list);
		// display them in increasing order
		System.out.println("Array in increasing order : ");
		System.out.println(list);
	}

	// neccessary method from word doc.
	public static void sort(ArrayList<Integer> list) {
		// sorting in increasing order
		for (int x = 0; x < list.size() - 1; x++) {
			int Min = list.get(x);
			int Indx = x;
			// check elements as to have smaller #'s on the left and
			// larger numbers on the right
			for (int y = x + 1; y < list.size(); y++) {
				if (Min > list.get(y)) {
					Min = list.get(y);
					Indx = y;
				}
			}

			if (Indx != x) {
				list.set(Indx, list.get(x));
				list.set(x, Min);
			}
		}
	}
}
