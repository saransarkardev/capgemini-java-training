package oops.fundamental.non_static.methods;

public class Person {

	String name;  // Default value --> null
	int age;	// Default value --> 0
	String gender;	// Default value --> null
	
	// No argument constructor
	Person() {
		System.out.println("No argument");
	}
	
	//Parameterized constructor
	Person(String name, int age, String gender) {
		//Here the formal argument(parameter) is local variables.
		// this keyword(non static) is used to store current object reference.
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
	}

}
