package inheritance.single_level;

public class Developer extends Employee{
	
	String technology;
	
	public Developer(int id, String name, double salary, String technology) {
		super(id, name, salary);
		this.technology = technology;
	}
	
	public void displayDeveloper() {
		displayEmp();
		System.out.println(this.technology);
	}
	
	public static void main(String[] args) {
		Developer d = new Developer(101, "Jatin", 50000, "Spring Boot");
		d.displayDeveloper();
	}
}
