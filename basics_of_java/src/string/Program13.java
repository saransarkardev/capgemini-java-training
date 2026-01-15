package string;
import java.util.TreeMap;
import java.util.Map;
/*
  write a program to find Occurance of each character how many times present in given String and display the output.

Example:-

   Input :-  
                  String s = "Hello";
                  
      Output :-  H = 1  -----> H   is present one time in give String.
                      e  = 1 ----->  e  is present one time in given Struing.
                       l = 2  ----->  l  is present 2 times in give String.
                       o = 1 ------>  o    is present one time in give String.

 */
public class Program13 {
	public static void findFrequency(String s) {
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		for (int i=0; i<s.length(); i++) 
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> "+ entry.getValue());
		}
	}
	public static void main(String[] args) {
		String s = "Hello";
		findFrequency(s);
	}
}
