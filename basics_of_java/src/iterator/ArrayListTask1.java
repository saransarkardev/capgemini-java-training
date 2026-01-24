package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add(100.50);
		list.add("Hello");
		list.add(true);
		list.add("World");
		
		// Remove Hello and World from the list.
		Iterator it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals("Hello") || it.next().equals("World")) {
				it.remove();
			}
		}
		
		System.out.println(list);
		
		
	}
}
