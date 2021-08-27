import java.util.Scanner;

public class ComputeLoan {

	public static void main (String[] args) {

	//Inititating a scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Enter your annual interest rate: ");

	double annualInterestRate = input.nextDouble();

	//1200 is for the 100 to turn it into a decimal and the 12 is for the months in a year, then multiplication
	double monthlyInterestRate = annualInterestRate / 1200;

	//Prompt the user
	System.out.print("Enter the length of your loan in years: ");

	byte loanLength = input.nextByte();

	//Prompt the user
	System.out.print("Enter your loan amount: ");

	double loanAmount = input.nextDouble();

	//Calculate monthly payment
	double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
	1 / Math.pow(1 + monthlyInterestRate, loanLength * 12.0));

	//Calculate total payment
	double totalPayment = monthlyPayment * loanLength * 12.0;

	//Display to the user
	System.out.println("The amount you have to pay each month is $" + (((int)monthlyPayment *100) / 100));

	System.out.println("The total payment for your loan is $" + (((int)totalPayment *100) / 100));

	}



}