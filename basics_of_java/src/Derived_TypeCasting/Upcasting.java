package Derived_TypeCasting;

public class Upcasting {
	public static void main(String[] args) {
		
		WhiteTiger wh = new WhiteTiger();
		wh.whiteColor();
		wh.roar();
		wh.walk();
		
		Tiger tiger = wh; // Up casting
		tiger.roar();
		tiger.walk();
		//tiger.whiteColor(); // CTE
		
		Animal animal = tiger; // Up casting
		animal.walk();
		// animal.roar(); // CTE
		// animal.whiteColor() // CTE
		
	}
}
