import java.util.Scanner;

public class Chp2Ex7 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	System.out.print("Input an amount of minutes: ");

	int minutes = input.nextInt();

	//Calculations
	/*Did it wrong the first time and went back to fix the problem. I took minutes
	and divided it by 60 to get hours--hours divided by 24--years divided by 365 to
	get their respective dividends. I was stumped trying to figure out how to use the
	remainder (%) operator to get the amount of days leftover. Soon, I just tried different
	variables until I got the number that was akin to the hint in the book (intro to java programming).
	I still do not completely understand why "days = days % 365" is the correct way.*/

	int hours = minutes / 60;

	int days = hours / 24;

	int years = days / 365;

		days = days % 365;


	//Display

	System.out.println(minutes + " minute(s) is " + years + " year(s) and " + days + " days");


	}


}