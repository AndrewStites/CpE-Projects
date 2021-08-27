import java.util.Scanner;

public class GeometryCalculatorDriver {
	public static void main(String[] args) {
		int selection;
		double area = 0;
		boolean trigger = true;

		GeometryCalculator Calc = new GeometryCalculator();
		Scanner console = new Scanner(System.in);

		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Exit");

	while (trigger) {
		selection = console.nextInt();

		if (selection == 1) {
			System.out.println("Enter the radius: ");
				double radius = console.nextDouble();
			area = Calc.circleArea(radius);
			trigger = false;

		}else if (selection == 2) {
			System.out.print("Enter the length: ");
				double length = console.nextDouble();

			System.out.println("Enter the width: ");
				double width = console.nextDouble();

			area = Calc.rectangleArea(length, width);
			trigger = false;

		}else if (selection == 3) {
			System.out.print("Enter the base: ");
				double base = console.nextDouble();

			System.out.println("Enter the height: ");
				double height = console.nextDouble();

			area = Calc.triangleArea(base, height);
			trigger = false;

		}else if (selection == 4) {
			break;

		}else{
			System.out.println(selection+" is not a valid menu seleciton, please try again.");
		}
}
System.out.println("The area is : " + area);
}
}