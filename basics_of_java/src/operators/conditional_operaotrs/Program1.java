package operators.conditional_operaotrs;

public class Program1 {
	public static void main(String[] args) {
		// Ternary Operator
		// operand1 ? operand2 : operand3
		
		System.out.println(true ? 10 : 20);
		System.out.println(false ? "A" : 65);
		System.out.println(10 > 'A' ? true : false);
		System.out.println("Hello" != "hello" ? "A" : "B");

		// System.out.println(40+20 ? "A" : "C"); --> Not possible in java
		
		// If we want to store the value in a variable then the operand2 and operand3 type should be same as variable data type.
		String res = 20 > 34 ? "Good" : "false";
		System.out.println(res);
	}
}
