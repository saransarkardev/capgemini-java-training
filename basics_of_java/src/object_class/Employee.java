package object_class;

public class Employee {
	int id;
	String name;
	int salary;
	
	
	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return id + " " + name + " "+ salary;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(1,"saran", 39999);
		System.out.println(e);
		
		
		
	}
}
