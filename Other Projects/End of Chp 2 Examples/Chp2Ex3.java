import java.util.Scanner;

public class Chp2Ex3 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a value for feet: ");

	double feet = input.nextDouble();

	double metersRate = .305;

	//Calculation

	double meters = feet * metersRate;

	//Display

	System.out.println(((int)(feet * 100) / 100.0) + " feet is " + ((int)(meters * 100) / 100.0) + " in meters");


	}

}