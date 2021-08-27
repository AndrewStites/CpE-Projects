import java.util.Scanner;

public class FishingGameMain{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		Die newDie = new Die(6);

		int userPoints = 0;
		char userAnswer = 'n';

		System.out.print("Do you want to go fishing? yes or no: ");
			userAnswer = input.nextLine().charAt(0);

		while (userAnswer == 'y'){
			newDie.roll();

		switch(newDie.getValue()){
				case 1: userPoints += 30; System.out.println("\nWowza, that's a big one! You caught your mom!"); System.out.println("+30 points\n"); break;
				case 2: userPoints += 20; System.out.println("\nCongrates! You caught a Blue Whale!"); System.out.println("+20 points\n"); break;
				case 3: userPoints += 10; System.out.println("\nHoly Guacamole! You caught some shrimp!."); System.out.println("+10 points\n"); break;
				case 4: userPoints += 1;  System.out.println("\nDang, you caught a shoe. gross..."); System.out.println("+0 points\n"); break;
				case 5: userPoints += 0;  System.out.println("\nYou just caught nothing."); System.out.println("+0 points\n"); break;
				case 6: userPoints += 5;  System.out.println("\nWelp, you caught a tiny goldfish."); System.out.println("+0 points\n"); break;
		}

		System.out.print("Do you want to go fishing? yes or no: ");
			userAnswer = input.nextLine().charAt(0);

		}

		System.out.println("Your total amount of points is " + userPoints);


	}



}