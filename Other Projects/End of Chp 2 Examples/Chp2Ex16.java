import java.util.Scanner;

public class Chp2Ex16 {

	public static void main(String[]args) {


	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter the side of a hexagon: ");

		double side = input.nextDouble();

	//Calculation

	double area = ((3 * Math.pow( 3, 0.5)) / 2) * Math.pow( side, 2);

	//Display

	System.out.println("The area of the hexagon is " + area);






	}


}