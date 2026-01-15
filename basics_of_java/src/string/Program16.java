package string;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 	write a program to Remove Duplicates characters in Given String..

	Example:-
	Input:-
    String str = "aabaabbbcccd";
    output:-  abcd;
 */
public class Program16 {
	public static String removeDuplicates(String s) {
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i=0; i<s.length(); i++) 
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		
		String ans = "";
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			ans += entry.getKey();
		
		return ans;
	}
	public static void main(String[] args) {
		String s = "aabaabbbcccd";
		
		System.out.println(removeDuplicates(s));
	}
}
