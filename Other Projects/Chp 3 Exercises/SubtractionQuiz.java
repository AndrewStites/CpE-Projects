import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Generate two random integers
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);

	//Add in the current time in Milliseconds
	long currentTimeInMillis = System.currentTimeMillis();

	//if statement to add in an occasional addition problem

	if (currentTimeInMillis % 10 >= 6) {
		System.out.print("What is " + number1 * 10 + " + " + number2 * 10 + "? ");
			int answer = input.nextInt();
		if (number1 * 10 + number2 * 10 == answer) {
			System.out.println("That is correct!");
			}
		else{
			System.out.println("Your answer is incorrect.");
					System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
			}
		}

   else{
	//If number1 < number2, then swap them
	if (number1 < number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}

	//Prompt the student to answer
	System.out.print("What is " + number1 + " - " + number2 + "? ");
		int answer = input.nextInt();

	//Grade the answer and display
	if (number1 - number2 == answer)
		System.out.println("That is correct!");
	else {
		System.out.println("Your answer is incorrect.");
		System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));

	}
}
System.out.println(currentTimeInMillis % 10);

	}


}