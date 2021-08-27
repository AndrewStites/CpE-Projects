import java.util.Scanner;

public class Chp2Ex1 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter a degree in Celsius: ");

	double celsiusDegree = input.nextDouble();

	//Calculation to Fahrenheit
	double fahrenheit = (9 / 5.0) * celsiusDegree + 32;

	//Display to the user
	System.out.println(celsiusDegree + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");

	}

}