import java.util.Scanner;

public class Chp2Ex14 {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);


	//Prompt the user
	System.out.println("Please enter the following: ");

	System.out.print("Weight in lbs.: ");

		double pounds = input.nextDouble();

	System.out.print("Height in inches: ");

		double inches = input.nextDouble();

	//Conversions

	double kilograms = pounds * 0.45359237;

	double meters = inches * 0.0254;

	//Calculations

	Double BMI = kilograms / (Math.pow(meters, 2));

	//Display

	System.out.println("Your BMI is " + BMI);



	}










}