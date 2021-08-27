import java.util.Scanner;

public class PointInACircle {

	public static void main(String[]args) {

	//Create a Scanner
	Scanner input = new Scanner(System.in);

	//Prompt the user
	System.out.print("Please enter the x coordinate: ");
		double x = input.nextDouble();

	System.out.print("Please enter the y coordinate: ");
		double y = input.nextDouble();

	//Calculations
	byte x2 = 0;
	byte y2 = 0;

	if (Math.pow((Math.pow(x2 - x, 2) + Math.pow(y2 -y, 2)), 0.5) <=  10) {

		System.out.println("Point " + "(" + x + ", " + y + ")" + " is in the circle");

	}
	else {
		System.out.println("Point " + "(" + x + ", " + y + ")" + " is not in the circle");
	}

	}


}