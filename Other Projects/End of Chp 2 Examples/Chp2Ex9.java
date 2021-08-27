import java.util.Scanner;

public class Chp2Ex9 {
	public static void main(String[]args) {

	//Create a Scanner

	Scanner input = new Scanner(System.in);

	//Prompt the user to enter the variables regarding acceleration

	System.out.println("Please enter:");

	System.out.print("v1 (ending velocity): ");

	double v1 = input.nextDouble();

	System.out.print("v0 (initial velocity): ");

	double v0 = input.nextDouble();

	System.out.print("t (time): ");

	double t = input.nextDouble();

	//Calculations

	double a = ((v1 - v0) / t);

	//Display

	System.out.println("Your acceleration is " + a);






	}

}