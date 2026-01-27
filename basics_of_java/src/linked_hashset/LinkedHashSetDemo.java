package linked_hashset;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.ListIterator;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(100);
		lhs.add(10);
		lhs.add(50);
		lhs.add(70);
		lhs.add(70);
		
//		System.out.println(lhs);
		
		// We can iterate here using for each and Iterator.....(Not using ListIterator).
		
		
		// Now we can use ListIterator to traverse the LinkedHashSet
		ArrayList<Integer> nums = new ArrayList<>(lhs);
		
		ListIterator<Integer> lt = nums.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		
	}
}
