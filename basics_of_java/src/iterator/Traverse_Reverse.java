package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Reverse {

		public static void main(String[] args) {
			ArrayList<String> languages = new ArrayList<>();
			
			languages.add("Java");
			languages.add("Python");
			languages.add("C");
			languages.add("C++");
			
			// for each loop --> traverse forward + remove (Not possible using for each loop)
//			for (String s : languages) {
//				if (s.equals("Python")) {
//					languages.remove(s);
//				}
//			}
			
			System.out.println("===================================================");
			
			// Iterator -->  traverse forward + remove (Possible)
			
			Iterator<String> it = languages.iterator();
			
			while (it.hasNext()) {
				if (it.next().equals("Python")) {
					it.remove();
				}
			}
			
			System.out.println(languages);
			
			System.out.println("===================================================");
			
			//ListIterator --> traverse + remove (Possible)
			
			ListIterator<String> itr = languages.listIterator();
			
			while (itr.hasNext()) {
				if (itr.next().equals("Python")) {
					itr.remove();
				}
			} 
			
			System.out.println(languages);
			
			System.out.println("===================================================");
			
			
		}

}
