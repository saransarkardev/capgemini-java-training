package stack;

import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// If opening bracket → push
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			// If closing bracket → check match
			else {
				// got a closing bracket and there is no opening bracket for the closing bracket.
				if (st.isEmpty())
					return false;

				char top = st.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		// Stack must be empty at the end in order to be balanced.
		return st.isEmpty();
	}

	public static void main(String[] args) {

		String s = "([{}])";

		System.out.println(isValid(s));
	}
}
