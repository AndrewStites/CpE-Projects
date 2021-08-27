import java.util.Scanner;

public class VendingMachineChange {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter an integer from 1 to 99: ");
		int amountGiven = input.nextInt();

	System.out.println("Your change is being processed...");

	int quarters = 0, dimes = 0, nickles = 0, pennies = 0;

	 quarters = amountGiven / 25;
		int newAmount = amountGiven % 25;
	 dimes = newAmount / 10;
		newAmount = newAmount % 10;
	 nickles = newAmount / 5;
		newAmount = newAmount % 5;
	 pennies = newAmount;

	System.out.println("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickles: " + nickles + "\nPennies: " + pennies);

	}
}