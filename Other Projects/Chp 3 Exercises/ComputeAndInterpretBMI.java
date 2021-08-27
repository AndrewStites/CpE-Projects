import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter weight in pounds
	System.out.print("Please enter your weight in pounds: ");
		double weight = input.nextDouble();

	//Prompt the user to enter height
	System.out.print("Enter feet: ");
		int feet = input.nextInt();
	System.out.print("Enter inches: ");
		int inches = input.nextInt();

	//Calculaitons for feet and inches
	int height = (feet * 12) + inches;

	double weightInKilograms = weight * 0.45359237;
	double heightInMeters = height * 0.0254;
	double bmi = weightInKilograms /
		Math.pow(heightInMeters, 2);

	//Interpret the BMI
	System.out.println("Your BMI is " + bmi);
	if (bmi < 18.5)
		System.out.println("Underweight");
	else if (bmi < 25.0)
		System.out.println("Normal");
	else if (bmi < 30.0)
		System.out.println("Overweight");
	else
		System.out.println("Obese");










	}




}