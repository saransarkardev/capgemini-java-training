package iterator;

import java.util.*;


public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("India");
		countries.add("China");
		countries.add("USA");
		countries.add("Brazil");
		
		// For each loop
		for(String s : countries) {
			System.out.println(s);
		}
		
		System.out.println("=================================================");
		
		Iterator<String> it = countries.iterator();
		
		while (it.hasNext()) {
			String ans = it.next();
			System.out.println(ans);
		}
		
		
		System.out.println("=====================================================");
		
		ArrayList al1 = new ArrayList();
		
		al1.add("java");
		al1.add(100);
		al1.add(100.50);
		al1.add(true);
		
		Iterator itr = al1.iterator();
		
		while(itr.hasNext()) {
		
			Object obj1 = itr.next();
			System.out.println(obj1);
			
		}
		
		System.out.println("==========================================================");
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		
		ListIterator<Integer> itr3 = list3.listIterator();
		
		while(itr3.hasNext()) {
			Integer num= itr3.next();
			System.out.println(num);
		}
		System.out.println("-----------------------------------------------------");
		
		while(itr3.hasPrevious()) {
			Integer num= itr3.previous();
			System.out.println(num);
		}
		
		
		
		
		
		
		
	}
}
