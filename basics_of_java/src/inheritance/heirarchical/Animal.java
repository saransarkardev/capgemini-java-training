package inheritance.heirarchical;

public class Animal {
	String color;
	String name;
	
	public Animal(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public void displayAnimal() {
		System.out.println("Color: "+ this.color);
		System.out.println("Name: "+ this.name);
	}
}
