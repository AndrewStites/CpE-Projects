import java.util.Scanner;

public class Chp2Ex2 {

	public static void main (String[]args) {

	//Create a Scanner
		Scanner input = new Scanner(System.in);

	//Prompt the user
		System.out.println("Please enter the dimensions for a cylinder:");

		System.out.print("radius: ");

		double radius = input.nextDouble();

		System.out.print("length: ");

		double length = input.nextDouble();

	//Calculations for the area

		final double PI = 3.14;

		double area = Math.pow(radius, 2) * PI;

	//Calculations for volume

		double volume = area * length;

	//Display the results

		System.out.println("The volume is " + ((int)(volume * 100) / 100.0) + " and the area is " + ((int)(area * 100) / 100.0));

	}


}