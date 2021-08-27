import java.util.Scanner;

public class MoreExponentPractice {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	//Prompt the user for input

	System.out.print("Enter a number for m: ");

	double m = input.nextDouble();

	System.out.print("Enter a number for r: ");

	double r = input.nextDouble();

	final byte SQUARE = 2;

	double exponent = Math.pow(r, SQUARE);

	double product = m * exponent;

	System.out.println("The answer is " + product);

	}


}