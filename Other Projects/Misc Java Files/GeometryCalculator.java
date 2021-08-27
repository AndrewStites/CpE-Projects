public class GeometryCalculator {
	private double area;

public double circleArea(double r) {
	area = r * r * Math.PI;
	return area;
}

public double rectangleArea(double length, double width) {
	area = length * width;
	return area;
}

public double triangleArea(double base, double height) {
	area = base * height * 0.5;
	return area;
}
}