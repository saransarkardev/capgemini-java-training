package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseDemo {
	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		// for each loop --> only traverse forward.
		for (String s : languages) {
			System.out.println(s);
		}
		
		System.out.println("===================================================");
		
		// Iterator --> only traverse forward.
		
		Iterator<String> it = languages.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===================================================");
		
		//ListIterator --> traverse forward and backward.
		
		ListIterator<String> itr = languages.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("===================================================");
		
		while (itr.hasPrevious()) {
			System.out.println(itr.hasPrevious());
		}
		
		
	}
}
