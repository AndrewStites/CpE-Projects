import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter any three digit number: ");
		int mainNumber = input.nextInt();
		int temp = mainNumber;
	//Calculations using the remainder to isolate digits
	 int lastDigit = mainNumber % 10;
		mainNumber = mainNumber / 100;

	int firstDigit = mainNumber % 10;

	//If statments to determine whether it is a palindrome or not
	if (firstDigit == lastDigit) {
		System.out.println(temp + " is a palindrome");
		}
	else {
		System.out.println(temp + " is not a palindrome");
		}

	}


}