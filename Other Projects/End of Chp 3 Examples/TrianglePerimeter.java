import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	String textMate = "";

	//Prompt the user to enter the three edges
	System.out.print("Please input three edges for a triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

	//if/then statement to determine the validity
	if (a + b > c && b + c > a && c + a > b) {
		//Calculations
		double perimeter;

		perimeter = a + b + c;

		System.out.println("The Perimeter is " + perimeter);
	}
	else {
		if (a + b < c) {
			textMate = "Make sure a + b > c";
			}
		else if (b + c < a) {
			textMate = "Make sure b + c > a";
			}
		else {
			textMate = "Make sure c + a > b";
			}
	System.out.println("Invalid input: " + textMate);
	}

    }
}