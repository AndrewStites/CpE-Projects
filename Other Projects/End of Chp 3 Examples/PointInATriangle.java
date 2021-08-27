import java.util.Scanner;

public class PointInATriangle {

	public static void main(String[]args) {
	
	//Create a Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt the user
	System.out.print("Please input the coordinates: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
	//Calculations
	double realC = Math.pow(Math.pow(100, 2) + Math.pow(200, 2), 0.5);
	double c = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
	
	//Logic
	boolean verdict = (a <= 100 && b <= 200 && c <= realC);
	
	//Display
	System.out.println("This point is " + (verdict ? "in" : "not in") + " the triangle");
	
	
	}


}