import java.util.Scanner;

public class Chp2Ex4 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a value for pounds: ");

	double pounds = input.nextDouble();

	double kilogramRate = .454;

	//Calculation

	double kilograms = kilogramRate * pounds;

	//Display

	System.out.println(pounds + " pound(s) is " + ((int)(kilograms * 100) / 100.0) +
		" in kilograms");

	}


}