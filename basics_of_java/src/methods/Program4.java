package methods;

public class Program4 {
	public static void checkAge(int age) {
		if (age <= 0) {
			System.out.println("Invalid age.");
		}
		else if (age > 0 && age <= 18) {
			System.out.println("You can not vote.");
		}
		else {
			System.out.println("You can vote.");
		}
		
	}
	public static void main(String[] args) {
		int age = 15;
		checkAge(age);
	}
}
