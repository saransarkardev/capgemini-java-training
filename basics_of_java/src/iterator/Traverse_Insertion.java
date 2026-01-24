package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Insertion {
	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		// for each loop --> traverse forward + Insert (Not possible using for each loop)
//		for (String s : languages) {
//			if (s.equals("Python")) {
//				languages.add("JabhSkript");
//			}
//		}
		
		System.out.println("===================================================");
		
		// Iterator -->  traverse forward + Insert (Not Possible)
		
		Iterator<String> it = languages.iterator();
		
		while (it.hasNext()) {
			
			if (it.next().equals("Python")) {
				languages.add("JabhSkript");
			}
		}
		
		System.out.println(languages);
		
		System.out.println("===================================================");
		
		//ListIterator --> traverse + Insert (Possible)
		
		ListIterator<String> itr = languages.listIterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals("Python")) {
				itr.add("Ruby");
			}
		} 
		
		System.out.println(languages);
		
		System.out.println("===================================================");
		
		
	}
}
