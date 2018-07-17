
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ATM_MACHINE {

	public static void main(String[] args) {

		ATM_MACHINE[] account = new ATM_MACHINE[10];
		// create 10 accounts with intial balance of $100
		for (int i = 0; i < 10; i++) {
			account[i] = new ATM_MACHINE(i, 100);
		}
		// prompt user to enter ID
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter ID: ");
			// if ID is incorrect, ask user to enter a correct ID
			int id = in.nextInt();
			while ((id > 10) || (id < 0)) {
				System.out.print("Please enter the correct ID: ");
				id = in.nextInt();

			}
			// Once ID is accepted, display main menu
			while (true) {
				// display choices user has
				System.out.println("Welcome to this ATM !");
				System.out.println("1 : For current balance");
				System.out.println("2 : For deposit money");
				System.out.println("3 : For withdraw money");
				System.out.println("4 : For exit menu");

				int choice = in.nextInt();
				// once user makes choice invoke the right methods
				// 1.Current Balance
				if (choice == 1) {
					System.out.println("Your current balance is $" + account[id].getBalance());
				}
				// 2.Deposit Money
				else if (choice == 2) {
					System.out.print("Enter the amount you wish to deposit : $");

					double deposit = in.nextDouble();
					account[id].deposit(deposit);

				}
				// 3.Withdraw Money
				else if (choice == 3) {

					System.out.print("Enter the amount you wish to withdraw : $ ");

					double withdraw = in.nextDouble();
					account[id].withdraw(withdraw);

				}
				// 4. Exit main menu
				else if (choice == 4) {
					System.out.println("Exitting Main Menu");
					// prompt for ID after exittig main menu
					System.out.print("Enter the ID: ");
					int finalID = in.nextInt();

					while (finalID != id) {

						System.out.print("Please enter the correct ID : ");
						id = in.nextInt();

					}
					System.out.println("Exit");
				}
			}
		}
	}

	public int id;
	public double balance;
// default values
	public ATM_MACHINE() {

		id = 0;
		balance = 0.00;

	}
//with specified id & balance
	public ATM_MACHINE(int a, double b) {
		id = a;
		balance = b;

	}
// return balance
	public double getBalance() {
		return balance;

	}
//deposity $$$ into balance
	public void deposit(double a) {
		balance = balance + a;

	}

	public void withdraw(double w) {
    //check if you can withdraw
		if (w <= balance) {
			balance = balance - w;
		} 
		else {
			System.out.println("Not enough money to withdraw this amount.");
		}
	}
}
