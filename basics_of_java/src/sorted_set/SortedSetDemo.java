package sorted_set;

import java.util.SortedSet;
import java.util.TreeSet;
import tree_set.MyIntegerComparator;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> ss = new TreeSet<Integer>(new MyIntegerComparator());
		
		ss.add(100);
		ss.add(10);
		ss.add(30);
		ss.add(40);
		ss.add(30);
		ss.add(50);
		ss.add(60);
		
		System.out.println(ss);
		
		// first()
		System.out.println("first() : " + ss.first());
		
		// last()
		System.out.println("last() : " + ss.last());
		
		// headSet()
		System.out.println("headSet() : " + ss.headSet(100));
		
		// tailSet()
		System.out.println("tailSet() : " + ss.tailSet(100));
		
		// subSet()
		System.out.println("headSet() : " + ss.subSet(30, 60));
		
		// comparator
		System.out.println("comparator() : " + ss.comparator());
				
				
	}
}
