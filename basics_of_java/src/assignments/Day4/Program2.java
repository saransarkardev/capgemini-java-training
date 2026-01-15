package assignments.Day4;

/*
 	The method accepts a string “str” that contains alphabets and hyphens (-). Implement the logic to move all hyphens(-) in the string to the front of the given string.

	NOTE:- Return null if str is null.

	Example :-

	Input:
	str=Move-Hyphens-to-Front
	Output:
	—MoveHyphenstoFront
	Explanation:-

	The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

	Sample Input

	Str: String-Compare
	Sample Output-

	-StringCompare
 */

public class Program2 {
	public static String moveHyphens(String s) {
		if (s == null) return null;
		
		String result = "";
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '-') 
				result += s.charAt(i);
		}
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) != '-') 
				result += s.charAt(i);
		}
		
		return result ;
	}
	public static void main(String[] args) {
		String s = "Move-Hyphens-to-Front";
		
		String ans = moveHyphens(s);
		System.out.println(ans);
	}
}
