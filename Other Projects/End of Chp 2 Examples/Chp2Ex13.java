import java.util.Scanner;

public class Chp2Ex13 {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter the monthly amount: ");

		double amount = input.nextDouble();

	//Calculations

	double monthlyInt = 0.05 / 12;

	final double CONSTANT = 1 + monthlyInt;

	double grandAmount = amount * CONSTANT;

		grandAmount = (amount + grandAmount) * CONSTANT;

		grandAmount = (amount + grandAmount) * CONSTANT;

		grandAmount = (amount + grandAmount) * CONSTANT;

		grandAmount = (amount + grandAmount) * CONSTANT;

		grandAmount = (amount + grandAmount) * CONSTANT;

	System.out.println("Your grand total for the sixth month will be $" + ((int)grandAmount / 100) * 100.0);







	}


}