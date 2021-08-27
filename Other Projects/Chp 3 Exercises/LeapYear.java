import java.util.Scanner;

public class LeapYear {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a year: ");

		int year = input.nextInt();

	//Check if year is a leap year
	boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	//Display
	System.out.println(year + " is a Leap Year? " + isLeapYear);


	}




}