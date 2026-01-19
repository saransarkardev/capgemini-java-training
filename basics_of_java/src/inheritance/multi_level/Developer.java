package inheritance.multi_level;

public class Developer extends Employee{
	
	String technology;
	
	public Developer(String name, int age, int id, double salary, String technology) {
		super(name,age,id,salary);
		this.technology = technology;
	}
	
	public void displayDeveloper() {
		displayEmployee();
		System.out.println("Techonology: "+this.technology);
	}
	
	public static void main(String[] args) {
		Developer diddy = new Developer("Anishka", 18, 69, 200000, "Python..hssss");
		diddy.displayDeveloper();
	}
}
