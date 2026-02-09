package recursion;

import java.util.ArrayList;

public class GenerateParenthesis {
	
	 private static void generate(ArrayList<String> result, String curr, int open, int close, int n) {
	        // We got a valid parenthesis
	        if (curr.length() == 2*n) {
	            result.add(curr);
	            return;
	        }

	        if (open < n) {
	            generate(result, curr+"(", open+1, close, n);
	        }
	        if (close < open) {
	            generate(result, curr+")", open, close+1, n);
	        }
	    }
	    public static void main(String[] args) {
	        ArrayList<String> result = new ArrayList<>();
	        int n = 3;
	        
	        generate(result, "", 0, 0, n);
	       
	        for (String s : result)
	        	System.out.println(s);
	    }
}
