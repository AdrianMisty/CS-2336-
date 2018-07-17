
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;
public class Eliminate_Duplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  int[] num = new int[10];
		 
		  System.out.print("Enter ten numbers : ");
		  // use for loop to fill array num
		  for (int a = 0; a < num.length; a++) {
			  num[a] = input.nextInt();
		  }
		 
		  System.out.print("The distinct numbers are : ");
		  //invoke method
		  num = eliminateDuplicates(num);
		  //use for loop to print out array  num
		  for (int b = 0; b < num.length; b++) {
			  System.out.print(num[b] + " ");
		  }		
	}

	public static int[] eliminateDuplicates(int[] list) {

		int[] temporary = new int[list.length];
		int tempIndx = 0;

		for (int a = 0; a < list.length; a++) {
            //first couple of elements will be the first verison of a duplicate
			// so let's set IsItACopy to false
			boolean IsItACopy = false;

			for (int b = 0; b < list.length; b++) {
				//check elements to see if IsItACopy will become true 
				if (temporary[b] == list[a]) {
					IsItACopy = true;
				}
			}   
				if (!IsItACopy) {
					temporary[tempIndx++] = list[a];
				}
		}
		int[] result = new int[tempIndx];
		// fill in the result array
		for (int c = 0; c < tempIndx; c++) {
			result[c] = temporary[c];
		}
        // return new array that has duplicates eliminated
		return result;
	}
}
