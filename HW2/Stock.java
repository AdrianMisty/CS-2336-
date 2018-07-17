
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		//create a stock object
		Stock first = new Stock("ORCL", "Oracle Corporation");
        first.setPreviousClosingPrice(34.5);
        first.setCurrentPrice(34.35);
        //print out in desired format
        System.out.println("Stock name: " + first.getName());
        System.out.println("Symbol: " + first.getSymbol());
        System.out.println("Previous price: $" + first.getPreviousClosingPrice());
        System.out.println("Current price: $" + first.getCurrentPrice());
        System.out.printf("Percent changed: %.2f",first.getChangePercent());
	}
    //string data field that are needed
	String symbol;
	String name;
    // double data fields that are needed
	double previousClosingPrice;
    double currentPrice;
    //constructor that creates a stock with a symbol and name
	public Stock(String symbo, String nam) {
		symbol = symbo;
		name = nam;
	}
    //getter:return symbol
	public String getSymbol() {
		return symbol;
	}
    //setter for symbol
	public void setSymbol(String symbo) {
		symbol = symbo;
	}
	//getter:return name
	public String getName() {
		return name;
	}
    //setter for name
	public void setName(String nam) {
		name = nam;
	}
	//getter:return current price
	public double getCurrentPrice() {
		return currentPrice;
	}
    //setter CurrentPrice
	public void setCurrentPrice(double currentPricee) {
		currentPrice = currentPricee;
	}
    //getter  previousclosing price
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
    //setter for previousclosing price
	public void setPreviousClosingPrice(double previousClosingPricee) {
		previousClosingPrice = previousClosingPricee;
	}
    //calculate percentage change in price
	public double getChangePercent() {
		double result = ((currentPrice - previousClosingPrice) / previousClosingPrice);
		return result*100;
	}

}
