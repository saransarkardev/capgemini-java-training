package tree_set;

import java.util.TreeSet;

public class EmployeeTask {
	public static void main(String[] args) {
		
		//conditions: the display should sort based on salary. if two or more employees 
		//have the same salary, then they should be sorted based on their name.

		
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		
		Employee e1 = new Employee(1, "Rohit", 50000);
		Employee e2 = new Employee(1, "Vira", 50000);
		Employee e3 = new Employee(1, "Akshay", 70000);
		Employee e4 = new Employee(1, "Harshit", 40000);
		Employee e5 = new Employee(1, "Mark", 50000);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		System.out.println(empSet);

		
	}
}
