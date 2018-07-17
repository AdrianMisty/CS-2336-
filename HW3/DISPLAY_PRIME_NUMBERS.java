
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class DISPLAY_PRIME_NUMBERS {

	public static void main(String[] args) {

		System.out.println("Prime #'s < 120 in decreasing order ");

		StackOfIntegers stack = new StackOfIntegers(20);
		// we want prime #'s <120
		for (int a = 2; a < 120; a++) {
			if (isPrime(a)) {
				stack.tothetop(a);
			}
		}
		//as long as there is something in the stack
		//keep going
		while (!stack.nothing()) {
			System.out.print(stack.removeTop() + " ");
		}
	}
    //check that numbers is prime
	public static boolean isPrime(int num) {
        //given a # and check all numbers that come before it
		double range = Math.sqrt(num);
		for (int x = 2; x < range; x++) {
			if (num % x == 0)
				return false;
		}
		return true;
	}
}

class StackOfIntegers {

	int[] array;
	int size;

	// stack default value of capacity
	public StackOfIntegers() {
		this(17);
	}

	// stack with set capacity
	public StackOfIntegers(int capac) {
		array = new int[capac];
	}

	public int tothetop(int value) {
		if (size >= array.length) {
			// move int to the top of the stack
			int[] move = new int[array.length * 2];
			System.arraycopy(array, 0, move, 0, array.length);
			array = move;

		}

		return array[size++] = value;
	}

	// return size
	public int getSize() {
		return size;
	}

	// case 1: stack is empty
	public boolean nothing() {
		return size == 0;
	}

	// remove the element at the top of the stack after returning it
	public int removeTop() {
		return array[--size];
	}

	// return the element at the top of the stack
	public int top() {
		return array[size - 1];
	}

}