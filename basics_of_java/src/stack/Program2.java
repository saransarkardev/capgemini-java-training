package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Program2 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.push(23));
		System.out.println(st.push(48));
		System.out.println(st.push(61));
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		try {
			System.out.println(st.pop());
		}
		catch(EmptyStackException e) {
			System.out.println("Stack is already empty");
		}
		
	}
}
