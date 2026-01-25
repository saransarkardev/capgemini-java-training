// Payroll interface (Abstraction)
interface Payroll {
    double calculatePay();
}

/* ---------------- Custom Exceptions ---------------- */

// Unchecked Exception
class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

// Checked Exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

/* ---------------- Employee Base Class ---------------- */

abstract class Employee implements Payroll {

    private int id;
    private String name;
    private String role;
    private double salary; // Encapsulated

    public Employee(int id, String name, String role, double salary)
            throws InvalidSalaryException {
        this.id = id;
        this.name = name;
        this.role = role;
        setSalary(salary);
    }

    // Controlled setter
    protected void setSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than zero.");
        }
        this.salary = salary;
    }

    // Getter (no direct access)
    protected double getSalary() {
        return salary;
    }

    // Salary update with authorization
    public void updateSalary(double newSalary, String requestedByRole)
            throws InvalidSalaryException {

        if (!requestedByRole.equalsIgnoreCase("HR")) {
            throw new UnauthorizedAccessException("Only HR can update salary.");
        }
        setSalary(newSalary);
    }

    public void showDetails() {
        System.out.println(id + " | " + name + " | " + role);
    }
}

/* ---------------- Full-Time Employee ---------------- */

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary)
        super(id, name, "FULL_TIME", salary);
    }

    @Override
    public double calculatePay() {
        return getSalary(); // monthly salary
    }
}

/* ---------------- Contract Employee ---------------- */

class ContractEmployee extends Employee {

    private int hoursWorked;

    public ContractEmployee(int id, String name, double hourlyRate, int hoursWorked)
            throws InvalidSalaryException {
        super(id, name, "CONTRACT", hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return getSalary() * hoursWorked;
    }
}

/* ---------------- Main Class ---------------- */

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        try {
            Employee emp1 = new FullTimeEmployee(1, "Alice", 50000);
            Employee emp2 = new ContractEmployee(2, "Bob", 300, 20);

            emp1.showDetails();
            System.out.println("Pay: " + emp1.calculatePay());

            emp2.showDetails();
            System.out.println("Pay: " + emp2.calculatePay());

            // HR updating salary (allowed)
            emp1.updateSalary(55000, "HR");

            // Non-HR trying to update salary (not allowed)
            emp2.updateSalary(350, "Manager");

        } catch (InvalidSalaryException e) {
            System.out.println("Invalid Salary: " + e.getMessage());
        } catch (UnauthorizedAccessException e) {
            System.out.println("Access Denied: " + e.getMessage());
        }
    }
}
