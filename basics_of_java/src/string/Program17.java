package string;
import java.util.HashMap;
import java.util.Map;

/*
 	Write a program to print Unique Words in a Given String.

	Example:-
	
	Enter a string: "hello world hello java world"
	Unique words in the given string:
	java
 */
public class Program17 {
	public static void uniqueWords(String s) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] arr = s.split(" ");
		
		for (int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for (Map.Entry<String , Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				System.out.print(entry.getKey() + " ");
		}
	}
	public static void main(String[] args) {
		
		String s = "hello world hello java world";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		uniqueWords(s);
	}
}
