package oops.fundamental.non_static.methods;

public class Student {
	
	int id;
	String name;
	double percentage;
	
	Student() {
		
	}
	
	//Parameterized constructor
	Student(int id, String name, double percentage) {
		this.id =id;
		this.name = name;
		this.percentage = percentage;
	}
	
	public void display() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Percentage: "+ this.percentage);
	}
}
