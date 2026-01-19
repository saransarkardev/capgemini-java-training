package inheritance.multi_level;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);
	}
}
