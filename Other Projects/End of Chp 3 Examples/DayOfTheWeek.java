import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user to enter the needed info
	System.out.print("Enter the year: (e.g., 2012): ");
		int year = input.nextInt();

	System.out.print("Enter day of the month: 1-31: ");
		int q = input.nextInt();

	System.out.print("Enter month: 1-12: ");
		int m = input.nextInt();

			if (m == 1){
			m = 13;
			}

			else if (m == 2){
			m = 14;
			}

	//Calculations to get "j"
	double j = year / 100;

	//Calculations to get "k"
	double k = year % 100;

	//Main Calculation
	int h = (int)(q + ((26 * (m + 1)) / 10.0) + k + (k / 4.0) + (j / 4.0) + (5 * j)) % 7;

	//Use a switch
	String textMate = "";
	switch (h) {
		case 0:textMate = "Saturday"; break;
		case 1:textMate = "Sunday"; break;
		case 2:textMate = "Monday"; break;
		case 3:textMate = "Tuesday"; break;
		case 4:textMate = "Wednesday"; break;
		case 5:textMate = "Thursday"; break;
		case 6:textMate = "Friday"; break;
		default:System.out.println("Invalid, try again"); break;
		}
	System.out.println("The day of the week is " + textMate);
	}

}