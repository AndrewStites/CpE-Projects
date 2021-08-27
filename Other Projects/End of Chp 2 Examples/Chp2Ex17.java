import java.util.Scanner;

public class Chp2Ex17 {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a temperature between -58F and 41F: ");

		double temp = input.nextDouble();

	System.out.print("Please enter the wind speed (>=2): ");

		double windSpeed = input.nextDouble();

	//Calculation

	double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow( windSpeed, 0.16) + 0.4275 * temp * Math.pow( windSpeed, 0.16);

	//Display

	System.out.println("The wind chill outside is " + windChill);




	}



}