package methods.overloading;

import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Press 1 for Area of Sqaure");
		System.out.println("Press 2 for Area of Rectangle");
		System.out.println("Press 3 for Area of Circle");
		System.out.println("Press 4 to exit");
		
		int n = sc.nextInt();

		switch(n) {
			case 1: 
				System.out.println("Enter Side: ");
				double side = sc.nextDouble();
				System.out.println("Area of Square: "+ AreaCalculator.calculateArea(side));
				break;
			case 2:
				System.out.println("Enter Length: ");
				System.out.println("Enter Breadth: ");
				double length = sc.nextDouble();
				double breadth = sc.nextDouble();
				System.out.println("Area of Rectangle: "+AreaCalculator.calculateArea(length, breadth));
				break;
			case 3:
				System.out.println("Enter Radius: ");
				float radius = sc.nextFloat();
				System.out.println("Area of Circle: "+AreaCalculator.calculateArea(radius));
				break;
			case 4:
				System.out.println("Exit");
				break;
		}
	}
}	
