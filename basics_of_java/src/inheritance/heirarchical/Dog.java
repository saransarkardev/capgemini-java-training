package inheritance.heirarchical;

public class Dog extends Animal{
	int age;
	
	Dog(String color, String name, int age) {
		super(color, name);
		this.age = age;
	}
	
	public void displayDog() {
		
	}
}
