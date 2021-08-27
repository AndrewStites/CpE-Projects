import java.util.Scanner;

public class MoneyIssues {

	public static void main(String[]args) {


	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please input the Amount of RMB: ");

		double amount = input.nextDouble();

	//Calculations
	double rate = amount / 3000;

	double fee = rate * 17;

	//Conversion
	double usd = fee / 6.64;

	//Display
	System.out.println("Cost: " + fee);

	System.out.println("USD Cost: $" + (int)usd);

	}

}