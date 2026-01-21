package object_class;

public class Student {
	// There are total 11 non static methods in Object class. --> equals(), hashCode(), toString(), clone() etc..
	
	int id;
	String name;
	double perc;
	
	
	Student(int id, String name, double perc) {
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		Student s = (Student) obj; // downcasting
		
		if (this.id == s.id) {
			return true;
		}
		return false;
				
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rohit", 88.3);
		Student s2 = new Student(1, "Rohit", 88.3);
		
		System.out.println(s1.equals(s2));
	}
}
