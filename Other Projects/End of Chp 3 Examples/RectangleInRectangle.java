import java.util.Scanner;

public class RectangleInRectangle {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter r1's x, y coordinates, height, and width: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double height = input.nextDouble();
		double width = input.nextDouble();

	System.out.print("Please enter r2's x, y coordinates, height, and width: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double height2 = input.nextDouble();
		double width2 = input.nextDouble();

	//Calculations
		double r1Area = height * width;
		double r2Area = height2 * width2;
		double distance = Math.pow(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2), 0.5);
		double halfHeight = height * 0.5;
		double halfWidth = width * 0.5;

	//Logic
	if (r1Area > r2Area) { //&& distance < halfHeight  && distance < halfWidth) {

		System.out.println("R2 is in R1!" + distance);

	}



	}

}