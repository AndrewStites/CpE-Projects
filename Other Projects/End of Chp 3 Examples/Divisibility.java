import java.util.Scanner;


public class Divisibility {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.println("Please input an integer: ");
		double integer = input.nextDouble();

	//Logic
	boolean checkNum = (integer % 5) == 0 && (integer % 6) == 0;
	boolean	checkNum2 = (integer % 5) == 0 || (integer % 6) == 0;
	boolean checkNum3 = (integer % 5) == 0 ^ (integer % 6) == 0;

	//Display Results
	System.out.println(integer + " is divisible by 5 and 6; " + checkNum);
	System.out.println(integer + " is divisible by 5 or 6; " + checkNum2);
	System.out.println(integer + " is divisible by 5 or 6, but not both; " + checkNum3);

	}


}