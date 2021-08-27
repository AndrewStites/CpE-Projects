import java.util.Scanner;

public class Chp2Ex15 {

	public static void main(String[]args) {

	//Create a Scanner

	Scanner input = new Scanner(System.in);

	//Prompt the user

	System.out.println("Please enter the following: ");

	System.out.print("X1: ");

		double x1 = input.nextDouble();

	System.out.print("X2: ");

		double x2 = input.nextDouble();

	System.out.print("Y1: ");

		double y1 = input.nextDouble();

	System.out.print("Y2: ");

		double y2 = input.nextDouble();

	//Calculation

	double distance = (Math.pow( (Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2)), 0.5));

	//Display

	System.out.println("The distance between the two points is " + distance);





	}


}
