import java.util.Scanner;

public class ChpTwoExTwo {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Note: Sunday is considered the number zero. " + "Enter a number corresponding to the day of the week: ");

	byte Day = input.nextByte();

	System.out.print("Enter the amount days you want to go in the future: ");

	double futureDays = input.nextDouble();

	final byte WEEK = 7;

	double answer = (Day + futureDays) % WEEK;

	System.out.println("The day would be " + answer);


	}


}