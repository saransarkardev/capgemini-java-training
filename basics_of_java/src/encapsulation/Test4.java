package encapsulation;

import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		
//		Math class is a utility class...the no argument construct is private so can't access that in Math class. All the methods will be static methods in Math class. and there is no facory method also.
		// the constructor Math() is not visible.
		System.out.println(Math.max(12,13)); // -> returns double type
		System.out.println(Math.floor(5.6));
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.PI);
		System.out.println(Math.TAU);
		System.out.println(Math.log(10));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(9.5));
		System.out.println(Math.cbrt(3));
		System.out.println(Math.exp(0));
		System.out.println(Math.random());
		
		// Random class in java
		Random random = new Random();
		System.out.println(random.nextInt(100));
		
		
		
	}
}
