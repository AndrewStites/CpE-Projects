import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Enter an integer: ");

		int integer = input.nextInt();

	if (integer % 5 == 0)
		System.out.println("HIFIVE!!!");

	if (integer % 2 == 0)
		System.out.println("HIEVEN!!!");
	}



}


/*if (y > 0)
	x = 1;

if (pay >= 90)
	multiplier = pay * 0.03;
	pay += multiplier;
else
	multiplier = pay * 0.01;
	pay += multiplier;
	*/