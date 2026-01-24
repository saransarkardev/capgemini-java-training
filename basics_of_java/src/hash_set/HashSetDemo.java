package hash_set;

import java.util.HashSet;


public class HashSetDemo {
	public static void main(String[] args) {
		
		
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee(1, "Rohit", 2000);
		Employee e2 = new Employee(1, "Rohit", 2000);
		Employee e3 = new Employee(1, "Rohit", 2000);
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3); 
		
		System.out.println(hs);
		
	
	}
}
