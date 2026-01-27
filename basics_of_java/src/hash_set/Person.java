package hash_set;

import java.util.HashSet;

public class Person {
	private int id;
	private String email;
	private int age;
	
	public Person(int id, String email, int age) {
		this.id = id;
		this.email = email;
		this.age = age;
	}
	
	
	public int hashCode(Object obj) {
		
		return  ((Integer)id).hashCode() + email.hashCode();
	}
	
	public boolean equals(Object obj) {
		
		Person p = (Person) obj;
		
		if (this.id == p.id && this.email.equals(p.email)) {
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "Id :" + id + " Email : "+ email + " Age : "+ age;
	}
	
	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		
		
		
		Person p1 = new Person(1, "rohit@gmail.com", 30);
		Person p2 = new Person(1, "rohit@gmail.com", 30);
		Person p3 = new Person(2, "rohit@gmail.com", 50);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set);
		
	}
}
