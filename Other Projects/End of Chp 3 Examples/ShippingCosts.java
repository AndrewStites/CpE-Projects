import java.util.Scanner;

public class ShippingCosts {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt user to enter package weight
	System.out.print("Please enter the weight of your package: ");
		double weight = input.nextDouble();

	//if/then statements to determine what the price is
	if (weight > 0 && weight <= 1) {
		System.out.println("3.5");
		}
	else if (weight > 1 && weight <= 3) {
		System.out.println("5.5");
		}
	else if (weight > 3 && weight <= 10) {
		System.out.println("8.5");
		}
	else if (weight > 10 && weight < 50) {
		System.out.println("10.5");
		}
	else {
		System.out.println("The package is too heavy to ship");
		}
	}


}