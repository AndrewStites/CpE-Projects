import java.util.Scanner;

public class PointInARectangle {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter the x coordinate: ");
		double x = input.nextDouble();

	System.out.print("Please enter the y coordinate: ");
		double y = input.nextDouble();

	//Check whether the point is in the rectangle
	boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2) ||
		(Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

	//Display results
	System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle)? "in" : "not in") + " the rectangle");

	}


}