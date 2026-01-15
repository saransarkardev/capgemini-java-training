package string;


/*
 	write a program to check given String is an Anagram or not and return a suitable message.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. For example, "listen" and "silent" are anagrams of each other because they use the same letters.

Now, let's discuss how we can determine if two strings are anagrams of each other. Here's a simple explanation:

First, check if both lengths of the String same or not if same you need to write the implementation the program other say directly Not an Anagram.
Compare the two Strings of every character. If they match for every character, the strings are anagrams.

For example, let's take the strings "listen" and "silent":

if you absorb the two String what characters are present in the s1 String same characters are present in the s2 String so. these two are Anagram.
 */
public class Program12 {
	public static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int[] freq = new int[256];
		
		for (int i=0; i<s1.length(); i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			
			freq[ch1]++;
			freq[ch2]--;
		}
		
		for (int i=0; i<freq.length; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		return true;
			
 	}
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		if (checkAnagram(s1, s2) == true)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
