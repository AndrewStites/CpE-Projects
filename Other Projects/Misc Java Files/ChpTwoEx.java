import java.util.Scanner;

public class ChpTwoEx {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a random number to find its remainder: ");

	int randomNumber = input.nextInt();

	System.out.print("Enter the second number: ");

	int randomNumberTwo = input.nextInt();

	double answer = randomNumber % randomNumberTwo;

	System.out.println("The remainder is " + answer);


	}
}