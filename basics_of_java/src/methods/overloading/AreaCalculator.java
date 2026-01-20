package methods.overloading;

public class AreaCalculator {
	
	public static double calculateArea(double side) {
		return side*side;
	}
	
	public static double calculateArea(double length, double breadth) {
		return length*breadth;
	}
	
	public static double calculateArea(float radius) {
		return 3.14*radius*radius;
	}
}
