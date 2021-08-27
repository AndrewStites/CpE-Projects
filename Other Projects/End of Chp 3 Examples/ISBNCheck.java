import java.util.Scanner;

public class ISBNCheck {

	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the 9 digit ISBN
		System.out.print("Please enter the 9 digit ISBN: ");
			int digit9 = input.nextInt();

		//Use the remainder to individualize the digits of the ISBN
		int d9 = digit9 % 10;
			digit9 = digit9 / 10;
		int d8 = digit9 % 10;
			digit9 = digit9 / 10;
		int d7 = digit9 % 10;
			digit9 = digit9 /10;
		int d6 = digit9 % 10;
			digit9 = digit9 / 10;
		int d5 = digit9 % 10;
			digit9 = digit9 / 10;
		int d4 = digit9 % 10;
			digit9 = digit9 / 10;
		int d3 = digit9 % 10;
			digit9 = digit9 / 10;
		int d2 = digit9 % 10;
			digit9 = digit9 / 10;
		int d1 = digit9 % 10;

		//Calculaiton using the provided equation
		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		//Display 013031998 for "checksum" and 123456789 for "X"
		if (checksum == 10) {
			System.out.println(d1 + "" + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
			}
		else {
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + checksum);
			}

	}

}