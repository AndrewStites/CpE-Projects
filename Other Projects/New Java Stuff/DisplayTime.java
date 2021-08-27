import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Prompt the user for input
		System.out.print("Enter a value for seconds: ");
		int seconds = input.nextInt();

		int minutes = seconds / 60; //turn seconds into minutes
		int remainingSeconds = seconds % 60; //gives remainder to be displayed in seconds left over from the minute conversion

		//Display to the console
		System.out.println(seconds + " seconds is " + minutes +
		 " minutes and " + remainingSeconds + " seconds");

	}

}