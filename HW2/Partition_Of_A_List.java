/*
Name: Adriana Alva 
Class: CS 2336.0U1
Date : 6/2/2018
*/
import java.util.Scanner;
import java.util.*;

public class Partition_Of_A_List {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		// allow user to enter list of #'s
		System.out.print("Enter list :");
		int[] lista = new int[inp.nextInt()];
		// fill array with user's list so we can use the method partition
		for (int i = 0; i < lista.length; i++) {

			lista[i] = inp.nextInt();

		}		
		partition(lista);//call method

		System.out.print("After the partition, the list is : ");
		// w/o for loop, doesn't work for all scenarios
		// print out post partition list
		for (int i = 0; i < lista.length; i++) {

			System.out.print(lista[i] + " ");

		}
	}
	// method that partitions the lst using the first element,called a pivot
	public static int partition(int[] lista) {
		int partition = lista[0]; // 1st element was chosen
		int pLocation = 0; // pivot
		int last = lista.length-1 ;//length, error of index no bounds 

		while (pLocation < last) {
			// arrange elements less than pivot to be in front of it
			if (partition > lista[pLocation + 1]) {
				lista[pLocation] = lista[pLocation + 1];
				lista[pLocation + 1] = partition;
				pLocation++;
			} else {
				// switch positions if element in lista is greater than the pivot
				int move = lista[last];
				lista[last] = lista[pLocation + 1];
				lista[pLocation + 1] = move;
				last--;
			}
		}
		// method returns index of pivot's location
		return pLocation;
	}
}