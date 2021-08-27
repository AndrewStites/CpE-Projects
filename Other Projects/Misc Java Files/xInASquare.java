import java.util.Scanner;

public class xInASquare{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please input an integer from 1 to 15: ");

			int	exes = input.nextInt();


		for (int height = 0; height < exes; height++) {

				System.out.print("x");

			for (int width = 0; width < exes; width++) {

				System.out.println("X");


			}


		}


	}
}