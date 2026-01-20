package Derived_TypeCasting;

public class DownCasting {
	public static void main(String[] args) {
		
		WhiteTiger wh = new WhiteTiger();
		
		Animal animal = wh; // Up casting
		animal.walk();
		// animal.roar(); --> CTE
		// animal.whiteColor() --> CTE
		
		Tiger tiger = (Tiger) animal; // Down casting
		tiger.walk();
		tiger.roar();
		// tiger.whitColor() --> CTE
		
		
		WhiteTiger wt = (WhiteTiger) tiger; // Down casting
		wt.walk();
		wt.roar();
		wt.whiteColor();
		
	}
}
