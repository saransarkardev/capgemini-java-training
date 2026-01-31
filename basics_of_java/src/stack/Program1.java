package stack;

import java.util.Stack; 

public class Program1 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}
}
