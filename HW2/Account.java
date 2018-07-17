
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
        // use test case provided from word doc.
		Account account1 = new Account(1122, 20000.00);
		account1.setannualInterestRate(4.5);
		account1.withdraw(2500.00);
		account1.deposit(3000);
		System.out.println("The account's balance is $"+ account1.getBalance());
		System.out.println("The account's monthly interest is " + account1.getMonthlyInterest() + " % ");
	    System.out.println("The account was created " + account1.getDateCreated());
	}

	// all set at default values
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;

	// no-arg constr. that creates a default account
	public Account() {
		dateCreated = new java.util.Date();
	}

	// constr. creates account with id & balance
	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	// accessor methods for id
	public int getId() {
		return this.id;
	}

	// accessor method for balance
	public double getBalance() {
		return this.balance;
	}

	// accessor method for getannualInterestRate
	public double getannualInterestRate() {
		return annualInterestRate;
	}

	// mutator methods for id
	public void setId(int id) {
		this.id = id;
	}

	// mutator methods for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// mutator methods for annualInterestRate
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	// return monthly interest rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	// return monthly interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// withdraw from an account
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	// deposit amount into account
	public void deposit(double amount) {
		this.balance += amount;
	}
}