import java.util.Scanner;

public class SquareDisplay{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

			int	exes;

		System.out.println("Please input an integer from 1 to 15: ");
			exes = input.nextInt();

		while(exes < 1 || exes > 15){
			System.out.println("Please re-enter your number: ");
			exes = input.nextInt();


			}



		for (int width = 1; width <= exes; width++) {

			for (int height = 1; height <= exes; height++) {

				System.out.print("X");


			}
				System.out.println();

		}


	}
}