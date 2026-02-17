package comparable_comparator;
import java.time.LocalTime;
import java.util.Objects;
import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String employeeName;
	private String email;
	private long phone;
	private String gender;
	private LocalDate dateOfBirth;
	private LocalTime timeOfBirth;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", phone="
				+ phone + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", timeOfBirth=" + timeOfBirth
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, employeeId, employeeName, gender, phone, salary, timeOfBirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(gender, other.gender) && phone == other.phone
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(timeOfBirth, other.timeOfBirth);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalTime getTimeOfBirth() {
		return timeOfBirth;
	}

	public void setTimeOfBirth(LocalTime timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int employeeId, String employeeName, String email, long phone, String gender, LocalDate dateOfBirth,
			LocalTime timeOfBirth, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.timeOfBirth = timeOfBirth;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee other) {
		return this.employeeId - other.employeeId;
//		return Integer.compare(this.employeeId, o.employeeId);
	}
	
}
