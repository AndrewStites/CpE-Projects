import java.util.Scanner;

public class HeadOrTails {

	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	//Prompt the user to enter 0 or 1 for heads or tails
	System.out.print("Choose: Heads (0), Tails (1): ");
		byte choice = input.nextByte();

	//The game master who decides what the answer is
	int gameMaster = (int)(Math.random() * 10);
		if (gameMaster <= 4) {
			gameMaster = 0;
			}
		else{
			gameMaster = 1;
			}

	//Calculation for the randomness
	int cpu = (int)(Math.random() * 10);
		if (cpu <= 4) {
			cpu = 0;
			}
		else{
			cpu = 1;
			}

 	//if statements to determine whether you won or not
	if (choice == gameMaster){
		System.out.println("You win, you fucking winner!");
		}
	else{
		System.out.println("The computer won, you idiot!");
		}

	}


}