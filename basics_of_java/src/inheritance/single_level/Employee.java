package inheritance.single_level;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmp() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
}
