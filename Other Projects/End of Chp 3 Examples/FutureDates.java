import java.util.Scanner;

public class FutureDates {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a day of the week (Sunday=0, Monday=1...): ");
		int day = input.nextInt();
	System.out.print("Please enter the amount of added days: ");
		int addedDays = input.nextInt();

		int temp = day + addedDays;
		String finalDayText = " ";
		String dayText = " ";

	switch (day) {
		case 0:dayText = "Sunday"; break;
		case 1:dayText = "Monday"; break;
		case 2:dayText = "Tuesday"; break;
		case 3:dayText = "Wednesday"; break;
		case 4:dayText = "Thursday"; break;
		case 5:dayText = "Friday"; break;
		case 6:dayText = "Saturday"; break;

	}

	switch (temp) {
		case 0:finalDayText = "Sunday"; break;
		case 1:finalDayText = "Monday"; break;
		case 2:finalDayText = "Tuesday"; break;
		case 3:finalDayText = "Wednesday"; break;
		case 4:finalDayText = "Thursday"; break;
		case 5:finalDayText = "Friday"; break;
		case 6:finalDayText = "Saturday"; break;

	}

	//Display
	System.out.println("Today is " + dayText + " and " + addedDays + " days from now it will be " + finalDayText);











	}



}