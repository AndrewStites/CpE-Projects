import java.util.Scanner;

public class TestBooleanOperators {

	public static void main(String[]args) {
	
	//Create a Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt the user
	System.out.print("Enter an integer: ");
	
		int integer = input.nextInt();
	
	if (integer % 2 == 0 && integer % 3 == 0)
		System.out.println(integer + " is divisible by 2 and 3.");
	
	if (integer % 2 == 0 || integer % 3 == 0)
		System.out.println(integer + " is divisible by 2 or 3.");
		
	if (integer % 2 == 0 ^ integer % 3 == 0)
		System.out.println(integer + " is divisible by 2 or 3, but not both.");
	
	
	
	
	}




}