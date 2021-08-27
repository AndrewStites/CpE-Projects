import java.util.Scanner;

public class LargeSmallNumber{

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	int largestNumber;
	int smallestNumber;
	String numbersOutput = "";

	System.out.print("Please enter an integer: ");
		int enteredInteger = input.nextInt();

	smallestNumber = enteredInteger;
	largestNumber = enteredInteger;

	while(enteredInteger != -99){
		numbersOutput += enteredInteger;
		System.out.print("Your numbers: " + numbersOutput );
		if (enteredInteger < smallestNumber) {
			smallestNumber = enteredInteger;
		}else if(enteredInteger > largestNumber){
			largestNumber = enteredInteger;
		}
		System.out.println("; Add a number or type \"-99\" to end: ");
			enteredInteger = input.nextInt();

		}
		System.out.println(smallestNumber + " is the smallest number and " + largestNumber + " is the largest number.");

}
}