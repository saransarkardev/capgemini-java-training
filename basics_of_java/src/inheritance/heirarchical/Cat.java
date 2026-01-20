package inheritance.heirarchical;
	
public class Cat extends Animal{
	int age;
	
	Cat(String color, String name, int age) {
		super(color, name);
		this.age = age;
	}
	
	public void displayCat() {
		displayAnimal();
		System.out.println("Age: "+ age);
	}
}
