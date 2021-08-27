import java.util.Scanner;

public class SolveQuadraticEquation {

	public static void main (String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.println("Please input a number for:");
	System.out.print("a: ");
		double a = input.nextDouble();
	System.out.print("b: ");
		double b = input.nextDouble();
	System.out.print("c: ");
		double c = input.nextDouble();

	//Calculation
	double d = b * b - 4 * a * c;

	double root1 = ((-b) - (Math.pow(d, 0.5))) / (2 * a);

	double root2 = ((-b) + (Math.pow(d, 0.5))) / (2 * a);

	//Logic

	if (d > 0) {

		System.out.println("The equation has two real roots: " + root1 + " " + root2);

    }
	else if (d == 0) {

		System.out.println("The equation has one real root: " + root1);
    }
	else
		System.out.println("There are no real roots");


	System.exit(0);

}
}