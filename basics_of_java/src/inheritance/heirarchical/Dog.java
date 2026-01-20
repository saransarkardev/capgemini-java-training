package inheritance.heirarchical;

public class Dog extends Animal{
	int age;
	
	Dog(String color, String name, int age) {
		super(color, name);
		this.age = age;
	}
	
	public void displayDog() {
		displayAnimal();
		System.out.println("Age: "+ age);
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog("black", "Rocky", 12);
		d.displayDog();
	}
}
