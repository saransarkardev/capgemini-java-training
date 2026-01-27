package oops_problem;

//================= CUSTOM EXCEPTIONS =================

//Unchecked Exception
class UnauthorizedAccessException extends RuntimeException {

	public UnauthorizedAccessException(String msg) {
		super(msg);
	}
}

//checked Exception
class InvalidSalaryException extends Exception {

	public InvalidSalaryException(String msg) {
		super(msg);
	}
}

//================= ABSTRACTION =================

interface payroll {

	public abstract void calculateSalary();
}


//================= EMPLOYEE CLASS =================

abstract class Employee implements payroll {

	private int id;
	private String name;
	private String role;
	private double salary;

	public Employee(int id, String name, String role, double salary) throws InvalidSalaryException {
		this.id = id;
		this.name = name;
		this.role = role;
		setSalary(role, salary);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String role) {
		this.role = role;
	}

	public void setSalary(String role, double salary) throws InvalidSalaryException {

		if (!role.equalsIgnoreCase("HR")) {
			throw new UnauthorizedAccessException("Unauthorized person is trying to access salary.");
		}

		if (salary <= 0) {
			throw new InvalidSalaryException("Salary must be greater than 0.");
		}

		this.salary = salary;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getRole() {
		return this.role;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee Details = [ID: " + id + ", Name: " + name + ", Role: " + role + ", Salary: " + salary + "]";
	}
}

//================= FULL-TIME EMPLOYEE =================

class FullTimeEmployee extends Employee {

	public FullTimeEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
		super(id, name, role, salary);
	}

	@Override
	public void calculateSalary() {
		System.out.println("Salary : " + getSalary() + (getSalary() * 0.10));
	}

}

//================= PART-TIME EMPLOYEE =================

class PartTimeEmployee extends Employee {

	private int rate;
	private int hours;

	public PartTimeEmployee(int id, String name, String role, int rate, int hours) throws InvalidSalaryException {
		super(id, name, role, rate * hours);
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Salary : " + (rate*hours);
	}
}


//================= MAIN CLASS =================


public class EmployeePayrollSystem {
	public static void main(String[] args) {
		
		try {
			Employee e1 = new FullTimeEmployee(1, "Saran", "HR", 4000.00);
			Employee e2 = new FullTimeEmployee(2, "Rahul", "HR", 65000);
			Employee e3 = new FullTimeEmployee(3, "Pritam", "HR", 20000.00);
			
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			
			e1.setSalary("manager", 3434);
			System.out.println(e1);
		}
		catch(InvalidSalaryException e) {
			System.out.println("Checked Exception: "+ e.getMessage());
		}
		catch(UnauthorizedAccessException e) {
			System.out.println("Uncheck Exception: "+ e.getMessage());
		}
		catch(Exception e) {
			System.out.println("General Exception: " + e.getMessage());
		}
	}
}
