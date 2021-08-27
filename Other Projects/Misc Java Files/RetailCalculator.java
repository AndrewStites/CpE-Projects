import java.util.Scanner;

public class RetailCalculator{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter the wholesale price of the item: ");
		double wholeSalePrice = input.nextDouble();

	System.out.println("Please enter the percent to markup (e.g. 25 or 35 or 67): ");
		double markUp = input.nextDouble();

	System.out.println("The retail amount: " + calculateRetail(wholeSalePrice, markUp));
	}

public static double calculateRetail(double wholeSalePrice, double markUp){

	double markUpPercentage = markUp / 100.0;

	double wholeSalePercent = markUpPercentage * wholeSalePrice;

	double totalAmount = wholeSalePercent + wholeSalePrice;

	return totalAmount;

}


}