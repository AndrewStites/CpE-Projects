import java.util.Scanner;

public class FindMonthAndYear {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter the number for the month and the year: ");
		byte month = input.nextByte();
		int year = input.nextInt();

	//Calculation for leap years
	//A leap year is divisible by 4
	boolean isLeapYear = (year % 4 == 0);

	//A leap year is not divisible by 100
			isLeapYear = isLeapYear && (year % 100 != 0);

	//A leap year is also divisible by 400
			isLeapYear = isLeapYear || (year % 400 == 0);

	//If statement for February's leap year
	int day = 0;
	if (isLeapYear)
		day = 29;

	//Switch statement to find the month
	switch (month){
		case 1: System.out.println("January had 31 days in " + year); break;
		case 2: System.out.println("February had " + day + " days in " + year); break;
		case 3: System.out.println("March had 31 days in " + year); break;
		case 4: System.out.println("April had 30 days in " + year); break;
		case 5: System.out.println("May had 31 days in " + year); break;
		case 6: System.out.println("June had 30 days in " + year); break;
		case 7: System.out.println("July had 31 days in " + year); break;
		case 8: System.out.println("August had 31 days in " + year); break;
		case 9: System.out.println("September had 30 days in " + year); break;
		case 10: System.out.println("October had 31 days in " + year); break;
		case 11: System.out.println("November had 30 days in " + year); break;
		case 12: System.out.println("December had 31 days in " + year); break;

	}


	}



}