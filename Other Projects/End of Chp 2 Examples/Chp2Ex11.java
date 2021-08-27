import java.util.Scanner;

public class Chp2Ex11 {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.println("Please enter:");

	System.out.print("Velocity: ");

	double v = input.nextDouble();

	System.out.print("Acceleration: ");

	double a = input.nextDouble();

	//Calculaitons

	double length = Math.pow(v, 2) / (2 * a);

	//Display
	System.out.println("The minimum length for the runway would be " + (int)length);

	}


}