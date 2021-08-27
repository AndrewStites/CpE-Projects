import java.util.Scanner;

public class Chp2Ex8 {
	/*public static void main(String[]args) {

		double a = 6.5;
		a += a + 1;

		//When I run this program, the answer will be 14. "a" starts as "6.5" in the statement.
		//in the expression, the equation reads as (6.5 = 6.5 + 6.5 + 1)

		System.out.println(a);*/


	 public static void main(String[]args) {

		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Prompt the user to input a offset
		System.out.print("Please input an offset from GMT: ");

		byte offSet = input.nextByte();

		//Obtain the current milliseconds since the Unix Epoch
		long totalMilliSeconds = System.currentTimeMillis();

		//Obtain the total seconds
		long totalSeconds = totalMilliSeconds / 1000;

		//Obtain the current second in the min in the hour
		long currentSecond = totalSeconds % 60;

		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		//Obtain the current minute in the hour
		long currentMinute = totalMinutes % 60;

		//Obtain the total hours
		long totalHours = totalMinutes / 60;

		//Obtain the current hour
		long currentHour = totalHours % 24;

			currentHour = offSet + currentHour;

		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");



	}

}