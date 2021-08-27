import java.util.Scanner;

public class Lottery {

	public static void main(String[]args) {

	//Generate lottery number
	int lottery = (int)(Math.random() * 1000);

	//Create a Scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a lottery number between 1 and 1000 (three digits; ex. 088 or 240): ");
		int guess = input.nextInt();

	//Get digits from lottery
	//Using the division and remainder operators to separate the lottery number generated
	int lotteryDigit1 = lottery / 100;
	int lotteryDigit2 = (lottery % 100) / 10;
	int lotteryDigit3 = lottery % 10;

	//Get digits from guess
	//Using the division and remainder operators to separate the guess number inputed
	int guessDigit1 = guess / 100;
	int guessDigit2 = (guess % 100) / 10;
	int guessDigit3 = guess % 10;

	//Display lottery number
	System.out.println("The winning lottery number is " + lottery);

	//Check the guess
	//Check if the user has the winning numbers
	if (guess == lottery)
		 System.out.println("You guessed the winning numbers! You win $10,000!");

	//Check if the user matched the three digits
	else if (guessDigit1 == lotteryDigit2 &&
			 guessDigit2 == lotteryDigit3 &&
			 guessDigit3 == lotteryDigit1
			 			||
			 guessDigit1 == lotteryDigit3 &&
			 guessDigit2 == lotteryDigit1 &&
			 guessDigit3 == lotteryDigit2
			 			||
			 guessDigit1 == lotteryDigit3 &&
			 guessDigit2 == lotteryDigit2 &&
			 guessDigit3 == lotteryDigit1
			 			||
			 guessDigit1 == lotteryDigit1 &&
			 guessDigit2 == lotteryDigit3 &&
			 guessDigit3 == lotteryDigit2
			 			||
			 guessDigit1 == lotteryDigit2 &&
			 guessDigit2 == lotteryDigit1 &&
			 guessDigit3 == lotteryDigit3)
		 System.out.println("You matched the digits! You win $3,000!");
	//Check if the user has at least one digit matching
	else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
											||
			 guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
			 								||
			 guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
		 System.out.println("You matched one digit! You win $1,000");
	else
		 System.out.println("Sorry, better luck next time!");


	}



}