import java.util.Scanner;

public class Chp2Ex5 {

	public static void main (String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.println("Please enter the: ");

	System.out.print("Meal Price: ");

	double mealPrice = input.nextDouble();

	System.out.print("Gratuity: ");

	double gratuity = input.nextDouble();

	gratuity = gratuity / 100.0;

	//Calculations
	double totalGratuity = gratuity * mealPrice;

	double totalMeal = totalGratuity + mealPrice;

	//Display
	System.out.println("The gratuity of your meal is $" + ((totalGratuity * 100.0) / 100.0) + " and your total cost is $" + totalMeal);

	}

}