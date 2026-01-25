package test;

interface payroll{
	 double calculateSalary();
}


class InvalidSalaryException extends RuntimeException {
    public InvalidSalaryException(String message) {
        super(message);
    }
}


class UnauthorizedAccessException extends Exception {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

public abstract class Employee implements payroll{
	 private int employeeID;
	 private String name;
	 private String role;
	 private double salary;
	 
	 public Employee(int employeeID, String name, String role) {
		 this.employeeID = employeeID;
		 this.name = name;
		 this.role = role;
		 
	 }
	 
	 
	 // setter for the salary
	   public void setSalary(double salary) throws InvalidSalaryException {
	       if (salary <= 0) {
	           throw new InvalidSalaryException("Salary is not valid.");
	       }
	       this.salary = salary;
	    }
	   
	   protected double getSalary() {
	        return salary;
	    }
	   

	    public void showDetails() {
	        System.out.println("Employee ID = "+ employeeID + " Name = "  + name + " Role = " + role);
	    }    
	    
}

public class FullTimeEmployee extends Employee{
	
	
	
	public FullTimeEmployee(int employeeID, String name, String role) {
		super(employeeID, name, role);
	}
	
	@Override
	public double calculateSalary() {
		
	}
}

public class ContractEmployee extends Employee{
	
	public ContractEmployee(int employeeID, String name, String role) {
		super(employeeID, name, role);
	}
	
	@Override
	public double calculateSalary() {
		
	}
}

