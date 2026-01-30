package com.uem.dsa.string;

// count vowels and consonants
public class Program2 {
	public static void main(String[] args) {
		String s = "aB*cdefE@#1uXIi";
		
		int countVowels = 0;
		int countConsonants = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				char ch = Character.toLowerCase(s.charAt(i));
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
					countVowels++;
				else 
					countConsonants++;
			}			
		}
		
		System.out.println("Vowels Count: "+ countVowels + ", Consonants Count: "+countConsonants);
	}
}
