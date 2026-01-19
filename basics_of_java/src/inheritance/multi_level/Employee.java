package inheritance.multi_level;

public class Employee extends Person {
	int id;
	double salary;
	
	
	 Employee (String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	 
	public void displayEmployee() {
		displayPerson();
		System.out.println("ID: "+this.id);
		System.out.println("Salary: "+ this.salary);
	}
}
