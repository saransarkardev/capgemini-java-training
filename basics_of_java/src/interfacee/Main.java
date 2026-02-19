package interfacee;

public class Main {
	public static void main(String[] args) {
		
//		Demo demo = new DemoImpl();
//		
//		demo.sample();
		
		// If the method is not an argument method and not a return type method in the Functional Interface
		
		// Type - 1
//		Demo demo = ()-> {
//			System.out.println("Method Implemented by using Lambda Expression");
//		};
//		demo.sample();
		
		
		// Type - 2
//		Demo demo1 = ()-> 
//		System.out.println("Method Implemented by using Lambda Expression");
//		
//		demo1.sample();
//		
		
//		Demo demo = (num) -> {
//			System.out.println("For argument method");
//		};
//		demo.sample(1000);
//		
		
		// If the method is single argument method and single statement is provided for the method.
//		Demo demo = num -> System.out.println("For argument method");
//		demo.sample(100);
		
//		Demo demo = (num1, num2)-> System.out.println("For argument method");
		
//		demo.sample(10,20);
		
		Demo demo1 = (num1, num2) -> num1 + num2;
		System.out.println(demo1.sample(1000, 2000));
		
 
	}
}
