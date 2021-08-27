import java.util.Scanner;

public class ComputeChange {

	public static void main (String[]args) {

	//Create Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter an amount
	System.out.print("Enter an amount of money: ");

	double amount = input.nextDouble();

	//Convert amount into cents
	int remainingAmount = (int)(amount * 100);

	int dollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

	int quarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

	int dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

	int nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

	//Display Information
	System.out.println("The amount of dollars of the initial amount is " + dollars);
	System.out.println("The amount of quarters of the initial amount is " + quarters);
	System.out.println("The amount of dimes of the initial amount is " + dimes);
	System.out.println("The amount of nickels of the initial amount is " + nickels);
	System.out.println("The amount of pennies of the initial amount is " + remainingAmount);

	}

}