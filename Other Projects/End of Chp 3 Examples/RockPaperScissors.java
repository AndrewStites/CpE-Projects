import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	/*To create a parameter for a certain program, which needs only a set few of numbers randomly,
	the best way(for a beginner) is to use the random Math class and then multiply the number by one more than the
	amount needed. For instance, below I needed to randomly generate 0, 1, or 2. I utilized the Math.random
	class and then multiplied it by 3, which is one more than I need. This is because the Math.random only has
	a range of 0.0 to 0.9. When that is multiplied by a number, such as 3, it will never print out the whole number
	"3".*/
	int cpuNumber = (int)(Math.random() * 3);

	//prompt the user to enter their guess
		System.out.print("Please enter one: Rock(0), Paper(1), Scissors(2): ");
		int guess = input.nextInt();

	//Used a switch statement to apply cpuNumber to Rock, Paper, and Scissors with regards to their specific number
	String cpuAnswer = "";
	switch (cpuNumber){
		case 0:cpuAnswer = " Rock"; break;
		case 1:cpuAnswer = " Paper"; break;
		case 2:cpuAnswer = " Scissors"; break;
		}

	//Did the same thing as above, but for the user's guess
	String guessAnswer = "";
	switch (guess) {
		case 0:guessAnswer = " Rock"; break;
		case 1:guessAnswer = " Paper"; break;
		case 2:guessAnswer = " Scissors"; break;
		}

	//if/then statements regarding if the computer won or lost or drew
	if (cpuNumber == guess){
		System.out.println("The computer chose" + cpuAnswer + ". " + "You chose" + guessAnswer + ". " + "It is a draw.");
	   }
	else if(cpuNumber == 0 && guess == 2 ||
			cpuNumber == 2 && guess == 1 ||
			cpuNumber == 1 && guess == 0){
		System.out.println("The computer chose" + cpuAnswer + ". " + "You chose" + guessAnswer + ". " + "You lost, loser.");
		}
	else{
		System.out.println("The computer chose" + cpuAnswer + ". " + "You chose" + guessAnswer + ". " + "You won!");
		}
	}

}