import java.util.Scanner;

public class Overload{
	static final double pi = Math.PI;


	static double Area(double radius){
		return pi*radius*radius;
	}

	static double Area(double length, double width){
		return length*width;
	}

	static double Area(float radius, double height){
		return pi*radius*radius*height;
	}

public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Entter radius of the circle: ");

	double circleRadius = input.nextDouble();

	System.out.print("Enter Length and Width of the rectangle: ");

	double rectangleLength = input.nextDouble();

	double rectangleWidth = input.nextDouble();

	System.out.print("Enter Radius and Height of the cylinder: ");

	float cylinderRadius = input.nextFloat();

	double cylinderHeight = input.nextDouble();

	System.out.println("");

	System.out.println("The area of the circle is: " + Overload.Area(circleRadius));

	System.out.println("The area of the rectangle is: " + Overload.Area(rectangleLength, rectangleWidth));

	System.out.println("The area of the cylinder is: " + Overload.Area(cylinderRadius, cylinderHeight));

}

}
