package array;

public class Program6 {
	public static void main(String[] args) {
		

		
		Employee[] employee = new Employee[3];
		employee[0] = new Employee(1, "Adam", 200000);
		employee[1] = new Employee(2, "Miller", 300000);
		employee[2] = new Employee(3, "King", 400000);
		
		for (int i=0; i<employee.length; i++) {
//			Will return object reference of employee
//			System.out.println(employee[i]);
			// we can not do null.display()
			employee[i].display();
		}
	}
}
