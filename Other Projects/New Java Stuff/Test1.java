import java.util.Scanner;

public class Test1 {
	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter seconds: ");

		int remainingSeconds = input.nextInt();

	int days = remainingSeconds / 86400;
		 remainingSeconds = remainingSeconds % 86400;

	int hours = remainingSeconds / 3600;
		 remainingSeconds = remainingSeconds % 3600;

	int minutes = remainingSeconds / 60;
		 remainingSeconds = remainingSeconds % 60;

	System.out.println("days: " + days + ", hours: " + hours + ", minutes: " + minutes + ", seconds: " + remainingSeconds);
	}

}